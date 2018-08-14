<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>登陆</title>

</head>
<body onload='document.f.username.focus();'>
	<div align="center">
	    <form name='f' action='${pageContext.request.contextPath }/login'
	        method='POST'>
	        <table>
	            <tr>
	                <td>User:</td>
	                <td><input type='text' name='username' value=''></td>
	            </tr>
	            <tr>
	                <td>Password:</td>
	                <td><input type='password' name='password' /></td>
	            </tr>
	            <tr>
	                <td colspan='2'><input name="submit" type="submit"
	                    value="Login" /></td>
	            </tr>
	        </table>
	        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	    </form>
	</div>
</body>
</html>
