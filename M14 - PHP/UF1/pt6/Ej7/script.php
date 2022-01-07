<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej7</title>
  </head>
  <body>
    <?php
      $intentos = $_POST['intentos'];
      $numero = $_POST['numero'];
      $key = 1145;

      if($numero == $key){
        echo "<p>La caja fuerte se ha abierto satisfactoriamente.</p>";
      }

      else{
        if($intentos > 1){
          $intentos--; ?> 

          <p>Lo siento, esta no es la combinación. Quedan <?=$intentos?> intentos</p>
          <br>
          <p>Introduce la clave:</p>
          <form action="script.php" method="post">
            <input name="numero" type="number">
            <input type="hidden" name="intentos" value=<?=$intentos?>>
            <input type="submit" value="Continuar">
          </form>
          
          <?php
        }
        
        else{
          echo "<p>Lo siento, no hay más intentos disponibles.</p>";
        }
      }
      ?>
  </body>
</html>