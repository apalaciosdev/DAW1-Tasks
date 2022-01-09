<?php
include_once './db/dbConfig.php';
?>

<!DOCTYPE html>
<html lang="es">

  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://www.google.com/recaptcha/api.js?hl=es" async defer></script>
    <title>Deprecated Login</title>
  </head>

  <body>
    <?php
    $user = $_POST['user'];
    $password = $_POST['password'];
    $tematica = $_POST['tematica'];


    //Si el login es correcto
    if ($user == "aaron@aaron.com" && $password == "aaron123" && $tematica == "Bombero") {
      session_start();
      $_SESSION['login-user'] = $user;

      switch ($tematica) {
        case 'Mecánico':
            header("Location: ../pages/mecanico.php");
            break;

        case 'Bombero':
            header("Location: ../pages/bombero.php");
            break;

        case 'Policia':
            header("Location: ../pages/policia.php");
            break;

        case 'DataBase':
            header("Location: ../pages/database.php");
            break;

        default:
            break;
      }
    } 
    
    
    //Si la contraseña es incorrecta
    else if ($user == "aaron@aaron.com" && $password != "aaron123") {
      echo "<p>Contraseña incorrecta</p>";
    ?>
      <form action="index.html" method="post">
        <input type="submit" value="Probar de nuevo">
      </form>
    <?php
    } 
    

    //Si el user es incorrecto
    else if ($user != "aaron@aaron.com" && $password == "aaron123") {
      echo "<p>Usuario incorrecto</p>";
    ?>
      <form action="index.html" method="post">
        <input type="submit" value="Probar de nuevo">
      </form>
    <?php
    } 
    

    //Si ambos campos són incorrectos
    else if ($user != "aaron@aaron.com" && $password != "aaron123") {
      echo "<p>Usuario y contraseña incorrectos</p>";
    ?>
      <form action="index.html" method="post">
        <input type="submit" value="Probar de nuevo">
      </form>
    <?php
    }
    ?>
    
  </body>
</html>