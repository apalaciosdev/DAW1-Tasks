<?php 
  include_once '../db/dbConfig.php';
?>

<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DataBase</title>
    <link rel="stylesheet" href="../styles/database.css">
  </head>

  <body>
    <h1>DataBase</h1>

    <form action="../helpers/logout.php" method="post">
        <input type="submit" value="Logout">
    </form>  

    <?php 
      session_start();
      $user = $_SESSION["login-user"];
      echo "<p>Bienvenido <span>$user</span> a la sección de database!</p>";
      
      $result = mysqli_query($con, "select * from usuaris;");
      $name = mysqli_query($con, "show columns from usuaris;");
    ?>

    <table>
      <?php
        $row_cnt = $result -> num_rows; //Mostramos cuantas filas hay en la BD
        echo "Total filas por mostrar: " . $result -> num_rows;
        
        echo "<tr>";
        while($row = mysqli_fetch_array($name)){
          echo "<th>" . $row['Field'] . "</th>"; //Mostramos el nombre de la columna
        }
        echo "</tr>";
        

        for ($i=0; $i < $row_cnt; $i++) { 
          while ($registre = mysqli_fetch_array($result, MYSQLI_ASSOC)) {
            echo "<tr>";
            //Mostramos todos los campos de la file
            foreach ($registre as $col_value) {
            echo "<td>$col_value</td>";
          }

          echo "</tr>";  
          }
        }
      ?>
    </table>
  </body>
</html>