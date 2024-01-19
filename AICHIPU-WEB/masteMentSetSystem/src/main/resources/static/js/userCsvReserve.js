// new DataTable('#userListTable');
var isPosting = false;
jQuery(function ($) {
  // デフォルトの設定を変更
  let isButtonClicked = false;
  // 取得したデータを dataList 配列に追加します
  let dataList = [];
  // let errorMessages ;
  let count=0;
  // 反映待ちユーザ差分テーブル
 let $tables = $("#userDiffReserveTable").DataTable({
   drawCallback: function(settings) {
     $('#userDiffReserveTable tbody tr').hide().fadeIn('slow');
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

    // 状態を保存する機能をつける
    // stateSave: true,

    //テーブルヘッダーを固定
    fixedHeader: true,

    // 初期表示並び順
    order: [[2, "asc"]],

   columns: [
     {
       "data": "userId",
       "render": function (data) {
           return  `<td><button type="button" class="btn btn-outline-secondary userViewBtn" id="userCancelBtn"><i class="fa-solid fa-trash"></i></button>
              <input type="hidden" id="userId" name="userId" value="${data}" />
            </td>`;
       }
     },
     //CSV項目.利用者ID
     { "data": "userId"
     },//CSV項目.反映日
     //利用者区分
     { "data": "employmentKbn",
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
     },
     {//反映日
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
     { "data": "fullnameJp" },
     //氏名（英字）
     { "data": "fullnameEn" },
     //学籍番号
     { "data": "employeeId" },
     //VPN利用
     { "data": "vpnUsage",
       "render":function (data) {
         data = (data === '*' ? '1' : data);
         return data === '1' ? '○' : '×';
       }
     },
     //サイボウズ
     { "data": "cybozu",
       "render":function (data) {
         return data === '1' ? '○' : '×';
       }
     },
     //並列演算装置
     { "data": "parallelComputing",
       "render":function (data) {
         return data === '1' ? '○' : '×';
       }
     },

     //教育システム
     { "data": "educationSystem",
       "render":function (data) {
         return data === '1' ? '○' : '×';
       }
     },
     //演習室１
     { "data": "exerciseRoom",
       "render":function (data) {
         return data === '1' ? '○' : '×';
       }
     },

   ],

    // 項目定義
    columnDefs: [
      // 「取り消し」列
      // 中央寄せ
      {
        targets: 0,
        width: 90,
        className: 'dt-head-center'
      },
      {
        targets: 0,
        className: 'dt-body-center',
        width: 90,

      },
      //　利用者ID
      {
        targets: 1,
        className: 'dt-head-center',
        width: 90
      },
      {
        targets: 1,
        className: 'dt-body-center',
        width: 90
      },
      //利用者区分
      {
        targets: 2,
        className: 'dt-head-center',
        width: 105
      },
      {
        targets: 2,
        className: 'dt-body-center',
        width: 105
      },
      // 反映日
      {
        targets: 3,
        className: 'dt-head-center',
        width: 75
      },
      {
        targets: 3,
        className: 'dt-body-center',
        width: 75
      },
      // 氏名(漢字)
      {
        targets: 4,
        className: 'dt-head-center',
        width: 115
      },
      {
        targets: 4,
        className: 'dt-body-center',
        width: 120
      },
      // 氏名(英字)
      {
        targets: 5,
        className: 'dt-head-center',
        width: 120
      },
      {
        targets: 5,
        className: 'dt-body-center',
        width: 120
      },
      // 学籍番号
      {
        targets: 6,
        className: 'dt-head-center',
        width: 100
      },
      {
        targets: 6,
        className: 'dt-body-center',
        width: 100
      },
      // VPN利用
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
      // サイボウズ
      {
        targets: 8,
        className: 'dt-head-center',
        width: 110
      },
      {
        targets: 8,
        className: 'dt-body-center',
        width: 110
      },
      // 並列演算装置
      {
        targets: 9,
        className: 'dt-head-center',
        width: 120
      },
      {
        targets: 9,
        className: 'dt-body-center',
        width: 120
      },
      // 教育システム
      {
        targets: 10,
        className: 'dt-head-center',
        width: 120
      },
      {
        targets: 10,
        className: 'dt-body-center',
        width: 120
      },
      // 演習室１
      {
        targets: 11,
        className: 'dt-head-center',
        width: 100
      },
      {
        targets: 11,
        className: 'dt-body-center',
        width: 100
      },

    ],
    fixedColumns: {
      leftColumns: 1,
    }
  });

  $('#userUpdate').on('click', function() {
    let reflectionDate = $(".inquiryContent").val();
    axios.post('./reserveList', { reflectionDate: reflectionDate })
        .then(function(response) {
          if (response.status === 200 ) {
            dataList = response.data;
            // 古いデータをクリアする
            $tables.clear();
            // 新しいデータを追加する
            $tables.rows.add(response.data);
            // テーブルを再描画する
            $tables.draw();
          }
        })
        .catch(function(error) {

          console.error(error);
        });
  });
  $(".inquiryContent").on("change", function() {
    let reflectionDate = $(this).val();
    axios.post('./reserveList', { reflectionDate: reflectionDate })
        .then(function(response) {
          if (response.status === 200 ) {
            dataList = response.data;
            // 古いデータをクリアする
            $tables.clear();
            // 新しいデータを追加する
            $tables.rows.add(response.data);
            // テーブルを再描画する
            $tables.draw();
          }
        })
        .catch(function(error) {

          console.error(error);
        });
  });
  $('#userCancel').on('click', function() {
    showSwalAlertWithButton("取り消しを行います。よろしいですか？","info");
  });

  $(document).on('click', '.userViewBtn', function() {

    Swal.fire({
      title: '取り消し確認？',
      html: `<span style="font-size: 18px; color: green;">取り消しを行います。よろしいですか？</span>`,
      icon: `info`,
      showCancelButton: true,
      confirmButtonClass: 'btn btn-success',
      cancelButtonClass: 'btn btn-danger',
      confirmButtonText: '確認',
      cancelButtonText: 'キャンセル',
      reverseButtons: true, // 確認とキャンセルボタンの位置を入れ替え
      width: '26%'
    }).then((result) => {
      if (result.isConfirmed) {

        let tdElement = $(this).closest('td');
        let rowElement = tdElement.closest('tr');
        let riYouShaId = tdElement.find('input[type="hidden"]').val();
        let reflectionDate = $(".inquiryContent").val();
        let formData = {
          riYouShaId : riYouShaId,
          hanEiDt: reflectionDate
        };

        axios.post('./csvUserCancel', formData, {
          headers: {
            'Content-Type': 'application/json'
          }
        })
            .then(function (response) {
              if (response.status === 200) {
                rowElement.animate({
                  backgroundColor: "#ffcccc"
                }, 300, function() {
                  rowElement.fadeOut('slow', function() {
                    rowElement.remove();
                    dataList = response.data;
                    $tables.clear();
                    $tables.rows.add(dataList);
                    $tables.draw();
                  });
                });
              }
            })
            .catch(function (error) {
              console.error(error);
            });
     　　 }
    });
  });

  function showSwalAlertWithButton(message,type) {
    Swal.fire({
      title: '取り消し確認？',
      html: `<span style="font-size: 18px; color: green;">${message}</span>`,
      icon: `${type}`,
      showCancelButton: true,
      confirmButtonClass: 'btn btn-success',
      cancelButtonClass: 'btn btn-danger',
      confirmButtonText: '確認',
      cancelButtonText: 'キャンセル',
      reverseButtons: true, // 確認とキャンセルボタンの位置を入れ替え
      width: '26%'
    }).then((result) => {
      if (result.isConfirmed) {

        let hiddenValues = [];

        $('input[name="userId"]').each(function() {
          let hiddenInput = $(this);
          hiddenValues.push(hiddenInput.val());
        });

        let reflectionDate = $(".inquiryContent").val();
        let formData = {
          riYouShaIds: hiddenValues,
          reflectionDate: reflectionDate
        };

        axios.post('./csvUserCancelList', formData, {
          headers: {
            'Content-Type': 'application/json'
          }
        })
            .then(function (response) {
              if (response.status === 200) {
                  dataList = response.data;
                  $tables.clear();
                  $tables.rows.add(dataList);
                  $tables.draw();
                Swal.fire('取り消し処理完了しました。', '', 'success');
              }
            })
            .catch(function (error) {
              console.error(error);
            });

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

  // ウィンドウ閉じるボタン押下時
  $("#windowClose").click(function(){
    window.close();

  });

});