<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<ul>
	<li>Get UserList from static service</li>
 	<c:forEach items="${userTestList}" var="u">
		<li>
			<c:out value="${u} "></c:out>	
		</li>
	 </c:forEach>
</ul>

<ul>
	<li>Get UserList from hibernate</li>
 	<c:forEach items="${userDataList}" var="usa">
		<li>
			<c:out value="${usa.username} "></c:out>	
		</li>
	 </c:forEach>
</ul>

</body>
</html>
