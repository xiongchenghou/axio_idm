// new DataTable('#userListTable');
var isPosting = false;
var m2 = "";
var m3 = "";

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
    order: [[3, "asc"]],


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
      if($("#futureUserFlag").val() == "0" && $("#reflectionFlag").val() == "1"){
          //反映待ちデータがあるため、マスタの設定変更はいけない
      }else{
           $("#toEditFormView").submit();
      }

  });


  // ユーザ未来データ編集ボタン
  $("#openUserMaintenanceEditReserve").click(function () {

    $("#toEditFormSub").submit();

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

  // パスワード初期化
  $('#passwordInitBtn').click(function (e) {
      if ($("#futureUserFlag").val() == "1") {
        //未来ユーザの場合、パスワードがまだないため、何にもしない
        return;
      } 
    var m1 = "パスワードの初期化を行います。よろしいですか？<br>利用者ID:" + $("#hiddenUserId").val();
    m2 = "パスワードを初期化しました。";
    m3 = "パスワードの初期化に失敗しました。";
    $("#viewPageOpDiv").val("initPassword");
    
    performOp(e, m1, m2, m3);
    
  });
  // パスワード初期化
  $('#btnConfirmOK').click(function (e) {
    $('#confirmModal').modal('hide');
    sendOpRequest(e, m2, m3);
  });
  
  //確認メッセージを表示
  function performOp(e, m1, m2, m3){
    // モーダルの内容要素を更新
    $('#confirmMessage').html(m1);
    // モーダルの内容を表示
    $('#confirmModal').modal('show');
  }
  

    //処理送信
    function sendOpRequest(e, m2, m3) {

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
            url: webAppName + "/userDetailOp",
            type: "POST",
            contentType: 'application/json',
            data: JSON.stringify(outputJson),
            success: function(result) {
                // 成功時の処理
                console.log(result["chkResult"]);
                //ボタン押下開放
                isPosting = false;

                if (result["chkResult"] == null) {
                    //チェックエラーなし、保存処理継続
                    $('#errMsgDiv').addClass("d-none");
                    $("#axioMessage").text(m2);
                    
                    $("#axioMessageDialog").dialog({
                        modal:true,
                        buttons:[
                            {
                                text: 'OK' ,
                                class: 'btn' ,
                                click: function(){
                                    $(this).dialog("close");
                                }
                            }
                        ],
                        open:function(event, ui){
                            $(".ui-dialog-titlebar-close").hide();
                        },
                        close:function(event, ui){
                            $('#axioMessageDialog').remove();
                        }
                    });
                    
                    showAxioMessage("処理は正常終了しました。","success", function(){
                        //画面再表示
                        $("#toViewForm").submit();
                    });
                    
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
                showAxioMessage(m3,"warning");
            }
        });
    }
  
  // 削除確認
  $('#userDeleteBtn').click(function (e) {

    var m1 = "利用者を削除します。よろしいですか？<br>利用者ID:" + $("#hiddenUserId").val();
    m2 = "利用者を削除しました。";
    m3 = "利用者の削除に失敗しました。";
    $("#viewPageOpDiv").val("del");
    performOp(e, m1, m2, m3);
  });
  // 有効
  $('#userUndoDeleteBtn').click(function (e) {

    var m1 = "利用者を有効にします。よろしいですか？<br>利用者ID:" + $("#hiddenUserId").val();
    m2 = "利用者を有効にしました。";
    m3 = "利用者の有効に失敗しました。";
    $("#viewPageOpDiv").val("undoDel");
    performOp(e, m1, m2, m3);
  });
  // ロック
  $('#lockBtn').click(function (e) {

    var m1 = "利用者をロックします。よろしいですか？<br>利用者ID:" + $("#hiddenUserId").val();
    m2 = "利用者をロックしました。";
    m3 = "利用者のロックに失敗しました。";
    $("#viewPageOpDiv").val("lock");
    performOp(e, m1, m2, m3);
  });
  // ロック解除
  $('#unlockBtn').click(function (e) {

    var m1 = "利用者のロックを解除します。よろしいですか？<br>利用者ID:" + $("#hiddenUserId").val();
    m2 = "利用者のロックを解除しました。";
    m3 = "利用者のロック解除に失敗しました。";
    $("#viewPageOpDiv").val("unlock");
    performOp(e, m1, m2, m3);
  });

    //帳票出力ボタン
    $("#userReportBtn").click(function(e) {
        //通常のアクションをキャンセルする
        e.preventDefault();
        if (isPosting) return false;
        isPosting = true;
        
        getPdfFileName(e);
        
    });
    
    
    function getPdfFileName(e){
        var fileName = "";
        
        $.ajax({
                url: webAppName + "/getPdfFileName",
                type: "POST",
                contentType: 'application/json',
                data: "",
                success: function(result) {
                fileName = result["chkResult"];
                
                getPdf(e, fileName);
            },
            error: function(xhr, status, error) {
                //ボタン押下開放
                isPosting = false;
                showAxioMessage("帳票出力処理が失敗しました。","warning");
            }
        });
    }
    function getPdf(e, fileName){
        
        
        // フォームのデータを取得
        var formData = $('#UserOpForm').serializeArray();
    
        var outputJson = {};
    
        // 各オブジェクトを処理して新しいオブジェクトを構築
        formData.forEach(function(obj) {
          var propertyName = obj.name;
          outputJson[propertyName] = obj.value;
        });
        
        
        $.ajax({
            url: webAppName + "/userReportPdf",
            type: "POST",
            contentType: 'application/json',
            data: JSON.stringify(outputJson),
            method: "POST",
            xhrFields: { responseType: 'blob' },
            success: function(data, message, xhr) {
                // サーバーサイドから受信したPDFデータをBlobとして作成
                var blob = new Blob([data], { type: "application/pdf" });

                // ダウンロードリンクを作成し、クリックしてダウンロードを開始
                var link = document.createElement('a');
                link.href = window.URL.createObjectURL(blob);
                link.download = fileName;
                document.body.appendChild(link);
                link.click();
                document.body.removeChild(link);
                //ボタン押下開放
                isPosting = false;
            },
            error: function(xhr, status, error) {
                //ボタン押下開放
                isPosting = false;
                showAxioMessage("帳票出力処理が失敗しました。","warning");
            }
        });
    }
    
  // 完了表示

}); 