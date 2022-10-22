
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>User Register Form</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>

</head>
<body>

<nav class="navbar bg-light">
  <div class="container">

    <p>Register Artist</p>
  </div>
</nav>

<div class="container">
 <div class="row">
   <div class = "offset-md-2 col-md-8">
     <form action="<%=request.getContextPath()%>/ArtistServlet" method="post">

       <div class="mb-3">
         <label for="name" class="form-label">Name :</label>
         <input type="text" class="form-control" id="name" name="name">
       </div>
       <div class="mb-3">
         <label for="username" class="form-label">Username :</label>
         <input type="text" class="form-control" id="username" name="username">
       </div>

       <div class="mb-3">
         <label for="age" class="form-label">age:</label>
         <input type="text" class="form-control" id="age" name="age">
       </div>



       <div class="mb-3">
         <label for="genre" class="form-label">genre :</label>
         <input type="text" class="form-control" id="genre" name="genre" >
       </div>
       <div class="col-auto">
         <button type="submit" class="btn btn-primary mb-3">Add User</button>
       </div>
     </form>

   </div>
 </div>
</div>





</body>
</html>
