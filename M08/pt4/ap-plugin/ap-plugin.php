<?php
/**
* Plugin Name: Aaron Palacios Plugin
* Plugin URI: http://localhost/wordpress/wp-content/plugins/ap-plugin/ap-plugin.php
* Description: El meu primer plug-in.
* Version: 1.0
* Author: Aaron Palacios Olea
* Author URI: http://www.github.com/apalaciosdev
*/


function textBottom() { 
    // echo '<div style="background: #CD2653; color: white; text-align: center;">My name is Jeff</div>'; 
    echo '<div style="background: #CD2653; color: white; text-align: center;"> ' . get_option('valor_footer') . '</div>';
  
}
add_action('wp_footer', 'textBottom'); 


function reverse_title( $title ) {
    return strrev ( $title );
}
add_filter( 'the_title', 'reverse_title' );





function plugin_menu_peu() {
	add_menu_page('Configuració de ap-plugin', 'Configuració
	de ap-plugin', 'manage_options', 'menu_config_peu',
	'crear_menu_peu');
}

add_action("admin_menu", "plugin_menu_peu");



function crear_menu_peu() {
	
	
	if($_POST && $_POST['textpeu']) {
		$text = $_POST['textpeu'];
		
		
		
		if(update_option('valor_footer', $text)) {
			echo '<p>El valor ha estat emmagatzemat</p>';
		} 
		
		else {
			echo '<p>
			No es va poder configurar el text del peu
			</p>';
		}
}
include('formulari-peu.php');
}


?>
