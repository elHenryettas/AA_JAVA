package primer.modulo.Herencias;

public class PolimorfismoMain {

    public static void main(String[] args) {

        // Car no se puede usar por que es clase abstracta
        /*Car coche1 = new Car();*/

        ElectricCar coche2 = new ElectricCar();

        HibridCar coche3 = new  HibridCar();

        //Polimorfismo

        Car coche4 = new ElectricCar();

        Car coche5 = new HibridCar(23);

        if(coche4 instanceof ElectricCar){
            System.out.println("El auto es electrico");
        }
        if(coche5 instanceof HibridCar){
            System.out.println("El auto es hibrido");
        }
        if(coche5 instanceof Car){
            System.out.println("El auto es de clase car");
        }
        if(coche4 instanceof Car){
            System.out.println("Este tambien");
        }

    }
}
