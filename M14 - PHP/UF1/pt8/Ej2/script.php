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
      $frase = $_POST['frase'];
      $array = str_split($frase);
  //strrev
      function invertor($array){
        for ($i=count($array) -1; $i>=0; $i--) { 
          echo "<a>$array[$i]</a>";
        }
      }

      invertor($array);
    ?>
  </body>
</html>