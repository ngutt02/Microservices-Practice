<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<h3 style="border: 2px solid  cyan; color: blue;">
  <c:if  test="${message ne null }">
      <c:out  value="${message }"/>
  </c:if>
</h3>

1.  <a href=addOrganization>Add Organization </a> 
     <br> <br>
2.  <a href="organizationList">List Organizations</a>
     