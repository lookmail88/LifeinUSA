<!DOCTYPE html>
<html>
<head>

  <!-- Basic Page Needs
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
  <meta charset=utf-8>
  <title>Welcome to LifeInUsa</title>
  <meta name="description" content="">
  <meta name="author" content="Xuyang Gao">

  <!-- Mobile Specific Metas
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  
  <!-- FONT
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
  <link href='http://fonts.googleapis.com/css?family=Roboto:900,500,900italic,400italic,700italic,300,700,500italic,300italic,400' rel='stylesheet' type='text/css'>

  <!-- CSS
  –––––––––––––––––––––––––––––––––––––––––––––––––– 
  <link rel=stylesheet href="/css/main.css">-->
  <link rel="stylesheet" href="/css/normalize.css"> 
  <link rel=stylesheet href="/css/gsidebar.css">
 <link rel=stylesheet href="/css/partner.css">
 <!-- Printer CSS
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->

	
  <!-- Favicon
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->

 
    
	
	
  <!-- Js library
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->    
<script type="text/javascript" src="/js/initlizeData.js"></script>	
	
<script type="text/javascript" type="text/javascript" src="/js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="/js/animatescroll.js"></script>


	
<script type="text/javascript" src="/js/angular.js"></script>
<script type="text/javascript" src="/js/angular-route.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.1.5/angular-sanitize.js"></script>
<script type="text/javascript" src="/js/site/main.js"></script>	

<script type="text/javascript" src="/js/gsidebar.js"></script>	
	
<link rel="stylesheet" href="/bootstrap/bootstrap-3.3.4/css/bootstrap.css">

<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script> 
		
	<script>
		$(document).ready( function() {
			
    		$("#gsidebar").gsidebar({
				datasource:menudata
			});
    		
    		$("#bt-step1").click(function(){
 				$("li[role='presentation']:eq(0),li[role='presentation']:eq(1)").toggleClass("active");
    		});
    		
    		$("#bt-step2").click(function(){
    			 
 				$("li[role='presentation']:eq(1),li[role='presentation']:eq(2)").toggleClass("active");
 				
 				var url="http://localhost:8080/partner/rest/wx/add_update";
 				
 				
 				
				var sser=$("#servicetype").val();
 				var apname= $("#appname").val();
 				var apdesc=$("#appdesc").val();
 				var apid=$("#appid").val();
 				var apsecret=$("#appsecret").val();
 				
 				 
 				
 				var datapost={
 					    servicetype:sser,
 						appname:apname,
 						appdesc:apdesc,
 						appid:apid,
 						appsecret:apsecret };
 				
 				$.getJSON( url,datapost)
 				  .done(function( data ) {
 				     $("#appurl").val(data.appurl);
 				    $("#apptoken").val(data.apptoken);
 				   $("#appencodingaeskey").val(data.ecodingaeskey);
 	 
 				  });
 				
 				
    		});
    		
    		
		});
	</script>

 
	
</head>
<body ng-app="lifeinusa" >
	
<!-- Nav End
–––––––––––––––––––––––––––––––––––––––––––––––––– -->
<div id="gsidebar"></div>	
	
