<?php
/*--------- HEADER --------------*/
get_header();
/*--------- LOOP -------------*/
// loop.
while (have_posts()) :
  the_post();
  the_title();
  the_content('Continua leyendo...', get_the_title());
endwhile;
/*--------- SIDEBAR -------------*/
get_sidebar();
/*--------- FOOTER -------------*/
get_footer();
