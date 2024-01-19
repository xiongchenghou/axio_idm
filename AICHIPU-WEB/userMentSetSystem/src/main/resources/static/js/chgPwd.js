/**
 * 名前空間を作成します。
 * 既に存在している階層については作成しません。
 * @prame ns .区切りの名前空間文字列
 * 依存関係については、requiere.jsでの管理やgulpのpolify等は行いません。
 * また、オブジェクトの階層によって、ライブラリを管理し必要に応じて即時関数を利用しグローバル領域を安全に保ってください。
 */

var isPosting = false;

namespace = function(ns) {
    var o = null;
    var unit = ns.split(".");
    o = window;
    for (var j = 0; j < unit.length; j = j + 1) {
        o[unit[j]] = o[unit[j]] || {};
        o = o[unit[j]];
    }
    return o;
};


namespace('axio.userSet');

$(function() {


    function userRegitSave(e){
        //alert("save");
        //return;

        //通常のアクションをキャンセルする
        e.preventDefault();
        //処理中、ボタン押下の抑制
        if (isPosting) return false;
        isPosting = true;
        // フォームのデータを取得
        //var formData = $('#UserRegistForm').serializeArray();
        var formData = $('#chgPwdForm').serializeArray();

        var outputJson = {};

        // 各オブジェクトを処理して新しいオブジェクトを構築
        formData.forEach(function(obj) {
          var propertyName = obj.name;
          outputJson[propertyName] = obj.value;
        });

        //保存前の有効性チェック処理
        $.ajax({
            //url: "./userRegitSave",
            //url: "./chgPwdPreCheck",
            url: "./chgPwd",
            type: "POST",
            contentType: 'application/json',
            data: JSON.stringify(outputJson),
            success: function(result){
                // 成功時の処理
                console.log(result["chkResult"]);
                //ボタン押下開放
                isPosting = false;
                //処理結果を判定
                //if (result["chkResult"] == null) {}
                if (result["chkResult"] == null || result["chkResult"] == "") {
                    //alert("利用者情報保存処理は正常終了しました。");
                    //alert("パスワード変更は正常に終了しました。");
                    //showAxioMessage("パスワード変更は正常に終了しました。","success" );
                    if($("#langDiv").val() == "ja"){
                        showAxioMessage("パスワード変更は正常に終了しました。","success" );
                    } else {
                        showAxioMessage("Change Password Success.","success" );
					}

                    ////詳細画面へ遷移
                    //$("#userId").val($("#riYouShaId").val());
                    //$("#UserSetForm").submit();


                }else{
                    //エラーメッセージを表示
                    //alert("利用者情報保存処理は失敗しました。");
                    //alert("パスワード変更処理は失敗しました。");
                    console.warn("パスワード変更処理は失敗しました。");
                    //showAxioMessage("パスワード変更処理は失敗しました。","warning");
                    if($("#langDiv").val() == "ja"){
                        showAxioMessage("パスワード変更処理は失敗しました。","warning");
                    } else {
                        showAxioMessage("Change Password Fail.","warning" );
					}
                }
            },
            error: function(err) {
                //ボタン押下開放
                isPosting = false;
                //エラーメッセージを表示
                //alert("利用者情報保存処理は失敗しました。");
                //alert("パスワード変更処理は失敗しました。");
                console.warn("パスワード変更処理は失敗しました。");
                //showAxioMessage("パスワード変更処理は失敗しました。","warning");
                if($("#langDiv").val() == "ja"){
                    showAxioMessage("パスワード変更処理は失敗しました。","warning");
                } else {
                    showAxioMessage("Change Password Fail.","warning" );
				}
            }
        });

    }

    /**
     * 「新規登録画面」「設定変更画面」の「保存」ボタン押下時
     */
    $('#passwordChangeBtn').on('click', function(e) {
        userRegitSavePreCheck(e);
    });

    // パスワード初期化
    $('#btnConfirmOK').click(function (e) {
        $('#confirmModal').modal('hide');
        userRegitSave(e);
    });

    //エラーメッセージを表示
    function setErrorInfo(chkRes, elm, msg) {

        if (!chkRes) {
            elm.focus();

            //var newParagraph = $('<p>').text('「利用者ID」に禁止文字が含まれてます、ご確認ください。');

            // <div>内に新しい<p>を追加
            //$('#errMsgDiv').html(newParagraph);
            $("#errMsgP").text(msg);

            $('#errMsgDiv').removeClass("d-none");
        } else {
            $('#errMsgDiv').addClass("d-none");
        }

    }

    //必須チェック
    function emptyStrChk(val) {
        if (val == null || val == "") {
            return false;
        } else {
            return true;
        }
    }

    function userRegitSavePreCheck(e) {

        var chkRes = emptyStrChk($("#nowPassword").val());
        var langDiv = $("#langDiv").val();
        if(langDiv == "ja"){
            setErrorInfo(chkRes, $("#nowPassword"), '「現行パスワード」を入力してください');
        }else{
            setErrorInfo(chkRes, $("#nowPassword"), 'Please enter the current password.');
        }
        if (!chkRes) {
            return;
        }
        chkRes = emptyStrChk($("#newPassword").val());
        if(langDiv == "ja"){
            setErrorInfo(chkRes, $("#newPassword"), '「新パスワード」を入力してください');
        }else{
            setErrorInfo(chkRes, $("#newPassword"), 'Please enter the new password.');
        }

        if (!chkRes) {
            return;
        }
        chkRes = emptyStrChk($("#newPasswordConfirm").val());
        if(langDiv == "ja"){
            setErrorInfo(chkRes, $("#newPasswordConfirm"), '「新パスワード（確認）」を入力してください');
        }else{
            setErrorInfo(chkRes, $("#newPasswordConfirm"), 'Please enter the confirm new password.');
        }
        if (!chkRes) {
            return;
        }


        //通常のアクションをキャンセルする
        e.preventDefault();
        //処理中、ボタン押下の抑制
        if (isPosting) return false;
        isPosting = true;
        // フォームのデータを取得
        var formData = $('#chgPwdForm').serializeArray();

        var outputJson = {};

        // 各オブジェクトを処理して新しいオブジェクトを構築
        formData.forEach(function(obj) {
            var propertyName = obj.name;
            outputJson[propertyName] = obj.value;
        });

        //保存前の有効性チェック処理
        $.ajax({
            url: "./chgPwdPreCheck",
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
                    // モーダルの内容要素を更新
                    $('#confirmMessage').html("パスワードを更新します。よろしいでしょうか？");
                    if($("#langDiv").val() != "ja"){
                        $('#confirmMessage').html("Update your password.");
                    }
                    // モーダルの内容を表示
                    $('#confirmModal').modal('show');
                } else {
                    //エラーメッセージを表示
                    $("#errMsgP").text(result["chkResult"]);

                    $('#errMsgDiv').removeClass("d-none");
                }
            },
            error: function(err) {
                //ボタン押下開放
                isPosting = false;
            }
        });


    }



    function showError(elm, msg) {
        // input要素への参照を取得
        var inputElement = elm; // ここで'id'を適切なものに置き換える

        // 最も近い invalid-feedback 要素を取得
        var closestInvalidFeedback = inputElement.closest('.form-group').find('.invalid-feedback');

        // 見つかった要素に対して処理を行う
        if (closestInvalidFeedback.length > 0) {
            // ここで何かしらの処理を行う
            closestInvalidFeedback.text(msg);
        }
        elm.addClass('is-invalid');
    }

});