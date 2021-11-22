<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej2</title>
  </head>
  <body>
    <?php
  
      $numero1 = $_POST['numero1'];
      $numero2 = $_POST['numero2'];
      $array = unserialize($_POST['values_array']);
      
      for ($i=0; $i < 100; $i++) { 
        if($array[$i] == ($numero1)){
          $array[$i] = $numero2;
          ?>
          <a style="color:red;"><?=$array[$i]?>,</a>
          <?php
        }

        else{
          ?>
          <a><?=$array[$i]?>,</a>
          <?php
        }
      }
    ?>

  </body>
</html>