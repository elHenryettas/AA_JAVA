package primer.modulo.Basicos.String.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        // List<String> nombres = new ArrayList<>();
        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre1");
        nombres.add("Nombre2");
        nombres.add("Nombre3");
        nombres.add("Nombre4");
        nombres.add("Nombre5");

        System.out.println(nombres);
        // "nomBre" variable temporal, similar a i en el for normal
        for(String nomBre : nombres){
            System.out.println(nomBre);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("Mazda", 20000));
        coches.add(new Coche("Mitsubishi", 300000));
        coches.add(new Coche("Suzuki", 4000000));

        for (Coche coche : coches) {
            if(coche.modelo == "Suzuki"){
                coche.inflacionPorciento(21);
            }
        }

        System.out.println(coches.toString());
    }
}
