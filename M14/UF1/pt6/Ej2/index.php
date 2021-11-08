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
      $i=0;
      while($i<101){
        if($i % 5==0){
          echo "<p>El número $i és múltiplo de 5.</p>";
        }
        $i++;
      }
    ?>
  </body>
</html>