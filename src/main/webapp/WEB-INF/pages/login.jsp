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
                <li class="col-md-4 layui-this"><strong>学生登录</strong></li>
                <li class="col-md-4"><strong>教师登录</strong></li>
                <li class="col-md-4"><strong>管理员登录</strong></li>
            </ul>
            <div class="layui-tab-content" style="height: 100px;">
                <div class="layui-tab-item layui-show">
                    <form method="post" action="${pageContext.request.contextPath}/stu_home">
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
                            <p>没有账号？<a href="${pageContext.request.contextPath}/stu_register_page"><strong>去注册</strong></a> </p>
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary btn-lg btn-block">立 即 登 录</button>
                        </div>
                    </form>
                </div>
                <div class="layui-tab-item">
                    <form>
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
                            <p>没有账号？<a href="${pageContext.request.contextPath}/tea_register_page"><strong>去注册</strong></a> </p>
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary btn-lg btn-block">立 即 登 录</button>
                        </div>
                    </form>
                </div>
                <div class="layui-tab-item">
                    <form>
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
                            <button type="submit" class="btn btn-primary btn-lg btn-block">立 即 登 录</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
    $(function () {layui.use(['element'], function () {})})
</script>
</body>
</html>