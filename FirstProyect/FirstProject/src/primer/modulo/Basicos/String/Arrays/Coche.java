package primer.modulo.Basicos.String.Arrays;


public class Coche {
    String modelo;
    double precio;

    public Coche() {}

    public Coche(String modelo, double precio){
        this.modelo = modelo;
        this.precio = precio;
    }

    public double inflacionPorciento(double porcentaje){

        return this.precio += this.precio / 100 * porcentaje;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
