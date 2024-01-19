// new DataTable('#userListTable');
jQuery(function ($) {
  // デフォルトの設定を変更
  $.extend($.fn.dataTable.defaults, {
    language: {
      "sProcessing": "処理中...",
      "sLengthMenu": "_MENU_ 件表示",
      "sZeroRecords": "データはありません。",
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
    }
  });


  $("#userListTable").DataTable({


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
    order: [[2, "asc"]],


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
      // 状態
      {
        targets: 1,
        width: 80
      },
      // 利用者ID
      {
        targets: 2,
        width: 100
      },
      // 利用者区分
      {
        targets: 3,
        width: 100
      },
      
      // 氏名（漢字）
      {
        targets: 4,
        width: 120
      },
      // 氏名（英字）
      {
        targets: 5,
        width: 120
      },
      // 所属
      {
        targets: 6,
        width: 100
      },
      // VPN利用
      {
        targets: 7,
        className: 'dt-head-center',
      },
      {
        targets: 7,
        className: 'dt-body-center',
        width:100
      },

    ],

    //左から3番目のカラムを固定
    fixedColumns: {
      left: 3,
    }
  });


  // ユーザ新規作成ボタン
  $("#userAddBtn").click(function () {
    location.href = "../../../templetes/AdminMaintenance/UserSearch/UserMaintenanceAdd.html"
  });

  // ユーザ閲覧ボタン
  $(".userViewBtn").click(function () {
    location.href = "../../../templetes/AdminMaintenance/UserSearch/UserMaintenanceView.html"

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
    $("#userLockMultiConfirmModal").modal("show");
  });

  // ロック解除確認
  $('#csvOutputBtn').click(function () {
    $("#csvOutputModal").modal("show");
  });

  // 削除確認
  $('#csvOutputBtn').click(function () {
    $("#csvOutputModal").modal("show");
  });

  // 完了表示

}); 