<!-- Primary Page Layout 
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
	<main >
		<div class="title">
			/partner/wx_setting.html
		</div>	
		<article class="container" >
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 ">
<div id="wxtab">

  <!-- Nav tabs -->
  <ul class="nav nav-tabs" role="tablist">
    <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">STEP1</a></li>
    <li role="presentation" class=" "><a href="#"  >STEP2</a></li>
    <li role="presentation" class=" "><a href="#"  >STEP3</a></li>
   
  </ul>

  <!-- Tab panes -->
  <div class="tab-content">
    <div role="tabpanel" class="tab-pane active" id="home">
		
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 title">
			第一步： 填写微信公众号类型与基本信息
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-4 title">
					选择公众号类型
				</div>
				<div class="col-xs-12 col-sm-6 col-md-8 content">
					  <select id="servicetype" name="servicetype" class="selectpicker " data-style="btn-info">
						  
						      <optgroup label="订阅号" data-max-options="2">
								  <option value="book">普通订阅号</option>
								  <option value="cbook">认证订阅号</option>
							  </optgroup>
							  <optgroup label="服务号" data-max-options="2">
								  <option value="service">普通服务号</option>
								  <option value="cservice">认证服务号</option>
								  
							  </optgroup>
  
  					  </select>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-4 title">
					公众号名称:
				</div>
				<div class="col-xs-12 col-sm-6 col-md-8 content">
					<input id="appname" name="appname" type="text" required/>  
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-4 title">
					公众号简介:
				</div>
				<div class="col-xs-12 col-sm-6 col-md-8 content">
					<input id="appdesc" name="appdesc" type="text" required/>  
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-4 title">
					公众号二维码:
				</div>
				<div class="col-xs-12 col-sm-6 col-md-8 content">
					<input type="file"   class="btn btn-info">上传二维码</input>  
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-12 ">
				<a id="bt-step1" href="#profile" aria-controls="home" role="tab" data-toggle="tab"><button  class="btn btn-info">下一步</button></a>
				</div>
			</div>		
		</div>  
	</div>
	
	<!--	第二步： 配置微信开发者凭据-->
    <div role="tabpanel" class="tab-pane" id="profile">
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 title">
			第二步： 配置微信开发者凭据
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-4 title">
					AppID(应用ID):
				</div>
				<div  class="col-xs-12 col-sm-6 col-md-8 content">
					<input id="appid" name="appid" type="text"  required/>  
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-6 col-md-4 title">
					AppSecret(应用密钥)
				</div>
				<div  class="col-xs-12 col-sm-6 col-md-8 content">
					<input id="appsecret" name="appsecret" type="text" required/>  
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 ">
					<img src="/images/tab2-2.png" alt="exapmle"/>
				</div>
			</div>
		</div>
	    <div class="row">
				<div class="col-xs-12 col-sm-6 col-md-12 ">
				<a id="bt-step2" href="#messages" aria-controls="home" role="tab" data-toggle="tab"><button  class="btn btn-info">下一步</button></a>
				</div>
		</div>	
	
	</div>
	
<!--	第三步：进入微信公众平台并设置接口-->
    <div role="tabpanel" class="tab-pane" id="messages">
		<div class="container">
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 title">
			第三步：进入微信公众平台并设置接口
				</div>
			</div>
			
			<div class="row">
				
				<div class="col-md-1">
					<div class="circle">1</div>
				</div>
				<div class="col-xs-6 col-sm-6 col-md-11">
			 		进入微信公共平台 http://mp.weixin.qq.com<br/>
					登录微信公众平台，点击进入【开发者中心】
				</div>
				<div class="col-md-1">
					 
				</div>
				<div class="col-xs-6 col-sm-6 col-md-11">
			 		<img src="/images/account21.jpg" class="imgborder">
				</div>
			</div>
			
			<hr class="hrz"/>
			
			<div class="row">
				<div class="col-md-1">
					<div class="circle">2</div>
				</div>
				<div class="col-xs-11 col-sm-11 col-md-11">
			 	修改服务器配置<br/>在服务器配置处，点击【修改配置】
				</div>
				<div class="col-md-1"></div>
				<div class="col-xs-6 col-sm-6 col-md-11">
			 		<img src="/images/account22.jpg" class="imgborder">
				</div>
			</div>
			
			<hr class="hrz"/>
			
			<div class="row">
				
				<div class="col-md-1">
					<div class="circle">3</div>
				</div>
				<div class="col-xs-6 col-sm-6 col-md-11">
			 	配置微信接口<br/>分别将下方的信息复制到【接口配置信息】的输入框
				</div>
				
				<div class="col-xs-6 col-sm-6 col-md-7">
			 		<img src="/images/account23.png" class="imgborder">
				</div>
				<div class="col-md-4">
					<button class="btn btn-info">URL</button>
					<textarea id="appurl" name="appurl" class="form-control mtext" rows="3"></textarea>
					<button class="btn btn-info">Token</button>
					<textarea id="apptoken" name="apptoken"  class="form-control mtext" rows="3"></textarea>
					<button class="btn btn-info">EncodingAESkey</button>
					<textarea id="appencodingaeskey" name="appencodingaeskey"  class="form-control mtext" rows="3"></textarea>
				</div>
				
			</div>
			
			<hr class="hrz"/>
			
			 
		</div>
	</div>
     
  </div>

</div>
							

				</div>
			</div>
		</article>
		
	</main>


<!-- Primary Page Layout End
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
	
	<footer ng-controller="header_footer">



	</footer>
  
	
<!-- End Document
  –––––––––––––––––––––––––––––––––––––––––––––––––– -->
</body>
</html>
