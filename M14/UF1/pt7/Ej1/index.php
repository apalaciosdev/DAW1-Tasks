<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej1</title>
    <style>
      table, tr, td{
        border: 1px solid black;
        border-collapse: collapse;
        padding: 10px;
      }
      thead{
        background-color: grey;
        color: white;
      }
    </style>
  </head>

  <body>
    <table>
      <thead>
        <td>Número</td>
        <td>Cuadrado</td>
        <td>Cubo</td>
      </thead>

      <tbody>
        <?php 
          $numero = array();
          $cuadrado = array();
          $cubo = array();

          for ($i=0; $i < 20; $i++) { //Añadimos los 20 valores random a cada array
            $num_aleatorio = rand(1,100);
            array_push($numero ,$num_aleatorio);
            array_push($cuadrado ,($num_aleatorio * $num_aleatorio));
            array_push($cubo ,($num_aleatorio * $num_aleatorio * $num_aleatorio));
          }

          for ($x=0; $x < 20; $x++) { 
            ?>
              <tr>
                <td><?php echo $numero[$x]?></td>
                <td><?php echo $cuadrado[$x]?></td>
                <td><?php echo $cubo[$x]?></td>
              </tr>
              <?php
          }  ?>
      </tbody>
    </table>
      
  </body>
</html>