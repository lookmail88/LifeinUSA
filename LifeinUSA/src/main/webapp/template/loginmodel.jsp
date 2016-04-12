<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
  <div class="modal-dialog" >
    <div class="modal-content" style="background-color:rgba(255,255,255,0.75)">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		  <h4 class="modal-title"><a>Sign In</a></h4>
      </div>
      <div class="modal-body" style="margin: 0 auto;">
        <ul >
        <form  action="j_spring_security_check" method="post">     
			<li>
				<input class="form-control" type="text" placeholder="Email"  name="username">
			</li>	
			
			<li>
				<input class="form-control" type="password" placeholder="Passwrod" name="password">
			</li>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<li>
				<div class="checkbox">
  <label>
    <input type="checkbox" name="">
    Remember Me
  </label>
</div>
			</li>
			
			<li>
				<a>Forget Password</a>
				<button class="btn btn-info pull-right" type="submit">Submit</button>
			</li>
			</form>             
		</ul>
      </div>
       
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->