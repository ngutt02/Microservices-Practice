<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="addCustomer" method="post"
	modelAttribute="registerBean">
	<table>
		<tr>
			<td>Phone No</td>
			<td><form:input path="phoneNo" /></td>
			<td><form:errors path="phoneNo" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><form:input path="password" /></td>
			<td><form:errors path="password" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><form:input path="name" /></td>
			<td><form:errors path="name" /></td>
		</tr>
		<tr>
			<td>PlanId</td>
			<td><form:select path="planId">
					<form:option value="">---select-----</form:option>
					<form:options items="${registerBean.planDtoList}" itemValue="planId"
						itemLabel="planId" />
				</form:select></td>
			<td><form:errors path="planId" /></td>
		</tr>
		<tr>
			<td colspan="3" ali gn="center"><input type="submit"
				value="REGISTER" /></td>
			<td></td>
			<td></td>
		</tr>

	</table>
</form:form>