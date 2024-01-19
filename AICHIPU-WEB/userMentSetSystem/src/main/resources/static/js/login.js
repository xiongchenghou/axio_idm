$(function () {
  $("#userLoginBtnJa").click(function () {
    location.href = "../../templetes/UserMaintenance/UserMaintenanceMenuJa.html"
  });

  $("#userLoginBtnEn").click(function () {
    location.href = "../../templetes/UserMaintenance/UserMaintenanceMenuEn.html"
  });

  /*==================================================================
    [ Focus input ]*/
    $('.input100').each(function(){
      $(this).on('blur', function(){
          if($(this).val().trim() != "") {
              $(this).addClass('has-val');
          }
          else {
              $(this).removeClass('has-val');
          }
      })    
  })

  /*==================================================================
  [ Validate ]*/
  var input = $('.validate-input .input100');

  $('.validate-form').on('submit',function(){
      var check = true;
    alert('Please enter')
      for(var i=0; i<input.length; i++) {
          if(validate(input[i]) == false){
              showValidate(input[i]);
              check=false;
          }
      }

      return check;
  });


  $('.validate-form .input100').each(function(){
      $(this).focus(function(){
         hideValidate(this);
      });
  });

  function validate (input) {
      if($(input).attr('type') == 'email' || $(input).attr('name') == 'email') {
          if($(input).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
              return false;
          }
      }
      else {
          if($(input).val().trim() == ''){
              return false;
          }
      }
  }

  function showValidate(input) {
      var thisAlert = $(input).parent();
      $(thisAlert).addClass('alert-validate');
  }

  function hideValidate(input) {
      var thisAlert = $(input).parent();

      $(thisAlert).removeClass('alert-validate');
  }

});

// ページの読み込みが完了した際に実行する関数を設定します
window.addEventListener('load', function() {
    // ユーザーIDとパスワードの入力フィールド要素を取得します
    var userIdInput = document.querySelector('input[name="userId"]');
    var passInput = document.querySelector('input[name="pass"]');

    // 要素が存在することを確認します
    if (userIdInput && passInput) {
        // ユーザーIDとパスワードの入力フィールドに値があるかどうかをチェックします
        if (userIdInput.value.trim() || passInput.value.trim()) {
            // どちらかの入力フィールドに値がある場合、ユーザーIDの入力フィールドにフォーカスを設定します
            userIdInput.focus();
        }
    }
    
    
    // セレクトボックスが変更されたときに実行される関数
    $('#selLang').on('change', function() {
        // 選択されたオプションの値を取得
        var selectedValue = $(this).val();

        // 選択した値を表示するエリアにセット
        if(selectedValue=="ja"){
            $("#spanPageTitle").text("利用者メンテナンス");
            $("#spanRiyoushaId").attr("data-placeholder","利用者ID");
            $("#spanPassword").attr("data-placeholder","パスワード");
            $("#adminLoginBtn").text("ログイン");
            
        }else if(selectedValue=="en"){
            $("#spanPageTitle").text("User Maintenance");
            $("#spanRiyoushaId").attr("data-placeholder","User ID");
            $("#spanPassword").attr("data-placeholder","Password");
            $("#adminLoginBtn").text("Log in");
            
        }
    });
    
});

