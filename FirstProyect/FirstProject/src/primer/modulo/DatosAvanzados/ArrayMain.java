package primer.modulo.DatosAvanzados;

public class ArrayMain {
    public static void main(String[] args) {
        // int arrayUno[] = new int[5];
        int arrayUno[] = {1,2,3,4,5};
        System.out.println(arrayUno.length); /* en arrays, length es un metodo */


        int arrayBi[][] = new int[3][4]; //no es dinamico, tiene que ser preciso o mayor el numero

        arrayBi[0][0] = 1;
        arrayBi[0][1] = 2;
        arrayBi[0][2] = 3;
        arrayBi[0][3] = 4;

        arrayBi[1][0] = 10;
        arrayBi[1][1] = 20;
        arrayBi[1][2] = 30;
        arrayBi[1][3] = 40;

        arrayBi[2][0] = 100;
        arrayBi[2][1] = 200;
        arrayBi[2][2] = 300;
        arrayBi[2][3] = 400;
        
        // para iterar tendria que hacer 2 fors; arrayBi[i][j] 
        for (int i = 0; i < arrayBi.length; i++) {
            System.out.println(arrayBi[i][2]);
        }

    }
}
