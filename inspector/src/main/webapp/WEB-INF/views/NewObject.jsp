<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	
	<c:set var="titlePage">
		<spring:message code="task.newTaskTitle"/>
	</c:set>
	
	<head>
		<%@include file="../jspf/map-meta-tegs.jspf" %>
    	<%@include file="../jspf/map-bootstrap-css.jspf" %>
		<title>${ titlePage }</title>
	</head>
	
	<body>
		<%@ include file="../jspf/home-menu.jspf" %>
		<div class="container">
		<div class="page-header">
			<h1>${ titlePage }</h1>
		</div>
			<form:form modelAttribute="newObject" 
						cssClass="form-horizontal" 
						method="post" 
						action="NewObject/save"  
						acceptCharset="UTF-8">
  				<%@ include file="../jspf/form-object.jspf" %>
  				<div class="form-group">
  					<div class="col-sm-offset-2 col-sm-10">
  						<form:button class="btn btn-default ">
  							<span class="glyphicon glyphicon-floppy-saved"></span>
  							<spring:message code="button.buttonSubmit"/>
  						</form:button>
  						<a href="home" class="btn btn-default">
  							<spring:message code="button.buttonBack"/>
  						</a>
  					</div>
  				</div>
  			</form:form>
		</div>
  				
		<%@ include file="../jspf/map-base-file-js.jspf" %>
	</body>
</html>