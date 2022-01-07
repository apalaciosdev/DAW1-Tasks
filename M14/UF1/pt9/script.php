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
    <title>Ej1</title>
  </head>
  <body>
    <?php
      $user = $_POST['user'];
      $password = $_POST['password'];
      $tematica = $_POST['tematica'];

      $userName = "";
      $sql = "select * from usuaris where userName = '$user' and passWord = '$password';";
      $rec = mysqli_query($con, $sql);
      $isValid = 0;


      while($row = mysqli_fetch_array($rec)){
        $isValid++;
        echo $isValid . "<br>";
        $userName = $row['nom'] . " " . $row['cognom'];
        
        if($isValid == 1){
          session_start();
          $_SESSION['login-user'] = $userName;

          if($tematica == "Mecánico"){
            header("Location: ./pages/mecanico.php");
          }

          else if($tematica == "Bombero"){
            header("Location: ./pages/bombero.php");
          }

          else if($tematica == "Policia"){
            header("Location: ./pages/policia.php");
          }

          else if($tematica == "DataBase"){
            header("Location: ./pages/database.php");
          }
        }   
        
      }
      
      
      else if($isValid == 0){
        echo "<p>Usuario o Contraseña incorrectos</p>";
        ?>
        <form action="index.html" method="post">
          <input type="submit" value="Probar de nuevo">
         </form>
        <?php
      }

      
      
      /*    PARTE1
      //CASO 1: El usuario y el password son correctos
      if($isValid == 2 && $tematica == "Mecánico"){
        $_SESSION['login-user'] = $user;
        session_start();
        header("Location: ./pages/mecanico.php");
      }
      
      
      if($user == "aaron@aaron.com" && $password == "aaron123" && $tematica == "Bombero"){
      session_start();
      $_SESSION['login-user'] = $user;
      header("Location: ./pages/bombero.php");
      }
      
      
      else if($user == "aaron@aaron.com" && $password == "aaron123" && $tematica == "Policia"){
      session_start();
      $_SESSION['login-user'] = $user;
      header("Location: ./pages/policia.php");
      }
      
      
      else if($user == "aaron@aaron.com" && $password == "aaron123" && $tematica == "DataBase"){
      session_start();
      $_SESSION['login-user'] = $user;
      header("Location: ./pages/database.php");
      }


      else if($user == "aaron@aaron.com" && $password != "aaron123"){
      
        echo "<p>Contraseña incorrecta</p>";
        ?>
        <form action="index.html" method="post">
          <input type="submit" value="Probar de nuevo">
         </form>
        <?php
      }
      
      else if($user != "aaron@aaron.com" && $password == "aaron123"){
       
        echo "<p>Usuario incorrecto</p>";
        ?>
        <form action="index.html" method="post">
          <input type="submit" value="Probar de nuevo">
         </form>
        <?php
      }
      
      else if($user != "aaron@aaron.com" && $password != "aaron123"){
       
        echo "<p>Usuario y contraseña incorrectos</p>";
        ?>
        <form action="index.html" method="post">
          <input type="submit" value="Probar de nuevo">
        </form>
        <?php
      }
      */

      
      ?>
      
  </body>
</html>