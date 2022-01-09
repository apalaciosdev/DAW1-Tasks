<?php

function userValidation($user, $password, $tematica, $con){

    $userName = "";
    $sql = "select * from usuaris where userName = '$user' and passWord = '$password';";
    $rec = mysqli_query($con, $sql);
    $isValid = 0;


    //Validamos que el usuario y la contraseá coincidan con algún usuario de la base de datos
    while ($row = mysqli_fetch_array($rec)) {
        $isValid++;
        $userName = $row['nom'] . " " . $row['cognom'];
        $userID = $row['id'];


        //Si tenemos coindicencia...
        if ($isValid == 1) {
            session_start();
            $_SESSION['login-user'] = $userName;


            //Hacemos un update de la última fecha de conexión del usuario
            $sql = "UPDATE usuaris SET dataUltimaConnexio=NOW() WHERE id='$userID'";
            if (mysqli_query($con, $sql)) {
                echo "<p>Fecha registrada con éxtio</p>";
            } else {
                echo "<p>Error: " . $sql . "</p>" . mysqli_error($con);
            }


            //Redirigimos al usuario a la página deseada
            switch ($tematica) {
                case 'Mecánico':
                    header("Location: ../pages/mecanico.php");
                    break;

                case 'Bombero':
                    header("Location: ../pages/bombero.php");
                    break;

                case 'Policia':
                    header("Location: ../pages/policia.php");
                    break;

                case 'DataBase':
                    header("Location: ../pages/database.php");
                    break;

                default:
                    break;
            }
        }
    }


    //En caso de que no tengamos coincidencia...
    if ($isValid == 0) {
        echo "<p>Usuario o Contraseña incorrectos</p>";
        ?>
        <form action="../index.html" method="post">
            <input type="submit" value="Probar de nuevo">
        </form>
        <?php
    }
}

?>