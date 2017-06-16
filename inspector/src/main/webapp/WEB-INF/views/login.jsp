<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

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
      		<form action="/inspector/login" method="post" class="form-signin" role="form">
        		<h2 class="form-signin-heading"><spring:message code="login.title"/></h2>
        		<label><spring:message code="login.username"/></label>
        		<input type="email" name="username" class="form-control" placeholder="Email address" required="" autofocus="">
        		<label><spring:message code="login.password"/></label>
        		<input type="password" name="password" class="form-control" placeholder="Password" required="">
        		<label class="checkbox">
          			<input type="checkbox" value="remember-me"> Remember me
        		</label>
        		<input id="button" type="submit" class="btn btn-lg btn-primary btn-block" value="<spring:message code="login.dingin"/>">
      		</form>
    	</div>
		<%@ include file="../jspf/map-base-file-js.jspf" %>
	</body>
</html>