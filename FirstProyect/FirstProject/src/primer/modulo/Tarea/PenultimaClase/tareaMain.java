package primer.modulo.Tarea.PenultimaClase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class tareaMain {

    public static void main(String[] args) {
        reverse();
    }
    public static void reverse() {
        // 1ra consigna
        System.out.println("1ra consigna");
        String[] uniString = {"Henry", "Osk", "Juan", "Daniel"};
        for (String string : uniString) {
            System.out.println(string);
        }
        // 2da consigna
        System.out.println("2da consigna");
        String[][] biString = {{"Mazda"}, {"Toyota", "BMW", "Nissan"}, {"Ford", "Mitsubishi"}};
        for (int i = 0; i < biString.length; i++) {
            for (int j = 0; j < biString[i].length; j++) {
                System.out.println("Valor: " + biString[i][j] + ". Se encuentra en la posicion ["+ i + "][" + j +"]");
            }
        }       
        // 3ra consigna 
        System.out.println("3ra consigna");
        Vector<Integer> vectorInt = new Vector(10, 10);
        vectorInt.add(1);
        vectorInt.add(2);
        vectorInt.add(3);
        vectorInt.add(4);
        vectorInt.add(5);
        vectorInt.remove(1); /* [1,2←,3,4,5] */
        vectorInt.remove(1); /* [1,3←,4,5] */
        System.out.println("Vector: " + vectorInt); /* [1,4,5] */

        // 4ta consigna 
        String why1 = "La razon por la cual hay que tener bien administrados y";
        String why2 = " y hacer un analisis previo a la cantidad inicial y exponencial";
        String why3 = " de elementos que va a tener un vector, es porque la manera de aumentar";
        String why4 = " la capacidad en un vector es creando un nuevo array en memoria y trasladar";
        String why5 = " todos los elementos del viejo, al nuevo array con mas";
        String why6 = " capacidad, esto, mal administrado, genera un gran cosumo de recursos.";
        System.out.println(why1+why2+why3+why4+why5+why6);

        // 5ta consigna
        System.out.println("4ta consigna");
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("Oreo");
        arrayListString.add("Pepito");
        arrayListString.add("Rex");
        arrayListString.add("Agua");
        
        LinkedList<String> linkedListString = new LinkedList<>();
        linkedListString.addAll(arrayListString);
        System.out.println("LinkedList:" + linkedListString.toString());
        
        // 6ta consigna
        System.out.println("5ta consigna");
        ArrayList<Integer> inPares = new ArrayList<>();
        
        for (int i = 0; i <= 10; i++) {
            if(i % 2 != 0){
                inPares.add(i);
            }
        }   
        System.out.println(inPares);
        
        // 7ma consigna
        System.out.println("7ma consigna");
        divicionPorCero(4,0);
        
    }

    public static int divicionPorCero(int A, int B) throws ArithmeticException  {
        try {   
            int resultado = A / B;
            return resultado;  
        } catch (ArithmeticException  e) {
            System.out.println("Esto no puede hacerse");
            throw new ArithmeticException();
        }finally{
            System.out.println("Demo de código");
        }
    }
}
