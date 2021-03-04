<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 

</head>
<body>

<div class="container">  
  <form action="loginAcess" method = "post"  >
    <div class="form-group">
      <label >username:</label>
      <input type="text" class="form-control"  name="uname">
    </div>
    
    <div class="form-group">
      <label >Password:</label>
      <input type="text" class="form-control" name="pswd">
    </div>
    
    <button type="submit" class="btn btn-primary">Login</button>
    
   
    
    <a href="register.jsp" >
      <button type="button" class="btn btn-info">Go to registration page</button>
   </a> 
    
    
  </form>
</div>
${msg}
${result }

</body>
</html>