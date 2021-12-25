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








<nav class="navbar navbar-expand-sm bg-dark" style="line-height: 5px;">

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
	padding: 0px 10px 0px;
}
</style>



</head>
<body style="background-color: MintCream;padding=3">






































	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<form:form action="xyz" method="post" modelAttribute="customerDto">
		<h2>Customer Details</h2>
		<table border="2">
			<tr>
				<td>PhoneNo</td>
				<td>${customerDto.phoneNo}</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>${customerDto.name}</td>
			</tr>
			<tr>
				<td>PlanId</td>
				<td>${customerDto.planId}</td>
			</tr>
		</table>
		<u><h>PlanDetails</h></u>
		<br>
		<table border="1">

			<tr>
				<td>PlanId</td>
				<td>${customerDto.currentPlan.planId}</td>
			</tr>
			<tr>
				<td>PlanName</td>
				<td>${customerDto.currentPlan.planName}</td>
			</tr>
			<tr>
				<td>validity</td>
				<td>${customerDto.currentPlan.validity}</td>
			</tr>
			<%-- <c:forEach items="${customerDto.friends}" var="friend">
		<tr>
			<td>Friends</td>
			<td>
				 <c:forEach items="${customerDto.friends}" var="friend">
				<c:out value="${friend.friends}"/>
			</c:forEach> ${customer.friends}
			</td>
		</tr>

		</c:forEach> --%>
		</table>
		<h>Friends</h>
		<table border="1">

			<c:forEach items="${customerDto.friends}" var="list">
				<tr>
					<td><c:out value="${list}" /></td>
				</tr>
			</c:forEach>

			<%-- <td>${customerDto.friends}</td> --%>

		</table>
	</form:form>
</body>
</html>