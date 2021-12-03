<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link rel="stylesheet" href="./fitxers/css.css">
</head>
<body>
  <?php 
    $crew = array (
      array( "nombre" => "Homer", "foto" => "homer.png" , "homer.mp3"),
      array( "nombre" => "Bart", "foto" => "bart.png", "mp3" => "bart.mp3"),
      array( "nombre" => "Squanchy", "foto" => "squanchy.png", "mp3" => "squanchy.mp3")
    );
  ?>    
  <table>
  
  <?php
  foreach ($crew as $array) {
    echo "<tr>";
    foreach ($array as $contenido) {
      if(strpos($contenido, '.png') !== false){
        ?>
        <td><img src="./fitxers/<?=$contenido?>"></td>
        <?php 
      }

      else if(strpos($contenido, '.mp3') !== false){
        ?>
        <td>
        <audio controls>
          <source src="./fitxers/<?=$contenido?>" type="audio/mp3">
            Tu navegador no soporta audio HTML5.
          </audio>
        </td>
        <?php 
      }
      
      else{
        echo "<td> $contenido </td>";
        
      }
    }
    echo "</tr>";
  }
  ?>
  </table>
  
</body>
</html>