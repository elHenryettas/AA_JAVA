package primer.modulo.Funciones;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();
        holaName("Henryettas");

        System.out.println(devolverHola("Carla"));

    }
    //public se puede usar desde cualquier lado
    public static void holaMundo(){
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");

    }
    //protected solo funciona dentro de package, "uno.(...)" en este caso.
    protected static void holaName(String name){
        System.out.println("Hola " + name + ", Como estas?");
    }

    //private solo puede usarse desde la misma clase
     private static String devolverHola(String name){
        return "hola " + name;
    }

    private static int sum(int num1, int num2){
        return num1+num2;
    }
}
