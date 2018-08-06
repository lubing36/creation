<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<!DOCTYPE HTML>
<html>
<head>
<title>Creation</title>
<link rel="stylesheet" href="${ctx }/dist/css/site.min.css">
<link rel="stylesheet" href="${ctx }/dist/css/bootstrap-table.min.css">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript" src="${ctx }/dist/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${ctx }/dist/js/site.min.js"></script>
<script type="text/javascript" src="${ctx }/dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${ctx }/dist/js/bootstrap-table.min.js"></script>
<script type="text/javascript" src="${ctx }/dist/js/bootstrap-table-zh-CN.js"></script>
</head>
<body>

	<tiles:insertAttribute name="header" />
	<div class="container-fluid">
		<div class="row row-offcanvas row-offcanvas-left">
			<tiles:insertAttribute name="menu" />
			<div class="col-xs-12 col-sm-9 content">
				<div class="panel panel-default">
					<tiles:insertAttribute name="body" />
				</div>
			</div>
		</div>
	</div>
	<%-- <tiles:insertAttribute name="footer" /> --%>
</body>
</html>