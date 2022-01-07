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

      $array = array();
      $arrayPares = array();
      $arrayImpares = array();


      
      ?>
      <h3>Array Original</h3>
      <?php
      for ($i=0; $i < 21; $i++) { 
        $num_aleatorio = rand(1,100);
        array_push($array, $num_aleatorio);
        ?>
        <a><?=$array[$i]?>,</a>
        <?php

        if($array[$i] % 2 == 0){
          array_push($arrayPares, $array[$i]);
        }

        else{
          array_push($arrayImpares, $array[$i]);
        }
      }



      ?>
      <br><br><br> <h3>Array Reordenada</h3>
      <?php

      $array = array_merge_recursive($arrayPares, $arrayImpares);
     
      
      for ($i=0; $i < 21; $i++){
        if($array[$i] % 2 == 0){
          ?>
          <a style="color:red;"><?=$array[$i]?>,</a>
          <?php
        }

        else{
          ?>
          <a style="color:blue;"><?=$array[$i]?>,</a>
          <?php
        }
      }
      ?>
  </body>
</html>