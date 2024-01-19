/**
 * 名前空間を作成します。
 * 既に存在している階層については作成しません。
 * @prame ns .区切りの名前空間文字列
 * 依存関係については、requiere.jsでの管理やgulpのpolify等は行いません。
 * また、オブジェクトの階層によって、ライブラリを管理し必要に応じて即時関数を利用しグローバル領域を安全に保ってください。
 */

var isPosting = false;
var opDiv = "";
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
    
        //通常のアクションをキャンセルする
        e.preventDefault();
        //処理中、ボタン押下の抑制
        if (isPosting) return false;
        isPosting = true;
        // フォームのデータを取得
        var formData = $('#UserRegistForm').serializeArray();
    
        var outputJson = {};
    
        // 各オブジェクトを処理して新しいオブジェクトを構築
        formData.forEach(function(obj) {
          var propertyName = obj.name;
          outputJson[propertyName] = obj.value;
        });
    
        //保存前の有効性チェック処理
        $.ajax({
            url: webAppName + "/userRegitSave",
            type: "POST",
            contentType: 'application/json', 
            data: JSON.stringify(outputJson),
            success: function(result){
                // 成功時の処理
                console.log(result["chkResult"]);
                //ボタン押下開放
                isPosting = false;
                //処理結果を判定
                if (result["chkResult"] == null) {
                    showAxioMessage("ユーザ情報を保存しました。","success", function(){
                    //詳細画面へ遷移
                    $("#userId").val($("#riYouShaId").val());
                    $("#UserSetForm").submit();
                    });
                    
                }else{
                    //エラーメッセージを表示
                    showAxioMessage("ユーザ情報の保存に失敗しました。","warning");
                    
                }
            },
            error: function(err) {
                //ボタン押下開放
                isPosting = false;
                //エラーメッセージを表示
                showAxioMessage("ユーザ情報の保存に失敗しました。","warning");
            }
        });
        
    }
    
    /**
     * 利用者情報管理 - 新規作成 初期設定ボタン押下時
     */
    $('#userInitBtn').on('click', function(e) {
        var chkRes = checkRiyoushaId($("#riYouShaId").val());
        if (!chkRes) {
            $("#riYouShaId").focus();

            //var newParagraph = $('<p>').text('「利用者ID」に禁止文字が含まれてます、ご確認ください。');

            // <div>内に新しい<p>を追加
            //$('#errMsgDiv').html(newParagraph);
            $("#errMsgP").text('「利用者ID」に禁止文字が含まれてます、ご確認ください。');

            $('#errMsgDiv').removeClass("d-none");

            return;
        } else {
            $('#errMsgDiv').addClass("d-none");

        }

        opDiv = "1";
        // モーダルの内容要素を更新
        $('#confirmMessage').html("初期設定を行います。よろしいですか？");
        // モーダルの内容を表示
        $('#confirmModal').modal('show');

    });

  // パスワード初期化
  $('#btnConfirmOK').click(function (e) {
      $('#confirmModal').modal('hide');
      if(opDiv=="1"){
          //初期値を設定する
          setInitValue();
      }else if(opDiv=="2"){
          //保存処理
          userRegitSave(e);
      }else if(opDiv=="3"){
          //取り消し
          userCancel(e);
      }
    
  });
  
  function setInitValue(){
      
        var riYouShaDiv = $("#riYouShaDiv").val();

        //キャンパス
        $('#campus').val('100');

        //所属
        $('#shoZoku').val('100-1000');

        //学籍番号より利用者IDを生成する
        initRiYouShaIdBaseOnGakuSekiBn();

        //メールアドレスを生成する
        initMailAddr();

        //入学年度を生成する
        initNyugakuNendo();
        
        switch (riYouShaDiv) {
            case "1":
                //1 教員
                setDefaultVal1();
                break;
            case "2":
                //2 職員
                setDefaultVal2();
                break;
            case "3":
                //3 学生
                setDefaultVal3();
                break;
            case "4":
                //4 ビジター
                setDefaultVal4();
                break;
            default:
                break;
        }

        $('#confirmModal').modal('hide');
  }
    /**
     * 「新規登録画面」「設定変更画面」の「保存」ボタン押下時
     */
    $('#userSaveBtn').on('click', function(e) {
        userRegitSavePreCheck(e);
    });

    /**
     * 設定変更画面　「取り消し」ボタン押下時
     */
    $('#userCancelBtn').on('click', function(e) {
        
        opDiv = "3";
        // モーダルの内容要素を更新
        $('#confirmMessage').html("取り消しを行います。よろしいですか？");
        // モーダルの内容を表示
        $('#confirmModal').modal('show');
        
    });



    //文字列dt1, dt2を比較結果を返す
    function date1CompDate2(dt1, dt2, div) {

        if (dt1 == null || dt1 == "" || dt2 == null || dt2 == "") {
            return true;
        }

        var date1 = new Date(dt1);
        var date2 = new Date(dt2);
        // 比較
        var res = false;

        switch (div) {
            case ">":
                res = (date1 > date2);
                break;
            case ">=":
                res = (date1 >= date2);
                break;
            case "<":
                res = (date1 < date2);
                break;
            case "<=":
                res = (date1 <= date2);
                break;
            case "=":
            case "==":
                res = (date1 == date2);
                break;
            default:
                break;
        }
        return res;
    }

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

    function userCancel(e) {
        //通常のアクションをキャンセルする
        e.preventDefault();
        //処理中、ボタン押下の抑制
        if (isPosting) return false;
        isPosting = true;
        // フォームのデータを取得
        var formData = $('#UserRegistForm').serializeArray();
    
        var outputJson = {};
    
        // 各オブジェクトを処理して新しいオブジェクトを構築
        formData.forEach(function(obj) {
            var propertyName = obj.name;
            outputJson[propertyName] = obj.value;
        });
    
        //保存前の有効性チェック処理
        $.ajax({
            url: webAppName + "/userCancel",
            type: "POST",
            contentType: 'application/json',
            data: JSON.stringify(outputJson),
            success: function(result) {
                // 成功時の処理
                console.log(result["chkResult"]);
                //ボタン押下開放
                isPosting = false;
    
                if (result["chkResult"] == null) {
                    showAxioMessage("取り消し処理が成功しました。","success", function(){
                        //詳細画面へ遷移
                        $("#userId").val($("#riYouShaId").val());
                        $("#UserSetForm").submit();
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
                showAxioMessage("取り消し処理が失敗しました。","warning");
            }
        });


    }
    function userRegitSavePreCheck(e) {
        //利用者IDをチェック
        var chkRes = checkRiyoushaId($("#riYouShaId").val());
        setErrorInfo(chkRes, $("#riYouShaId"), '「利用者ID」に禁止文字が含まれてます、ご確認ください。');
        if (!chkRes) {
            return;
        }
        chkRes = emptyStrChk($("#hanEiDt").val());
        setErrorInfo(chkRes, $("#hanEiDt"), '「反映日」を入力してください');
        if (!chkRes) {
            return;
        }
        chkRes = emptyStrChk($("#riYouShaId").val());
        setErrorInfo(chkRes, $("#riYouShaId"), '「利用者ID」を入力してください');
        if (!chkRes) {
            return;
        }
        chkRes = emptyStrChk($("#riYouShaDiv").val());
        setErrorInfo(chkRes, $("#riYouShaDiv"), '「利用者区分」を入力してください');
        if (!chkRes) {
            return;
        }
        chkRes = emptyStrChk($("#seiJp").val());
        setErrorInfo(chkRes, $("#seiJp"), '「姓（漢字）」を入力してください');
        if (!chkRes) {
            return;
        }
        chkRes = emptyStrChk($("#seiEn").val());
        setErrorInfo(chkRes, $("#seiEn"), '「姓（英字）」を入力してください');
        if (!chkRes) {
            return;
        }
        chkRes = emptyStrChk($("#validateStartDt").val());
        setErrorInfo(chkRes, $("#validateStartDt"), '「開始日」を入力してください');
        if (!chkRes) {
            return;
        }
        chkRes = emptyStrChk($("#validateEndDt").val());
        setErrorInfo(chkRes, $("#validateEndDt"), '「終了日」を入力してください');
        if (!chkRes) {
            return;
        }

        chkRes = date1CompDate2($("#validateEndDt").val(), $("#initHanEiDt").val(), ">=");
        setErrorInfo(chkRes, $("#validateEndDt"), '「終了日」に「' + $("#initHanEiDt").val() + '」以降の日付を入力してください。');
        if (!chkRes) {
            return;
        }
        chkRes = date1CompDate2($("#hanEiDt").val(), $("#initHanEiDt").val(), ">=");
        setErrorInfo(chkRes, $("#hanEiDt"), '「反映日」に「' + $("#initHanEiDt").val() + '」以降の日付を入力してください。');
        if (!chkRes) {
            return;
        }
        chkRes = date1CompDate2($("#validateEndDt").val(), $("#validateStartDt").val(), ">=");
        setErrorInfo(chkRes, $("#validateStartDt"), '「開始日」に「終了日」より前の日付を入力してください。');
        if (!chkRes) {
            return;
        }
        
        opDiv = "2";
        if($("#pageDiv").val() == "new"){
            // モーダルの内容要素を更新
            $('#confirmMessage').html("新規登録を行います。よろしいですか？");
            
        }else {
            // モーダルの内容要素を更新
            $('#confirmMessage').html("更新を行います。よろしいですか？");
        } 
        
        if($("#pageDiv").val() == "new"){
            
            //通常のアクションをキャンセルする
            e.preventDefault();
            //処理中、ボタン押下の抑制
            if (isPosting) return false;
            isPosting = true;
            // フォームのデータを取得
            var formData = $('#UserRegistForm').serializeArray();
    
            var outputJson = {};
    
            // 各オブジェクトを処理して新しいオブジェクトを構築
            formData.forEach(function(obj) {
                var propertyName = obj.name;
                outputJson[propertyName] = obj.value;
            });
    
            //保存前の有効性チェック処理
            $.ajax({
                url: webAppName + "/userRegitSavePreCheck",
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
        }else{
            $('#errMsgDiv').addClass("d-none");
            // モーダルの内容を表示
            $('#confirmModal').modal('show');
        }


    }


    //入学年度を生成する
    function initNyugakuNendo() {

        if ($("#riYouShaDiv").val() != "3") {
            //学生ではない
            return;
        }
/*
        if ($("#nyuGakuNendo").val() != "") {
            return;
        }
*/
        var gakuSekiBn = $("#gakuSekiBn").val();

        //if(gakuSekiBn.substr(0, 4) != ""){
        $("#nyuGakuNendo").val(gakuSekiBn.substr(0, 4) );
        //}

    }

    //メールアドレスを生成する
    function initMailAddr() {
/*
        if ($("#mailAddr").val() != "") {
            return;
        }
*/
        var riYouShaDiv = $("#riYouShaDiv").val();

        var tmpStr = "";
        switch (riYouShaDiv) {
            case "1":
            //1 教員
            case "2":
                //2 職員
                tmpStr = "ist";
                break;
            case "3":
            //3 学生
            case "4":
                //4 ビジター
                tmpStr = "cis";
                break;
            default:
                break;
        }
        var riYouShaId = $("#riYouShaId").val();
        $("#mailAddr").val(riYouShaId +
            "@" + tmpStr + ".aichi-pu.ac.jp");

    }

    //学籍番号より利用者IDを生成する
    function initRiYouShaIdBaseOnGakuSekiBn() {
        var regex = /^\d{10}$/;

        var gakuSekiBn = $("#gakuSekiBn").val();

        if (!regex.test(gakuSekiBn)) {
            return;
        }
        if (gakuSekiBn.substr(4, 2) != "31"
            && gakuSekiBn.substr(4, 2) != "83"
            && gakuSekiBn.substr(4, 2) != "84") {
            return;
        }

        //if ($("#riYouShaId").val() == "") {
            var headStr = "";
            switch (gakuSekiBn.substr(4, 2)) {
                case "31":
                    //is + 入学年度（下2桁） + 数字（4桁）  ;;学部生
                    headStr = "is";
                    break;
                case "83":
                    //im + 入学年度（下2桁） + 数字（4桁）	;;修士生
                    headStr = "im";
                    break;
                case "84":
                    //id + 入学年度（下2桁） + 数字（4桁）	;;博士生
                    headStr = "id";
                    break;
                default:
            }
            $("#riYouShaId").val(headStr +
                gakuSekiBn.substr(2, 2) +
                gakuSekiBn.substr(6, 4));
        //}

    }


    //1 教員
    function setDefaultVal1() {
        var riYouShaId = $("#riYouShaId").val();

        //1  利用者フラグ [教育LDAP]  0
        //2  利用者フラグ [サイボウズ]  1
        $('[name="useApp02"]').prop('checked', true);
        //3  利用者フラグ [並列演算装置]  1
        $('[name="useApp03"]').prop('checked', true);
        //4  利用者フラグ [VPN]  1
        $('[name="useApp04"]').prop('checked', true);
        //5  利用者フラグ [教育システム]  1
        $('[name="useApp05"]').prop('checked', true);
        //6  利用者フラグ [演習室１]  1
        $('[name="useApp06"]').prop('checked', true);

        //2 uidNumber(IST)
        $("#otherItem02").val("");

        //3 uidNumber(CIS)
        $("#otherItem03").val("");

        //4 gidNumber(IST)
        $("#otherItem04").val("100");

        //5 gidNumber(CIS)
        $("#otherItem05").val("100");

        //6 Windowsグループ(IST)
        $("#otherItem06").val("ist");

        //7 Windowsグループ(CIS)
        $("#otherItem07").val("sensei");

        //8 Windowsグループ（演習室１）
        $("#otherItem08").val("sensei");

        //9 OU(IST-AD)
        $("#otherItem09").val("ou=ist");

        //10 OU(CIS-AD)
        $("#otherItem10").val("ou=Teachers,ou=CISUsers");

        //11 OU(演習室1-AD)
        $("#otherItem11").val("OU=sensei");

        //12 OU(IST-LDAP)
        $("#otherItem12").val("ou=teachers,ou=cisusers");

        //13 OU(CIS-LDAP)
        $("#otherItem13").val("ou=ist");

        //14 Windowsホームディレクトリ(IST)
        $("#otherItem14").val("C:\\Users\\ist\\" + riYouShaId);

        //15 Windowsホームディレクトリ(CIS)
        $("#otherItem15").val("\\\\cs18\\sensei\\" + riYouShaId);

        //16 Linuxホームディレクトリ(IST)
        $("#otherItem16").val("/ist/" + riYouShaId);

        //17 Linuxホームディレクトリ(CIS)
        $("#otherItem17").val("/cis/sensei/" + riYouShaId);

        //18 WWWホームディレクトリ(CIS)
        $("#otherItem18").val("/cis/sensei/" + riYouShaId);

        //19 Windowsホームディレクトリ(演習室1)
        $("#otherItem19").val("\\\\ia203\\home\\sensei\\" + riYouShaId);

        //20 ログインシェル(IST)
        $("#otherItem20").val("/bin/csh");

        //21 ログインシェル(CIS)
        $("#otherItem21").val("/bin/bash");

        //22 ユーザプロファイルパス(IST)
        $("#otherItem22").val("C:\\WINDOWS\\fjsys\\userprof");

        //23 ユーザプロファイルパス(CIS)
        $("#otherItem23").val("C:\\WINDOWS\\fjsys\\userprof");

        //24 ログオンスクリプト(IST)
        $("#otherItem24").val("logon.bat");

        //25 ログオンスクリプト(CIS)
        $("#otherItem25").val("");

        //26 Dynamic VLAN-ID(有線)
        $("#otherItem26").val("3832");

        //27 Dynamic VLAN-ID(無線)
        $("#otherItem27").val("3832");

        //28 サイボウズ初期グループ
        $("#otherItem28").val("of_1_全教員（教授会）");



    }
    //2 職員
    function setDefaultVal2() {
        var riYouShaId = $("#riYouShaId").val();

        //1  利用者フラグ [教育LDAP]  0
        //2  利用者フラグ [サイボウズ]  1
        $('[name="useApp02"]').prop('checked', true);
        //3  利用者フラグ [並列演算装置]  1
        $('[name="useApp03"]').prop('checked', true);
        //4  利用者フラグ [VPN]  1
        $('[name="useApp04"]').prop('checked', true);
        //5  利用者フラグ [教育システム]  1
        $('[name="useApp05"]').prop('checked', true);
        //6  利用者フラグ [演習室１]  1
        $('[name="useApp06"]').prop('checked', true);


        //2 uidNumber(IST)
        $("#otherItem02").val("");

        //3 uidNumber(CIS)
        $("#otherItem03").val("");

        //4 gidNumber(IST)
        $("#otherItem04").val("150");

        //5 gidNumber(CIS)
        $("#otherItem05").val("150");

        //6 Windowsグループ(IST)
        $("#otherItem06").val("ist");

        //7 Windowsグループ(CIS)
        $("#otherItem07").val("sensei");

        //8 Windowsグループ（演習室１）
        $("#otherItem08").val("sensei");

        //9 OU(IST-AD)
        $("#otherItem09").val("ou=ist");

        //10 OU(CIS-AD)
        $("#otherItem10").val("ou=Teachers,ou=CISUsers");

        //11 OU(演習室1-AD)
        $("#otherItem11").val("OU=sensei");

        //12 OU(IST-LDAP)
        $("#otherItem12").val("ou=teachers,ou=cisusers");

        //13 OU(CIS-LDAP)
        $("#otherItem13").val("ou=ist");

        //14 Windowsホームディレクトリ(IST)
        $("#otherItem14").val("C:\\Users\\ist\\" + riYouShaId);

        //15 Windowsホームディレクトリ(CIS)
        $("#otherItem15").val("\\\\cs18\\sensei\\" + riYouShaId);

        //16 Linuxホームディレクトリ(IST)
        $("#otherItem16").val("/ist/" + riYouShaId);

        //17 Linuxホームディレクトリ(CIS)
        $("#otherItem17").val("/cis/sensei/" + riYouShaId);

        //18 WWWホームディレクトリ(CIS)
        $("#otherItem18").val("/cis/sensei/" + riYouShaId);

        //19 Windowsホームディレクトリ(演習室1)
        $("#otherItem19").val("\\\\ia203\\home\\sensei\\" + riYouShaId);

        //20 ログインシェル(IST)
        $("#otherItem20").val("/bin/csh");

        //21 ログインシェル(CIS)
        $("#otherItem21").val("/bin/bash");

        //22 ユーザプロファイルパス(IST)
        $("#otherItem22").val("C:\\WINDOWS\\fjsys\\userprof");

        //23 ユーザプロファイルパス(CIS)
        $("#otherItem23").val("C:\\WINDOWS\\fjsys\\userprof");

        //24 ログオンスクリプト(IST)
        $("#otherItem24").val("logon.bat");

        //25 ログオンスクリプト(CIS)
        $("#otherItem25").val("");

        //26 Dynamic VLAN-ID(有線)
        $("#otherItem26").val("3832");

        //27 Dynamic VLAN-ID(無線)
        $("#otherItem27").val("3832");

        //28 サイボウズ初期グループ
        $("#otherItem28").val("ist2000");


    }
    //3 学生
    function setDefaultVal3() {
        var riYouShaId = $("#riYouShaId").val();

        //1  利用者フラグ [教育LDAP]  0
        //2  利用者フラグ [サイボウズ]  0
        $('[name="useApp02"]').prop('checked', false);
        //3  利用者フラグ [並列演算装置]  0
        $('[name="useApp03"]').prop('checked', false);
        //4  利用者フラグ [VPN]  1
        $('[name="useApp04"]').prop('checked', true);
        //5  利用者フラグ [教育システム]  1
        $('[name="useApp05"]').prop('checked', true);
        //6  利用者フラグ [演習室１]  1
        $('[name="useApp06"]').prop('checked', true);

        //2 uidNumber(IST)
        $("#otherItem02").val("");

        //3 uidNumber(CIS)
        $("#otherItem03").val("");

        //4 gidNumber(IST)
        $("#otherItem04").val("2000");

        //5 gidNumber(CIS)
        $("#otherItem05").val("900");

        //6 Windowsグループ(IST)
        $("#otherItem06").val("res");

        //7 Windowsグループ(CIS)
        $("#otherItem07").val("home");

        //8 Windowsグループ（演習室１）
        $("#otherItem08").val("");

        //9 OU(IST-AD)
        $("#otherItem09").val("ou=res");

        //10 OU(CIS-AD)
        $("#otherItem10").val("ou=Students,ou=CISUsers");

        //11 OU(演習室1-AD)
        $("#otherItem11").val("OU=student");

        //12 OU(IST-LDAP)
        $("#otherItem12").val("ou=students,ou=cisusers");

        //13 OU(CIS-LDAP)
        $("#otherItem13").val("ou=res");

        //14 Windowsホームディレクトリ(IST)
        $("#otherItem14").val("C:\\Users\\res\\" + riYouShaId);

        //15 Windowsホームディレクトリ(CIS)
        $("#otherItem15").val("\\\\cs18\\home\\" + riYouShaId);

        //16 LLinuxホームディレクトリ(IST)
        $("#otherItem16").val("/res/" + riYouShaId);

        //17 Linuxホームディレクトリ(CIS)
        $("#otherItem17").val("/cis/home/" + riYouShaId);

        //18 WWWホームディレクトリ(CIS)
        $("#otherItem18").val("/cis/home/" + riYouShaId);

        //19 Windowsホームディレクトリ(演習室1) \\ia203\home\student\[利用者ID]
        $("#otherItem19").val("\\\\ia203\\home\\student\\" + riYouShaId);

        //20 ログインシェル(IST)
        $("#otherItem20").val("/bin/csh");

        //21 ログインシェル(CIS)
        $("#otherItem21").val("/bin/bash");

        //22 ユーザプロファイルパス(IST)
        $("#otherItem22").val("C:\\WINDOWS\\fjsys\\userprof");

        //23 ユーザプロファイルパス(CIS)
        $("#otherItem23").val("C:\\WINDOWS\\fjsys\\userprof");

        //24 ログオンスクリプト(IST)
        $("#otherItem24").val("logon.bat");

        //25 ログオンスクリプト(CIS)
        $("#otherItem25").val("");

        //26 Dynamic VLAN-ID(有線)
        $("#otherItem26").val("3848");

        //27 Dynamic VLAN-ID(無線)
        $("#otherItem27").val("3848");

        //28 サイボウズ初期グループ
        $("#otherItem28").val("ist3000");


    }
    //4 ビジター
    function setDefaultVal4() {
        var riYouShaId = $("#riYouShaId").val();

        //1  利用者フラグ [教育LDAP]  0
        //2  利用者フラグ [サイボウズ]  0
        $('[name="useApp02"]').prop('checked', false);
        //3  利用者フラグ [並列演算装置]  0
        $('[name="useApp03"]').prop('checked', false);
        //4  利用者フラグ [VPN]  0
        $('[name="useApp04"]').prop('checked', false);
        //5  利用者フラグ [教育システム]  1
        $('[name="useApp05"]').prop('checked', true);
        //6  利用者フラグ [演習室１]  0
        $('[name="useApp06"]').prop('checked', false);


        //2 uidNumber(IST)
        $("#otherItem02").val("");

        //3 uidNumber(CIS)
        $("#otherItem03").val("");

        //4 gidNumber(IST)
        $("#otherItem04").val("2000");

        //5 gidNumber(CIS)
        $("#otherItem05").val("900");

        //6 Windowsグループ(IST)
        $("#otherItem06").val("res");

        //7 Windowsグループ(CIS)
        $("#otherItem07").val("home");

        //8 Windowsグループ（演習室１）
        $("#otherItem08").val("");

        //9 OU(IST-AD)
        $("#otherItem09").val("ou=res");

        //10 OU(CIS-AD)
        $("#otherItem10").val("ou=Students,ou=CISUsers");

        //11 OU(演習室1-AD)
        $("#otherItem11").val("OU=student");

        //12 OU(IST-LDAP)
        $("#otherItem12").val("ou=students,ou=cisusers");

        //13 OU(CIS-LDAP)
        $("#otherItem13").val("ou=res");

        //14 Windowsホームディレクトリ(IST)
        $("#otherItem14").val("C:\\Users\\res\\" + riYouShaId);

        //15 Windowsホームディレクトリ(CIS)
        $("#otherItem15").val("\\\\cs18\\home\\" + riYouShaId);

        //16 Linuxホームディレクトリ(IST)
        $("#otherItem16").val("/res/" + riYouShaId);

        //17 Linuxホームディレクトリ(CIS)
        $("#otherItem17").val("/cis/home/" + riYouShaId);

        //18 WWWホームディレクトリ(CIS)
        $("#otherItem18").val("/cis/home/" + riYouShaId);

        //19 WWWホームディレクトリ(CIS)
        $("#otherItem19").val("\\\\ia203\\home\\student\\" + riYouShaId);

        //20 ログインシェル(IST)
        $("#otherItem20").val("/bin/csh");

        //21 ログインシェル(CIS)
        $("#otherItem21").val("/bin/bash");

        //22 ユーザプロファイルパス(IST)
        $("#otherItem22").val("C:\\WINDOWS\\fjsys\\userprof");

        //23 ユーザプロファイルパス(CIS)
        $("#otherItem23").val("C:\\WINDOWS\\fjsys\\userprof");

        //24 ログオンスクリプト(IST)
        $("#otherItem24").val("logon.bat");

        //25 ログオンスクリプト(CIS)
        $("#otherItem25").val("");

        //26 Dynamic VLAN-ID(有線)
        $("#otherItem26").val("3832");

        //27 Dynamic VLAN-ID(無線)
        $("#otherItem27").val("3832");

        //28 サイボウズ初期グループ
        $("#otherItem28").val("ist3000");

    }


    function checkRiyoushaId(riyoushaId) {


        var forbiddenCharactersRegex = /[\/:*?"<>|&\(\)\[\]{}\^=;!'\+,`~# ]|[ ]|[　]|[\\]/g;

        // テスト例
        // var inputString = "This is a test string with some forbidden characters: \/:*?\"<>|&()[]{}^=;!'+,`~#　全角スペース";
        if (forbiddenCharactersRegex.test(riyoushaId)) {
            console.log("入力に禁止された文字またはスペースが含まれています。");
            return false;
        } else {
            console.log("入力は許可されています。");
            return true;
        }
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