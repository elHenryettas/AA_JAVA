package primer.modulo.DatosAvanzados;

public class StringMain {
    public static void main(String[] args) {
        String cadena = "Mensaje de Texto";

        boolean aux = cadena.startsWith("Men");
        // boolean auxs= cadena.endsWith("to");
        if(aux){
            /* System.out.println("Coincide"); */ 
        }else{
            System.out.println("No Coincide");
        }

        // char letter = cadena.charAt(3);
        // System.out.println(letter);  s 

        for (int i = 0; i < cadena.length(); i++) { /* en String, length es una funcion */
            char letter =cadena.charAt(i);
            if(letter == 's'){
                System.out.println("Si tiene ");
            }
        }
 


        
    }
    
}
