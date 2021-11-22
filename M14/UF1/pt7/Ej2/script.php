<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej2</title>
  </head>
  <body>
    <?php
      $numero1 = $_POST['numero1'];
      $numero2 = $_POST['numero2'];
      $numero3 = $_POST['numero3'];
      $numero4 = $_POST['numero4'];
      $numero5 = $_POST['numero5'];
      $numero6 = $_POST['numero6'];
      $numero7 = $_POST['numero7'];
      $numero8 = $_POST['numero8'];
      $numero9 = $_POST['numero9'];
      $numero10 = $_POST['numero10'];
      $numeros = array();
      
      
      for ($i=1; $i < 11; $i++) { 
        array_push($numeros, ${"numero" . $i});
        echo "Numero $i: " . ${"numero" . $i};
        echo "<br>";
        
      }

      echo "<br> <p style='float:left; margin-right: 20px;'>Número mínimo: " . min($numeros) . "</p>" ;
      echo "<p>Número máximo: " . max($numeros) . "</p>" ;
      ?>
  </body>
</html>