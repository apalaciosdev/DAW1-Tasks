<?php
add_action( 'wp_enqueue_scripts', 'my_theme_enqueue_styles'
);
function my_theme_enqueue_styles() {
wp_enqueue_style( 'parent-style',
get_template_directory_uri() . '/style.css' );
}

function printHead(){
echo '<meta name="description" content="descripció bàsica del lloc">';
}

add_action('wp_head', 'printHead');


?>
