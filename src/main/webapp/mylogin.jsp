<%@ page language="java"
isELIgnored="false"
pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>登录页面</title>
    <link rel="alternate icon" type="image/png" href="assets/i/favicon.png">
    <link rel="stylesheet" type="text/css" href="http://cdn.amazeui.org/amazeui/2.7.2/css/amazeui.min.css">
    <script type="text/javascript" src="http://cdn.amazeui.org/amazeui/2.7.2/js/amazeui.min.js"></script>
    <script type="text/javascript" src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
    <style>
        .header {
            text-align: center;
        }

        .header h1 {
            font-size: 200%;
            color: #333;
            margin-top: 30px;
        }

        .header p {
            font-size: 14px;
        }
    </style>
</head>
<body>

<div class="header">
    <div class="am-g">
        <h1>程序员的菜</h1>
        <p>hello world，希望你们不会打架<br/>请不要讨论：缩进，换行，空格，回车等内容</p>
    </div>
    <hr/>
</div>

<div class="am-g">
    <div class="am-u-lg-4 am-u-md-5 am-u-sm-centered">
        <h3>登录</h3>

        <form method="post" class="am-form" action="LoginControlBack">
            <label for="email">用户名:</label>
            <div class="am-input-group">
                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                <input type="text" class="am-form-field" placeholder="Username" id="email" name="loginName" value="${cookie.userName.value}">
            </div>

            <br>
            <label for="password">密码:</label>
            <div class="am-input-group">
                <span class="am-input-group-label"><i class="am-icon-lock am-icon-fw"></i></span>
                <input type="password" class="am-form-field" id="password" placeholder="Password" name="loginPassWord" value="${cookie.passWord.value}">
            </div>

            <br>
            <label for="remember-me">
                <input id="remember-me" type="checkbox" name="remember" >
                记住密码
            </label>
            <br/>
            <div class="am-cf">
                <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
                <input type="submit" name="" value="忘记密码 ^_^? "  class="am-btn am-btn-default am-btn-sm am-fr">
            </div>
            <input type="hidden" name="actionType" value="login">
        </form>
        <hr>
        <p>┋◆冃.狌.交.伖，释.鲂.压.劦、棑.解.漃.瘼◆ 真 人】视||频. █网.址：wWw. GitHub 。Com◆┋◆綫.下.面.基 .鸡.綪.狅，欢</p>
    </div>

</div>
</body>
</html>
