package primer.modulo.DatosAvanzados;

import java.util.Vector;


// El aumento de capacidad de los vectores puede ser muy costosa, siempre la capacidad incial debe estar proxima al tamaño que se espera alcanzar
// Son arrays dinamicos

public class VectoresMain {
    public static void main(String[] args) {
        Vector<Integer> victor = new Vector(50, 15);
        victor.add(1);
        victor.add(23);
        victor.add(11);
        victor.add(61);
        victor.add(2);
        victor.add(4);
        victor.add(-5);
        // System.out.println(victor); [1, 23, 11, 61, 2, 4, -5]
       /*  victor.remove(3); */

        // System.out.println("victor size "+ victor.size()+ ", victor capacity: " + victor.capacity());        
        // victor size 7, victor capacity: 50
        Vector<Integer> victorDos = new Vector();
        victorDos.add(1);
        victorDos.add(23);
        victorDos.add(11);
        victorDos.add(61);
        victorDos.add(2);
        victorDos.add(4);
        victorDos.add(-5);

        boolean isEquals = victor.equals(victorDos);
        // System.out.println(isEquals); true
        
        // for (int i = 0; i < victor.size(); i++) {
        //     if(victor.get(i) % 2 == 0){
        //         victor.remove(i);
        //         System.out.println("par");
        //         i--;
        //         continue;
        //     }
        //     System.out.println("inpar");
        // }
            
        // .trimToSize(); Reduce la capacidad maxima a la cantidad de elementos actuales
    }
}
