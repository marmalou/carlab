import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car(6000.00, "blue", "Diesel");
    }

    @Test
    public void hasPrice(){
        assertEquals(6000.00, car.getPrice(),0.1);
    }

    @Test
    public void hasColour(){
        assertEquals("blue", car.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals("Diesel", car.getEngine());
    }

}
