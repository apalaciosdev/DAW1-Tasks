<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej1</title>
  </head>
  <body>
    <?php
      $notas = array(
        /*[0] MATES*/      array("Raichu" => 10, "Vulpix" => 2, "Umbreon" => 5, "Entei" => 3.4, "Skitty" => 6.5, "Misdreavus" => 8.7, "Absol" => 2.1, "Espeon" => 9.2, "Butterfree" => 6, "Suicune" => 4),
        /*[1] INGLES*/     array("Raichu" => 3, "Vulpix" => 3.4, "Umbreon" => 10, "Entei" => 1.1, "Skitty" => 3.4, "Misdreavus" => 7.8, "Absol" => 5.6, "Espeon" => 5.3, "Butterfree" => 9.8, "Suicune" => 6.5),
        /*[2] FILOSOFIA*/  array("Raichu" => 6, "Vulpix" => 8, "Umbreon" => 8, "Entei" => 0.2, "Skitty" => 5.4, "Misdreavus" => 6.7, "Absol" => 4.7, "Espeon" => 5.4, "Butterfree" => 5.6, "Suicune" => 9.4)
      );  
      

      function mejorNotaIngles($notas){
        echo "<p>La nota máxima de la asignatura de inglés es: " . max($notas) . "</p>";
      }
      
      
      function peorNotaFilosofia($notas){
        echo "<p>La nota más baja de la asignatura de filosofía es: " . min($notas) . "</p>";
      }


      function mediaAritmeticaIngles($notas){
        echo "<p>La media aritmética de las notas de inglés es: " . (array_sum($notas)/sizeof($notas)) . "</p><br>";
      }


      function nombreAprovadosMates($notas){
        echo "<h2>Alumnos aprobados</h2>";
        foreach ($notas as $nombre => $nota) {
          if($nota > 4.9){
            echo "<p>Alumno: $nombre  -  Nota: $nota</p>";
          }
        }
      }



      mejorNotaIngles($notas[1]);
      peorNotaFilosofia($notas[2]);
      mediaAritmeticaIngles($notas[1]);
      nombreAprovadosMates($notas[0]);



      /*
      foreach ($notas as $materia => $resultados) {
        echo "<h1>asignatura: $materia</h1>";

        foreach ($resultados as $nombre => $nota) {
          echo "<p>$nombre: $nota</p>";
        }
      }
      */
    ?>
  </body>
</html>
