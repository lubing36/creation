<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<script>
	function query(){
		$.ajax({
			type:"GET",
			url:"",
			data:{username:"",password:""},
			dataType:"json",
			success:function(data){
				
			}
		});
	}
</script>