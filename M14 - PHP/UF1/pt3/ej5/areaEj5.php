<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej5</title>
  </head>
  <body>
    <?php
      $largo = $_POST['largo'];
      $ancho = $_POST['ancho'];

      echo "El área del rectángulo és: ", ($largo * $ancho);
    ?>
  </body>
</html>