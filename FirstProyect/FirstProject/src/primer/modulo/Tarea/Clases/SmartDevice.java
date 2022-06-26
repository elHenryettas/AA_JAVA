package primer.modulo.Tarea.Clases;

public class SmartDevice {

    
    // atributes 
    protected String model;
    protected String brand;
    protected String processor;
    protected int yearLunch;
    protected int price;
    protected int weight;
    protected boolean waterResistant;
    protected boolean inStock;

    // constructor
    public SmartDevice(){

    }
    public SmartDevice(String model, String brand, String processor, int price, int weight, int yearLunch, boolean waterResistant, boolean inStock){
        this.model = model;
        this.brand = brand;
        this.processor = processor;
        this.price = price;
        this.weight = weight;
        this.yearLunch = yearLunch;
        this.waterResistant = waterResistant;
        this.inStock = inStock;
    }

    // functions

    public String getModel(){
        return this.model;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getProcessor(){
        return this.processor;
    }
    public int getPrice(){
        return this.price;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getYearLunch(){
        return this.yearLunch;
    }
    public boolean getWaterResistant(){
        return this.waterResistant;
    }
    public boolean getInStock(){
        return this.inStock;
    }
}
