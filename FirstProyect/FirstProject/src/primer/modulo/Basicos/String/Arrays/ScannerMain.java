package primer.modulo.Basicos.String.Arrays;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine();

        System.out.println("El nombre introducido es: " + nombre);
    }
}
