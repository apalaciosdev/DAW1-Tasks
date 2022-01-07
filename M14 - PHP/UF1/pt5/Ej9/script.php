<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej9</title>
  </head>
  <body>
    <?php 
      $numero = $_POST['numero'];
      
      // método simple ;)
      echo "<p>Tu número tiene " . strlen($numero) . " dígito/s. (SIN BUCLE)</p>";
     
      

      //método con bucle
      $length = 0;
      do {
        $numero = floor($numero / 10);
        $length ++;

      } while ($numero > 0);
      
      echo "<p>Tu numero tiene $length dígito/s.  (CON BUCLE)</p>";   
    ?>
  </body>
</html>