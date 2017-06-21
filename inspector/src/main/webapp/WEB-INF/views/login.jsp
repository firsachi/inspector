<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<%@include file="../jspf/map-meta-tegs.jspf" %>
    	<%@include file="../jspf/map-bootstrap-css.jspf" %>
    	<!-- Custom styles for this template -->
    	<link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">
    	<title><spring:message code="login.title"/></title>
	</head>
	<body>
		<div class="container">
      		<form:form modelAttribute="user" action="/inspector/login" method="post" cssClass="form-signin" role="form">
        		<h2 class="form-signin-heading"><spring:message code="login.title"/></h2>
        		<c:if test = "${ error != null}">
         			<div style="margin-bottom: 6px" class="alert alert-danger"><spring:message code="label.error"/></div>
      			</c:if>
        		<c:set var="login">
        			<spring:message code="login.username"/>
        		</c:set>
        		<form:label path="username">${ login }</form:label>
        		<form:input path="username" cssClass="form-control" placeholder="${ login }"/>
        		<form:errors path="username" cssClass="text-danger"/>
        		<c:set var="pass">
        			<spring:message code="login.password"/>
        		</c:set>
        		<form:label path="password">${ pass }</form:label>
        		<form:password path="password" cssClass="form-control" placeholder="${ pass }"/>
        		<form:errors path="password" cssClass="text-danger"/>
        		
        		<form:button class="btn btn-lg btn-primary btn-block">
        			<spring:message code="login.dingin"/>
        		</form:button>
        		<a href="." class="btn btn-default btn-lg btn-block"><spring:message code="login.back"/></a>
      		</form:form>
      		
    	</div>
		<%@ include file="../jspf/map-base-file-js.jspf" %>
	</body>
</html>