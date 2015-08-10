
(function($) {

    $.fn.gsidebar = function( options ) {
		var settings = $.extend({
		// These are the defaults.
		datasource: " ",
		menumargin:"5",
		menupadding:"0",
		menuborder:"1",
		menutextalign:"left",
		menufullwidth:"180",
		menuiconwidth:"60",
		
		
		padview:{
					initwidth:400},				  
		mobileview:{
					initwidth:400
				}
		}, options );

var acontent=document.URL.split("/");
var currentpage=acontent[acontent.length-1];
console.log("current url:"+document.URL);
console.log("current page:"+currentpage);
	
var menuhtml=getMenu(settings.datasource);		
console.log("html menu: "+menuhtml);
		
		//step1 make html
		this.html(menuhtml);
		//step2 initialize css
		Initialize(settings);
		//step3 add mouse event
		mouseevent(settings);
		
		return this;
    }
}(jQuery));


/*
Step1 create html 
*/
function getMenu(data){
	var html="";
	
	$.each( data, function( i,obj ) {
   		var iconclass="";
		if(obj.iconclass!=null)iconclass=obj.iconclass;
		console.log(obj.iconclass);
		html=html+"<li>"+
			"<span class='"+iconclass+"' aria-hidden='true'></span>"+
			"<a href='"+obj.url+"'><span></span>"+
			obj.title+"</a>";
		
		if(obj.submenu!=null){
			html=html+getMenu(obj.submenu);
		}
		
		html=html+"</li>";
 		
	});
	html="<ul>"+html+"</ul>";
	return html;
}

/*
Step2 initlize css for the menu 
*/

function Initialize(settings){
	//menu width
	$("#gsidebar, #gsidebar ul, #gsidebar li").css("width",settings.menuiconwidth+"px");
	
	//hide submmenu
	
	$("#gsidebar li>ul").hide();
	

}

/*
step3 add mouse event
*/
function mouseevent(settings){
	
	$("#gsidebar").on( "mouseover", function() {
  		$("#gsidebar, #gsidebar ul, #gsidebar li").css("width",settings.menufullwidth+"px");
		
		
  }).on("mouseleave",function(event){
		//close all submenu
	 	$("#gsidebar li>ul").hide();
		//reset the sidebar width
		$("#gsidebar, #gsidebar ul, #gsidebar li").css("width",settings.menuiconwidth+"px");
		event.stopPropagation();
		
	}).on("click",function(event){
		//close all submenu
		$("#gsidebar li>ul").hide();
		event.stopPropagation();
	});
	
	
	$("#gsidebar li").on( "mouseover", function() {
		//$("#gsidebar li>ul").hide();
  		$(this).children("ul").show();
  });
	
	$("#gsidebar li").on( "click", function() {
  		$(this).children("ul").hide();
  });
	
}


