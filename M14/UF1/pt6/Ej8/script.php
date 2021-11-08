<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ej8</title>
    <style>
      table{
        border: 1px solid black;
      }
    </style>
  </head>
  <body>
    <?php 
      $numero = $_POST['numero'];
      $i = 0; 
    ?>
    
    <table align="center">
      <thead>
        <th>Tabla del <?=$numero?></th>
      </thead>

      <tbody>   
          <?php 
            while($i <= 10){ ?>
              <tr>
                <td><?php echo "$numero x $i"?></td>
                <td><?=($numero * $i)?></td>
              </tr>
              
              <?php $i ++;
            }
          ?>
      </tbody>
    </table>
  </body>
</html>