package uno.tiposyvariables;

public class CarMain {

    public static void main(String[] args){

        Car carObj = new Car("Rojo", "Honda", "Civic", 1430.50, 5.4);

        carObj.acelerar(50);

        carObj.peso = 1330.30;


        ElectricCar carElectricObj = new ElectricCar();
        carElectricObj.motorElectrico = "Mazda";
        System.out.println(carElectricObj);
    }
}
