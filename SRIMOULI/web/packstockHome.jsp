<%-- 
    Document   : packstockHome
    Created on : Apr 3, 2017, 5:35:13 PM
    Author     : Masrat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #EEEEEE">
         <s:iterator value="ulist" status="stat"> 
                    <s:if test="%{#stat.index==0}">
            <%@include file="Upperpage.jsp" %>
                   
               
        <!-- Page Content -->
    <div class="container">
        <!-- Page Heading -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Welcome to Packing Sector</h1>
            </div>
        </div>
        <!-- /.row -->

        <!-- Projects Row -->
        <div class="row">
            <div class="col-md-5 portfolio-item">
                <a href="readytopack?id=<s:property value="id"/>">
				<div class="dashboard1  quality"><h2>Ready to Pack</h2></div>
                </a>
            </div>
            <div class="col-md-5 portfolio-item">
                <a href="packstock?id=<s:property value="id"/>">
				<div class="dashboard1 carding"><h2>Stock Report of Bags</h2></div>
                </a>
            </div>
          
        </div>
                          
    </div>
        </s:if>
        </s:iterator>
        <!-- /.row -->
        <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
