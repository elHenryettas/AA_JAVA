package primer.modulo.Herencias;

public class ElectricCar extends Car {
    String motorElectrico;
    public ElectricCar(){

    }

    public ElectricCar(String motorElectrico) {

        this.motorElectrico = motorElectrico;
    };

    public ElectricCar(String color, String fabricante, String modelo, double peso,double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;

    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
