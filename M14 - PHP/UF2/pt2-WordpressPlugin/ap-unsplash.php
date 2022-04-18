<?php
/**
* Plugin Name: Aaron Palacios Unsplash Plugin
* Plugin URI: http://localhost/wordpress/wp-content/plugins/ap-unsplash/ap-unsplash.php
* Description: Unsplash Plugin
* Version: 1.0
* Author: Aaron Palacios Olea
* Author URI: http://www.github.com/apalaciosdev
*/


//AÑADIR RECURSOS
function themeslug_enqueue_style() {
    wp_enqueue_style( 'my-theme', '/wp-content/plugins/ap-unsplash/style.css', false );
}
 
function themeslug_enqueue_script() {
    wp_enqueue_script('myscript', plugins_url('main.js', __FILE__),"","",true);
}
 
add_action( 'wp_enqueue_scripts', 'themeslug_enqueue_style' );
add_action( 'wp_enqueue_scripts', 'themeslug_enqueue_script' );



//HACER PETICIÓN GET HTTP
function getData(){
	$apiKey = get_option('apiKey');
	$photoTag = get_option('photoTag');
	
	$url = "https://api.unsplash.com/search/photos?page=1&query=" . $photoTag . "&client_id=" . $apiKey;
	
	$response = file_get_contents($url);

	$data = json_decode($response, true);
	
	return $data;
}



//CREAR GALERIA
add_action( 'template_redirect', 'return_galeria', 10 );
function return_galeria(){

	global $template;
  $template_file = basename((__FILE__).$template);
    
	// Comprobamos que nos encontremos en el home
	if ( is_home() && $template_file = 'home.php' ) {
	
		// Una vez cargada la etiqueta del body, generamos la galeria
		add_action( 'wp_body_open', 'crearGaleria' );
		
		function crearGaleria() {
			$ApiData = getData();
			?>
			<div class="slideshow-container">
				
				<?php
					for($i=1; $i<=9; $i++){
						echo "<div class='mySlides fade'>";
						echo "<div class='numbertext'>" . $i .  "/ 10</div>";
						echo "<img src='" . $ApiData["results"][$i]["urls"]["regular"] . "' style='width:100%'>";
						//echo "<div class='text'>Caption Text</div>";
						echo "</div><br>";
					};
				?>
				
				<a class="prev" onclick="plusSlides(-1)">❮</a>
				<a class="next" onclick="plusSlides(1)">❯</a>
				
			</div>
			<br>
			
			<div style="text-align:center">
			  <span class="dot" onclick="currentSlide(1)"></span> 
			  <span class="dot" onclick="currentSlide(2)"></span> 
			  <span class="dot" onclick="currentSlide(3)"></span> 
			  <span class="dot" onclick="currentSlide(4)"></span> 
			  <span class="dot" onclick="currentSlide(5)"></span> 
			  <span class="dot" onclick="currentSlide(6)"></span>
			  <span class="dot" onclick="currentSlide(7)"></span> 
			  <span class="dot" onclick="currentSlide(8)"></span> 
			  <span class="dot" onclick="currentSlide(9)"></span>
			  <span class="dot" onclick="currentSlide(10)"></span>
			</div>
			<?php
		}
  }
  
}




//CREAR MENÚ CONFIGURACIÓN
function plugin_menu_peu() {
	add_menu_page('Unsplash plugin', 'Unsplash plugin', 'manage_options', 'menu_config_peu', 'crear_menu_peu');
}

add_action("admin_menu", "plugin_menu_peu");



function crear_menu_peu() {

	//Recibimos el parámetro de la API Key del formulario
	if($_POST && $_POST['apiKey']) {
		$text = $_POST['apiKey'];
		
		if(update_option('apiKey', $text)) {
			echo '<p>El API Key se ha almacenado</p>';
		} 
		
		else {
			echo '<p>
			No se ha podido almacenar el API Key
			</p>';
		}
	}
	
	
	//Recibimos el parámetro tag del formulario
	if($_POST && $_POST['photoTag']) {
		$text = $_POST['photoTag'];
		
		if(update_option('photoTag', $text)) {
			echo '<p>El tag se ha almacenado</p>';
		} 
		
		else {
			echo '<p>
			No se ha podido almacenar el tag
			</p>';
		}
	}
include('formulari.php');
}

?>