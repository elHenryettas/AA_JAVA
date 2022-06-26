package primer.modulo.Tarea.Clases;

public class SmartWatch extends SmartDevice{
    protected int totalButtons;


    public SmartWatch(String model, String brand, String processor, int price, int weight, int yearLunch, boolean waterResistant, boolean inStock, int totalButtons){
        super(model, brand, processor, price, weight, yearLunch, waterResistant, inStock);
        this.totalButtons = totalButtons;

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "totalButtons=" + totalButtons +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                ", yearLunch=" + yearLunch +
                ", price=" + price +
                ", weight=" + weight +
                ", waterResistant=" + waterResistant +
                ", inStock=" + inStock +
                '}';
    }
}
