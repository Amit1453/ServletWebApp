<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All users</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>

<h1>All the recorded Info</h1> 

<div class="container">
  
       <table class="table table-bordered">
  
   
     
    <thead>
         <tr bgcolor="00FF7F">
      	<th>ID</th>
        <th>USERNAME</th>
        <th>PASSWORD</th>
        <th>NAME</th>
        <th>EMAIL <a href = "sortAscServlet"> <image src="a.png" height="25" width="25"> </image></a> 
        		<a href = "sortDscServlet"> <image src="d.png" height="25" width="25"></image></a> 
        		
        		
        </th>
       
        <th>    ACTION  </th>
         
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${list}" var="usr">
      <tr>
      	<td>${usr.id }</td>
        <td>${usr.username }</td>
        <td>${usr.password }</td>
        <td>${usr.fullname }</td>
        <td>${usr.email }</td>
        
         
       <td><a href = "deleteServlet?id=${usr.id }"> <button type="Submit" class="btn btn-info">Delete</button></a>
       <a href = "dataTransferServlet?id=${usr.id }&uname=${usr.username}&pswd=${usr.password}&fname=${usr.fullname}&email=${usr.email}"><button type="Submit" class="btn btn-info">Update</button></a>      
        </td>
        
        
      </tr>
     </c:forEach>
      
    </tbody>
  </table>  
  
  
</div>


</body>
</html>