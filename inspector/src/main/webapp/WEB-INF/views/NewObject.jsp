<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	
	<head>
		<%@include file="../jspf/map-meta-tegs.jspf" %>
    	<%@include file="../jspf/map-bootstrap-css.jspf" %>
		<title></title>
	</head>
	
	<body>
		<%@ include file="../jspf/home-menu.jspf" %>
  				<form:form modelAttribute="newObject" cssClass="form-horizontal">
  					<%@ include file="../jspf/form-object.jspf" %>
  				</form:form>
		<%@ include file="../jspf/map-base-file-js.jspf" %>
	</body>
</html>