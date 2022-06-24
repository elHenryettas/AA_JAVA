package primer.modulo.Basicos.String.Arrays;

public class TryCatchMain {
public static void main(String[] args) {
        try {
        int result = 5 / 4;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("Cierre de recursos");
        }
        

        System.out.println("fin");
    }
}
