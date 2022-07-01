package primer.modulo.DatosAvanzados;

public class ArrayMain {
    public static void main(String[] args) {
        // int arrayUno[] = new int[5];
        int arrayUno[] = {1,2,3,4,5};
        System.out.println(arrayUno.length); /* en arrays, length es un metodo */


        int arrayBi[][] = new int[2][3];
        arrayBi[0][0] = 1;
        arrayBi[0][1] = 2;
        arrayBi[0][2] = 3;
        arrayBi[0][3] = 4;

        arrayBi[1][0] = 10;
        arrayBi[1][1] = 20;
        arrayBi[1][2] = 30;
        arrayBi[1][3] = 40;

        // para iterar tendria que hacer 2 fors; arrayBi[i][j] 


    }
}
