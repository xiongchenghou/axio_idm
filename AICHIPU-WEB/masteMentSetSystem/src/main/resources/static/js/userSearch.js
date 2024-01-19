/**
 * 名前空間を作成します。
 * 既に存在している階層については作成しません。
 * @prame ns .区切りの名前空間文字列
 * 依存関係については、requiere.jsでの管理やgulpのpolify等は行いません。
 * また、オブジェクトの階層によって、ライブラリを管理し必要に応じて即時関数を利用しグローバル領域を安全に保ってください。
 */
namespace = function(ns) {
  var o=null;
  var unit=ns.split(".");
  o=window;
  for (var j=0; j<unit.length; j=j+1) {
    o[unit[j]]=o[unit[j]] || {};
    o=o[unit[j]];
  }
  return o;
};


namespace('axio.userSet');

// new DataTable('#userListTable');
jQuery(function ($) {

  var isButtonClicked = false;
  // デフォルトの設定を変更
  var $tables = $("#userListTable").DataTable({
    drawCallback: function(settings) {
      $('#userListTable tbody tr').hide().fadeIn('slow');
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
    order: [[3, "asc"]],

    columns: [
      {
        "data": "userId",
        "render": function (data) {
            return '<input class="form-check-input"  type="checkbox" id="userId" value="' + data + '">';
            }
      },
      { "data": "userReserve",
        "render":function (data, type, row, meta) {
          let userId = row.userId;
          let futureUserFlag = row.futureUserFlag;
          if (data === '1' && futureUserFlag === '0' && row.status === 'valid') {
            return '<button type="button" class="btn btn-outline-secondary userViewBtn" data-userid="' + userId + '"> ' +
                '<i class="fa-solid fa-info"></i><i class= "fa-regular fa-clock"> </i>'+
                '</button>';
          }else {
            return '<button type="button" class="btn btn-outline-secondary userViewBtn" data-userid="' + userId + '"> ' +
                '<i class="fa-solid fa-info"></i>' +
            '</button>';
          }
        }
      },
      { "data": "status",
        "render":function (data, type, row, meta) {
          if (data === 'valid') {
            return  `<i class="fa-solid fa-user"></i>有効<input type="hidden" class="status_hid" value="${data}">`;
          } else if (data === 'invalid') {
            // return  '<i class="fa-solid fa-user-slash"></i>無効';
            return  `<i class="fa-solid fa-user-slash"></i>削除<input type="hidden" class="status_hid" value="${data}">`;
          } else if (data === 'lock') {
            return  `<i class="fa-solid fa-user-lock"></i>ロック<input type="hidden" class="status_hid" value="${data}">`;
          } else if (data === 'reserve') {
            return  `<i class="fa-regular fa-circle-user"></i>未来<input type="hidden" class="status_hid" value="${data}">`;
          }else {
            return  `<i class="fa-regular fa-circle-user"></i>不明<input type="hidden" class="status_hid" value="${data}">`;
          }
        }
      },
      { "data": "userId"},
      { "data": "employmentName" },
      { "data": "fullnameJp" },
      { "data": "fullnameEn" },
      { "data": "department" },
      { "data": "vpn",
        "render":function (data, type, row, meta) {
          return data === '1' ? '○' : '×';
        }
      },
    ],
    // 項目定義
    columnDefs: [
      // 「選択」列
      // 中央寄せ
      {
        targets: 0,
        className: 'dt-head-center',
        "orderable": false
      },
      {
        targets: 0,
        className: 'dt-body-center',
      },
      {
        targets: 0,
        width: 60,
      },
      // 詳細列
      {
        targets: 1,
        className: 'dt-head-center',
        "orderable": false,
        width: 70

      },
      {
        targets: 1,
        className: 'dt-body-center',
        width: 70
      },
      // 状態
      {
        targets: 2,
        width: 80
      },
      // 利用者ID
      {
        targets: 3,
        width: 100
      },
      // 利用者区分
      {
        targets: 4,
        width: 100
      },

      // 氏名（漢字）
      {
        targets: 5,
        width: 140
      },
      // 氏名（英字）
      {
        targets: 6,
        width: 140
      },
      // 所属
      {
        targets: 7,
        width: 100
      },
      // VPN利用
      {
        targets: 8,
        className: 'dt-head-center',
      },
      {
        targets: 8,
        className: 'dt-body-center',
        width:100
      },

    ],

    //左から3番目のカラムを固定
    fixedColumns: {
      left: 1,
    }
  });


  // クリアボタンのクリックイベント
  $('#clearBtn').click(function() {
    Swal.fire({
      title: '確認画面',
      // text: '検索条件をクリアします。よろしいですか？',
      html: '<span style="font-size: 18px; color: green;">検索条件をクリアします。よろしいですか？</span>',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonClass: 'btn btn-success',
      cancelButtonClass: 'btn btn-danger',
      confirmButtonText: 'クリア',
      cancelButtonText: 'キャンセル',
      reverseButtons: true, // 確認とキャンセルボタンの位置を入れ替え
      width: '20%'
    }).then((result) => {
      if (result.isConfirmed) {
        // テキスト"タイプのすべての入力ボックスをクリアする
        $('#clearFlag').find('input[type="text"]').val('');
        // すべての選択要素をリセットする
        $('#clearFlag').find('select').each(function() {
          $(this).prop('selectedIndex', 0);
        });
        // すべてのチェックボックスの選択を解除する
        $('#clearFlag').find('input[type="checkbox"]').prop('checked', false);
        $("#changedDataFlg").val("");
        Swal.fire('クリアされました', '', 'success');
      }
    });


  });


  // 取得したデータを dataList 配列に追加します
  var dataList = [];

  // "検索"ボタンのイベントハンドラ
  $('#searchBtn').click(function() {
    returnInitStatus();
    //重複の送信を防止する START
    if (isButtonClicked) {
      return;
    }

    isButtonClicked = true;
    setTimeout(function() {
      isButtonClicked = false;
    }, 1000);
    //重複の送信を防止する END

    var actionUrl = $(this).data('action');
    // フォームデータの収集
    var formData = {
      clientId: $('#clientId').val(),
      userDiv: $('#userDiv').val(),
      fullNameJp: $('#fullNameJp').val(),
      fullNameEn: $('#fullNameEn').val(),
      campusList: $('#campus').val(),
      departmentList: $('#department').val(),
      entranceYear: $('#entranceYear').val(),
      vpn: $('#vpn').val(),
      validUserChecked: $('#validUserChecked').is(':checked'), // 選択されているかを確認
      invalidUserChecked: $('#invalidUserChecked').is(':checked'), // 選択されているかを確認
      lockUserChecked: $('#lockUserChecked').is(':checked'), // 選択されているかを確認
      futureUserChecked: $('#futureUserChecked').is(':checked'), // 選択されているかを確認
      initPassword: $('#initPassword').is(':checked') // 選択されているかを確認
    };

    // バックエンドAPIにリクエストを送信する
    axios.post(actionUrl, formData)
        .then(function(response) {
          dataList = response.data;
          // 古いデータをクリアする
          $tables.clear();
          // 新しいデータを追加する
          $tables.rows.add(response.data);
          // テーブルを再描画する
          $tables.draw();

        })
        .catch(function(error) {
          // リクエスト失敗の処理
          console.error('Search error:', error);
        });
  });

  // ユーザ新規作成ボタン
  $("#userAddBtn").click(function () {
    window.location.href = webAppName + "/userRegist";
  });

  /**
   * 戻るボタン押下
   */
  $("#btn_back").on("click", function(e) {
    if ($("#changedDataFlg").val()) {
      var that = this;
      var $div = $("<div id='_dialogLeave'><span>保存されていないため、入力した内容が破棄されますがよろしいですか？</span></div>");
      e.preventDefault();

      $div.dialog({
        title: '確認',
        modal:true,
        autoOpen: false,
        modal: true,
        buttons: [
          {
            text: 'OK' ,
            class: 'btn'  ,
            click: function(){
              preventEvent = false;
              $("#changedDataFlg").val("");
              $(this).dialog("close");
              window.location.href = $(that).attr("href");
            }
          },
          {
            text: 'キャンセル' ,
            class: 'btn' ,
            click: function(){
              $(this).dialog("close");
            }
          }
        ],
        open:function(event, ui){ $(".ui-dialog-titlebar-close").hide();}
      });
      $div.dialog('open');
    }
  });

  // ユーザ閲覧ボタン
  $(document).on("click", ".userViewBtn", function () {
    var userId = $(this).data("userid"); //
    $('input[type="hidden"][name="userId"]').val(userId);
    $('#userViewForm').submit();
  });

  // 反映待ちユーザ閲覧ボタン
  $(".userReserved").click(function () {
    location.href = "../../../templetes/AdminMaintenance/UserSearch/UserMaintenanceViewReserve.html"

  });

  // ユーザ編集ボタン
  $("#userEditBtn").click(function () {
    location.href = "../../../templetes/AdminMaintenance/UserSearch/UserMaintenanceEdit.html"

  });

  // ユーザ未来日編集ボタン
  $("#openUserMaintenanceEditReserve").click(function () {

    location.href = "../../../templetes/AdminMaintenance/UserSearch/UserMaintenanceEditReserve.html"

  });


  // モーダル表示
  // ロック確認
  $('#userLockMultiBtn').click(function () {
    // ビジネスロジックに基づいてロックするユーザの数を計算する
    var userCount = calculateSelectedUserCount();

    // モーダルの内容要素を更新
    $('#userLockModal_Content').html(`
        <div style="margin-bottom: 15px;">
            ${userCount}件のユーザをロックします。<br/>
            よろしいですか？
        </div>
    `);
    // モーダルの内容を表示
    $('#userLockMultiConfirmModal').modal('show');
  });

  // ボタンがクリックされた場合、以下の操作を実行します
  $("#userLockMultiConfirmModalProcessBtn").click(function () {

    // 選択されているすべてのチェックボックスを取得する

    var selectedCheckboxes = $("input[type='checkbox'][id='userId']:checked");

    // 選択されたチェックボックスの値を格納する空のuserId配列を作成します
    var userIds = [];

    // 選択されたチェックボックスを繰り返し処理し、その値をuserId配列に追加します
    selectedCheckboxes.each(function () {
      userIds.push($(this).val());
    });

    // Ajax POST リクエストを送信する
    // userId 配列が空かどうかを確認する
    if (userIds.length > 0) {
      var formData = {
        userId: userIds,
      };
      $("#userLockMultiConfirmModal").modal("hide");
      // ローディングアニメーションを表示すべきかどうかを追跡する変数を定義します
      let shouldShowLoading = true;
      // リクエストが完了する前に表示する場合、1秒のタイムアウトを設定し、それ以前にローディングアニメーションを表示しないようにします
      const loadingTimeout = setTimeout(() => {
        if (shouldShowLoading) {
          showSwalAlertNoButton('しばらくお待ちください...','info');
        }
      }, 300);
     onCheckboxChange();
      // バックエンドAPIにリクエストを送信する
      axios.post("./userLock", formData)
          .then(function(response) {
            if (response.status === 200 ){
              // リクエストが完了したため、shouldShowLoadingをfalseに設定します
              shouldShowLoading = false;
              clearTimeout(loadingTimeout); // タイムアウトをクリア
              Swal.close(); // ローディングアニメーションを閉じる

              // $("#userLockMultiConfirmModal").modal("hide");
              const updateData = 'lock'; // 更新後の状態値
              reSetupStatus(userIds,updateData); // ロック更新後の状態値を設定

              showSwalAlert("ロック操作は成功しました。","success");
            } else {
              // $("#userLockMultiConfirmModal").modal("hide");
              showSwalAlert("ロック操作が失敗しました。","warning");

            }
          })
          .catch(function(error) {
            // リクエストが完了したため、shouldShowLoadingをfalseに設定します
            shouldShowLoading = false;
            clearTimeout(loadingTimeout); // タイムアウトをクリア
            Swal.close(); // ローディングアニメーションを閉じる

            if (error.code === 'ECONNABORTED') {
              // タイムアウトエラーの場合、カスタムエラーメッセージを表示
              showSwalAlert("リクエストがタイムアウトしました、後で再試行してください。","error");

            } else {
              // その他のリクエストエラー、エラーを処理
              showSwalAlert("サーバーで問題が発生しました。後で再試行してください。","error");
            }
            console.error('リクエストエラー:', error);

          });
    } else {

      $("#userLockMultiConfirmModal").modal("hide");
      showSwalAlert("ユーザが選択されていません。","info");
    }
  });


  // ロック解除確認
  $('#userUnLockMultiBtn').click(function () {
    // ロックする必要のあるユーザ数を計算する
    var userCount = calculateSelectedUserCount();

    // モーダルの内容要素を更新
    $('#userUnlockModal_Content').html(`
        <div style="margin-bottom: 15px;">
            ${userCount}件のユーザのロックを解除します。<br/>
            よろしいですか？
        </div>
    `);
    // モーダルの内容を表示
    $('#userUnlockMultiConfirmModal').modal('show');
  });

  // ボタンがクリックされた場合、以下の操作を実行します
  $("#userUnlockMultiConfirmModalProcessBtn").click(function () {

    var selectedCheckboxes = $("input[type='checkbox'][id='userId']:checked");
    // 選択されたチェックボックスの値を格納する空のuserId配列を作成します
    var userIds = [];
    // 選択されたチェックボックスを繰り返し処理し、その値をuserId配列に追加します
    selectedCheckboxes.each(function () {
      userIds.push($(this).val());
    });

    // Ajax POST リクエストを送信する
    // userId 配列が空かどうかを確認する
    if (userIds.length > 0) {
      var formData = {
        userId: userIds,
      };
      $("#userUnlockMultiConfirmModal").modal("hide");
      // ローディングアニメーションを表示すべきかどうかを追跡する変数を定義します
      let shouldShowLoading = true;
      // リクエストが完了する前に表示する場合、1秒のタイムアウトを設定し、それ以前にローディングアニメーションを表示しないようにします
      const loadingTimeout = setTimeout(() => {
        if (shouldShowLoading) {
          showSwalAlertNoButton('しばらくお待ちください...','info');
        }
      }, 300);
     onCheckboxChange();
      // バックエンドAPIにリクエストを送信する
      axios.post("./userUnlock", formData)
          .then(function(response) {

            if (response.status === 200 ){
              shouldShowLoading = false;
              clearTimeout(loadingTimeout); // タイムアウトをクリア
              Swal.close(); // ローディングアニメーションを閉じる

              const updateData = 'valid'; // 無効の更新後の状態値
              reSetupStatus(userIds,updateData); // 更新後の状態値を設定

              showSwalAlert("ロック解除は成功しました。","success");

            } else {
              showSwalAlert("ロック解除処理NG。","warning");
              // $("#userUnlockMultiConfirmModal").modal("hide");
            }
          })
          .catch(function(error) {
            shouldShowLoading = false;
            clearTimeout(loadingTimeout); // タイムアウトをクリア
            Swal.close(); // ローディングアニメーションを閉じる
            // リクエスト失敗の処理
            console.error('Search error:', error);
            showSwalAlert(`ロック解除処理がエラーになりました、エラー：${error}`,"error");
          });
    } else {
      $("#userUnlockMultiConfirmModal").modal("hide");
      showSwalAlert("ユーザが選択されていません。","info");

    }
  });

function reSetupStatus(userIds,status) {
  // 選択された userId を繰り返し処理
  userIds.forEach(function(userId) {
    // ユーザのデータを検索
    let dataItemToUpdate = dataList.find(item => item.userId === userId);

    if (dataItemToUpdate) {
      // データ項目の状態を更新
      dataItemToUpdate.status = status;

      // テーブル内の対応行のデータを更新
      const rowIndexToUpdate = $tables.row(`#${userId}`).index();
      $tables.row(rowIndexToUpdate).data(dataItemToUpdate);

      // 変更を反映するためにテーブルを再描画
      $tables.draw(false);
    }
  });

}
  // 有効確認
  $('#userValidMultiBtn').click(function () {
    // ロックする必要のあるユーザ数を計算する
    var userCount = calculateSelectedUserCount();
    // モーダルの内容要素を更新
    $('#userValidModal_Content').html(`
        <div style="margin-bottom: 15px;">
            ${userCount}件のユーザを有効にします。<br/>
            よろしいですか？
        </div>
    `);
    // モーダルの内容を表示
    $('#userValidMultiConfirmModal').modal('show');
  });

  // ボタンがクリックされた場合、以下の操作を実行します
  $("#userValidMultiConfirmModalProcessBtn").click(function () {

    var selectedCheckboxes = $("input[type='checkbox'][id='userId']:checked");

    // 選択されたチェックボックスの値を格納する空のuserId配列を作成します
    var userIds = [];

    // 選択されたチェックボックスを繰り返し処理し、その値をuserId配列に追加します
    selectedCheckboxes.each(function () {
      userIds.push($(this).val());
    });

    // Ajax POST リクエストを送信する
    // userId 配列が空かどうかを確認する
    if (userIds.length > 0) {
      var formData = {
        userId: userIds,
      };
      $("#userValidMultiConfirmModal").modal("hide");
      // ローディングアニメーションを表示すべきかどうかを追跡する変数を定義します
      let shouldShowLoading = true;
      // リクエストが完了する前に表示する場合、1秒のタイムアウトを設定し、それ以前にローディングアニメーションを表示しないようにします
      const loadingTimeout = setTimeout(() => {
        if (shouldShowLoading) {
          showSwalAlertNoButton('しばらくお待ちください...','info');
        }
      }, 300);
     onCheckboxChange();
      // バックエンドAPIにリクエストを送信する
      axios.post("./userValid", formData)
          .then(function(response) {

            if (response.status === 200 ){
              shouldShowLoading = false;
              clearTimeout(loadingTimeout); // タイムアウトをクリア
              Swal.close(); // ローディングアニメーションを閉じる

              const updateData = 'valid'; // 更新後の状態値
              reSetupStatus(userIds,updateData); // ロック更新後の状態値を設定
              Swal.fire({
                icon: 'success',
                title: '実行結果',
                html: '<span style="font-size: 18px; color: green;">選択されたユーザを有効にしました。</span>',
              });
            } else {
              // $("#userValidMultiConfirmModal").modal("hide");+
              showSwalAlert("有効処理NG。","warning");

            }
          })
          .catch(function(error) {
            shouldShowLoading = false;
            clearTimeout(loadingTimeout); // タイムアウトをクリア
            Swal.close(); // ローディングアニメーションを閉じる
            // リクエスト失敗の処理
            console.error('Search error:', error);
            showSwalAlert(`有効処理がエラーになりました、エラー：${error}`,"error");

          });
    } else {
      $("#userValidMultiConfirmModal").modal("hide");
      showSwalAlert("ユーザが選択されていません。","info");


    }
  });

  // 削除確認
  $('#userDelMultiBtn').click(function () {
    // ロックする必要のあるユーザ数を計算する
    var userCount = calculateSelectedUserCount();

    // モーダルの内容要素を更新
    $('#userDeleteModal_Content').html(`
        <div style="margin-bottom: 15px;">
            ${userCount}件のユーザを削除します。<br/>
            よろしいですか？
        </div>
    `);
    // モーダルの内容を表示
    $('#userDeleteMultiConfirmModal').modal('show');
  });


  // ボタンがクリックされた場合、以下の操作を実行します
  $("#userDeleteMultiConfirmModalProcessBtn").click(function () {

    // 選択されているすべてのチェックボックスを取得する
    var selectedCheckboxes = $("input[type='checkbox'][id='userId']:checked");

    // 選択されたチェックボックスの値を格納する空のus rId配列を作成します
    var userIds = [];

    // 選択されたチェックボックスを繰り返し処理し、その値をuserId配列に追加します
    selectedCheckboxes.each(function () {
      userIds.push($(this).val());
    });

    // Ajax POST リクエストを送信する
    // userId 配列が空かどうかを確認する
    if (userIds.length > 0) {
      var formData = {
        userId: userIds,
      };
      $("#userDeleteMultiConfirmModal").modal("hide");
      // ローディングアニメーションを表示すべきかどうかを追跡する変数を定義します
      let shouldShowLoading = true;
      // リクエストが完了する前に表示する場合、1秒のタイムアウトを設定し、それ以前にローディングアニメーションを表示しないようにします
      const loadingTimeout = setTimeout(() => {
        if (shouldShowLoading) {
          showSwalAlertNoButton('しばらくお待ちください...','info');
        }
      }, 300);
     onCheckboxChange();
      // バックエンドAPIにリクエストを送信する
      axios.post("./userDoDelete", formData)
          .then(function(response) {

            if (response.status === 200 ){
              shouldShowLoading = false;
              clearTimeout(loadingTimeout); // タイムアウトをクリア
              Swal.close(); // ローディングアニメーションを閉じる

              const updateData = 'invalid'; // 更新後の状態値
              reSetupStatus(userIds,updateData); // ロック更新後の状態値を設定
              Swal.fire({
                icon: 'success',
                title: '実行結果',
                html: '<span style="font-size: 18px; color: green;">選択されたユーザを削除しました。</span>',
              });
            } else {
              showSwalAlert("有効処理NG。","warning");
              // $("#userDeleteMultiConfirmModal").modal("hide");
            }
          })
          .catch(function(error) {
            shouldShowLoading = false;
            clearTimeout(loadingTimeout); // タイムアウトをクリア
            Swal.close(); // ローディングアニメーションを閉じる
            // リクエスト失敗の処理
            console.error('Search error:', error);
            showSwalAlert(`削除処理がエラーになりました、エラー：${error}`,"error");

          });
    } else {
      showSwalAlert("ユーザが選択されていません。","info");
      $("#userDeleteMultiConfirmModal").modal("hide");
    }
  });
  //選択したユーザ数を返す
  function calculateSelectedUserCount() {
    //チェックボックスが選択されたユーザを取得して数を返す
    return $('#userListTable .form-check-input:checked').length;
  }

  //CSVダウンロード処理イベント
  $("#csvDownloadBtn").click(function () {
    // ロックする必要のあるユーザ数を計算する
    var userCount = calculateSelectedUserCount();

    // モーダルの内容要素を更新
    $('#userCsvDownloadModal_Content').html(`
        <div style="margin-bottom: 15px;">
            ${userCount}件のユーザデータをダウンロードします。<br/>
            よろしいですか？
        </div>
    `);
    // モーダルの内容を表示
    $('#userCsvDownloadMultiConfirmModal').modal('show');
  });

  // ボタンがクリックされた場合、以下の操作を実行します
  $("#userCsvDownloadMultiConfirmModalProcessBtn").click(function () {

    // 選択されているすべてのチェックボックスを取得する
    var selectedCheckboxes = $("input[type='checkbox'][id='userId']:checked");

    // 選択されたチェックボックスの値を格納する空のuserId配列を作成します
    var userIds = [];

    // 選択されたチェックボックスを繰り返し処理し、その値をuserId配列に追加します
    selectedCheckboxes.each(function () {
      userIds.push($(this).val());
    });

    // Ajax POST リクエストを送信する
    // userId 配列が空かどうかを確認する
    if (userIds.length > 0) {
      var formData = {
        userId: userIds,
      };
      $("#userCsvDownloadMultiConfirmModal").modal("hide");
      // ローディングアニメーションを表示すべきかどうかを追跡する変数を定義します
      let shouldShowLoading = true;
      // リクエストが完了する前に表示する場合、1秒のタイムアウトを設定し、それ以前にローディングアニメーションを表示しないようにします
      const loadingTimeout = setTimeout(() => {
        if (shouldShowLoading) {
          showSwalAlertNoButton('しばらくお待ちください...','info');
        }
      }, 300);
      // onCheckboxChange();
      // バックエンドAPIにリクエストを送信する
      axios.post("./userCsvDownload", formData)
          .then(function(response) {

            if (response.status === 200 ){
              shouldShowLoading = false;
              clearTimeout(loadingTimeout); // タイムアウトをクリア
              Swal.close(); // ローディングアニメーションを閉じる

              // レスポンスからバイナリデータ（CSVファイル）を取得
              const blob = new Blob([response.data], {type: 'text/csv'});
              // 要素を作成
              const downloadLink = document.createElement('a');
              downloadLink.href = window.URL.createObjectURL(blob);

              downloadLink.download = response.headers['content-disposition'].split('filename=')[1];
              // ダウンロードリンクを模倣する
              downloadLink.click();
              showSwalAlert("ダウンロードを開始します。","success");
            }else{
              showSwalAlert("ダウンロード処理が失敗しました。","warning");
              $("#userCsvDownloadMultiConfirmModal").modal("hide");
            }
          })
          .catch(function(error) {
            shouldShowLoading = false;
            clearTimeout(loadingTimeout); // タイムアウトをクリア
            Swal.close(); // ローディングアニメーションを閉じる
            // リクエスト失敗の処理
            console.error('APIリクエストエラー:', error);
            showSwalAlert(`ダウンロード処理がエラーになりました、エラー：${error}`,"error");
          });
    } else {
      $("#userCsvDownloadMultiConfirmModal").modal("hide");
      showSwalAlert("利用者が選択されていません。","info");
    }
  });

// 通知バーを表示
  function showNotification(message, type = 'success') {
    const notificationBar = document.getElementById('notification-bar');
    notificationBar.textContent = message;
    notificationBar.className = type; // タイプに応じて異なるスタイルを設定できます
    notificationBar.style.display = 'block';
    if (type === 'error') {
      notificationBar.style.backgroundColor = 'red';
    }else if (type === 'success') {
      notificationBar.style.backgroundColor = '#4CAF50';
    }

    // タイマーを設定して、一定時間後に通知バーを非表示にする
    setTimeout(() => {
      notificationBar.style.display = 'none';
    }, 5000); // 5秒後に通知バーを非表示にする
  }

  function showSwalAlert(message,type) {
    Swal.fire({
      icon: `${type}`,
      title: `確認画面`,
      html: `<span style="font-size: 18px; color: green;">${message}</span>`,
      width: '20%',
      confirmButtonText: '確認',
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

// テキスト変更時
  $("input[type='text'],input[type='select'],input[type='checkbox'],select").on("change", function() {
    // データ変更をマーク
    $("#changedDataFlg").val("on");
  });


// チェックボックスがチェックされた時, チェックボックスを全チェックする・しない
  $('#all_checks').change(function() {
    var allChecked = $(this).prop('checked');
    $("input[type='checkbox'][id='userId']").prop('checked', allChecked);

    if (!allChecked ){
      $('#userLockMultiBtn, #userValidMultiBtn, #userUnLockMultiBtn, #userDelMultiBtn').prop('disabled', false);
    }else{
      setButDisable();
    }
  });


  $('#userListTbody').on('change', "input[type='checkbox'][id='userId']", function() {
    var allCheckboxes = $('#userListTbody input[type="checkbox"][id="userId"]');
    var checkedCheckboxes = allCheckboxes.filter(':checked');

    // すべて選択
    if (checkedCheckboxes.length === allCheckboxes.length) {
      $('#all_checks').prop('checked', true).prop('indeterminate', false);
    }
// すべて未選択
    else if (checkedCheckboxes.length === 0) {
      $('#all_checks').prop('checked', false).prop('indeterminate', false);
    }
// 一部選択
    else {
      $('#all_checks').prop('checked', false).prop('indeterminate', true);
    }
    setButDisable();
  });

  function onCheckboxChange(){
    $('#all_checks').prop('checked', false).prop('indeterminate', false);
  }
  function setButDisable() {
    let allChecked = $("input[type='checkbox'][id='userId']");
    let hasValid = false;
    let hasLock = false;
    let hasDelete = false;
    let hasFuture = false;

    // 全てのチェックボックスをループ処理
    allChecked.each(function() {
      let statusValue = $(this).closest('tr').find("input.status_hid").val();

      if ($(this).is(':checked')) {
        hasValid |= statusValue === 'valid';
        hasLock |= statusValue === 'lock';
        hasDelete |= statusValue === 'invalid';
        hasFuture |= statusValue === 'reserve';
      }
    });

    // ボタンの禁止/有効化
    $('#userValidMultiBtn').prop('disabled', hasValid || hasLock || hasDelete || hasFuture);
    $('#userLockMultiBtn').prop('disabled', hasLock || hasDelete || hasFuture);
    $('#userUnLockMultiBtn').prop('disabled', hasValid || hasDelete || hasFuture);
    $('#userDelMultiBtn').prop('disabled', hasDelete || hasFuture);

    // 特殊なケースの処理
    if (hasLock && !hasValid && !hasDelete && !hasFuture) {
      $('#userUnLockMultiBtn').prop('disabled', false);
    }
    if (hasDelete && !hasValid && !hasLock && !hasFuture) {
      $('#userValidMultiBtn').prop('disabled', false);
    }
    if (hasValid && !hasLock && !hasDelete && !hasFuture) {
      $('#userUnLockMultiBtn').prop('disabled', true);
    }

    // どのチェックボックスも選択されていない場合、全てのボタンを有効化
    if (!hasValid && !hasLock && !hasDelete && !hasFuture) {
      $('#userValidMultiBtn').prop('disabled', false);
      $('#userLockMultiBtn').prop('disabled', false);
      $('#userUnLockMultiBtn').prop('disabled', false);
      $('#userDelMultiBtn').prop('disabled', false);
    }
  }

  function returnInitStatus() {
    $('#all_checks').prop('checked', false);
    $('#userLockMultiBtn, #userValidMultiBtn, #userUnLockMultiBtn, #userDelMultiBtn').prop('disabled', false);
  }
});



// 完了表示