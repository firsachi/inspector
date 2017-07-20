<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<c:set var="titlePage">
		<spring:message code="${title}"/> ${ task.idNumber }
	</c:set>
	
	<head>
		<%@include file="../jspf/map-meta-tegs.jspf" %>
    	<%@include file="../jspf/map-bootstrap-css.jspf" %>
		<title>${titlePage}</title>
	</head>
	
	<body>
		<%@ include file="../jspf/home-menu.jspf" %>
		<div class="container-fluid">
			<div class="panel panel-default">
  				<div class="panel-heading"><b>${ titlePage }</b></div>
  				<table class="table">
  					<tr>
  						<th><spring:message code="table.inspectorName"/></th>
  						<td>${ user.getFullUserName() }</td>
  					</tr>
  					<tr>
  						<th><spring:message code="table.district"/></th>
  						<td></td>
  					</tr>
  					<tr>
  						<th><spring:message code="table.street"/></th>
  						<td>${ task.street }</td>
  					</tr>
  					<tr>
  						<th><spring:message code="table.build"/></th>
  						<td>${ task.build }</td>
  					</tr>
  					<tr>
  						<th><spring:message code="table.notes"/></th>
  						<td>${ task.summary }</td>
  					</tr>
  				</table>
  				
  				<div class="panel-body">
    				<div class="col-md-6">
  						<div class="panel-body"><spring:message code="table.map"/>
  							<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d17050.457879243794146!2d30.633689680027704!3d50.457879243794146!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sru!2sua!4v1500461923709" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
  						</div>
					</div>
  					<div class="col-md-6">
  						<div class="panel-body"><spring:message code="table.photo"/></div>
  					</div>
  				</div>
			</div>
		</div>
		<%@ include file="../jspf/map-base-file-js.jspf" %>
	</body>
</html>