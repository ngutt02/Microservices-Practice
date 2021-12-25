<%@taglib  uri="http://www.springframework.org/tags/form"   prefix="form"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 

<!DOCTYPE html>
<html lang="en">

<head>
<script src="<%=basePath %>resources/misstyles/assets/plugins/jquery/jquery.min.js"></script>
<script src="<%=basePath %>resources/misstyles/assets/plugins/popper/popper.min.js"></script>
<script src="<%=basePath %>resources/misstyles/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
<link href="<%=basePath %>resources/misstyles/css/style.css" rel="stylesheet">
</head>
<body>

<!-- ============================================================== -->
<!-- Bread crumb and right sidebar toggle -->
<!-- ============================================================== -->
<div class="row page-titles">
	<div class="col-md-5 col-12 align-self-center">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="javascript:void(0)">Home</a></li>
			<li class="breadcrumb-item">Masters</li>
			<li class="breadcrumb-item active">Add Organisation</li>
		</ol>
	</div>
	<div class="col-md-7 col-12 align-self-center d-none d-md-block">
		<div class="d-flex mt-2 justify-content-end">
			<div class="">
				<button
					class="right-side-toggle waves-effect waves-light btn-success btn btn-circle btn-sm pull-right ml-2">
					<i class="ti-settings text-white"></i>
				</button>
			</div>
		</div>
	</div>
</div>
<!-- ============================================================== -->
<!-- End Bread crumb and right sidebar toggle -->
<!-- ============================================================== -->


 <%-- <!-- Row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="card card-outline-info">
                            <div class="card-header">
                            
	                            <c:if test="${addOrg != null}">
	                                <h4 class="mb-0 text-white">Edit Organisation</h4>
                                </c:if>
                                <c:if test="${addOrg == null}">
	                                <h4 class="mb-0 text-white">Add Organisation</h4>
                                </c:if>
                            </div>
                            <div class="card-body">
                                <form:form  action="save"  method="post"  modelAttribute="addOrg">
                                
                                 	<c:if test="${addOrg != null}">
                                 	<form:input type="hidden"  path="organisationsid" placeholder="Organization Id" value="<c:out value='${addOrg.organisationsid}' />"/>
					                    
					                </c:if>    
                                    <div class="form-body">
                                        <h6 class="card-title"><font style="color:red;">*</font> Indicate Mandatory fields</h6>
                                        <hr>
                                        <div class="row pt-3">
                                            <div class="col-md-2">
                                                <div class="form-group">
                                                    <label class="control-label">Type of Organisation :<span class="text-danger">*</span></label>
                                                </div>
                                            </div>
                                            
                                            <div class="col-md-4">
                                                <div class="form-group">
                                                <div class="controls">
                                                    <form:input  path="organisationfullname" placeholder="Organization Full Name"/>
                                                   <div class="help-block"></div>
                                                </div>
                                                <small class="form-control-feedback"> Like University/College/Institute etc </small>
                                                </div>
                                            </div>
                                            
                                            
                                            <!--/span-->
                                             <div class="col-md-2">
                                                <div class="form-group">
                                                    <label class="control-label">Short Name of Organisation <span class="text-danger">*</span></label>
                                                </div>
                                            </div>
                                            
                                            <div class="col-md-4">
                                                <div class="form-group">
                                                	<div class="controls">
	                                                    <form:input  path="organisationshortname" placeholder="Organization Short Name" />
	                                                        <div class="help-block"></div>
	                                                </div>
	                                                    <small class="form-control-feedback"> Like UN/COL/INST etc </small>
                                                </div>
                                            </div>
                                            <!--/span-->
                                        </div>
                                        <!--/row-->
                                        
                                        
                                        

                                    </div>
                                    <div class="form-actions" align="center">
                                    
                                        <c:if test="${addOrg != null}">
			                                <button type="submit" class="btn btn-success"> <i class="fa fa-check"></i>Update</button>
		                                </c:if>
		                                <c:if test="${addOrg == null}">
			                                <button type="submit" class="btn btn-success"> <i class="fa fa-check"></i>Save</button>
		                                </c:if>
                                        <button type="reset" class="btn btn-inverse">Reset</button>
                                    </div>
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Row --> --%>


<form:form  action="save"  method="post"  modelAttribute="addOrg">
  <table cellpadding="5" cellspacing="5">
  
  <tr>
           <td> <form:input  path="organisationsid" placeholder="Organization Id"/> </td>
            <td><form:errors  path="organisationsid"/></td>
     </tr>
     
     
      <tr>
            <td> <form:input  path="organisationfullname" placeholder="Organization Full Name"/> </td>
           <td><form:errors  path="organisationfullname"/></td>
           
     </tr>
     
     <tr>
           
           <td> <form:input  path="organisationshortname" placeholder="Organization Short Name"/> </td>
           <td><form:errors  path="organisationshortname"/></td>
     </tr>
     
    
     
     <tr>
          <td  colspan="2"  align="center">
                <input  type="submit"   value="save"> &nbsp;&nbsp;
                
                <input  type="submit"   value="reset">
          </td>
     </tr>     
  </table>
  
  
  

</form:form>

</body>
</html>



