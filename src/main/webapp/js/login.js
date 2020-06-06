
function submitHandler(submitId, formId, target, desc) {
    $(submitId).click(function () {
        $.ajax({
            url: target,
            data: $(formId).serialize(),
            dataType: 'text',
            success: function (resp) {
                if (resp === 'true') {
                    window.location.href = desc;
                } else {
                    layer.open({
                        title: '登录失败',
                        content: '账号或密码错误',
                        icon: 5
                    })
                }
            }
        })
    })
}