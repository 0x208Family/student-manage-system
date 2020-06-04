<%--
  Created by IntelliJ IDEA.
  User: 16202
  Date: 2020/5/29
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/iconfont/iconfont.css">

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- layui -->
    <link href="${pageContext.request.contextPath}/layui/css/layui.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->

    <style type="text/css">
        p {
            text-indent: 2em;
            line-height: 200%;
            margin-top: 3%;
        }

        legend {
            text-align: center;
        }

        .html_foot {
            font-size: 20px;
        }

        .nav-font-size {
            font-size: 18px;
        }
    </style>
</head>
<body>

<!-- 导航栏 -->
<nav class="navbar navbar-inverse" style="margin-bottom: 0;">
    <div class="container" style="height: 60px">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header" style="margin-top: 5px">
            <img src="${pageContext.request.contextPath}/logo/logo.jpg" class="img-circle" style="width: 50px; height: 50px">
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="margin-top: 5px">
            <ul class="nav navbar-nav navbar-right">
                <li class="nav-font-size"><a href="#"><i class="iconfont">&#xe60e;</i> 学校官网</a></li>
                <li class="nav-font-size"><a href="${pageContext.request.contextPath}/login"><i class="iconfont">&#xe606;</i> 登录</a> </li>
                <li class="nav-font-size"><a href="${pageContext.request.contextPath}/stu_register_page"><i class="iconfont">&#xe61c;</i> 学生注册</a></li>
                <li class="nav-font-size"><a href="${pageContext.request.contextPath}/tea_register_page"><i class="iconfont">&#xe61c;</i> 教师注册</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" style="height: 500px;">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img src="${pageContext.request.contextPath}/bg/carousel_bg/bg1.jpg" alt="..." style="height: 500px; width: 100%">
            <div class="carousel-caption">
                Hello1
            </div>
        </div>
        <div class="item">
            <img src="${pageContext.request.contextPath}/bg/carousel_bg/bg2.jpg" alt="..." style="height: 500px; width: 100%">
            <div class="carousel-caption">
                Hello2
            </div>
        </div>
        <div class="item">
            <img src="${pageContext.request.contextPath}/bg/carousel_bg/bg3.jpg" alt="..." style="height: 500px; width: 100%">
            <div class="carousel-caption">
                Hello3
            </div>
        </div>
    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>

<div style="text-align: center; height: 120px; margin-top: 30px">
    <p style="text-align: center; font-size: xx-large"><strong>理工概况</strong></p>
</div>

