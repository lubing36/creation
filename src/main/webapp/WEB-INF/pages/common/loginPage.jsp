<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录</title>
<link rel="stylesheet" href="${ctx }/creation/dist/css/bootstrap.min.css">
<link href="${ctx}/creation/dist/css/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="${ctx}/creation/dist/css/style.css">
<link rel="stylesheet" type="text/css" href="${ctx}/creation/dist/css/userpanel.css">
<link rel="stylesheet" type="text/css" href="${ctx}/creation/dist/css/jquery.ui.all.css">
	<script type="text/javascript" src="${ctx }/creation/dist/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctx }/creation/dist/js/bootstrap.min.js"></script>
</head>

<body class="login" mycollectionplug="bind">
	<div class="login_m">
		<div class="login_logo">
			<img src="${ctx}/creation/dist/img/logo.png" width="196" height="46">
		</div>
		<div class="login_boder">

			<div class="login_padding" id="login_model">

				<form name='f' action='${pageContext.request.contextPath }/login'
					method='POST'>
					<h2>用户名</h2>
					<label> <input type="text" name="username"
						class="txt_input txt_input2"
						onfocus="if (value ==&#39;Your name&#39;){value =&#39;&#39;}"
						onblur="if (value ==&#39;&#39;){value=&#39;Your name&#39;}"
						value="Your name">
					</label>
					<h2>密码</h2>
					<label> <input type="password" name="password"
						class="txt_input"
						onfocus="if (value ==&#39;******&#39;){value =&#39;&#39;}"
						onblur="if (value ==&#39;&#39;){value=&#39;******&#39;}"
						value="******">
					</label> <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					<label>
						<button type="submit" class="btn btn-success">登陆</button> 
					</label>
				</form>
			</div>
		</div>
	</div>			
</body>
</html>