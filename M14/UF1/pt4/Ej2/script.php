<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Ej2</title>
</head>
<body>
  <?php 
    $hora = $_POST['hora'];

    if($hora >= 6 && $hora <= 12){
      echo "<p>Buenos dias, son las $hora de la mañana</p>";
    }

    elseif($hora >= 13 && $hora <= 20){
      echo "<p>Buenas tardes, son las $hora de la tarde</p>";
    }

    elseif($hora >= 21 && $hora <= 23 || $hora >= 0 && $hora <= 5){
      echo "<p>Buenas noches, son las $hora de la noche</p>";
    }

    else{
      echo "<p>Has introducido una hora incorrecta</p>";
    }

  ?>
</body>
</html>