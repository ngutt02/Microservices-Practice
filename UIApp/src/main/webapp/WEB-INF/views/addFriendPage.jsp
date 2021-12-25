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
	
Add Friend		
	
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























































<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${message ne null}">
	<c:out value="${message}" />


</c:if>




<form action="addFriend" method="post">
	<table>
		<tr>
			<td>PhoneNo</td>
			<td><input type="text" name="phoneNo" /></td>
		</tr>
		<tr>
			<td>FriendNo</td>
			<td><input type="text" name="friendNo" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Add Friend" /></td>
		</tr>




	</table>


</form>

<!-- </body></html> -->