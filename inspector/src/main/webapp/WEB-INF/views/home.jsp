<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	
	<head>
		<%@include file="../jspf/map-meta-tegs.jspf" %>
    	<%@include file="../jspf/map-bootstrap-css.jspf" %>
		<title>Insert title here</title>
	</head>
	
	<body>
		<%@ include file="../jspf/home-menu.jspf" %>
		<div class="container-fluid">
			<h1><spring:message code="table.homeName"/></h1>
		
			<div class="table-responsive">
			<table class="table">
				<tr>
					<th><spring:message code="table.number"/></th>
					<th><spring:message code="table.street"/></th>
					<th><spring:message code="table.district"/></th>
					<th><spring:message code="table.notes"/></th>
					<th><spring:message code="table.data"/></th>
					<th><spring:message code="table.statys"/></th>
					<th><spring:message code="table.resultCheck"/></th>
					<th><spring:message code="table.operation"/></th>
				<tr>
				<c:forEach var="task" items="${tasks}">
				<tr>
					<td>${task.id}</td>
					<td>${task.street}</td>
					<td>${task.district.name}</td>
					<td>${task.opis}</td>
					<td>${task.dateDoc}</td>
					<td>${task.statys.name}</td>
					<td>${task.answer}</td>
					<td><a href="home${task.id}"><spring:message code="table.view"/></a></td>
				</tr>
			</c:forEach>
			</table>
			</div>
		</div>
		<%@ include file="../jspf/map-base-file-js.jspf" %>
	</body>
</html>