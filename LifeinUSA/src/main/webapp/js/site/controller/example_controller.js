var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope,$http ) {
 
 /*this controller uses the config.params object as the request payload*/
    var config = {
        params: {
            'rows': 5,
            'fname': '{firstName}',
            'lname': '{lastName}',
            'tel': '{phone|format}',
            'callback': "JSON_CALLBACK"
        }
    };
	
    $http.jsonp("http://www.filltext.com", config, {}).success(function (data) {
        $scope.users = data;
    });
	
	$scope.loadMore = function(){
		$("#loadmore").html("Loading...");
		$http.jsonp("http://www.filltext.com", config, {}).success(function (data) {
       $scope.users = $scope.users.concat(data);
		$("#loadmore").html("Load More...");	
    });
		
		
	};
	

});


