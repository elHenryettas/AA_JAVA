package uno.tiposyvariables;

public class Tipos {


    public static void main(String[] args) {

        //<tipo> <identificador> = <valor>
        //<tipo> <identificador>
        //<identificador> = <valor>

        //enteros
        byte number1 = 1; // 1 bytes
        short number2 = 2; // 2 bytes
        int number3 = 3; // 4 bytes
        long number4 = 4L; // 8 bytes

        //punto flotante
        float decimal1 = 1.4f;
        double decimal2 = 3.33d; //mayor capacidad que float

        //caracter
        char caracter1 = 'a';

        //boleanos
        boolean verdadero = true;
        boolean falso = false;

        //cadenas de texto
        String nombre = "Henry";
        String apellido = "Gatinga";

        //tipos envoltorios
        Integer numero = null;
        Long numero2 = 2L;
    }
}
