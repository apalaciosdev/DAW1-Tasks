package PaqueteFunciones;

public class funcionesSaltos {

    public static float crearRandom(int tipo) {
        float randomNumber = 0;
        switch (tipo) {
            case 1: //Salto longitud
                randomNumber = (float) ((float) Math.floor(Math.random() * (9 - 1 + 1))) + 1;
                break;

            case 2: //Salto altura
                randomNumber = (float) ((float) Math.floor(Math.random() * (1.5 - 0.8 + 1)) + 0.8);
                break;

            case 3: //Salto pértiga
                randomNumber = (float) ((float) Math.floor(Math.random() * (6.3 - 3 + 1)) + 3);
                break;
            
            case 4: //Salto válido o no válido
                randomNumber = (float) ((float) Math.floor(Math.random() * (1 - 0 + 1)) + 0);
                break;

            default:
                break;
        }

        return randomNumber;
    }
    

    public static String checkIsValid(int tipo, float saltoIntroducido) {
        String message = "ok";
        switch (tipo) {
            case 1: //Salto longitud
                if(saltoIntroducido < 1 || saltoIntroducido > 9){
                    message = "Introduce un número del 1 al 9";
                }
                break;
                
            case 2: //Salto altura
                if(saltoIntroducido < 0.8 || saltoIntroducido > 1.5){
                    message = "Introduce un número del 0.8 al 1.5";
                }
                break;
                
            case 3: //Salto pértiga
                if(saltoIntroducido < 3 || saltoIntroducido > 6.3){
                    message = "Introduce un número del 3 al 6.3";
                }
                break;
            
            default:
                break;
        }

        return message;
    }

}
