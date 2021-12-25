<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>









<html lang="en">
<head>
<title></title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=2">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
	
</script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js">
	
</script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js">
	
</script>


<div style="background-color: #00695c;

width: 100%;
        height: 30px;
        margin: 0px;
        border-radius:0px;






">
	<h3 style="color: white">Sathyatel Management System</h3>
	</header>
</div>








<nav class="navbar navbar-expand-sm bg-dark" style="line-height:0px;">

	<ul class="navbar-nav">
		<li class="nav-item" style="color: white"><a class="nav-link"
			href="home?phoneNo=${phoneNo}" style="color: white">Back To HomePage</a></li>
</ul></nav>











<style>
div {
	padding: 0px 0px 0px;
}
</style>



<style>
div1 {
	padding: 0px 0px 0px;
}
</style>



</head>
<body style="background-color: MintCream;padding=3">
































<table border="2">
	<c:forEach items="${callDtoList }" var="list">


		<tr>
			<td>CallId</td>
			<td><c:out value="${list.callId}" /></td>
		</tr>
		<tr>
			<td>CalledBy</td>
			<td><c:out value="${list.calledBy}" /></td>
		</tr>
		<tr>
			<td>CalledTo</td>
			<td><c:out value="${list.calledTo}" /></td>
		</tr>
		<tr>
			<td>CalledOn</td>
			<td><c:out value="${list.calledOn}" /></td>
		</tr>
		<tr>
			<td>Duration</td>
			<td><c:out value="${list.duration}" /></td>
		</tr>


	</c:forEach>

</table>