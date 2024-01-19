// new DataTable('#userListTable');
var isPosting = false;
jQuery(function ($) {
  // デフォルトの設定を変更
  let isButtonClicked = false;
  // 取得したデータを dataList 配列に追加します
  let dataList = [];
  // let errorMessages ;
  let count=0;
  let $tables = $("#userListTable").DataTable({
    drawCallback: function(settings) {
      $('#userListTable tbody tr').hide().fadeIn('slow');
      if (count > 0) {
        $('#errCount').text(`エラー件数：${count}件`);
      } else {
        $('#errCount').text('');
      }
    },
    language: {
      "sProcessing": "処理中...",
      "sLengthMenu": "_MENU_ 件表示",
      "sZeroRecords": "検索条件に合致するデータがありません。",
      "sInfo": " _TOTAL_ 件中 _START_ から _END_ まで表示",
      "sInfoEmpty": " 0 件中 0 から 0 まで表示",
      "sInfoFiltered": "（全 _MAX_ 件より抽出）",
      "sInfoPostFix": "",
      "sSearch": "検索:",
      "sUrl": "",
      "oPaginate": {
        "sFirst": "先頭",
        "sPrevious": "前",
        "sNext": "次",
        "sLast": "最終"
      }
    },
    rowId: 'userId',
    // 件数切替の値を10～50の10刻みにする
    lengthMenu: [100, 200, 300],

    // デフォルト50件
    displayLength: 100,

    // 検索機能 無効
    searching: false,

    // 横スクロール有効化
    scrollX: true,

    // 縦スクロールバーを有効にする (scrollYは200, "200px"など「最大の高さ」を指定します)
    scrollY: 400,

    //テーブルヘッダーを固定
    fixedHeader: true,

    // 初期表示並び順
    order: [[1, "asc"]],
    //
    createdRow: function (row, data) {
      // 各<tr>要素が作成された後に実行される関数
      if (data.checkFlag === '1') {
        let errorMessages = JSON.parse(data.checkMessage);
        // console.log(errorMessages);
        count++;
        $(row).data('errorMessages', errorMessages);
        $(row).addClass('csvUserErrorRecord');
      }else {

        let $secondTd = $(row).find('td:eq(1)');

        const hiddenContent = `<input type="hidden" id="userId" name="userId" value="${data.userId}" />`;
        $secondTd.append(hiddenContent);
      }
    },

    columns: [
      {//CSV項目.処理区分 ADD/MODE/LCK/UNLOCK
        "data": "processKbn",
        "render": function (data) {
          if (data === 'ADD') {
            return  '<td><i class="fa-solid fa-plus"></i>追加</td>';
          } else if (data === 'MOD') {
            return  '<td><i class="fa-solid fa-pen-to-square"></i>変更</td>';
          } else if (data === 'LCK') {
            return  '<td><i class="fa-solid fa-lock"></i>ロック</td>';
          } else if (data === 'UNLCK') {
            return  '<td><i class="fa-solid fa-unlock"></i>解除</td>';
          }else {
            return  '<td><i class="fa-solid fa-pen-to-square"></i>不明</td>';
          }
        }
      },//利用者ID
      { "data": "userId",},
      //CSV項目.利用者区分
      { "data": "column1",
        "render":function (data) {
          if (data === '1') {
            return  '<td>教員</td>';
          } else if (data === '2') {
            return  '<td>職員</td>';
          } else if (data === '3') {
            return  '<td>学生</td>';
          } else if (data === '4') {
            return  '<td>ビジター</td>';
          }else {
            return  '<td>その他</td>';
          }
        }
      },//CSV項目.反映日
      {
        "data": "reflectionDate",
        "render": function (data) {
          if (data) {
            let date = new Date(data);
            return date.toLocaleDateString('ja-JP', {year: 'numeric', month: '2-digit', day: '2-digit'});
          } else {
            return '';
          }
        }
      },
      //氏名（漢字）
      { "data": "column3" },
      //氏名（英字）
      { "data": "column2" },
      //学籍番号
      { "data": "column4" },
      //VPN利用
      { "data": "column5",
        "render":function (data) {
          data = (data === '*' ? '1' : data);
          return data === '1' ? '○' : '×';
        }
      },
    ],
    // 項目定義
    columnDefs: [
      //　差分
      {
        targets: 0,
        className: 'dt-head-center',
      },
      {
        targets: 0,
        className: 'dt-body-center',
      },
      {
        targets: 0,
        width: 65,
        "orderable": false,
      },
      // 利用者ID
      {
        targets: 1,
        className: 'dt-head-center',
        width: 100

      },
      {
        targets: 1,
        className: 'dt-body-center',
        width: 100
      },
      // 利用者区分
      {
        targets: 2,
        className: 'dt-head-center',
        width: 100
      },
      {
        targets: 2,
        className: 'dt-body-center',
        width: 100
      },
      // 反映日
      {
        targets: 3,
        className: 'dt-head-center',
        width: 100
      },
      {
        targets: 3,
        className: 'dt-body-center',
        width: 100
      },
      // 氏名（漢字）
      {
        targets: 4,
        width: 140
      },
      
      // 氏名（英字）
      {
        targets: 5,
        width: 140
      },
      // 学籍番号
      {
        targets: 6,
        width: 100
      },
      // VPN
      {
        targets: 7,
        className: 'dt-head-center',
        width: 100
      },
      {
        targets: 7,
        className: 'dt-body-center',
        width: 100
      },

    ],

    //左から1番目のカラムを固定
    fixedColumns: {
      left: 1,
    }
  });

  // ファイル入力ボックスの変更イベントを監視します
  $('#csvFile').on('change', function() {
    // ファイル入力ボックスの値が変更された場合、選択されたファイルがあるかどうかを確認します
    // ファイルが選択されているか確認
    if (this.files && this.files.length > 0) {
      // SweetAlertを使用してアップロード中のアラートを表示
      showSwalAlertNoButton('しばらくお待ちください...','info');

      // ファイル処理のシミュレーション
      setTimeout(function() {

        Swal.close(); // アラートを閉じる

        // アップロードボタンを活性化
        $('#userUpload').prop('disabled', false);
      }, 1000); // ファイル処理には2秒かかると仮定
    }else {
      // 選択されたファイルがない場合、アップロードボタンを無効にします
      $('#userUpload').prop('disabled', true);
    }
  });



  // アップロードボタンのクリックイベントを監視します
  $('#userUpload').on('click', function() {
    count = 0;
    //重複の送信を防止する START
    if (isButtonClicked) {
      return;
    }

    isButtonClicked = true;
    setTimeout(function() {
      isButtonClicked = false;
    }, 1000);
    //重複の送信を防止する END

    // 選択されたファイルを取得します
    const selectedFile = $('#csvFile')[0].files[0];
    // FormDataオブジェクトを作成し、ファイルを追加します
    const formData = new FormData();
    formData.append('csvFile', selectedFile);
    // ローディングアニメーションを表示すべきかどうかを追跡する変数を定義します
    let shouldShowLoading = true;
    // リクエストが完了する前に表示する場合、1秒のタイムアウトを設定し、それ以前にローディングアニメーションを表示しないようにします
    const loadingTimeout = setTimeout(() => {
      if (shouldShowLoading) {
        showSwalAlertNoButton('しばらくお待ちください...','info');
      }
    }, 300);

    // Axiosを使用してファイルをバックエンドのAPIに送信します
    axios.post('./csvUpload', formData, {
      headers: {
        'Content-Type': 'multipart/form-data'
      }
    })
        .then(function(response) {
          // リクエストが完了したため、shouldShowLoadingをfalseに設定します
          shouldShowLoading = false;
          clearTimeout(loadingTimeout); // タイムアウトをクリア
          Swal.close(); // ローディングアニメーションを閉じる
          // ファイルのアップロード成功後の処理
          if (response.status === 200 ) {
            if(response.data.data !== null){
            dataList = response.data;
            // 古いデータをクリアする
            $tables.clear();
            // 新しいデータを追加する
            $tables.rows.add(response.data.data);
            // テーブルを再描画する
            $tables.draw();

              const rowCount = $tables.data().length;
                if (rowCount-count > 0 ) {
                  // 選択されたファイルがある場合、アップロードボタンを有効にします
                  $('#userAddBtn').prop('disabled', false);
                } else {
                  // 選択されたファイルがない場合、アップロードボタンを無効にします
                  $('#userAddBtn').prop('disabled', true);
                }

            if(count > 0) {
            $('#errCount').text(`エラー件数：${count}件`);
            }
              count=0;
            // showSwalAlertWithButton(dataList.message, `success`)

            }else{
              //各チェック時にエラーがある場合、ここに入ります。↓
              showSwalAlertWithButton(response.data.message, `warning`)
            }
          } else if (response.status === 400){
            // アップロードされたファイルは空の場合の処理
            showSwalAlertWithButton(response.data.message, `warning`)
          }
        })
        .catch(function(error) {
          shouldShowLoading = false;
          clearTimeout(loadingTimeout); // タイムアウトをクリア
          Swal.close(); // ローディングアニメーションを閉じる
          // ファイルのアップロード失敗時 OR CSVファイルの解析に失敗した場合の処理
          showSwalAlertWithButton(error.response.data.message, `error`)
        })
  });

  $('#userAddBtn').click(function (e) {
    // 確定ボタン
    // モーダルの内容要素を更新
    $('#confirmMessage').html("確定します。よろしいですか？");
    // モーダルの内容を表示
    $('#confirmModal').modal('show');
  });
  
  $('#btnConfirmOK').click(function (e) {
    $('#confirmModal').modal('hide');
    sendOpRequest(e);
  });
    //処理送信
    function sendOpRequest(e) {

        //通常のアクションをキャンセルする
        e.preventDefault();
        if (isPosting) return false;
        isPosting = true;

        // フォームのデータを取得
        var formData = $('#UserOpForm').serializeArray();
    
        var outputJson = {};
    
        // 各オブジェクトを処理して新しいオブジェクトを構築
        formData.forEach(function(obj) {
          var propertyName = obj.name;
          outputJson[propertyName] = obj.value;
        });
        //ユーザ削除
        $.ajax({
            url: webAppName + "/csvConfirm",
            type: "POST",
            contentType: 'application/json',
            data: JSON.stringify(outputJson),
            success: function(result) {
                // 成功時の処理
                console.log(result["chkResult"]);
                //ボタン押下開放
                isPosting = false;

                if (result["chkResult"] == null || result["chkResult"] == "") {
                    //チェックエラーなし、保存処理継続
                    $('#errMsgDiv').addClass("d-none");
                    $('#userAddBtn').prop('disabled', true);
                    showAxioMessage("処理は正常終了しました。","success");
                    
                } else {
                    //エラーメッセージを表示
                    $("#errMsgP").text(result["chkResult"]);
                    $('#errMsgDiv').removeClass("d-none");
                }
                
            },
            error: function(err) {
                //ボタン押下開放
                isPosting = false;
                //エラーメッセージを表示
                showAxioMessage("処理は失敗しました。","warning");
            }
        });
    }

  // 反映待ちユーザウィンドウ表示
  $("#openUserCsvReserveBtn").click(function(){
    window.open('./reserve', null, 'width=1300,height=1400,toolbar=yes,menubar=yes,scrollbars=yes');
    
  });

  // エラーレコード詳細表示
  $(document).on("click", "tr.csvUserErrorRecord", function() {
    // クリックイベントの処理。ここでの this はクリックされたDOM要素を指します。
    // 特定のクラスが含まれているか確認
    if ($(this).hasClass("csvUserErrorRecord")) {
      // ここは特定のクラスを持つ行がクリックされたときの処理コードです
      let rowData = $(this).find("td"); // 行全体のDOM要素を取得
      // rowData内の各td要素を反復処理
      rowData.each(function(index) {
        let cellValue = $(this).text(); // td要素のテキストコンテンツを取得
        console.log("td" + index + ": " + cellValue);
      });

      // tr要素のid値を取得
      var rowId = $(this).attr("id");
      console.log("tr id: " + rowId);

      // $("#errorMessageModal").modal("show");
      let errorMessages = $(this).data('errorMessages');
      let keyToTextMap = {
        processKbn: '差分',
        userId: '利用者ID',
        reflectionDate: '反映日',
        column1:'利用者区分',
        column2:'氏名（英字）',
        column3:'氏名（漢字）',
        column4:'学籍番号',
        column5:'VPN',
        duplicateError:'重複チェック',
        notRegisterError:'存在チェック',
        reserveError:'反映チェック',
        alreadyUnLockError:'未ロックチェック',
        alreadyDelError:'削除チェック',
        alreadyLockError:'ロック済チェック',
      };
      let errorMessageHTML = '<hr><div style="text-align: left">';
      for (let key in errorMessages) {
        if (errorMessages.hasOwnProperty(key)) {
          let labelText = keyToTextMap[key] || key;
          errorMessageHTML += `<span style="font-size: 18px;">${labelText}: ${errorMessages[key]}</span><br>`;
        }
      }
      errorMessageHTML += '</div><hr>';

      Swal.fire({
        icon: `error`,
        title: `エラー内容`,
        html: errorMessageHTML,
        width: '26%',
        confirmButtonText: '閉じる',
        customClass: {
          confirmButton: 'custom-ok-button',
        }
      });
    }
  });

  function showSwalAlertWithButton(message,type) {
    Swal.fire({
      icon: `${type}`,
      title: `確認画面`,
      html: `<span style="font-size: 20px; color: green;">${message}</span>`,
      width: '20%',
      confirmButtonText: '閉じる',
      customClass: {
        confirmButton: 'custom-ok-button'
      }
    });
  }

  function showSwalAlertNoButton(message,type) {
    Swal.fire({
      icon: `${type}`,
      title: '処理中です...',
      width: '20%',
      html: `<span style="font-size: 20px; color: green;">${message}</span>`,
      allowOutsideClick: false,
      didOpen: () => {
        Swal.showLoading()
      }
    });
  }
});