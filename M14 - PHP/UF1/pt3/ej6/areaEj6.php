<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej6</title>
  </head>
  <body>
    <?php
      $base = $_POST['base'];
      $altura = $_POST['altura'];

      echo "El área del triángulo és: ", ($base * $altura) / 2;
    ?>
  </body>
</html>