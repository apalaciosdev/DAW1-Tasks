<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej1</title>
  </head>
  <body>
    <?php 
      for ($i=0; $i<101; $i++) { 
        if($i % 5==0){
          echo "<p>El número $i és múltiplo de 5.</p>";
        }
      };
    ?>
  </body>
</html>