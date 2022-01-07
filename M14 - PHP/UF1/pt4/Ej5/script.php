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
    $a = $_POST['numero1'];
    $b = $_POST['numero2'];

    $x = ((-$b) / $a);

    echo "<p>El resultado es $x</p>"
  ?>
</body>
</html>