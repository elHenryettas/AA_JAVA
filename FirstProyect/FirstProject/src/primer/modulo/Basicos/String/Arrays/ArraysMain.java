package primer.modulo.Basicos.String.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        String nombre1 = "Henry";
        String nombre2 = "Osk";
        String nombre3 = "Gatinga";

        String[] nombres = new String[3];
        String[] nombres2 = new String[]{nombre1, nombre2, nombre3};
        int[] numeros = new int[5];
        Coche[] coches = new Coche[2];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
