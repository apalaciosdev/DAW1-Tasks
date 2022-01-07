import java.util.*;
import java.lang.*;


public class Act2_apalacios {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);   
        Scanner teclado2 = new Scanner(System.in);   
        teclado2.useDelimiter("\n");
        
        int respuesta = 0;
        boolean value = true;
        
        String Pelis[]={"CLIMAX", "LAPLACE'S WITCH", "KEEPERS", "BURNING", "FIRST LOVE"};
        String Directores[]={"GASPAR NOÉ", "TAKASHI MIIKE", "KRISTOFFER NYHOLM", "LEE CHANG-DONG", "TAKASHI MIIKE"};
        int Taquilla[]={2036044, 10973306, 1202522, 7578063, 5567534};
        //int Taquilla[]={1202522, 2036044, 5567534, 7578063, 10973306 };


     
        String PelisCopia[] = new String[Pelis.length];
        String DirectoresCopia[] = new String[Directores.length];
        int TaquillaCopia[] = new int[Taquilla.length];


        
        while(value){
            System.out.println("\n\n-------Introduce la operación deseada-------" + 
                                "\n  1.- Modificar datos" + 
                                "\n  2.- Consultar datos" + 
                                "\n  3.- Filtrar datos" + 
                                "\n  4.- Salir del programa" + 
                                "\n\nSelecciona un número");

            respuesta = teclado.nextInt();



            //OPERACIÓN 1
            if(respuesta == 1){
                System.out.println("Introduce la pelicula que deseas modificar (1, 2, 3, 4 o 5)");
                int peliParaModificar = teclado.nextInt();

                System.out.println("Pelicula a modificar: " + Pelis[(peliParaModificar -1)] + " - " + Directores[(peliParaModificar -1)] + " - " + Taquilla[(peliParaModificar -1)]);
               
                System.out.println("Introduce el nombre de la película: ");
                Pelis[(peliParaModificar -1)] = teclado.next();


                System.out.println("Introduce el director de la película: ");
                Directores[(peliParaModificar -1)] = teclado.next();
                
                System.out.println("Introduce la taquilla de la película: ");
                Taquilla[(peliParaModificar -1)] = teclado.nextInt();

                System.out.println("Pelicula a modificar: " + Pelis[(peliParaModificar -1)] + " - " + Directores[(peliParaModificar -1)] + " - " + Taquilla[(peliParaModificar -1)]);
            }



            //OPERACIÓN 2
            else if(respuesta == 2){
                Boolean existeDirector = false;
                int posicionDirector = 0;
                Boolean existePeli = false;
                int posicionPeli = 0;
                

    
                System.out.println("\n\n-------¿Qué deseas consultar?-------" + 
                                    "\n  1.- Nombre del director" + 
                                    "\n  2.- Nombre de la pelicula" +  
                                    "\n\nSelecciona un número");
    
                int respuestaOp2 = teclado.nextInt();


                
                System.out.println("Introduce el nombre a consultar: ");
                String nombreAModificar = teclado2.next().toUpperCase().trim();
                
                
                if(respuestaOp2 == 1){
                    
                    for(int x = 0; x < Directores.length; x++){                   
                        if(Directores[x].equals(nombreAModificar)){
                            existeDirector = true;
                            posicionDirector = x;
                        }   
                    }

                    if(existeDirector){
                        System.out.println("¡Datos encontrados! -> " + Pelis[posicionDirector] + " - " + Directores[posicionDirector] + " - " + Taquilla[posicionDirector]);                   
                    }
                    
                    else{
                        System.out.println("Los datos no coinciden con ningún campo");                        
                    }
                }

                
                else if(respuestaOp2 == 2){
                    for(int x = 0; x < Pelis.length; x++){
                        if(Pelis[x].equals(nombreAModificar)){
                            existePeli = true;
                            posicionPeli = x;
                        }   
                    }

                    if(existePeli){
                        System.out.println("¡Datos encontrados! -> " + Pelis[posicionPeli] + " - " + Directores[posicionPeli] + " - " + Taquilla[posicionPeli]);                   
                    }
                    
                    else{
                        System.out.println("Los datos no coinciden con ningún campo");                        
                    }
                }
            }



            //OPERACIÓN 3
            else if(respuesta == 3){
                System.arraycopy(Pelis, 0, PelisCopia, 0, Pelis.length);
                System.arraycopy(Directores, 0, DirectoresCopia, 0, Directores.length);
                System.arraycopy(Taquilla, 0, TaquillaCopia, 0, Taquilla.length);
                int contadorA0 = 0;

                System.out.println("Introduce la cantidad total: ");
                int cantidadTaquilla = teclado.nextInt();

                for(int z = 0; z < TaquillaCopia.length; z++){
                    if(TaquillaCopia[z] < cantidadTaquilla){
                        contadorA0 ++;
                    }
                }     

                for(int i = 0; i < TaquillaCopia.length; i++){
                    if(TaquillaCopia[i] < cantidadTaquilla){
                        TaquillaCopia[i] = 0;
                        
                        for(int j = i; j < TaquillaCopia.length -1; j++){
                            int temporal = TaquillaCopia[j];
                            TaquillaCopia[j] = TaquillaCopia[j+1];
                            TaquillaCopia[j+1] = temporal;
        
                            String temporalDirectores = DirectoresCopia[j];
                            DirectoresCopia[j] = DirectoresCopia[j+1];
                            DirectoresCopia[j+1] = temporalDirectores;
        
                            String temporalPelis = PelisCopia[j];
                            PelisCopia[j] = PelisCopia[j+1];
                            PelisCopia[j+1] = temporalPelis;   
                        }
                    }
                }
    
                int TaquillaCopiaRange[] = Arrays.copyOfRange(TaquillaCopia, 0, (TaquillaCopia.length -contadorA0));
                String DirectoresCopiaRange[] = Arrays.copyOfRange(DirectoresCopia, 0, (DirectoresCopia.length -contadorA0));
                String PelisCopiaRange[] = Arrays.copyOfRange(PelisCopia, 0, (PelisCopia.length -contadorA0));

                
                for(int i = 0; i < TaquillaCopiaRange.length; i++){
                    System.out.println("· "+ TaquillaCopiaRange[i] + " - " + PelisCopiaRange[i] + " - " + DirectoresCopiaRange[i]);
                }
                
                
            }
            


            //OPERACIÓN 4
            else if(respuesta == 4){
                value = false;
            }


            
            //OPERACIÓN NO VÁLIDA
            else{
                System.out.println("\n\n----------------------------------------------------------");
                System.out.println("Operación seleccionada no válida. Selecciona otra de nuevo");
                System.out.println("----------------------------------------------------------");
            }
        }



        System.out.println("\n\n---------------- FIN DEL PROGRAMA ----------------");
        System.out.println("----------------- Aaron Palacios -----------------");
    }
}

            /*
            for(int i = 0; i < Taquilla_v2.length; i++){
                if(Taquilla_v2[i] < cantidadTaquilla){
                    Taquilla_v2[i] = 0;
                }

                for(int j = i; j < Taquilla_v2.length -1; j++){
                    int temporal = Taquilla_v2[j];
                    Taquilla_v2[j] = Taquilla_v2[j+1];
                    Taquilla_v2[j+1] = temporal;

                    String temporalDirectores = Directores_v2[j];
                    Directores_v2[j] = Directores_v2[j+1];
                    Directores_v2[j+1] = temporalDirectores;

                    String temporalPelis = Pelis_v2[j];
                    Pelis_v2[j] = Pelis_v2[j+1];
                    Pelis_v2[j+1] = temporalPelis;
                    
                }
            }

            for(int i = 0; i < Taquilla_v2.length; i++){
                System.out.println("# "+ Taquilla_v2[i] + " - " + Pelis_v2[i] + " - " + Directores_v2[i]);
         
            }*/