package primer.modulo.Herencias.Intefaces;

import primer.modulo.Herencias.Car;

public class InterfacesMain {
    public static void main(String[] args) {
        //ejemplo de polimorfismo sobre intefaces; aca ambos estan usando CarService
        CarService service1 = new CarServiceClassicImpl();
        CarService service2 = new CarServiceSportImpl();
        Car car1 =  service1.crearCocheDemo();
        Car car2 =  service1.crearCocheDemo();
        System.out.println(car1);
        System.out.println(service2);
        System.out.println(car2);
    }
}
