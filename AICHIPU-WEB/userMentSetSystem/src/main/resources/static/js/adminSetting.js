// new DataTable('#userListTable');

var table;
var isPosting = false;
var rowIndex;

var m2 = "管理者権限設定しました。";
var m3 = "管理者権限設定に失敗しました。";
var data;
var opDiv = 0;

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

    table = $("#userListTable").DataTable({
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
        },
        lengthMenu: [100, 200, 300],
        displayLength: 100,
        searching: false,
        scrollX: true,
        scrollY: 400,
        fixedHeader: true,
        order: [[2, "asc"]],
        columns: [
            {
                data: 'adminFlg',
                className: 'dt-body-center',
                width: 60,
                searchable: false,
                orderable: false,
                render: function(data) {
                    if (data == '1') {
                        return '<input type="checkbox" name="o_chk" value="' + data + '" checked onclick="return false;">'
                    } else {
                        return '<input type="checkbox" name="o_chk" value="' + data + '" onclick="return false;">'
                    }
                }
            },
            {
                data: 'status',
                width: 80,
                render: function(data) {
                    if (data == 'valid') {
                        return '<i class="fa-solid fa-user"></i>有効';
                    } else if (data == 'lock') {
                        return '<i class="fa-solid fa-user-lock"></i>ロック';
                    } else if (data == 'invalid') {
                        return '<i class="fa-solid fa-user-slash"></i>削除';
                    } else if (data == 'reserve') {
                        return '<i class="fa-regular fa-circle-user"></i>未来';
                    } else {
                        return '';
                    }
                }
            },
            { data: 'userId', width: 100 },
            { data: 'riyoushaDiv', width: 100 },
            { data: 'nameJp', width: 120 },
            { data: 'nameEn', width: 120 },
            { data: 'orgNm', width: 100 },
            {
                data: 'vpnFlg',
                className: 'dt-body-center',
                width: 100,
                render: function(data) {
                    if (data == '1') {
                        return '〇';
                    } else {
                        return '×';
                    }
                }
            }
        ]
    });
    /*
    var newData =[
    { 'adminFlg' : '1' , 'status' : '1' , 'userId' : 'userId' , 'riyoushaDiv' : 'riyoushaDiv', 'nameJp' : 'nameJp' , 'nameEn' : 'nameEn' , 'orgNm' : 'orgNm' , 'vpnFlg' : 'vpnFlg' },
    { 'adminFlg' : '0' , 'status' : '2' , 'userId' : 'userId' , 'riyoushaDiv' : 'riyoushaDiv', 'nameJp' : 'nameJp' , 'nameEn' : 'nameEn' , 'orgNm' : 'orgNm' , 'vpnFlg' : 'vpnFlg' },
    { 'adminFlg' : '0' , 'status' : '3' , 'userId' : 'userId' , 'riyoushaDiv' : 'riyoushaDiv', 'nameJp' : 'nameJp' , 'nameEn' : 'nameEn' , 'orgNm' : 'orgNm' , 'vpnFlg' : 'vpnFlg' },
    { 'adminFlg' : '1' , 'status' : '4' , 'userId' : 'userId' , 'riyoushaDiv' : 'riyoushaDiv', 'nameJp' : 'nameJp' , 'nameEn' : 'nameEn' , 'orgNm' : 'orgNm' , 'vpnFlg' : 'vpnFlg' },
    { 'adminFlg' : '1' , 'status' : '1' , 'userId' : 'userId' , 'riyoushaDiv' : 'riyoushaDiv', 'nameJp' : 'nameJp' , 'nameEn' : 'nameEn' , 'orgNm' : 'orgNm' , 'vpnFlg' : 'vpnFlg' },
    ];
    
                  table.clear().rows.add(newData).draw();
                  */


    $('#userListTable tbody').on('click', 'tr', function(e) {
        data = table.row(this).data();
        console.log(data);

        if (data.status == "reserve") {
            alert("未来データのため、管理者権限を設定できません。");
            return;
        }

        var m1 = "";
        if (data.adminFlg == null || data.adminFlg != "1") {
            console.log("Adminに変更");
            data.adminFlg = "1";
            $("#setAdminForm #userId").val(data.userId);
            $("#setAdminForm #setAdminFlg").val("1");
            m1 = "管理者権限を設定します。宜しいでしょうか？<br>利用者ID:" + data.userId;
        } else {
            console.log("Admin 解除");
            data.adminFlg = "0";
            $("#setAdminForm #userId").val(data.userId);
            $("#setAdminForm #setAdminFlg").val("0");
            m1 = "管理者権限を解除します。宜しいでしょうか？<br>利用者ID:" + data.userId;
        }
        rowIndex = table.row(this).index();


        opDiv = 1;
        // モーダルの内容要素を更新
        $('#confirmMessage').html(m1);
        // モーダルの内容を表示
        $('#confirmModal').modal('show');

    });

    // パスワード初期化
    $('#btnConfirmOK').click(function(e) {
        if(opDiv == 1){
            setAdminFlg(e, m2, m3);
        }else if(opDiv == 2){
            //通常のアクションをキャンセルする
            e.preventDefault();
            if (isPosting) return false;
            $("#userId").val("");
            $("#userDiv").val("");
            $("#fullNameJp").val("");
            $("#fullNameEn").val("");
            $("#campus").val("");
            $("#department").val("");
            $("#entranceYear").val("");
            $("#vpnFlg").val("");
            $("#adminFlg").val("");
            $("#validUserChecked1").prop("checked", false);
            $("#deleteUserChecked1").prop("checked", false);
            $("#lockUserChecked1").prop("checked", false);
            $("#futureUserChecked1").prop("checked", false);

        }
        $('#confirmModal').modal('hide');
    });


    //処理送信
    function setAdminFlg(e, m2, m3) {

        //通常のアクションをキャンセルする
        e.preventDefault();
        if (isPosting) return false;
        isPosting = true;

        // フォームのデータを取得
        var formData = $('#setAdminForm').serializeArray();

        var outputJson = {};

        // 各オブジェクトを処理して新しいオブジェクトを構築
        formData.forEach(function(obj) {
            var propertyName = obj.name;
            outputJson[propertyName] = obj.value;
        });
        //ユーザ削除
        $.ajax({
            url: "/setAdmin",
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
                    table.row(rowIndex).data(data);
                    // テーブルの再描画
                    table.draw();
                    alert(m2);
                } else {
                    //エラーメッセージを表示
                }
            },
            error: function(err) {
                //ボタン押下開放
                isPosting = false;
                //エラーメッセージを表示
                alert(m3);
            }
        });
    }


    // クリア
    $('#btnClear').click(function(e) {


        opDiv = 2;
        // モーダルの内容要素を更新
        $('#confirmMessage').html("検索条件をクリアします。宜しいでしょうか？");
        // モーダルの内容を表示
        $('#confirmModal').modal('show');
    });

    // 検索
    $('#btnSearch').click(function(e) {

        //通常のアクションをキャンセルする
        e.preventDefault();
        if (isPosting) return false;
        isPosting = true;


        // フォームのデータを取得
        var formData = $('#AdminForm').serializeArray();

        var outputJson = {};

        // 各オブジェクトを処理して新しいオブジェクトを構築
        formData.forEach(function(obj) {
            var propertyName = obj.name;
            outputJson[propertyName] = obj.value;
        });

        $.ajax({
            url: "/adminSearch",
            type: "POST",
            contentType: 'application/json',
            data: JSON.stringify(outputJson),
            dataType: "json",
            success: function(data) {
                // サーバーからのJSONデータを処理
                console.log(data);
                table.clear().rows.add(data).draw();
                // ここでデータを使って何かを行う
                //ボタン押下開放
                isPosting = false;

            },
            error: function(error) {
                console.error("Error fetching data: " + error);
                //ボタン押下開放
                isPosting = false;

            }
        });

    });

    // 完了表示

}); 