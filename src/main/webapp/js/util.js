
function setDatepicker(selectorId) {
    $(selectorId).datepicker({
        language:"zh-CN",
        autoclose:true,
        endDate: new Date()
    });
}

function studentDateValidator(url) {

    $('#stu_register').bootstrapValidator({
        message: "无效的字段信息",
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        // submitButtons: '#submit',
        fields: {
            studentId: {
                trigger: 'blur',
                container: '#_studentId',
                validators: {
                    notEmpty: {
                        message: '请输入学号'
                    },
                    stringLength: {
                        min: 10,
                        max: 10,
                        message: "学号长度有误"
                    },
                    remote: {
                        url: url,
                        date: { studentId: $('input[name="studentId"]').val() },
                        message: '学号不可用',
                        delay: 2000,
                        type: 'POST'
                    }
                }
            },
            name: {
                trigger: 'blur',
                container: '#_name',
                validators: {
                    notEmpty: {
                        message: '请输入姓名'
                    },
                    stringLength: {
                        min: 2,
                        max: 4,
                        message: '无效的姓名'
                    }
                }
            },
            instructorName: {
                trigger: 'blur',
                container: '#_instructorName',
                validators: {
                    notEmpty: {
                        message: '请输入姓名'
                    },
                    stringLength: {
                        min: 2,
                        max: 4,
                        message: '无效的姓名'
                    }
                }
            },
            identityNum: {
                trigger: 'blur',
                container: '#_identityNum',
                validators: {
                    notEmpty: {
                        message: '请输入身份证号'
                    },
                    stringLength: {
                        min: 18,
                        max: 18,
                        message: '请输入18位身份证号'
                    },
                    regexp: {
                        regexp: /^[1-9][0-9]{5}(19|20)[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|31)|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}([0-9]|x|X)$/,
                        message: '无效的身份证号'
                    }
                }
            },
            password: {
                trigger: 'blur',
                container: '#_fst_password',
                validators: {
                    notEmpty: {
                        message: '请输入密码'
                    },
                    stringLength: {
                        min: 8,
                        max: 16,
                        message: '密码长度必须在8-16位'
                    },
                    regexp: {
                        regexp: /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[^]{8,16}$/,
                        message: '密码必须包含至少1个大写字母，1个小写字母和1个数字'
                    }
                }
            },
            sec_password: {
                trigger: 'blur',
                container: '#_sec_password',
                validators: {
                    notEmpty: {
                        message: '请确认密码'
                    },
                    identical: {
                        field: 'password',
                        message: '两次密码输入不一致'
                    }
                }
            },
            personalPhone: {
                trigger: 'blur',
                container: '#_personalPhone',
                validators: {
                    notEmpty: {
                        message: '手机号不能为空'
                    },
                    stringLength: {
                        min: 11,
                        max: 11,
                        message: '无效的手机号'
                    },
                    regexp: {
                        regexp: /^1[3456789]\d{9}$/,
                        message: "无效的手机号"
                    }
                }
            },

            parentPhone: {
                trigger: 'blur',
                container: '#_parentPhone',
                validators: {
                    notEmpty: {
                        message: '手机号不能为空'
                    },
                    stringLength: {
                        min: 11,
                        max: 11,
                        message: '无效的手机号'
                    },
                    regexp: {
                        regexp: /^1[3456789]\d{9}$/,
                        message: "无效的手机号"
                    }
                }
            },

            dormitoryId: {
                trigger: 'blur',
                container: '#_dormitoryId',
                validators: {
                    notEmpty: {
                        message: '请输入宿舍号'
                    }
                }
            },

            cls: {
                trigger: 'blur',
                container: '#_cls',
                validators: {
                    notEmpty: {
                        message: '请输入专业班级'
                    }
                }
            },

            academy: {
                trigger: 'blur',
                container: '#_academy',
                validators: {
                    notEmpty: {
                        message: '请输入学院'
                    }
                }
            },

            birth: {
                trigger: 'blur',
                container: '#_birth',
                validators: {
                    notEmpty: {
                        message: '请选择出生日期'
                    }
                }
            },

            admissionDate: {
                trigger: 'blur',
                container: '#_admissionDate',
                validators: {
                    notEmpty: {
                        message: '请选择入学日期'
                    }
                }
            },

            confirm: {
                trigger: 'blur',
                container: '#_confirm',
                validators: {
                    choice: {
                        min: 1,
                        max: 1,
                        message: '请确认信息正确性'
                    }
                }
            }
        }
    });
}

