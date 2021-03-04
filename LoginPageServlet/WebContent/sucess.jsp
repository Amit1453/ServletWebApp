<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Sucessfully login.....................</h1>
<form action= "recordServlet">
	
	
	

   
   
   <h1>Displaying User Info</h1> 
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>id</b></th> 
          <th><b>username</b></th> 
          <th><b>password</b></th> 
          <th><b>FullNmae</b></th> 
          <th><b>EMAIL</b></th> 
         </tr> 
         <thread>
        </tbody>
        <tr>
        	 <td>${userdto.id }</td>
   		 <td>${userdto.username }</td>
        <td>${userdto.password }</td>
        <td>${userdto.fullname}</td>
        <td>${userdto.email }</td>
      </tr>
      
         <a href = "recordServlet" >
               <button type="button" class="btn btn-info">Print all the record</button> 
         </a>
  </form>

</body>
</html>