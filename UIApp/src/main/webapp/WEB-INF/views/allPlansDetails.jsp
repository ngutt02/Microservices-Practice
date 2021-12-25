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
        height: 35px;
        margin: 5px;
        border-radius: 3px;">
	<h4 style="color: white">Sathyatel Management System</h4>
	</header>
</div>







<div style= "width: 20%;
        height: 20px;
        margin: 5px;
        border-radius: 3px;
        background-color: powderblue;"><h6>
	
All Plans Details	
	
</h6></div>






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






















<table border="2">
	<tr>
		<th>PlanId</th>
		<th>Name</th>
		<th>Validity</th>
	</tr>
	<c:forEach items="${planDtoList}" var="dto">
		<tr>
			<td><c:out value="${dto.planId}" /></td>
			<td><c:out value="${dto.planName}" /></td>
			<td><c:out value="${dto.validity}" /></td>
		</tr>
	</c:forEach>

</table>