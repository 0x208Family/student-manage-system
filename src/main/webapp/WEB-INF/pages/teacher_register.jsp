<%--
  Created by IntelliJ IDEA.
  User: 16202
  Date: 2020/5/30
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/validator/css/bootstrapValidator.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/datepicker/css/bootstrap-datepicker3.min.css"/>
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_1852391_8nxr6qvbrf8.css"/>

    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-1.11.0.min.js" ></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js" ></script>
    <!-- 使用压缩过的版本-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/validator/js/bootstrapValidator.min.js" ></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/datepicker/js/bootstrap-datepicker.min.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/datepicker/locales/bootstrap-datepicker.zh-CN.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/layer/layer.js"></script>

    <style type="text/css">
        .form-comp {
            width: 200px;
        }

        .form-horizontal .has-feedback .form-control-feedback {
            top: 0;
            right: 32%;
        }

    </style>
</head>
<body>
<div class="col-md-6 col-md-offset-3">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="${pageContext.request.contextPath}/index.jsp"><i class="iconfont iconshouye"></i> 返回首页</a> </li>
                    <li><a href="${pageContext.request.contextPath}/stu_register_page"><i class="iconfont iconzhuce"></i> 学生注册</a> </li>
                    <li><a href="${pageContext.request.contextPath}/entity"><i class="iconfont icondenglu"></i> 登录</a> </li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<div class="col-md-8 col-md-offset-2">
    <div class="page-header"><h2 class="text-center">教师注册</h2></div>
    <form id="tea_register" class="form-horizontal"  method="post" action="#">
        <div class="form-group">
            <label for="teacherId" class="col-sm-2 control-label">教师编号</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconbianhao" id="icon_teacherId_id"></span>
                <input type="text" class="form-control form-comp" id="teacherId" name="teacherId" placeholder="教师编号" aria-describedby="icon_teacherId_id" style="width: 60%"/>
                <div id="_teacherId" style="display: inline-block;"></div>
            </div>
        </div>
        <div class="form-group">
            <label for="name" class="col-sm-2 control-label">姓名</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconxingmingyonghumingnicheng" id="icon_name_id"></span>
                <input type="text" class="form-control form-comp" id="name" name="name" placeholder="姓名" aria-describedby="icon_name_id" style="width: 60%"/>
                <div id="_name" style="display: inline-block;"></div>
            </div>
        </div>
        <div class="form-group">
            <label for="fst_password" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconmima" id="icon_fst_password_id"></span>
                <input type="password" class="form-control form-comp" id="fst_password" name="password" placeholder="密码" aria-describedby="icon_fst_password_id" style="width: 60%"/>
                <div id="_fst_password" style="display: inline-block; word-break: break-all; margin: fill"></div>
            </div>
        </div>
        <div class="form-group">
            <label for="sec_password" class="col-sm-2 control-label">确认密码</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconquerenmima" id="icon_sec_password_id"></span>
                <input type="password" class="form-control form-comp" id="sec_password" name="sec_password" placeholder="确认密码" aria-describedby="icon_sec_password_id" style="width: 60%"/>
                <div id="_sec_password" style="display: inline-block;"></div>
            </div>
        </div>
        <div class="form-group">
            <label for="identityNum" class="col-sm-2 control-label">身份证号</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont icon2shenfenzhenghaoma" id="icon_identity_id"></span>
                <input type="text" class="form-control form-comp" id="identityNum" name="identityNum" placeholder="身份证号" aria-describedby="icon_identity_id" style="width: 60%"/>
                <div id="_identityNum" style="display: inline-block;"></div>
            </div>
        </div>

        <div class="form-group">
            <label for="politicalStatus" class="col-sm-2 control-label">政治面貌</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconzhengzhi" id="icon_political_id"></span>
                <select class="form-control form-comp" id="politicalStatus" name="politicalStatus" aria-describedby="icon_political_id" style="width: 60%">
                    <c:forEach items="${requestScope.statusList}" var="status">
                        <option>${status.status}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="nation" class="col-sm-2 control-label">籍贯</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconorigin" id="icon_nation_id"></span>
                <select class="form-control form-comp" id="nation" name="nation" aria-describedby="icon_nation_id" style="width: 60%">
                    <c:forEach items="${requestScope.provinceList}" var="province">
                        <option>${province.provinceName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">性别</label>
            <div class="col-sm-10">
                <label class="radio-inline">
                    <input type="radio" name="sex" id="male" value="男" checked/> 男
                </label>
                <label class="radio-inline">
                    <input type="radio" name="sex" id="female" value="女"/> 女
                </label>
            </div>
        </div>

        <div class="form-group">
            <label for="ethnic" class="col-sm-2 control-label">民族</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconminzu1" id="icon_ethnic_id"></span>
                <select class="form-control form-comp" id="ethnic" name="ethnic" aria-describedby="icon_ethnic_id" style="width: 60%">
                    <c:forEach items="${requestScope.ethnicList}" var="ethnic">
                        <option>${ethnic.ethnicName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label for="academy" class="col-sm-2 control-label">学院</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconxueyuan1" id="icon_academy_id"></span>
                <input type="text" class="form-control form-comp" id="academy" name="academy" placeholder="学院" aria-describedby="icon_academy_id" style="width: 60%"/>
                <div id="_fst_academy" style="display: inline-block;"></div>
            </div>
        </div>

        <div class="form-group">
            <label for="phone" class="col-sm-2 control-label">联系电话</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont icondianhua" id="icon_phone_id"></span>
                <input type="text" class="form-control form-comp" id="phone" name="phone" placeholder="联系电话" aria-describedby="icon_phone_id" style="width: 60%"/>
                <div id="_phone" style="display: inline-block;"></div>
            </div>
        </div>

        <div class="form-group">
            <label for="province" class="col-sm-2 control-label">省份</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconsuozaishengfen" id="icon_province_id"></span>
                <select class="form-control form-comp" id="province" name="province" aria-describedby="icon_province_id" style="width: 60%">
                    <c:forEach items="${requestScope.provinceList}" var="province">
                        <option>${province.provinceName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label for="city" class="col-sm-2 control-label">城市</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconchengshi1" id="icon_city_id"></span>
                <select class="form-control form-comp" id="city" name="city" aria-describedby="icon_city_id" style="width: 60%">
                    <c:forEach items="${requestScope.cityList}" var="city">
                        <option>${city.cityName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label for="county" class="col-sm-2 control-label">县区</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconchengshi" id="icon_county_id"></span>
                <select class="form-control form-comp" id="county" name="county" aria-describedby="icon_county_id" style="width: 60%">
                    <c:forEach items="${requestScope.countyList}" var="county">
                        <option>${county.countyName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label for="addressDetail" class="col-sm-2 control-label">详细住址</label>
            <div class="col-sm-10 input-group">
                <span class="input-group-addon iconfont iconzhuzhi_jiedao" id="icon_addressDetail_id"></span>
                <textarea style="resize: none; width: 60%" rows="3" class="form-control form-comp" id="addressDetail" name="addressDetail" placeholder="详细住址" aria-describedby="addressDetail"></textarea>
            </div>
        </div>

        <div class="col-md-6 col-md-offset-3">
            <div class="form-group">
                <div class="checkbox">
                    <input id="submit" type="submit" class="btn btn-primary" style="margin-right: 10px" value="立即注册"/>
                    <label style="margin-right: 30px"><input name="confirm" type="checkbox" value=""/>我已准确填写注册信息</label>
                    <div id="_confirm" style="display: inline-block;"></div>
                </div>
            </div>
        </div>
    </form>
</div>
<div class="modal fade" id="captchaModal" tabindex="-1" role="dialog" aria-labelledby="captchaModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
                <h4 class="modal-title" id="captchaModalLabel">输入图中验证码</h4>
            </div>
            <div class="modal-body">
                <img id="captcha_img" src="${pageContext.request.contextPath}/Kaptcha" style="width: 150px; height: 92px; margin-left: 30%; margin-bottom: 20px"/>
                <form id="captcha_form" class="form-horizontal" method="post" action="#">
                    <div class="form-group">
                        <label for="captcha" class="col-sm-2 control-label">验证码</label>
                        <div class="col-sm-10 input-group">
                            <span class="input-group-addon iconfont iconyanzhengma" id="icon_captcha_id"></span>
                            <input type="text" class="form-control form-comp" id="captcha" name="captcha"
                                   placeholder="验证码" aria-describedby="icon_captcha_id" style="width: 60%"/>
                            <div style="padding-top: 8px"><strong>看不清？单击图片换一张</strong></div>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button id="captcha_confirm" type="button" class="btn btn-primary">确认</button>
            </div>
        </div>
    </div>
</div>
<button id="modal_trigger" data-toggle="modal" data-target="#captchaModal" value="21" style="display: none"></button>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/util.min.js"></script>
<script type="text/javascript">
    $(function () {
        modalClickHandler('#captcha_confirm', '#captcha', '#tea_register',
            '${pageContext.request.contextPath}/captcha_check',
            '${pageContext.request.contextPath}/save_teacher',
            '${pageContext.request.contextPath}/entity',
            '#captcha_img', '${pageContext.request.contextPath}/Kaptcha?'
        );

        teacherDateValidator("${pageContext.request.contextPath}/tea_id_verify");

        $('#captcha_img').click(function () {
            changeCaptcha(this, "${pageContext.request.contextPath}/Kaptcha?");
        })

        $('#submit').click(function (e) {
            if ($('#tea_register').data('bootstrapValidator').isValid()) {
                changeCaptcha('#captcha_img', '${pageContext.request.contextPath}/Kaptcha?');
                $('#modal_trigger').trigger('click');
                e.preventDefault();
            } else {
                layer.open({
                    offset: '100px',
                    title: '提示',
                    content: '请填写完整注册信息并点击右侧按钮进行确认',
                    icon: 1
                })
            }
        })

        // 三级联动
        changeCityAndCounty('#province', '#city', '#county', '${pageContext.request.contextPath}/request_city', '${pageContext.request.contextPath}/request_county')
        changeCounty('#province', '#city', '#county', '${pageContext.request.contextPath}/request_county')
    })
</script>
</body>
</html>