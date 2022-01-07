<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej6</title>
  </head>
  <body>
    <?php
      $numero1 = $_POST['numero1'];
      $numero2 = $_POST['numero2'];
      $numero3 = $_POST['numero3'];
      $numero4 = $_POST['numero4'];
      $numero5 = $_POST['numero5'];
      $numero6 = $_POST['numero6'];
      $numero7 = $_POST['numero7'];
      $numero8 = $_POST['numero8'];

      for ($i=1; $i < 9; $i++) { 
        if(${"numero" . $i} % 2 == 0){
          ?>
          <a style="color:red;"><?=${"numero" . $i}?>,</a>
          <?php
        }

        else{
          ?>
          <a style="color:blue;"><?=${"numero" . $i}?>,</a>
          <?php
        }

      }
    ?>
  </body>
</html>