<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej3</title>
  </head>
  <body>
  <?php
   $num= array(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15); 
   $rotar= array_pop($num); array_unshift($num,$rotar); 
   foreach($num as $num){ 
     echo "$num, "; } ?> 
  </body>
</html>