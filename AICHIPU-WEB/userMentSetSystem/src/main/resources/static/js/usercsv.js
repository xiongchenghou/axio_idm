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
    order: [[1, "asc"]],


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

    //左から3番目のカラムを固定
    fixedColumns: {
      left: 1,
    }
  });




  // 反映待ちユーザ差分テーブル
  $("#userDiffReserveTable").DataTable({


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

    // 項目定義
    columnDefs: [
      // 「取り消し」列
      // 中央寄せ
      {
        targets: 0,
        width: 70,
        className: 'dt-head-center'
      },
      {
        targets: 0,
        className: 'dt-body-center',
        width: 70,
        
      },
      // 差分
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
      //　利用者ID
      {
        targets: 2,
        className: 'dt-head-center',
        width: 90
      },
      {
        targets: 2,
        className: 'dt-body-center',
        width: 90
      },
      //利用者区分
      {
        targets: 3,
        className: 'dt-head-center',
        width: 70
      },
      {
        targets: 3,
        className: 'dt-body-center',
        width: 70
      },
      // 反映日
      {
        targets: 4,
        className: 'dt-head-center',
        width: 120
      },
      {
        targets: 4,
        className: 'dt-body-center',
        width: 120
      },
      // 氏名(漢字)
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
      // 氏名(英字)
      {
        targets: 6,
        className: 'dt-head-center',
        width: 120
      },
      {
        targets: 6,
        className: 'dt-body-center',
        width: 120
      },
      // 学籍番号
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
      // VPN利用
      {
        targets: 8,
        className: 'dt-head-center',
        width: 100
      },
      {
        targets: 8,
        className: 'dt-body-center',
        width: 100
      },
      // 教育LDAP
      {
        targets: 9,
        className: 'dt-head-center',
        width: 100
      },
      {
        targets: 9,
        className: 'dt-body-center',
        width: 100
      },
      // サイボウズ
      {
        targets: 10,
        className: 'dt-head-center',
        width: 100
      },
      {
        targets: 10,
        className: 'dt-body-center',
        width: 100
      },
      // 並列演算装置
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
      // 教育システム
      {
        targets: 12,
        className: 'dt-head-center',
        width: 100
      },
      {
        targets: 12,
        className: 'dt-body-center',
        width: 100
      },
      // 演習室１
      {
        targets: 13,
        className: 'dt-head-center',
        width: 100
      },
      {
        targets: 13,
        className: 'dt-body-center',
        width: 100
      },


    ],

    //左から4番目のカラムを固定
    fixedColumns: {
      left: 3,
    }
  });



  // 反映待ちユーザウィンドウ表示
  $("#openUserCsvReserveBtn").click(function(){
    window.open('../../AdminMaintenance/UserCsv/UserCsvReserve.html', null, 'width=1300,height=1400,toolbar=yes,menubar=yes,scrollbars=yes');
    
  });

  // ウィンドウ閉じるボタン押下時
  $("#windowClose").click(function(){
    window.close();
    
  });

  // エラーレコード詳細表示
  $(".csvUserErrorRecord").click(function(){
    $("#errorMessageModal").modal("show");
    
    
  });




  

  


}); 