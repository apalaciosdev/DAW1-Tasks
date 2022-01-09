<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mecánico</title>
    <link rel="stylesheet" href="../styles/mecanico.css">
  </head>

  <body>
    <?php 
      session_start();
      $user = $_SESSION["login-user"];
      echo "<p>Bienvenido <span>$user</span> a la sección de Mecánico!</p>";
    ?>

    <form action="../helpers/logout.php" method="post">
        <input type="submit" value="Logout">
    </form> 

    <h1>MECÁNICO</h1>
    
    <img class="gif-img" src="https://media2.giphy.com/media/WpBM8MXkMrP0aqi5lR/giphy.gif?cid=94b197879qk4ad752a95iwcr7hzdt6yiavzv1mbnbmqe2hzk&rid=giphy.gif&ct=g"/>
    <img class="gif-img" src="https://media4.giphy.com/media/VpR1sXYMhuwaKKCVGN/giphy-downsized-medium.gif?cid=94b197877znkcyb55gkpgqn4w0hpyv8qb3q0x96rjgycmv5t&rid=giphy-downsized-medium.gif&ct=g"/>
  </body>
</html>