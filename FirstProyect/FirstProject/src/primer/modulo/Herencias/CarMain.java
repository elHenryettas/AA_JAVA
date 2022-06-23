package primer.modulo.Herencias;

public class CarMain {

    public static void main(String[] args){

        Car carObj = new ElectricCar("Rojo", "Honda", "Civic", 1430.50, 5.4, "Tesla");

        carObj.acelerar(50);

        carObj.peso = 1330.30;


        ElectricCar carElectricObj = new ElectricCar("Verde", "Suzuki", "Nazda", 1000, 4.8, "JDK");


        System.out.println(carElectricObj.toString());

        carElectricObj.acelerar(30);
        carElectricObj.acelerar(30);
        System.out.println(carElectricObj.toString());
    }
}
