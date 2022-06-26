package primer.modulo.Tarea.Clases;

public class ClasesMain {
    public static void main(String[] args) {
        SmartDevice newPhone1 = new SmartPhone("G6", "Motorola", "1GHz", 500, 165, 2019, true, true, 8, 12, 3);
        SmartDevice newWatch1 = new SmartWatch("XLR4", "Pichichu", "1GHz", 300, 2, 2022, true, true, 3);
        System.out.println(newWatch1.toString());
        System.out.println(newPhone1.toString());
    
    }
}
