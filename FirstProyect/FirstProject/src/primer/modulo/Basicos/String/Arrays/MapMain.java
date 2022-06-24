package primer.modulo.Basicos.String.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();

        personas.put("2616559452", "Nombre Apellido 1");
        personas.put("2616559423", "Nombre Apellido 2");
        personas.put("2616559411", "Nombre Apellido 3");
        personas.put("2616559422", "Nombre Apellido 4");

       /* System.out.println(personas);*/

        for (String key: personas.keySet()){
            System.out.println(key);
            /*
             2616559452
             2616559411
             2616559422
             2616559423
            */
        }
        for (String value: personas.values()){
            System.out.println(value);
            /*
              Nombre Apellido 1
              Nombre Apellido 3
              Nombre Apellido 4
              Nombre Apellido 2
            */

        }
        /*for (Map.Entry<String, String> pair:  personas.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
            *//*
            2616559452 Nombre Apellido 1
            2616559411 Nombre Apellido 3
            2616559422 Nombre Apellido 4
            2616559423 Nombre Apellido 2
            *//*
        }
        for (Map.Entry<String, String> pair:  personas.entrySet()){
            System.out.println(pair);
            *//*
            2616559452=Nombre Apellido 1
            2616559422=Nombre Apellido 4
            2616559423=Nombre Apellido 2
            2616559411=Nombre Apellido 3
            *//*

        }*/
    }
}
