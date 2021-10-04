<!DOCTYPE html>
<html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Práctica 2</title>
    <link rel="stylesheet" type="text/css" href="css/practica2.css" media="screen" />
  </head>


  <?php  
    // Creación color random para el BG
    $rand = array('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f');
    $color = '#'.$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)];
    
    // Array con todo el contenido de la tabla
    $valores = array(
      array("SERVER_PORT", $_SERVER['SERVER_PORT'], "Indica el puerto en el que se ejecuta el servidor."),
      array("DOCUMENT_ROOT", $_SERVER['DOCUMENT_ROOT'], "Indica el directorio raíz de documentos del servidor."),
      array("REMOTE_ADDR",$_SERVER['REMOTE_ADDR'], "Indica la dirección IP desde donde estás viendo la página."),
      array("SERVER_ADDR", $_SERVER['SERVER_ADDR'], "Indica la dirección IP desde de la página que estás viendo."),
      array("SERVER_NAME", $_SERVER['SERVER_NAME'], "Indica el nombre del HOST del servidor donde se está ejecutando la página."),
      array("SERVER_SIGNATURE",  $_SERVER['SERVER_SIGNATURE'], "Indica la versión y el nombre del Virtual Host Name."),
      array("SERVER_SOFTWARE", $_SERVER['SERVER_SOFTWARE'], "Indica la identificación del server."),
    );
    
    // Variables para enseñar la fecha actual, la fecha de creación y el nombre del autor
    $fechaActual = date('m/d/Y h:i:s', time());  
    $fechaCreacion = "10/04/2021";
    $nombreAutor = "Aaron Palacios Olea";
  ?>
  

  <body style="background-color: <?php echo $color; ?>;"> <!--Añadimos el color random generado como BG-->
 
    <img src="imagenes/logo.png" alt="logo">
    <h1>Práctica 2</h1>

    <table align="center">
      <thead>
        <tr>
          <?php //Añadimos este array como los cabezales de la tabla y lo incrustamos con foreach
            $array = array("Nombre ", "Valor ", "Descripción ");
            foreach ($array as $valor) {
              echo "<th> $valor </th>";
            }
          ?>
        </tr>
      </thead>

      <tbody>
        <?php //Añadimos los valores del array padre en la tabla usando un foreach
          foreach ($valores as $array) {
            echo "<tr>";
            foreach ($array as $contenido) {
              echo "<td> $contenido </td>";
            }
            echo "</tr>";
          }
        ?>
      </tbody>
    </table>

    <?php  //Imprimimos 3 variables
      echo "<p>Fecha actual: $fechaActual</p>";
      echo "<p>Fecha creación: $fechaCreacion</p>";
      echo "<p>Autor: <b>$nombreAutor</b></p>";
    ?>

  </body>

</html>