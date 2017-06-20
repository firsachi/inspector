<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<%@include file="../jspf/map-meta-tegs.jspf" %>
    	<%@include file="../jspf/map-bootstrap-css.jspf" %>
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container">
			<div class="page-header">
  				<h1><spring:message code="user.registration"/> "<spring:message code="label.nameModule"/>"</h1>
			</div>
			<%@include file="../jspf/registratin-form.jspf" %>
		</div> <!-- clse container -->
		<%@include file="../jspf/map-base-file-js.jspf" %>
	</body>
</html>