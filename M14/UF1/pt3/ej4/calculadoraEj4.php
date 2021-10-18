<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej4</title>
  </head>
  <body>
    <?php
      $n1 = $_POST['n1'];
      $n2 = $_POST['n2'];

      echo "$n1 + $n2 = ", $n1 + $n2 , "<br>";
      echo "$n1 - $n2 = ", $n1 - $n2 , "<br>";
      echo "$n1 x $n2 = ", $n1 * $n2 , "<br>";
      echo "$n1 / $n2 = ", $n1 / $n2 , "<br>";
    ?>
  </body>
</html>