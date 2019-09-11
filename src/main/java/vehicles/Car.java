package vehicles;

public class Car extends Vehicles {
    public Car(double price, String colour, String engine){
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
