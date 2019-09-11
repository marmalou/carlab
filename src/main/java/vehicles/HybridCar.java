package vehicles;

public class HybridCar extends Vehicles {
    public HybridCar(double price, String colour, String engine) {
        super(price, colour, engine);
    }
    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public String getEngine() {
        return this.engine;
    }
}

