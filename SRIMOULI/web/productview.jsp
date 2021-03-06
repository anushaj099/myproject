<%-- 
    Document   : productview
    Created on : Feb 15, 2017, 10:54:49 AM
    Author     : nsg
--%>





<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Sri Mouli Textiles Private Limited</title>

   
 
    <!-- Custom CSS -->
    <link href="css/Srimouli.css" rel="stylesheet">
      <link href="css/newcss.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
   
  
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <s:head/>
  <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    
      <SCRIPT language=Javascript>
      function isDecimalKey(evt)
                {
                    var theEvent = evt || window.event;
                    var key = theEvent.keyCode || theEvent.which;
                    key = String.fromCharCode(key);
                    if (key.length === 0)
                        return;
                    var regex = /^[0-9a-zA-Z]+$/;
                    if (!regex.test(key)) {
                        theEvent.returnValue = false;
                        if (theEvent.preventDefault)
                            theEvent.preventDefault();
                    }
                }
                </script>
</head>

<body style="background-color: #EEEEEE">

      <style type="text/css">
            label[for="i"] {
            color: black;
            font-size: 11pt;
            font-style: normal;
            padding-bottom: 10px;}    
            input[type="radio"]{
                width: 25px;
                margin-left: 10px;
            }
            input[type="checkbox"]{
                width: 25px;
                    margin-left: 10px;
            }
        </style>
        
<s:iterator value="ulist" var="myobj">   
     <%@include file="Upperpage.jsp" %>    
     <div class="container">
     <div class="tab1">
           <div class="row">
            <div class="col-lg-12">
               <h1 class="page-header">Sri Mouli Textiles Private Limited Product View</h1>
            </div>
        </div>
    
      <table border="1" class="table table-bordered table-responsive">
          <tr>
              <th>S.No</th>
              <th>Product Name</th>
              <th>Product Type</th>
            <s:if test="#myobj.loginType == 'control'"> 
            <th>Edit</th>
            <th>Delete</th>
            </s:if>
          </tr>
          
           <s:iterator value="productlist"  status="rowstatus">
            <tr>
                <td><s:property value="#rowstatus.count" /></td>
                <td><s:property value="productName"/></td>
                <td><s:property value="partialType"/></td>
    <s:if test="#myobj.loginType == 'control'">     
        
         <s:if test="year.isEmpty()">
      <td><a href="productEdit?id=<s:property value='id'/>&idl=<s:property value="idl"/>&variety=<s:property value="productName"/>" data-toggle="tooltip" data-placement="bottom" title="Delete" > <img src="Images/edit.png" alt="Images" /></a></td>
 <td><a href="productDelete?id=<s:property value='id'/>&idl=<s:property value="idl"/>" data-toggle="tooltip" data-placement="bottom" title="Delete" onclick="return confirm('Are u Sure ?')"> <img src="Images/delete.png" alt="Images" /></a></td>
   </s:if>
         <s:else>
             <td><a  href="#" data-toggle="tooltip" data-placement="bottom" title="Edit"> <img src="Images/edit.png" alt="images" /></a></td>
               <td><a href="#" data-toggle="tooltip" onclick="return confirm('Are You Sure ?')" data-placement="bottom" title="Delete"> <img src="Images/delete.png" alt="images" /></a></td>
        </s:else>
        
        
          </s:if> 
            </tr>
           
        </s:iterator>     
      </table>
     </div>
     </div>
       </s:iterator>
           
    </body>
</html>

