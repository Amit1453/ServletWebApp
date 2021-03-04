<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Update</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>

<h1>The Record to be update</h1> 

<div class="container">  
  <form action="updateServlet" method = "post"  >
    <div class="form-group">
      <label >username:</label>
      <input type="text" class="form-control" value=${Username} name="uname">
    </div>
    
    <div class="form-group">
      <label >Password:</label> 
      <input type="text" class="form-control" value=${Password} name="pswd">
    </div>
    
    <div class="form-group">
      <label >Fullname:</label>
      <input type="text" class="form-control" value=${Fullname} name="fname">
    </div>
    
    <div class="form-group">
      <label >Email:</label>
      <input type="text" class="form-control" value=${Email} name="email">
    </div>
    
    <input type="hidden" name="id" value=${stringid }>
    
    <button type="submit" class="btn btn-primary">Update</button>

       
      
    
      </form>
    
    </div>
   



</body>
</html>