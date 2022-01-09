<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Policia</title>
    <link rel="stylesheet" href="../styles/policia.css">
  </head>

  <body>
    <?php 
      session_start();
      $user = $_SESSION["login-user"];
      echo "<p>Bienvenido <span>$user</span> a la sección de Policia!</p>";
    ?>

    <form action="../helpers/logout.php" method="post">
        <input type="submit" value="Logout">
    </form> 

    <h1>POLICIA</h1>
    
    <img class="gif-img" src="https://media2.giphy.com/media/Bc3SkXz1M9mjS/giphy-downsized-medium.gif?cid=94b19787bia5dik6julsav5pot7s8e9jbt1bllrkkigret6y&rid=giphy-downsized-medium.gif&ct=g"/>
    <img class="gif-img" src="https://media0.giphy.com/media/jjFI1eFyFccUg/giphy.gif?cid=94b19787bia5dik6julsav5pot7s8e9jbt1bllrkkigret6y&rid=giphy.gif&ct=g"/>
  </body>
</html>