
// Get the full pathname (including the web app name)
var fullPathname = window.location.pathname;

// Extract the web app name (assuming it's the first part of the pathname)
var webAppName = ".";
/*
if(fullPathname.split('/').length > 2){
    webAppName = "/" + fullPathname.split('/')[1]; 
}
*/
function showAxioMessage(message, type, callbackFunc){
    
    
    Swal.fire({
        icon: `${type}`,
        title: `確認画面`,
        html: `<span style="font-size: 18px; color: green;">${message}</span>`,
        width: '20%',
        confirmButtonText: '確認',
        customClass: {
            confirmButton: 'custom-ok-button'
        }
    }).then((result) => {
        if (result.value) {
          if(callbackFunc !== undefined){
              callbackFunc();
          }
        }
      });
    
    /*
    if(title !== undefined && title != ""){
        $("#axioMessageDialog2").prop("title", title);
    }
    $("#axioMessage").text(msg);
    
    $("#axioMessageDialog2").dialog({
        modal:true,
        buttons:[
            {
                text: 'OK' ,
                class: 'btn' ,
                click: function(){
                    $(this).dialog("close");
                    if(callbackFunc !== undefined){
                        callbackFunc();
                    }
                }
            }
        ],
        open:function(event, ui){
            $(".ui-dialog-titlebar-close").hide();
        }
    });
    */
    
}