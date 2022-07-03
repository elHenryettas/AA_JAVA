package primer.modulo.DatosAvanzados;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        System.out.println(lista.get(1));

        for(Object arrayObjeto : lista.toArray()){
           /* System.out.println(arrayObjeto.toString());
            ElementoA
            ElementoB
            ElementoC */
        }
        
    }
}
