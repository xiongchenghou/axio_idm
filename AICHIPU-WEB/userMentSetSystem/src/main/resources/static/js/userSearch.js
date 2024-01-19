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
  // デフォルトの設定を変更

  var $tables = $("#userListTable").DataTable({
    language: {
      "sProcessing": "処理中...",
      "sLengthMenu": "_MENU_ 件表示",
      "sZeroRecords": "検索条件に合致するデータがありません",
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
    rowId: 'userId', //
    // 件数切替の値を10～50の10刻みにする
    lengthMenu: [3, 5, 7],

    // デフォルト50件
    displayLength: 3,

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
          var userId = row.userId;
          if (data === '1') {
            return '<td><button type="button" class="btn btn-outline-secondary userViewBtn" data-userid="' + userId + '"> ' +
                '<i class="fa-solid fa-info"></i><i class= "fa-regular fa-clock"> </i>'+
                '</button></td>';
          }else {
            return '<td><button type="button" class="btn btn-outline-secondary userViewBtn" data-userid="' + userId + '"> ' +
                '<i class="fa-solid fa-info"></i>' +
            '</button></td>';
          }
        }
      },
      { "data": "status",
        "render":function (data, type, row, meta) {
          if (data === 'valid') {
            return  '<td><i class="fa-solid fa-user"></i>有効</td>';
          } else if (data === 'invalid') {
            return  '<td><i class="fa-solid fa-user-slash"></i>無効</td>';
          } else if (data === 'lock') {
            return  '<i class="fa-solid fa-user-lock"></i>ロック</td>';
          } else if (data === 'reserve') {
            return  '<td><i class="fa-regular fa-circle-user"></i>未来</td>';
          }else {
            return  '<td><i class="fa-regular fa-circle-user"></i>不明</td>';
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
      left: 3,
    }
  });


  // クリアボタンのクリックイベント
  $('#clearBtn').click(function() {
    // テキスト"タイプのすべての入力ボックスをクリアする
    $('#clearFlag').find('input[type="text"]').val('');
    // すべての選択要素をリセットする
    $('#clearFlag').find('select').each(function() {
      $(this).prop('selectedIndex', 0);
    });
    // すべてのチェックボックスの選択を解除する
    $('#clearFlag').find('input[type="checkbox"]').prop('checked', false);
    $("#changedDataFlg").val("");
  });


  // 取得したデータを dataList 配列に追加します
  var dataList = [];

  // "検索"ボタンのイベントハンドラ
  $('#searchBtn').click(function() {
    // 初始化一个空的 dataList 数组

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
          $tables.rows.add(response.data); // 假设后端返回的数据是一个数组
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
    window.location.href = "/userRegist";
  });

  /**
   * 戻るボタン押下
   */
  $("#btn_back").on("click", function(e) {
    if ($("#changedDataFlg").val()) {
      var that = this;
      var $div = $("<div id='_dialogLeave'><span>保存されていないため、入力した内容が破棄されますが宜しいでしょうか</span></div>");
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
    // ビジネスロジックに基づいてロックするユーザーの数を計算する
    var userCount = calculateSelectedUserCount(); // 假设这是计算选中用户数量的函数

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
    // 获取所有选中的复选框
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
      // バックエンドAPIにリクエストを送信する
      axios.post("/userLock", formData)
          .then(function(response) {

            if (response.status === 200 ){
              // showNotification(`ロック処理完了`,);
              $("#userLockMultiConfirmModal").modal("hide");

              const updateData = 'lock'; // 更新後の状態値

              reSetupStatus(userIds,updateData); // ロック更新後の状態値を設定
            } else {
              showNotification(`ロック処理NG`,);
              $("#userLockMultiConfirmModal").modal("hide");
            }
          })
          .catch(function(error) {
            showNotification(`ロック処理がエラーになりました、エラー：${error}`, type = 'error');
            // リクエスト失敗の処理
            console.error('Search error:', error);
            $("#userLockMultiConfirmModal").modal("hide");
          });
    } else {
      showNotification(`処理データなし`,);
      $("#userLockMultiConfirmModal").modal("hide");
    }
  });


  // ロック解除確認
  $('#userUnLockMultiBtn').click(function () {
    // ロックする必要のあるユーザー数を計算する
    var userCount = calculateSelectedUserCount(); // 假设这是计算选中用户数量的函数

    // モーダルの内容要素を更新
    $('#userUnlockModal_Content').html(`
        <div style="margin-bottom: 15px;">
            ${userCount}件のユーザをロック解除します。<br/>
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
      // バックエンドAPIにリクエストを送信する
      axios.post("/userUnlock", formData)
          .then(function(response) {
            console.log(response.data)
            if (response.status === 200 ){
              // showNotification(`ロック解除処理完了`,);

              const updateData = 'invalid'; // 無効の更新後の状態値

              reSetupStatus(userIds,updateData); // 更新後の状態値を設定

              $("#userUnlockMultiConfirmModal").modal("hide");
            } else {
              showNotification(`ロック解除処理NG`,);
              $("#userUnlockMultiConfirmModal").modal("hide");
            }
          })
          .catch(function(error) {
            // リクエスト失敗の処理
            console.error('Search error:', error);
            showNotification(`ロック解除処理がエラーになりました、エラー：${error}`, type = 'error');
            $("#userUnlockMultiConfirmModal").modal("hide");
          });
    } else {
      showNotification(`処理データなし`,);
      $("#userUnlockMultiConfirmModal").modal("hide");
    }
  });

function reSetupStatus(userIds,status) {
  // 選択された userId を繰り返し処理
  userIds.forEach(function(userId) {
    // ユーザーのデータを検索
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
    // ロックする必要のあるユーザー数を計算する
    var userCount = calculateSelectedUserCount(); // 假设这是计算选中用户数量的函数
    // モーダルの内容要素を更新
    $('#userValidModal_Content').html(`
        <div style="margin-bottom: 15px;">
            ${userCount}件のユーザを有効します。<br/>
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
      // バックエンドAPIにリクエストを送信する
      axios.post("/userValid", formData)
          .then(function(response) {
            console.log(response.data)
            if (response.status === 200 ){

              // showNotification(`有効処理完了`,);
              $("#userValidMultiConfirmModal").modal("hide");
              const updateData = 'valid'; // 更新後の状態値

              reSetupStatus(userIds,updateData); // ロック更新後の状態値を設定
            } else {
              showNotification(`有効処理NG`,);
              $("#userValidMultiConfirmModal").modal("hide");
            }
          })
          .catch(function(error) {
            // リクエスト失敗の処理
            console.error('Search error:', error);
            showNotification(`有効処理がエラーになりました、エラー：${error}`, type = 'error');
            $("#userValidMultiConfirmModal").modal("hide");
          });
    } else {
      showNotification(`処理データなし`,);
      $("#userValidMultiConfirmModal").modal("hide");
    }
  });

  // 削除確認
  $('#userDelMultiBtn').click(function () {
    // ロックする必要のあるユーザー数を計算する
    var userCount = calculateSelectedUserCount(); // 假设这是计算选中用户数量的函数

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
      // バックエンドAPIにリクエストを送信する
      axios.post("/userDoDelete", formData)
          .then(function(response) {

            console.log(response.data)
            if (response.status === 200 ){
              // showNotification(`無効処理完了`,);
              $("#userDeleteMultiConfirmModal").modal("hide");
              const updateData = 'invalid'; // 更新後の状態値

              reSetupStatus(userIds,updateData); // ロック更新後の状態値を設定
            } else {
              showNotification(`無効処理NG`,);
              $("#userDeleteMultiConfirmModal").modal("hide");
            }
          })
          .catch(function(error) {
            // リクエスト失敗の処理
            console.error('Search error:', error);
            showNotification(`削除処理がエラーになりました、エラー：${error}`, type = 'error');
            $("#userDeleteMultiConfirmModal").modal("hide");
          });
    } else {
      showNotification(`処理データなし`,);
      $("#userDeleteMultiConfirmModal").modal("hide");
    }
  });
  //選択したユーザー数を返す
  function calculateSelectedUserCount() {
    //チェックボックスが選択されたユーザーを取得して数を返す
    return $('.form-check-input:checked').length;
  }

  //CSVダウンロード処理イベント
  $("#csvDownloadBtn").click(function () {
    // ロックする必要のあるユーザー数を計算する
    var userCount = calculateSelectedUserCount(); // 假设这是计算选中用户数量的函数

    // モーダルの内容要素を更新
    $('#userCsvDownloadModal_Content').html(`
        <div style="margin-bottom: 15px;">
            ${userCount}件のユーザをダウンロードします。<br/>
            よろしいですか？
        </div>
    `);
    // モーダルの内容を表示
    $('#userCsvDownloadMultiConfirmModal').modal('show');
  });
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
    // バックエンドAPIにリクエストを送信する
    axios.post("/userCsvDownload", formData)
        .then(function(response) {


          console.log(response.data)
          if (response.status === 200 ){
            // レスポンスからバイナリデータ（CSVファイル）を取得
            const blob = new Blob([response.data], {type: 'text/csv'});
            // 要素を作成
            const downloadLink = document.createElement('a');
            downloadLink.href = window.URL.createObjectURL(blob);
            downloadLink.download = 'user_data.csv';
            // ダウンロードリンクを模倣する
            downloadLink.click();
            $("#userCsvDownloadMultiConfirmModal").modal("hide");
            showNotification('ダウンロー処理完了');


          }else{
              showNotification(`ダウンロード処理NG`,);
              $("#userCsvDownloadMultiConfirmModal").modal("hide");
          }
        })
        .catch(function(error) {
          // リクエスト失敗の処理
          console.error('APIリクエストエラー:', error);
          $("#userCsvDownloadMultiConfirmModal").modal("hide");
          showNotification(`ダウンロード処理がエラーになりました、エラー：${error}`, type = 'error');
        });
  } else {
    $("#userCsvDownloadMultiConfirmModal").modal("hide");
    showNotification(`処理データなし`,);
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


// テキスト変更時
$("input[type='text'],input[type='select'],input[type='checkbox'],select").on("change", function() {
  // データ変更をマーク
  $("#changedDataFlg").val("on");
});
// 完了表示