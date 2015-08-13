 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
<sec:csrfMetaTags/>
  <!-- Basic Page Needs
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
  <meta charset="utf-8">
  <title>Welcome to LifeInUsa</title>
  <meta name="description" content="">
  <meta name="author" content="Xuyang Gao, James">

  <!-- Mobile Specific Metas
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  
  <!-- FONT
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
  <link href='http://fonts.googleapis.com/css?family=Roboto:900,500,900italic,400italic,700italic,300,700,500italic,300italic,400' rel='stylesheet' type='text/css'>

  <!-- CSS
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
  <link rel=stylesheet href="/css/main.css">
  <link rel="stylesheet" href="/css/normalize.css"> 

 <!-- Printer CSS
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->

	
  <!-- Favicon
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->

 
    
	
	
  <!-- Js library
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->    
<script src="/js/initlizeData.js"></script>	
	
<script src="/js/jquery-2.1.3.min.js"></script>
<script src="/js/animatescroll.js"></script>


	
<script src="/js/angular.js"></script>
<script src="/js/angular-route.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.1.5/angular-sanitize.js"></script>
<script src="/js/site/main.js"></script>	
	
<link rel="stylesheet" href="/bootstrap/bootstrap-3.3.4/css/bootstrap.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script> 
		
	<script>
		
	</script>

	
	
	
</head>
<body ng-app="lifeinusa">
	<header>
			<div class="container" id="thisistop">
			<div class="row">
				<div class="col-md-4" style="margin-top:15px;">
					 LifeInUSA
				</div>
				<div class="col-md-8">
					<ul class="appmenu">
						<li><a href="#">CITIES</a></li>
						<li><a href="#">PARTNERS</a></li>
						<li><a href="#">BOLGS</a></li>
						<li><a href="#">CONTACT US</a></li>
						<li><a href="#">ABOUT US</a></li>
					</ul>
				</div>
			</div>
		</div>

	</header>
<!-- Nav End
–––––––––––––––––––––––––––––––––––––––––––––––––– -->
	
	
<!-- Primary Page Layout 
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
	<main>
		<article class="partner-background1">
			<div class="container">
				<div class="row">
					<div class="col-md-8">2</div>
					<div class="col-md-4">
						<div class="loginpanel" >
							<ul >
								<form class="form-group has-success has-feedback"  >
									<li>Sign Up</li>
									
								<li>
									<input class="form-control"   type="text" placeholder="First Name" required/>			
								</li>
								<li>
									<input class="form-control"   type="text" placeholder="Last Name" required/>			
								</li>
								<li>
									<input class="form-control"  type="email" placeholder="Email Address" required/>			
								</li>
								<li>
									<input class="form-control"  type="number" placeholder="Phone Number" required/>			
								</li>
								<li>
									<input id="inputPassword" class="form-control"   type="password" placeholder="Password" required/>			
								</li>
								<li>
									<input class="form-control"   type="password" data-match="#inputPassword" data-match-error="Whoops, these don't match" placeholder="Confirm"   required/>			
								</li>
								<li>
									<div class="form-inline">
										<input class="form-control"   type="text" placeholder="Verfied Code" required style="width:50%;float:left;"/>	
										
										<button>12345</button>
									</div> 
								</li>	
									
								<li>
									
										<input class="btn btn-info"  type="submit" value="submit" />		
										
									
								</li>
								<li>
									<a href="#" data-toggle="modal" data-target="#login">Sign In</a>
								</li>
								</form>
							</ul>
						</div>
					</div>
						
						
				</div>
			</div>
		</article>
		
		<div class="devide">
			
		</div>
		
	</main>


<!-- Primary Page Layout End
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
	
	<footer ng-controller="header_footer" >
		<div ng-include="footerurl">
		
		</div>
			<div id="gotop"><a href="javascript:void();" onclick="$('#thisistop').animatescroll({scrollSpeed:2000});"><img src="images/gotop.gif" ></a></div>
 		
		<div ng-include="loginmodelurl"></div>

	</footer>
  
	
<!-- End Document
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
</body>
</html>
