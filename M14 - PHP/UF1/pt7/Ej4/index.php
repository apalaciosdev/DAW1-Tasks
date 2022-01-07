<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej4</title>
  </head>
  <body>
    <?php
      $array = array();
  
      for ($i=0; $i < 100; $i++) { 
        $num_aleatorio = rand(1,20);
        array_push($array, $num_aleatorio);
        ?>
        <a><?=$array[$i]?></a>;
        <?php
      }
      ?>

      <p>Introduce los números: </p>
      <form action="script.php" method="post">
        <label for="numero1">Número 1</label>
        <input name="numero1" type="number"><br><br>

        <label for="numero2">Número 2</label>
        <input name="numero2" type="number"><br><br>

        <input type="hidden" readonly name="values_array" value="<?php echo serialize($array) ?>">
      
        <input type="submit" value="Pasar array">

      </form>
  </body>
</html>