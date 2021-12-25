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
        border-radius:2px;

">
	<h3 style="color: white">Sathyatel Management System</h3>
	</header>
</div>










<nav class="navbar navbar-expand-sm bg-dark" style="line-height: 0px;">

	<ul class="navbar-nav">
		<li class="nav-item" style="color: white"><a class="nav-link"
			href="viewProfile?phoneNo=${phoneNo}" style="color: white">ViewProfile</a></li>



		

		<li class="nav-item" style="color: white"><a class="nav-link"
			href="allPlans" style="color: white">AllPlans</a></li>


		<li class="nav-item" style="color: white"><a class="nav-link"
			href="changePlanPage?phoneNo=${phoneNo}" style="color: white">ChangePlans</a></li>



		<li class="nav-item" style="color: white"><a class="nav-link"
			href="addFriendPage" style="color: white">addFriend</a></li>


		<li class="nav-item" style="color: white"><a class="nav-link"
			href="planById?planId=${planId}" style="color: white">PlanId</a></li>





		<li class="nav-item"><a class="nav-link"
			href="callDetails?phoneNo=${phoneNo}" style="color: white">CallDetails</a></li>
		<!-- 
                <li class="nav-item"> 
                    <a class="nav-link" href="editEmployee" style="color:white">EditEmployee</a> 
                </li> 
               -->
		<li class="nav-item"><a class="nav-link"
			href="allFriendsContact?phoneNo=${phoneNo}" style="color: white">AllFriends</a></li>
	</ul>
</nav>




















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














































	<h5>Hiii ${name} Welcome To Sathyatel Management services</h5>
	<table>

		<tr>
			<td><a href="viewProfile?phoneNo=${phoneNo}"><button>View
						Profile</button></a></td>
			<td><a href="addFriendPage"><button>Add Friends</button></a></td>
			<td><a href="allPlans"><button>Plans</button></a></td>
		</tr>
		<tr>
			<td><a href="changePlanPage?phoneNo=${phoneNo}"><button>Change
						Plan</button></a></td>
			<td><a href="callDetails?phoneNo=${phoneNo}"><button>CallDetails</button></a></td>
			<td><a href="planById?planId=${planId}"><button>PlanId</button></a></td>
			<td><a href="allFriendsContact?phoneNo=${phoneNo}"><button>All
						Friends Contact</button></a></td>

		</tr>

	</table></body></html>
