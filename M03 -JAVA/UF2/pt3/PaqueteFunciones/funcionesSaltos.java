package PaqueteFunciones;

public class funcionesSaltos {
  public static float crearRandom(int tipo){
    float randomNumber = 0;
    switch (tipo) {
        case 1:
            randomNumber = (float) ((float)Math.floor(Math.random() * (9 - 1 + 1)))+1;
            break;
            
            case 2:
            randomNumber = (float) ((float) Math.floor(Math.random() * (1.5 - 0.8 + 1)) + 0.8);
            break;
            
        case 3:
            randomNumber = (float) ((float) Math.floor(Math.random() * (6.3 - 3 + 1)) + 3);    
            break;
    
        default:
            break;
    }

    return randomNumber;
}


}
