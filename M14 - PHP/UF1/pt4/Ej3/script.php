<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Ej3</title>
</head>
<body>
  <?php 
    $numero = $_POST['numero'];

    if($numero == 1){
      echo "<p>Lunes</p>";
    }

    elseif($numero == 2){
      echo "<p>Martes</p>";
    }

    elseif($numero == 3){
      echo "<p>Miercoles</p>";
    }

    elseif($numero == 4){
      echo "<p>Jueves</p>";
    }

    elseif($numero == 5){
      echo "<p>Viernes</p>";
    }

    elseif($numero == 6){
      echo "<p>Sabado</p>";
    }

    elseif($numero == 7){
      echo "<p>Domingo</p>";
    }

    else{
      echo "<p>El número tiene que estar entre el 1 y el 7. Introduce otro.</p>";
    }

  ?>
</body>
</html>