<?php
    include_once '../db/dbConfig.php';   

    $response = $_POST["g-recaptcha-response"];
    $user = $_POST['user'];
    $password = $_POST['password'];
    $tematica = $_POST['tematica'];

    $userName = "";
    $sql = "select * from usuaris where userName = '$user' and passWord = '$password';";
    $rec = mysqli_query($con, $sql);
    $isValid = 0;
    
    if(!empty($response)){
        $secret = "6Lc31PkdAAAAAN3cpitD03yEQth-JKDEJWby2pTK";
        $ip = $_SERVER['REMOTE_ADDR'];
        $respuestaValidación = file_get_contents("https://www.google.com/recaptcha/api/siteverify?secret=$secret&response=$response&remoteip=$ip");
    
        //Si queremos visualizar la información obtenida de la petición a la api de validación de Google para comprobar el estado de esta lo haremos con la función de PHP var_dump
        //var_dump($respuestaValidación);
    
        $jsonResponde = json_decode($respuestaValidación);
        if($jsonResponde->success){
            //entrará aquí cuando todo sea correcto	
            while($row = mysqli_fetch_array($rec)){
                $isValid++;
                $userName = $row['nom'] . " " . $row['cognom'];
                $userID = $row['id'];
                
                if($isValid == 1){
                    session_start();
                    $_SESSION['login-user'] = $userName;
                    
                    //hacemos un update de la última fecha de conexión del usuario
                    $sql = "UPDATE usuaris SET dataUltimaConnexio=NOW() WHERE id='$userID'";
                    if(mysqli_query($con, $sql)){
                        echo "New record created successfully";
                    } 
                    else {
                        echo "Error: " . $sql . "<br>" . mysqli_error($con);
                    }



                    if($tematica == "Mecánico"){
                        header("Location: ../pages/mecanico.php");
                    }

                    else if($tematica == "Bombero"){
                        header("Location: ../pages/bombero.php");
                    }

                    else if($tematica == "Policia"){
                        header("Location: ../pages/policia.php");
                    }

                    else if($tematica == "DataBase"){
                        header("Location: ../pages/database.php");
                    }
                }       
            }
                
            if($isValid == 0){
            echo "<p>Usuario o Contraseña incorrectos</p>";
            ?>
            <form action="../index.html" method="post">
                <input type="submit" value="Probar de nuevo">
                </form>
            <?php
            }
        }


        else{
            //Google ha detectado que se trata de un proceso no humano
            echo "error, no human behind the screen :(";
            exit();
        }
    }
    
    else{
        //si entra aquí significa que no se ha pulsado el Captcha
        echo "<p>No has validado el Captcha.</p>";
        ?>
        <form action="../index.html" method="post">
            <input type="submit" value="Probar de nuevo">
        </form>
        <?php
        exit();
    }
?>