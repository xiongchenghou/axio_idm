// new DataTable('#userListTable');
var table;
var isPosting = false;
jQuery(function($) {
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

    table = $("#operationLogTable").DataTable({
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
        order: [[1, "desc"]],
        // 項目定義
        columnDefs: [
            // 「選択」列
            // 中央寄せ
            {
                targets: 0,
                // className: 'dt-body-center',
                width: 100
            },
            {
                targets: 1,
                className: 'dt-body-center',
                width: 220
            },
            {
                targets: 2,
                className: 'dt-head-center',
                width: 100
            },
            {
                targets: 3,
                className: 'dt-body-center',
                width: 100
            },
            {
                targets: 4,
                // className: 'dt-head-center',
                width: 300
            },

        ],

        //左から3番目のカラムを固定
        fixedColumns: {
            left: 2,
        },
        columns: [
            { data: 'opName' },
            { data: 'opDt' },
            { data: 'opUserId' },
            { data: 'targetUserId' },
            { data: 'detail' },
        ],
    });
    
      $('#operationLogTable tbody').on('click', 'tr', function () {
        var data = table.row(this).data();
        $("#modOpName").text(data.opName);
        $("#modOpDt").text(data.opDt);
        $("#modOpUserId").text(data.opUserId);
        $("#modTargetUserId").text(data.targetUserId);
        $("#modDetail").text(data.detail);
        
        $("#operationLogDetailModal").modal("show");
      });
    // モーダル表示
    // ロック確認
    $('.operationLogRow').click(function() {
        $("#operationLogDetailModal").modal("show");
    });
    // モーダル表示
    // ロック確認
    $('#csvDownloadBtn').click(function() {
        // Trigger CSV download
        var headers = table.columns().header().toArray();
        var headers = $.map(headers, function(header) {
            return header.textContent || header.innerText;
        });
        var headersArry = [headers];
        //headersArry[0] = headers;
        var data = table.rows().data().toArray();
        var newArray = data.map(function(item) {
            return [
                item.opName,
                item.opDt,
                item.opUserId,
                item.targetUserId,
                item.detail
            ];
        });
        var combinedArray = headersArry.concat(newArray);
        //var combinedArray = data.concat(headers);
        downloadCsv(combinedArray, '操作ログ.csv');
    });
    function arrayToCsv(data) {
        const csvContent = data.map(row => row.map(cell => `"${cell}"`).join(',')).join('\n');
        return 'data:text/csv;charset=utf-8,' + encodeURIComponent(csvContent);
    }

    function downloadCsv(data, filename) {
        const link = document.createElement('a');
        link.href = arrayToCsv(data);
        link.download = filename;
        document.body.appendChild(link);
        link.click();
        document.body.removeChild(link);
    }


  // クリア
  $('#btnClear').click(function (e) {
    
        //通常のアクションをキャンセルする
        e.preventDefault();
        if (isPosting) return false;
        isPosting = true;
        $("#opName").val("");
        $("#opUserId").val("");
        $("#targetUserId").val("");
        $("#startDt").val("");
        $("#endDt").val("");
  });

  // 検索
  $('#btnSearch').click(function (e) {
    
        //通常のアクションをキャンセルする
        e.preventDefault();
        if (isPosting) return false;
        isPosting = true;
        
        
        // フォームのデータを取得
        var formData = $('#OpelogForm').serializeArray();
    
        var outputJson = {};
    
        // 各オブジェクトを処理して新しいオブジェクトを構築
        formData.forEach(function(obj) {
          var propertyName = obj.name;
          outputJson[propertyName] = obj.value;
        });
        
       $.ajax({
            url: webAppName + "/logSearch",
            type: "POST",
            contentType: 'application/json',
            data: JSON.stringify(outputJson),
          dataType: "json",
          success: function (data) {
            // サーバーからのJSONデータを処理
              console.log(data);
              table.clear().rows.add(data).draw();
            // ここでデータを使って何かを行う
                //ボタン押下開放
                isPosting = false;

          },
          error: function (error) {
            console.error("Error fetching data: " + error);
                //ボタン押下開放
                isPosting = false;

          }
        });
        
  });


}); 