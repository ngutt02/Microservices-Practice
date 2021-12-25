<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>





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







<div style= "width: 50%;
        height: 20px;
        margin: 5px;
        border-radius: 3px;
        background-color: powderblue;"><h6>
	${msg} 		
	
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

































<form:form action="addCustomer" method="post"
	modelAttribute="customerDto">



<table border="2">
<tr><td>phoneNo</td><td>${customerDto.phoneNo}</td></tr>
<tr><td>Name</td><td>${customerDto.name}</td></tr>
<tr><td>PlanId</td><td>${customerDto.planId}</td></tr>
<%-- <tr><td></td><td>${customerDto.phoneNo}</td></tr> --%>











</table>
</form:form>