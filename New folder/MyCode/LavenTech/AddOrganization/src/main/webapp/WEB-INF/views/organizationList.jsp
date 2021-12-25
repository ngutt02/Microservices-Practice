


<%@taglib  uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>

<form action="search" method="get" style="border: 2px solid cyan;">

Organization Short Name :<input type="text" name="organisationshortname"/>

&nbsp;&nbsp;&nbsp;
<input type="submit" value="search"/>

</form>


<table  border="2" cellpadding="5" cellspacing="5">
   <tr>
       <th>Organization Id</th>
		<th>Organization Full Name</th>
		<th>Organization Short Name</th>
       <th>Operations</th>
   </tr>
   <c:if  test="${!empty  organization}">
   
        <c:forEach   items="${organization}"   var="org">
             <tr align="center">
				<td><c:out value="${org.organisationsid}" /></td>
				<td><c:out value="${org.organisationfullname}" /></td>
				<td><c:out value="${org.organisationshortname}" /></td>
				 <td>
                            <a href="editOrganization?organisationsid=${org.organisationsid }"><img  src="images/edit.png"  width="30" height="30"></a>
                            &nbsp; &nbsp; &nbsp;
                            <a href="deleteOrganization?organisationsid=${org.organisationsid }"><img  src="images/delete.png"  width="30"  height="30"></a>
                    </td>
			</tr>     
        </c:forEach>
   
   </c:if>
</table>





