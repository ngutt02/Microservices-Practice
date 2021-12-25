<%@taglib  uri="http://www.springframework.org/tags/form"   prefix="form"%>

<form:form  action="update"  method="post"  modelAttribute="addOrg">
  <table cellpadding="5" cellspacing="5">
  
  <tr>
           <td> <form:input  path="organisationsid" placeholder="Organization Id" readonly="true"/> </td>
           <%--  <td><form:errors  path="organisationsid"/></td> --%>
     </tr>
     
     
      <tr>
           </td> <td> <form:input  path="organisationfullname" placeholder="Organization Full Name"/> </td>
           <%-- <td><form:errors  path="organisationfullname"/></td> --%>
           
     </tr>
     
     <tr>
           
           <td> <form:input  path="organisationshortname" placeholder="Organization Short Name"/> </td>
           <%-- <td><form:errors  path="organisationshortname"/></td> --%>
     </tr>
     
    
     
     <tr>
          <td  colspan="2"  align="center">
                <input  type="submit"   value="save"> &nbsp;&nbsp;
                
                <input  type="submit"   value="reset">
          </td>
         </tr>     
  </table>

</form:form>



