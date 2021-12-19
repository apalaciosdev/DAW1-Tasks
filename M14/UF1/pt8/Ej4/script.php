<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej4</title>
  </head>
  <body>
    <?php
      $inputTexto = strtolower($_POST['inputTexto']);
      
      function esVocal($inputTexto){
        $letrasTexto = str_split($inputTexto);
        $contador = 0;
      
        for ($i=0; $i < count($letrasTexto) ; $i++) { 
          if ($letrasTexto[$i] == "a" || $letrasTexto[$i] == "e" || $letrasTexto[$i] == "i" || $letrasTexto[$i] == "o" || $letrasTexto[$i] == "u") {
            $contador++;
          }
        }
        echo "<p>La cadena contiene " . $contador . " vocales.</p>";
      }


      esVocal($inputTexto);

    ?>
  </body>
</html>

