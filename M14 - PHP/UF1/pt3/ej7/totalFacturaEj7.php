<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej7</title>
  </head>
  <body>
    <?php
      $euros = $_POST['euros'];
      $iva = $_POST['iva'];

      echo "El total con I.V.A. es de: ", $euros - (($euros * $iva) / 100) ;
    ?>
  </body>
</html>