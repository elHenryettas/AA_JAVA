package primer.modulo.Herencias;
// las clases abstractas fuerzan a crear instancias a partir solamente de sus clases hijas
public abstract class Car {

    //atributos
    String color;
    String fabricante;
    String modelo;
    double peso;
    double largo;
    Integer velocidad = 0;

    //constructores
    public Car(){

    }
    public Car(String color, String fabricante, String modelo, double peso,double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }
    //comportamiento

    public void acelerar(Integer cantidad) {
        if(cantidad > 0 && cantidad < 120){
    	    this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso='" + peso + '\'' +
                ", largo='" + largo + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
