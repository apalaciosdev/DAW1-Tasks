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
      $catetoA = $_POST['catetoA'];
      $catetoB = $_POST['catetoB'];
    
      function calculoHipotenusa($catetoA, $catetoB){
        $hipotenusa=sqrt(pow($catetoA, 2) + pow($catetoB, 2));       

        return $hipotenusa;
      }

      echo calculoHipotenusa($catetoA, $catetoB);
    ?>
  </body>
</html>
