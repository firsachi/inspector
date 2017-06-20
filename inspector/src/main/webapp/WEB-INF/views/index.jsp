<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
	<head>
    	<%@include file="../jspf/map-meta-tegs.jspf" %>
    	<%@include file="../jspf/map-bootstrap-css.jspf" %>
    	<title><spring:message code="label.nameModule"/></title>
    	<style type="text/css">	
			.jumbotron h1{
				
			}
			.jumbotron p{
				font-size: 15px;
				text-align: justify;
			}
    	</style>
  	</head>
  	<body>
	<nav class="navbar navbar-inverse navbar-static-top" role="navigation">
		<div class="container">
    	<!-- Brand and toggle get grouped for better mobile display -->
    	<div class="navbar-header">
      		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            	<span class="sr-only">Toggle navigation</span>
            	<span class="icon-bar"></span>
            	<span class="icon-bar"></span>
            	<span class="icon-bar"></span>
          	</button>
      		<a class="navbar-brand" href="#">
      			<spring:message code="label.nameCompany"/>
      		</a>
    	</div>

    	<!-- Collect the nav links, forms, and other content for toggling -->
    	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      		<ul class="nav navbar-nav">
      		</ul>
      		<ul class="nav navbar-nav navbar-right">
        		<li class="dropdown">
          			<button type="button" class="btn btn-primary navbar-btn" onclick="self.location.href='./home'">
          				<spring:message code="login.dingin"/>
          			</button>
        		</li>
      		</ul>
    		</div><!-- /.navbar-collapse -->
  		</div>
	</nav>
    
    <div class="container">
    	
    	<div class="container">
    	<div class="row">
    		<div class="col-md-8">
    			<h1 style="margin-top: 0px;" ><spring:message code="label.nameModule"/></h1>
    			<p>Згідно частини 1 статті 16 Закону України «Про рекламу» розміщення зовнішньої реклами у населених пунктах проводиться на підставі дозволів, що надаються виконавчими органами сільських, селищних, міських рад, а поза межами населених пунктів — на підставі дозволів, що надаються обласними державними адміністраціями, а на території Автономної Республіки Крим — Радою міністрів Автономної Республіки Крим, в порядку, встановленому цими органами на підставі типових правил, що затверджуються Кабінетом Міністрів України.</p>
    			<p>Типові правила розміщення зовнішньої реклами затверджені постановою Кабінету Міністрів України від 29 грудня 2003 р. № 2067.</p>
    			<p>Пунктом 44 цих Типових правил встановлено, що рекламні засоби забезпечуються маркуванням із зазначенням на каркасі рекламного засобу найменування розповсюджувача зовнішньої реклами, номера його телефону, дати видачі дозволу та строку його дії.</p>
    			<p>Цю ж норму містить п.13.6 розділу ІІ Порядку розміщення реклами у м.Києві, затвердженого рішенням Київської міської ради від 22 вересня 2011 року № 37/6253.</p>
    			<p>Відсутність такого маркування на засобі зовнішньої реклами, а також відсутність інформації про такий засіб у відкритій базі об’єктів зовнішньої реклами, яка розміщена на сайті КП «Київреклама», є можливим свідченням того, що даний рекламний засіб розміщено самовільно.</p>
    			<p>Цей модуль створено для повідомлення про такі рекламні засоби, з метою перевірки даної інформації, застосування відповідних заходів впливу до порушників та ініціювання процедури демонтажу самовільно встановлених рекламних засобів.</p>
    			<p>Запрошуємо спільно побороти нелегальну рекламу в столиці.</p>
    			<p>Повідомлення на цей модуль носять інформативний характер та не можуть розглядатись в порядку, встановленому Законом України «Про звернення громадян».</p>
    		</div>
    			<div class="col-md-4" >
    				<div class="panel panel-default">
    				
    					<div class="panel-heading">
							<spring:message code="user.join"/>
						</div>
						
    					<div class="panel-body">
    						<%@include file="../jspf/registratin-form.jspf" %>
    					</div>
    				</div>
    			</div>
    		</div> <!-- end row -->
		</div>
    </div>
	<%@include file="../jspf/map-base-file-js.jspf" %>
  </body>
</html>
