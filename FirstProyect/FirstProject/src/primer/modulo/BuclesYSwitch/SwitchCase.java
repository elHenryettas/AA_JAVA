package primer.modulo.BuclesYSwitch;

public class SwitchCase {
    public static void main(String[] args) {
        String weather =  "rainy";
        switch (weather){
            case "sunny":
                System.out.println("el cielo es soleado");
                break;
            case "cloudy":
                System.out.println("el cielo es nublado");
                break;
            case "rainy":
                System.out.println("esta lloviendo");
                break;
            default:
                System.out.println("no se ha podido identificar el clima");
        }
    }
}
