package primer.modulo.BuclesYSwitch;

public class BucleWhile {
    public static void main(String[] args) {
        int i = -1;
        while(i<10){
            i++;
            if(i == 6 || i == 4 ) break;

            System.out.println(i);
        }
    }
}
