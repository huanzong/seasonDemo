/**
 * 跳转到登录页面
 * @param {Boolean} needReturn 登录成功是否需要返回，默认true返回
 */
function goToLoginPage(needReturn) {
    var href_ = escape(encodeURI(window.location.href));
    var idsLoginUrl = USER_PATH + "ids/cn/haier_login.jsp";
    if (!needReturn) {
        idsLoginUrl += "?regFrom=haierBBS&returnUrl=" + href_;
    }
    //cookie中放入首次登录标志
    jQuery.cookie("firstLoginFlag", "0");
    window.location.href = idsLoginUrl;
    return false;
}

/**
 * 跳转到用户注册页面
 */
function goToRegPage() {
    var returnUrl = window.location.href;
    var idsRegUrl = USER_PATH + "ids/cn/haier_regUser.jsp?regFrom=haierBBS&regFromUrl=" + returnUrl;
    window.location.href = idsRegUrl;
    return false;
}


function getHtmlFromUrl(url_) {
    var content = "";
    jQuery.ajax({
        url: url_,
        async: false,
        dataType: 'html',
        cache: false,
        success: function (data) {
            content = data;
        }
    });
    return content;
}


//呼吸灯效果函数
function blink() {
    if (intBlink > 1) {
        return;
    }
    setInterval(function () {
        jQuery(".userMessage em").fadeOut(1300).fadeIn(1300);
    }, 2600);
    // title 增加新消息提醒
    var timerArr = jQuery.blinkTitle.show();
    //若认为操作消失，只需如此调用： jQuery.blinkTitle.clear(timerArr);
}

// 正则判断是否是数字
function testNumber(obj) {
    var isNum = false;
    var re = /^[0-9]+.?[0-9]*$/;
    if (re.test(obj)) {
        isNum = true;
    }
    return isNum;
}
