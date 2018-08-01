<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<c:choose>
	<c:when test="${errorMessage!='' and errorMessage!=null }">
		<h2>${errorMessage }</h2>
	</c:when>
	<c:otherwise>
		<h2>${respData }</h2>
	</c:otherwise>
</c:choose>


