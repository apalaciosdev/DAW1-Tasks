<?php
    include_once '../db/dbConfig.php';   
    include("./userValidation.php");

    $response = $_POST["g-recaptcha-response"];
    $user = $_POST['user'];
    $password = $_POST['password'];
    $tematica = $_POST['tematica'];

    
    if(!empty($response)){
        $secret = "6Lc31PkdAAAAAN3cpitD03yEQth-JKDEJWby2pTK";
        $ip = $_SERVER['REMOTE_ADDR'];
        $validationRequest = file_get_contents("https://www.google.com/recaptcha/api/siteverify?secret=$secret&response=$response&remoteip=$ip");
        $jsonResponse = json_decode($validationRequest);
    
        //Si queremos visualizar la información obtenida de la petición a la api de validación de Google para comprobar el estado de esta lo haremos con la función de PHP var_dump
        //var_dump($validationRequest);
    
        

        //Si el usuario pasa el Captcha...
        if($jsonResponse->success){
            //Llamamos a la función que valida el user
            userValidation($user, $password, $tematica, $con);
        }

        //Si no lo pasa
        else{
            //Google ha detectado que se trata de un proceso no humano
            echo "error, no human behind the screen :(";
            exit();
        }
    }
    
    else{
        //Si no pulsa el Captcha
        echo "<p>No has validado el Captcha.</p>";
        ?>
        <form action="../index.html" method="post">
            <input type="submit" value="Probar de nuevo">
        </form>
        <?php
        exit();
    }
?>