<div class="layui-container">
    <div class="layui-row layui-col-space30">
        <div class="layui-col-md6" style="">
            <fieldset class="layui-elem-field" style="padding: 10px">
                <legend style="text-align: center"><i class="iconfont" style="font-size: x-large">&#xe608;</i><strong>&nbsp;学校简介</strong></legend>
                <div>
                    <p>
                        太原理工大学是一所历史悠久、底蕴深厚、特色鲜明的世纪学府。其前身是创立于1902年的山西 大学堂西学专斋，为中国创办最早的三所国立大学之一，坐落于具有2500多年建城史的国家历史
                        文化名城——太原。1953年，学校独立建校，定名太原工学院，直属国家高教部； 1962年划归山西省管理；1984年更名为太原工业大学。1997年，
                        太原工业大学与直属于国家煤炭工业部的山西矿业学院（始建于1958年）合并， 组建太原理工大学，同年跻身国家“211工程”重点建设大学行列，开启了改革发展的新篇章。
                        2017年，学校入选国家“双一流”重点建设高校，迎来了崭新的发展时期。一百多年来， 学校始终秉承“求实、创新”的校训，坚持“以人为本、文体为舟、承载德智、
                        全面发展”的办学传统，彰显“敢为人先、敢于竞争、勇于创新”的精神气质， 涌现出一批学术大师、行业翘楚和道德楷模，如著名教育家赵宗复、“中国石油之父”孙健初、
                        中国“前寒武纪地质学开拓者和奠基人”王曰伦、圆弧齿轮专家朱景梓、“煤化工科技领域的开拓者之 一”谢克昌、“知识分子楷模”栾茀、“草原公仆”云布龙等，深刻诠释着百年老校“得天下英才以育之、
                        育一代新人以报国”的崇高追求。
                    </p>
                    <p>
                        学校以工为主、理工结合、多学科协调发展，涵盖理学、工学、经济学、法学、教育学、文学、管理学、 艺术学等8个门类，设有24个专业学院、1个中外合作办学学院。现有明向、迎西、虎峪、柏林等四个校区，
                        占地面积2136933平方米，校舍总建筑面积149万平方米。截至目前，学校有全日制学生38664名、
                        国际学生588名、教职工3591名。现有中国科学院院士1名、中国工程院院士3名、双聘院士10名、
                        教育部“长江学者奖励计划”特聘（讲座）教授5名、国家杰出青年科学基金获得者7名、“新世纪百千万人
                        才工程”国家级人选13名。学校入选全国“三全育人”综合改革试点高校和创新创业50强高校，荣膺首批“ 全国文明校园”称号。
                    </p>
                    <p>
                        学校紧紧围绕“以学生为中心”的办学理念，坚持立德树人根本任务和一流大学建设目标，致力于培养德智体
                        美劳全面发展的社会主义建设者和接班人。目前学校18个专业通过了国际工程教育专业认证，17个专业入选
                        国家级一流本科专业建设点；各类创新团队在国内外竞赛中屡创佳绩，大学生学科竞赛成绩稳居全国高校50
                        强；“清泽心雨”思政平台获批教育部高校思想政治工作精品项目，“螺丝钉之家”入选全国学雷锋活动示范点。
                        学校高度重视并着力构建全方位、多层次体育工作格局和积极健康的校园文化氛围，竞技体育成绩斐然， 是国内迄今为止唯一一所获得过男篮、男足两项全国总冠军的大学。
                    </p>
                    <p>
                        学校科研实力雄厚，成就卓著，曾连续两次作为首席科学家单位承担国家重点基础研究发展计划（973计划）
                        项目，累计承担“863”计划、“国家重点研发计划”等国家级各类项目1338项；获得国家科技三大奖42项。
                        学校拥有省部共建国家重点实验室培育基地1个、教育部重点实验室4个、教育部创新团队2个、科技部重点
                        领域创新团队1个。近年来，学校努力打造服务国家和区域经济社会发展的才智引擎，成果转化、技术转移等累 计为地方和行业企业创造经济效益逾百亿元。
                    </p>
                    <p>
                        “汾水之滨，煌煌学堂”。学校将以习近平新时代中国特色社会主义思想为指导，不忘初心，牢记使命，
                        以推动社会进步、实现国家富强、谋求人类福祉为己任，坚定不移朝着高水平国际化创新型一流大学目标奋勇前行。
                    </p>
                    <p style="text-align: right">
                        数据来源：太原理工大学<a href="http://www2017.tyut.edu.cn/xxgk/xxjj.htm"
                                      style="color: blue"><strong>官网</strong></a>
                    </p>
                </div>
            </fieldset>
        </div>
        <div class="layui-col-md6">
            <fieldset class="layui-elem-field" style="padding: 10px">
                <legend style="text-align: center"><i class="iconfont" style="font-size: x-large">&#xe75f;</i><strong>&nbsp;历史沿革</strong></legend>
                <div>
                    <div style="margin-top: 3%">
                        <ul class="layui-timeline">
                            <li class="layui-timeline-item">
                                <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                                <div class="layui-timeline-content layui-text">
                                    <h3 class="layui-timeline-title"><strong>太原理工大学时期</strong></h3>
                                    <p>
                                        1997年，太原工业大学合并山西矿业学院，更名为太原理工大学，同时步入国家“211工程”重点建设行列。
                                    </p>
                                </div>
                            </li>
                            <li class="layui-timeline-item">
                                <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                                <div class="layui-timeline-content layui-text">
                                    <h3 class="layui-timeline-title"><strong>太原工业大学时期</strong></h3>
                                    <p>
                                        1984年，太原工学院更名为太原工业大学。
                                    </p>
                                    <p>
                                        1984年至1995年，由原来的6系1部的单一工科院校变成了一所拥有14个系、4个中心、8个研究所的理、工、文、管相结合的综合性工业大学。
                                    </p>
                                </div>
                            </li>
                            <li class="layui-timeline-item">
                                <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                                <div class="layui-timeline-content layui-text">
                                    <h3 class="layui-timeline-title"><strong>太原工学院时期</strong></h3>
                                    <p>
                                        1953年，山西大学 太原工学院校门 太原工学院校门 取消建制，工学院（机械工程、电机工程、土木工程、化工工程4个系）独立建校，命名为太原工学院，是高教部直属高校
                                    </p>
                                    <p>
                                        1962年，山西水利学院、山西化工学院并入。
                                    </p>
                                    <p>
                                        1981年，山西煤炭化学工业大学并入。
                                    </p>
                                </div>
                            </li>
                            <li class="layui-timeline-item">
                                <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                                <div class="layui-timeline-content layui-text">
                                    <h3 class="layui-timeline-title"><strong>山西大学工学院时期</strong></h3>
                                    <p>
                                        1912年，南京临时政府成立，教育部颁布了新的教育法令。遵照新的规章，山西大
                                        学堂改名为山西大学校，监督改称为校长，中学专斋与西学专斋的建制也同时取消。设立了预科和本科，预科分为一、二两部，一部为文法科，二部为理工科，均修业三年，本科分文法工三科。
                                    </p>
                                </div>
                            </li>
                            <li class="layui-timeline-item">
                                <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                                <div class="layui-timeline-content layui-text">
                                    <h3 class="layui-timeline-title"><strong>山西大学堂西学专斋时期</strong></h3>
                                    <p>
                                        1902年初，李提摩太偕人来太原拟签订正式合同时，方知晋省已办起了山西大学堂。 于是他又建议岑春煊将山西大学堂与他拟创办的中西大学堂归并办理。山西大学堂
                                        原来部分改为“中学专斋”，总理为谷如墉，总教习为高燮曾；拟办中西学堂改为 “西学专斋”，总理为李提摩太，总教习为敦崇礼。
                                    </p>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </fieldset>
        </div>
    </div>
