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
  						<th><spring:message code="table.area"/></th>
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
  					<tr>
  						<th><spring:message code="table.map"/></th>
  						<th><spring:message code="table.photo"/></th>
  					</tr>
  				</table>
			</div>
		</div>
		<%@ include file="../jspf/map-base-file-js.jspf" %>
	</body>
</html>