package primer.modulo.EntradaSalida;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileInputStream;

public class EntradaSalidaMain {
    public static void main(String[] args) {
        try {
            boolean ok = false;
            do {
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Introduce 2 numeros: ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    ok = true;
                    System.out.println(num1+num2);
                } catch (InputMismatchException e) {
                    System.out.println("Datos invalidos");
                }
                
            }while(!ok);
            
        } catch (Exception e) {
            //TODO: handle exception
        }

        try {
            // ! crear archivo 
            PrintStream out = new PrintStream("saludame.js");
            out.print("const aviones = ['14','18','22','35']; console.log(aviones.map(avion => 'F-'+avion))");
            out.close();
            
        } catch (Exception e) {
            //TODO: handle exception
        }


       /*  try {
            InputStream fichero = new java.io.FileInputStream(
                "C:\\Users\\mocte\\Documents\\GitHub\\Book-Shop\\api\\Database");
            try {
                byte[] datos = fichero.readAllBytes();
                for (byte e : datos) {
                    System.out.println((char)e);
                }
                //! otra forma de leer
                // int datos = fichero.read();
                // while(datos != -1){
                //     System.out.println((char)datos);
                //     datos= fichero.read();
                // }
                //! forma de leer por partes
                // byte datos[] = new byte[5];
                // int dato = fichero.read(datos);
                // while(dato != -1){
                //     System.out.println((char)dato);
                //     dato = fichero.read(datos);
                // }

            } catch (Exception e) {
                //TODO: handle exception
            }
        } catch (FileNotFoundException e) {
           System.out.println("El programa da error " + e.getMessage());
        } */
    }
}
