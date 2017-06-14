<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

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
  			<h1>Новий об`єкт</h1>
		</div>
		<form:form class="form-horizontal" role="form">
			<div class="form-group">
    			<div class="col-sm-10">
      				<input type="text" class="form-control">
    			</div>
  			</div>
		</form:form>
		<form class="form-horizontal" role="form">
  			<div class="form-group">
    			<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
    			<div class="col-sm-10">
      				<input type="email" class="form-control" id="inputEmail3" placeholder="Email">
    			</div>
  			</div>
  			<div class="form-group">
    			<label for="inputPassword3" class="col-sm-2 control-label">Пароль</label>
    			<div class="col-sm-10">
      				<input type="password" class="form-control" id="inputPassword3" placeholder="Password">
    			</div>
  			</div>
  			<div class="form-group">
    			<div class="col-sm-offset-2 col-sm-10">
      			<div class="checkbox">
        			<label>
        				<input type="checkbox"> Запомнить меня
        			</label>
      			</div>
    			</div>
  			</div>
  			<div class="form-group">
    			<div class="col-sm-offset-2 col-sm-10">
      				<button type="submit" class="btn btn-default">Войти</button>
    			</div>
  			</div>
		</form>
		</div>
		<%@ include file="../jspf/map-base-file-js.jspf" %>
	</body>
</html>