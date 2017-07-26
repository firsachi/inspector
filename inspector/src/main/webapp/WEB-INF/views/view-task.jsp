<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<c:set var="titlePage">
		<spring:message code="${title}"/> ${ task.id }
	</c:set>
	
	<head>
		<%@include file="../jspf/map-meta-tegs.jspf" %>
    	<%@include file="../jspf/map-bootstrap-css.jspf" %>
    	<style type="text/css">
    	#map{
    		height: 450px;
    	}
    	</style>
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
  						<td>${ task.opis }</td>
  					</tr>
  				</table>
  				<div class="panel-body">
    				<div class="col-md-6">
  						<div class="panel-body">
  							<spring:message code="table.map"/>
  							<div id="map" class="img-responsive"></div>
  						</div>
					</div>
  					<div class="col-md-6">
  						<div class="panel-body">
  							<spring:message code="table.photo"/>
  							<img alt="page" src="${ im }" class="img-responsive">
  						</div>
  					</div>
  				</div>
			</div>
		</div>
		<%@ include file="../jspf/map-base-file-js.jspf" %>
	<script>
		function initMap() {
			var uluru = {
				lat : ${ task.x },
				lng : ${ task.y }
			}
			var map = new google.maps.Map(document.getElementById('map'), {
				zoom : 17,
				center : uluru
			});
			var marker = new google.maps.Marker({
				position : uluru,
				map : map
			});
		}
	</script>
	<%@ include file="../jspf/map-googlemap.jsp" %>
  </body>
	</body>
</html>