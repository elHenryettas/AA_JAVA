package primer.modulo.Tarea.Clases;

public class SmartPhone extends SmartDevice {
    /* private String model;
    private String brand;
    private String processor;
    private int yearLunch;
    private int price;
    private int weight; */
    protected int inches;
    protected int pxCamera;
    protected int totalCameras;

    // Constructor
    public SmartPhone(String model, String brand, String processor, int price, int weight, int yearLunch, boolean waterResistant, boolean inStock, int inches, int pxCamera, int totalCameras){
        super(model, brand, processor, price, weight, yearLunch, waterResistant, inStock);
        this.inches = inches;
        this.pxCamera = pxCamera;
        this.totalCameras = totalCameras;
    }
    // Functions


    @Override
    public String toString() {
        return "SmartPhone{" +
                "inches=" + inches +
                ", pxCamera=" + pxCamera +
                ", totalCameras=" + totalCameras +
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
