package primer.modulo.DatosAvanzados;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class HashMapMain {
    public static void main(String[] args) {
         HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("key1", 10);
        mapa.put("key2", 20);
        mapa.put("key3", 30);
        mapa.put("key4", 40);
        // System.out.println(mapa); {key1=10, key2=20, key3=30, key4=40}
        mapa.replace("key3", 100);
        // .put() en el caso de ya existir la clave, remplaza su valor;
        // .replace() en el caso de no existir la clave: no hace nada
        System.out.println(mapa);

        for(Map.Entry<String, Integer> elemento : mapa.entrySet()){
            System.out.println("Elemento clave es: "+ elemento.getKey());
            System.out.println("Elemento valor es: "+ elemento.getValue());
        }
    }
}
