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
    $nota1 = $_POST['numero1'];
    $nota2 = $_POST['numero2'];
    $nota3 = $_POST['numero3'];

    $calculo = (($nota1 + $nota2 + $nota3) / 3);

    echo "<p>La media es: $calculo</p>"
  ?>
</body>
</html>