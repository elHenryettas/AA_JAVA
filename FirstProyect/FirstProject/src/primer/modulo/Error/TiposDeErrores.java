package primer.modulo.Error;

import java.io.IOException;
import java.util.Scanner;
// Error en runtime o compilacion /* 5 0; Error runtime o tiempo de compilacion */
// Errores por compilacion(Ejemplo: terminar una variable sin ";") 
// Error humano o error logico(el peor)

// Suprimir un warning


public class TiposDeErrores {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Introduce 2 numeros: ");
        // int num1 = scanner.nextInt();
        // int num2 = scanner.nextInt();

        // try {
        //     System.out.println("El resultado de la division es: " + num1 / num2); 
        // } catch (ArithmeticException e) {
        //     System.out.println("Primer catch: "+ e.getCause());
        // } catch (Exception e) {
        //     System.out.println("Estoy en una excepcion que no es aritmérica"+ e.getClass());
        // } finally{
        //     System.out.println("Finally");
        // }

        //! dividir(6,0);
      /* t ry {
            dividir(6,0);
        }  catch (Exception e) {
            System.out.println("eee");
        } */
    }

    public static int dividir(int A, int B) throws ArithmeticException, IOException {
        try {
            int resultado = A / B;
            return resultado;    
        } catch (Exception e) {
            throw new IOException();
        }
    }
}
