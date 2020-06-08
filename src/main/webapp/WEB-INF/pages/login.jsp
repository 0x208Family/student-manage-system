<%--
  Created by IntelliJ IDEA.
  User: 16202
  Date: 2020/6/4
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>

    <!-- CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/validator/css/bootstrapValidator.min.css">
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_1852391_8nxr6qvbrf8.css"/>

    <!-- JavaScript -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/validator/js/bootstrapValidator.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>

</head>
<body>
<div class="col-md-6 col-md-offset-3">
    <nav class="navbar navbar-default">
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/index.jsp"><i class="iconfont iconshouye"></i> 返回首页</a></li>
            </ul>
        </div>
    </nav>
</div>

<div class="col-md-6 col-md-offset-3">
    <div class="page-header">
        <h1 class="text-center">欢 迎 使 用</h1>
    </div>
    <div class="col-md-10 col-md-offset-1">
        <div class="col-md-10 col-md-offset-1 layui-tab layui-tab-brief">
            <ul class="layui-tab-title">
                <li class="col-md-3 layui-this"><strong>学生登录</strong></li>
                <li class="col-md-3"><strong>教师登录</strong></li>
                <li class="col-md-3"><strong>辅导员登录</strong></li>
                <li class="col-md-3"><strong>管理员登录</strong></li>
            </ul>
            <div class="layui-tab-content" style="height: 100px;">
                <div class="layui-tab-item layui-show">
                    <form id="stu_form" method="post" action="${pageContext.request.contextPath}/stu_check">
                        <div class="form-group">
                            <label for="studentId">学号</label>
                            <input type="text" class="form-control" id="studentId" name="studentId" placeholder="学号">
                        </div>
                        <div class="form-group">
                            <label for="student_password">密码</label>
                            <input type="password" class="form-control" id="student_password" name="password" placeholder="密码">
                        </div>
                        <div class="form-group">
                            <input type="checkbox" name="remember"><strong> 七天免登录</strong>
                        </div>
                        <div class="form-group">
                            <div class="col-md-6" style="padding-left: 0; display: inline-block"><p>没有账号？<a href="${pageContext.request.contextPath}/stu_register_page"><strong>去注册</strong></a></p></div>
                            <div class="col-md-6" style="padding-right: 0; text-align: right; display: inline-block; float: right"><a href="#"><strong>忘记密码</strong></a></div>
                        </div>
                        <div class="form-group">
                            <button id="stu_login" type="button" class="btn btn-primary btn-lg btn-block">立 即 登 录</button>
                        </div>
                    </form>
                </div>
                <div class="layui-tab-item">
                    <form id="tea_form" method="post" action="${pageContext.request.contextPath}/tea_check">
                        <div class="form-group">
                            <label for="teacherId">教师编号</label>
                            <input type="text" class="form-control" id="teacherId" name="teacherId" placeholder="教师编号">
                        </div>
                        <div class="form-group">
                            <label for="teacher_password">密码</label>
                            <input type="password" class="form-control" id="teacher_password" name="password" placeholder="密码">
                        </div>
                        <div class="form-group">
                            <input type="checkbox" name="remember"><strong> 七天免登录</strong>
                        </div>
                        <div class="form-group">
                            <div class="col-md-6" style="padding-left: 0; display: inline-block"><p>没有账号？<a href="${pageContext.request.contextPath}/tea_register_page"><strong>去注册</strong></a></p></div>
                            <div class="col-md-6" style="padding-right: 0; text-align: right; display: inline-block; float: right"><a href="#"><strong>忘记密码</strong></a></div>
                        </div>
                        <div class="form-group">
                            <button id="tea_login" type="button" class="btn btn-primary btn-lg btn-block">立 即 登 录</button>
                        </div>
                    </form>
                </div>
                <div class="layui-tab-item">
                    <form id="ins_form" method="post" action="${pageContext.request.contextPath}/tea_check">
                        <div class="form-group">
                            <label for="teacherId">辅导员编号</label>
                            <input type="text" class="form-control" name="instructorId" placeholder="辅导员编号">
                        </div>
                        <div class="form-group">
                            <label for="teacher_password">密码</label>
                            <input type="password" class="form-control" name="password" placeholder="密码">
                        </div>
                        <div class="form-group">
                            <input type="checkbox" name="remember"><strong> 七天免登录</strong>
                        </div>
                        <div class="form-group">
                            <button id="ins_login" type="button" class="btn btn-primary btn-lg btn-block">立 即 登 录</button>
                        </div>
                    </form>
                </div>
                <div class="layui-tab-item">
                    <form id="man_form" method="post" action="${pageContext.request.contextPath}/man_check">
                        <div class="form-group">
                            <label for="managerId">管理员编号</label>
                            <input type="text" class="form-control" id="managerId" name="managerId" placeholder="管理员编号">
                        </div>
                        <div class="form-group">
                            <label for="manager_password">密码</label>
                            <input type="password" class="form-control" id="manager_password" name="password" placeholder="密码">
                        </div>
                        <div class="form-group">
                            <input type="checkbox" name="remember"><strong> 七天免登录</strong>
                        </div>
                        <div class="form-group">
                            <button id="man_login" type="button" class="btn btn-primary btn-lg btn-block">立 即 登 录</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
<script type="text/javascript">
    $(function () {
        layui.use(['element', 'layer'], function () {})

        submitHandler('#stu_login', '#stu_form', '${pageContext.request.contextPath}/stu_check', '${pageContext.request.contextPath}/stu_home')
        submitHandler('#tea_login', '#tea_form', '${pageContext.request.contextPath}/tea_check', '${pageContext.request.contextPath}/tea_home')
        submitHandler('#ins_login', '#ins_form', '${pageContext.request.contextPath}/ins_check', '${pageContext.request.contextPath}/ins_home')
        submitHandler('#man_login', '#man_form', '${pageContext.request.contextPath}/man_check', '${pageContext.request.contextPath}/man_home')
    })
</script>
</body>
</html>