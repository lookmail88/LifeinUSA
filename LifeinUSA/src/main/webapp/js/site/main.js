
var app = angular.module('lifeinusa', ['ngSanitize']);
app.controller('header_footer', function($scope) {
 
 /*this controller uses the config.params object as the request payload*/
    $scope.headerurl = '/template/header.html';
 	$scope.footerurl = '/template/footer.html'; 
	$scope.loginmodelurl='/template/loginmodel.jsp';
});