function teacherDateValidator(url) {
    $('#tea_register').bootstrapValidator({
        message: "无效的字段信息",
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        // submitButtons: '#submit',
        fields: {
            teacherId: {
                trigger: 'blur',
                container: '#_teacherId',
                validators: {
                    notEmpty: {
                        message: '请输入教师编号'
                    },
                    stringLength: {
                        min: 10,
                        max: 10,
                        message: "教师编号长度有误"
                    },
                    remote: {
                        url: url,
                        date: { teacherId: $('input[name="teacherId"]').val() },
                        message: '教师编号不可用',
                        delay: 2000,
                        type: 'POST'
                    }
                }
            },
            name: {
                trigger: 'blur',
                container: '#_name',
                validators: {
                    notEmpty: {
                        message: '请输入姓名'
                    },
                    stringLength: {
                        min: 2,
                        max: 4,
                        message: '无效的姓名'
                    }
                }
            },
            identityNum: {
                trigger: 'blur',
                container: '#_identityNum',
                validators: {
                    notEmpty: {
                        message: '请输入身份证号'
                    },
                    stringLength: {
                        min: 18,
                        max: 18,
                        message: '请输入18位身份证号'
                    },
                    regexp: {
                        regexp: /^[1-9][0-9]{5}(19|20)[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|31)|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}([0-9]|x|X)$/,
                        message: '无效的身份证号'
                    }
                }
            },
            password: {
                trigger: 'blur',
                container: '#_fst_password',
                validators: {
                    notEmpty: {
                        message: '请输入密码'
                    },
                    stringLength: {
                        min: 8,
                        max: 16,
                        message: '密码长度必须在8-16位'
                    },
                    regexp: {
                        regexp: /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[^]{8,16}$/,
                        message: '密码必须包含至少1个大写字母，1个小写字母和1个数字'
                    }
                }
            },
            sec_password: {
                trigger: 'blur',
                container: '#_sec_password',
                validators: {
                    notEmpty: {
                        message: '请确认密码'
                    },
                    identical: {
                        field: 'password',
                        message: '两次密码输入不一致'
                    }
                }
            },
            phone: {
                trigger: 'blur',
                container: '#_phone',
                validators: {
                    notEmpty: {
                        message: '手机号不能为空'
                    },
                    stringLength: {
                        min: 11,
                        max: 11,
                        message: '无效的手机号'
                    },
                    regexp: {
                        regexp: /^1[3456789]\d{9}$/,
                        message: "无效的手机号"
                    }
                }
            },
            academy: {
                trigger: 'blur',
                container: '#_academy',
                validators: {
                    notEmpty: {
                        message: '请输入学院'
                    }
                }
            },
            confirm: {
                trigger: 'blur',
                container: '#_confirm',
                validators: {
                    choice: {
                        min: 1,
                        max: 1,
                        message: '请确认信息正确性'
                    }
                }
            }
        }
    })
}

function modalClickHandler(bnId, captchaId, formId,  captchaURL, saveURL, targetURL, img, capURL) {
    $(bnId).click(function () {
        $.ajax({
            url: captchaURL,
            data: 'captcha=' + $(captchaId).val(),
            dataType: 'text',
            success: function (resp) {
                if (resp === 'true') {
                    // 序列化表单提交
                    $.ajax({
                        url: saveURL,
                        data: $(formId).serialize(),
                        dataType: 'text',
                        success: function (res) {
                            if (res === 'true') {
                                window.location.href = targetURL;
                            } else {
                                layer.open({
                                    offset: '50px',
                                    title: '失败',
                                    content: '数据保存失败，请检查网络链接或稍后再试',
                                    icon: '5'
                                })
                            }
                        }
                    })
                } else {
                    layer.open({
                        offset: '50px',
                        title: '错误',
                        content: '验证码错误',
                        icon: 5
                    })
                }
            },
            error: function () {
                alert('验证请求发送失败');
            },
            complete: function () {
                changeCaptcha(img, capURL);
            }
        })
    })
}

function changeCityAndCounty(prId, ciId, ctId, ciURL, ctURL) {
    var province = $(prId);
    province.change(function () {
        $(ciId).empty();
        $(ctId).empty();
        requestCityAndCounty(prId, ciId, ctId, ciURL, ctURL);
    })
}

function changeCounty(prId, ciId, ctId, ctURL) {
    var city = $(ciId);
    city.change(function () {
        $(ctId).empty();
        requestCounty(prId, ciId, ctId, ctURL);
    })
}

function requestCityAndCounty(prId, ciId, ctId, ciURL, ctURL) {
    var province = $(prId);
    var city = $(ciId);
    $.ajax({
        url: ciURL,
        data: 'pid=' + (province.get(0).selectedIndex + 1),
        dataType: 'JSON',
        success: function (cityList) {
            $.each(cityList, function (index, c) {
                city.append("<option>" + c.cityName + "</option>");
            })
            // 更新county
            requestCounty(prId, ciId, ctId, ctURL);
        }
    })
}

function requestCounty(prId, ciId, ctId, ctURL) {
    var province = $(prId);
    var city = $(ciId);
    var county = $(ctId);
    $.ajax({
        url: ctURL,
        data: 'pid=' + (province.get(0).selectedIndex + 1) + "&cnm=" + city.find('option:selected').text(),
        dataType: 'JSON',
        success: function (countyList) {
            $.each(countyList, function (index, c) {
                county.append("<option>" + c.countyName + "</option>");
            })
        }
    })
}

function changeCaptcha(img, URL) {
    $(img).attr('src', URL + Math.floor(Math.random() * 100));
}