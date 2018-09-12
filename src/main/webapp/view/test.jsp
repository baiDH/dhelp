<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<script type="text/javascript" src="scripts/jquery/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="scripts/test.js"></script>
</head>
<body>
<h2>Test Info</h2>
用户名： ${testAtai.name}<br>
年龄： ${testAtai.age}<br>
性别： ${testAtai.sex}<br>
<hr>
adiv的值：<div id="adiv">adiv的值</div>
<input type="button" id="ainput" value="改变adiv的值" onclick="aTestMethod();"/>
<hr>
bdiv的值：<div id="bdiv">未实现 bdiv的值</div>
<hr>
<input type="button" id="binput" value="改变bdiv的值" onclick="bTestMethod();"/>
</body>
</html>