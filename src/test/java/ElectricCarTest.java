import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar(8000.00, "green", "Electric");
    }



    @Test
    public void hasPrice(){
        assertEquals(8000.00, electricCar.getPrice(),0.1);
    }

    @Test
    public void hasColour(){
        assertEquals("green", electricCar.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals("Electric", electricCar.getEngine());
    }
}

