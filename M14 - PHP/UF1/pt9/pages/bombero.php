<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Bombero</title>
  <link rel="stylesheet" href="bombero.css">
</head>
<body>
<?php 
    session_start();
    $user = $_SESSION["login-user"];
    echo "<p>Bienvenido $user a la sección de Bombero!</p>";
  ?>
  <h1>BOMBERO</h1>
  <img class="gif-img" src="https://media0.giphy.com/media/l41YfZWbhnSGVqwsU/giphy.gif?cid=94b19787ppvx7ib0zmi54itau6kammvc2qsg5kgy82rapedd&rid=giphy.gif&ct=g"/>
  <img class="gif-img" src="https://media1.giphy.com/media/2E60YJWi8Aq2yAkHzb/giphy.gif?cid=94b19787ppvx7ib0zmi54itau6kammvc2qsg5kgy82rapedd&rid=giphy.gif&ct=g"/>
  <form action="../logout.php" method="post">
      <input type="submit" value="Logout">
  </form>  
</body>
</html>