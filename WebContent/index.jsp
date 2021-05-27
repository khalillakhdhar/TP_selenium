<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Inscription</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col">
      
    </div>
    <div class="col">
      <form action="UserServlet" method="post">
      <div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Nom </label>
  <input type="text" required name="nom" class="form-control" id="nom" placeholder="votre nom ici">
</div>
      <div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Prenom </label>
  <input type="text" required name="prenom" class="form-control" id="prenom" placeholder="votre prenom ici">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Email </label>
  <input type="email" name="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
</div>
<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">Mot de passe</label>
    <input type="password" name="password" class="form-control" id="password" >
       <div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Age </label>
  <input type="text" min="18" required name="age" class="form-control" id="age" placeholder="votre age ici">
</div>
      <div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Score </label>
  <input type="number" min="80" required name="score" class="form-control" id="score" placeholder="votre score ici">
</div>
    <div class="mb-3">
  <input type="submit"  class="btn btn-primary" value="envoyer">
</div>
</div>



</form>
    </div>
    <div class="col">
      
    </div>
  </div>
</div>

</body>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</html>