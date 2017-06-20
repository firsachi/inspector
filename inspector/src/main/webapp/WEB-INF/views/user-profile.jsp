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
		<%@ include file="../jspf/home-menu.jspf" %>
		<div class="container">
			<div class="page-header">
  				<h1><spring:message code="label.userProfile"/></h1>
			</div>
			<!-- panel profile start -->
			<div class="panel panel-default">
				<div class="panel-heading">
					<spring:message code="profile.editProfile.tile"/>
				</div>
				<div class="panel-body">
					<form:form action="/inspector/editUserProfile" class="form-horizontal" modelAttribute="user" method="post" role="form">
						
						<div class="form-group">
    						<form:label path="firstName" class="col-sm-2 control-label"><spring:message code="user.firstName"/></form:label>
    						<div class="col-sm-10">
    							<form:input path="firstName" class="form-control"/>
    							<form:errors path="firstName" class="form-text text-danger"/>
    						</div>
  						</div>
  						
  						<div class="form-group">	
    						<form:label path="lastName" class="col-sm-2 control-label"><spring:message code="user.lastName"/></form:label>
    						<div class="col-sm-10">
    							<form:input path="lastName" class="form-control"/>
    							<form:errors path="lastName" cssClass="form-text text-danger"/>
    						</div>
  						</div>
  						
  						<div class="form-group">
    						<form:label path="username" class="col-sm-2 control-label"><spring:message code="login.username"/></form:label>
    						<div class="col-sm-10">
    							<form:input path="username" class="form-control"/>
								<form:errors path="username" cssClass="form-text text-danger"/>
    						</div>
  						</div>
  						
  						<div class="form-group">
    						<div class="col-sm-offset-2 col-sm-10">
    							<form:button type="submit" class="btn btn-primary"><spring:message code="button.buttonSubmit"/></form:button>
    						</div>
  						</div>
					</form:form>
				</div>
			</div><!-- panel profile end -->
		
			<div class="panel panel-default">

				<div class="panel-heading">
					<spring:message code="profile.editProfile.tile"/>
				</div>
				
				<div class="panel-body">
					<form:form modelAttribute="user" method="post" class="form-horizontal">
						
						<div class="form-group">
    						<form:label path="password" class="col-sm-2 control-label"><spring:message code="login.password"/></form:label>
    						<div class="col-sm-10">
    							<form:password path="password" class="form-control"/>
    							<form:errors path="password" cssClass="form-text text-danger"/>
    						</div>
    					</div>
    					
    					<div class="form-group">
    						<form:label path="newPassword" class="col-sm-2 control-label"><spring:message code="user.newPassword"/></form:label>
    						<div class="col-sm-10">
    							<form:password path="newPassword" class="form-control"/>
    							<form:errors path="newPassword" cssClass="form-text text-danger"/>
    						</div>
  						</div>
  						
    					<div class="form-group">
    						<div class="col-sm-offset-2 col-sm-10">
    							<form:button type="submit" class="btn btn-primary"><spring:message code="button.buttonSubmit"/></form:button>
    						</div>
  						</div>
					</form:form>
				</div>
				
			</div>

		</div> <!-- clse container -->
		<%@ include file="../jspf/map-base-file-js.jspf" %>
	</body>
</html>