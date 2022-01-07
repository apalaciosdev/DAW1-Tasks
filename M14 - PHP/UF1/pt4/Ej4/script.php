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
    $horas = $_POST['numero'];

    if($horas <= 40){
      $total = $horas * 12;
      echo "<p>El salario total es $total euros.</p>";
    }

    elseif($horas > 40){
      $extra = $horas - 40;
      $total1 = 12 * 40 + $extra * 16;
      echo "<p>El salario total es $total1 euros.</p>";
    }
  ?>
</body>
</html>