</div>

<div class="layui-fluid layui-bg-blue" style="margin-bottom: 0.8%">
    <div class="layui-row">
        <div class="layui-col-md4">
            <img class="layui-logo" style="margin-top: 10%; margin-bottom: 10%; margin-left: 10%" src="${pageContext.request.contextPath}/logo/foot_logo.png">
        </div>
        <div class="layui-col-md4">
            <fieldset class="layui-elem-field" style="margin-top: 30px;">
                <legend><i class="iconfont">&#xe62b;</i>&nbsp;关于我</legend>
                <div>
                    <p class="html_foot" style="font-size: 20px"><i class="iconfont">&#xe607;</i>&nbsp;QQ: 1620281937</p>
                    <p class="html_foot">&nbsp;</p>
                    <p class="html_foot"><i class="iconfont">&#xe614;</i>&nbsp;微信: LH01000000</p>
                    <p class="html_foot">&nbsp;</p>
                </div>
            </fieldset>
        </div>
        <div class="layui-col-md4">
            <fieldset class="layui-elem-field site-demo-button" style="margin-top: 30px;">
                <legend><i class="iconfont">&#xe696;</i>&nbsp;友情链接</legend>
                <div>
                    <p class="html_foot">&nbsp;</p>
                    <p class="html_foot">&nbsp;</p>
                    <p class="html_foot">&nbsp;</p>
                    <p class="html_foot">&nbsp;</p>
                </div>
            </fieldset>
        </div>
    </div>
</div>

<!-- layui -->
<script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="${pageContext.request.contextPath}/jquery/jquery-1.12.4.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    layui.use(['element', 'carousel'], function () {
        var carousel = layui.carousel;
        carousel.render({
            elem: '#images_carousel'
            , width: '100%'
            , height: '480px'
            , interval: 3000
            , arrow: 'hover'
        });

        // 关于学校
        $("#about_link").click(function () {
            layer.open({
                title: '关于学校',
                content: '资料收集中...',
                time: 3000
            });
            return false;
        });
    });
</script>
</body>
</html>