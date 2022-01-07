<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Ej1</title>
</head>
<body>
  <?php 
    $inputDia = $_POST['dia'];
    $dia = strtolower($inputDia);
    
    if($dia == 'lunes'){
      echo "<p>El $dia a primera hora toca M14</p>";
    }

    elseif($dia == 'martes'){
      echo "<p>El $dia a primera hora toca M01</p>";
    }
    
    else if($dia == 'miercoles'){
      echo "<p>El $dia a primera hora no hay clase, pero a segunda hora toca M03</p>";
    }
    
    elseif($dia == 'jueves'){
      echo "<p>El $dia a primera hora toca M08</p>";
    }
    
    elseif($dia == 'martes'){
      echo "<p>El $dia a primera hora toca M010</p>";
    }

    elseif($dia == 'sabado' || $dia == 'domingo'){
      echo "<p>Los fines de semana no hay clase</p>";
    }

    else{
      echo "<p>Has escrito mal el dia de la semana</p>";
    }
  ?>
</body>
</html>