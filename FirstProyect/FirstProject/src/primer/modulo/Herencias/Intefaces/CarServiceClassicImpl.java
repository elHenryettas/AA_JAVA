package primer.modulo.Herencias.Intefaces;

import primer.modulo.Herencias.Car;
import primer.modulo.Herencias.ElectricCar;
import primer.modulo.Herencias.Intefaces.CarService;

public class CarServiceClassicImpl implements CarService {

    @Override
    public Car crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new ElectricCar();
    }

    @Override
    public void destroyCar(Car Car) {
        
    }
}
