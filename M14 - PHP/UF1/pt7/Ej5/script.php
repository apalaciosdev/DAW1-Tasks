<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej5</title>
  </head>
  <body>
    <?php
      $meses = array("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre");

      $mes0 = $_POST['enero'];
      $mes1 = $_POST['febrero'];
      $mes2 = $_POST['marzo'];
      $mes3 = $_POST['abril'];
      $mes4 = $_POST['mayo'];
      $mes5 = $_POST['junio'];
      $mes6 = $_POST['julio'];
      $mes7 = $_POST['agosto'];
      $mes8 = $_POST['septiembre'];
      $mes9 = $_POST['octubre'];
      $mes10 = $_POST['noviembre'];
      $mes11 = $_POST['diciembre'];


      for ($i=0; $i < sizeof($meses); $i++) { 
        //Si no se introduce ningún valor
        if(${"mes" . $i} == null){
          ${"mes" . $i} = 0;
        }
        
        ?>
        <a><?=$meses[$i]?> (temperatura: <?=${"mes" . $i}?>ºC)</a>
        <?php

        for ($x=0; $x < ${"mes" . $i}; $x++) { 
          ?>
          <img src="limon.png" style="height: 15px; margin-right: -3px">
          <?php
        }
        ?>
          <br><br>
        <?php
      }
    ?>
  </body>
</html>