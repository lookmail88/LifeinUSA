
var app = angular.module('lifeinusa', ['ngSanitize']);
app.controller('header_footer', function($scope) {
 
 /*this controller uses the config.params object as the request payload*/
    $scope.headerurl = '/template/header.html';
 	$scope.footerurl = '/template/footer.html'; 
	$scope.loginmodelurl='/template/loginmodel.html';
});


app.controller('fliper', function($scope) {
    $scope.descs=servicesdescs;
});

app.controller('rates',function($scope){
	$scope.rates=pricetable;
});

app.controller('qnas',function($scope){
	$scope.qnas=questions;
    $scope.toggle=function(id){
		 var idname="#q"+id;
		angular.element("#q"+id).toggleClass("qnahide");
		angular.element("#img"+id).toggleClass("clockwise90");
	}
});

app.controller('dogwalkingcontroller',function($scope){
	$scope.siteservice=sdogwalking;
});

app.controller('doggiecontroller',function($scope){
	$scope.siteservice=sdoggiedaycare;
});

app.controller('catsittingcontroller',function($scope){
	$scope.siteservice=scatsitting;
});

app.controller('overnightcontroller',function($scope){
	$scope.siteservice=sovernight;
});

app.controller('bordingcontroller',function($scope){
	$scope.siteservice=sboarding;
});

app.controller('pettaxicontroller',function($scope){
	$scope.siteservice=spettaxi;
});



	$(window).scroll(function(){
    if ($(window).scrollTop()>240){
        $("nav").css({position:"fixed",top:"0px"});
    }else{
        $("nav").css({position:"relative"});
    }
});


$(window).scroll(function(){
    if ($(window).scrollTop()>500){
        $("#gotop").css({display:"block"});
   }else{
         		$("#gotop").css({display:"none"});
    }
});
