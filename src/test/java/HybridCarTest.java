import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before(){
        hybridCar = new HybridCar(10000.00, "red", "hybrid");
    }



    @Test
    public void hasPrice(){
        assertEquals(10000.00, hybridCar.getPrice(),0.1);
    }

    @Test
    public void hasColour(){
        assertEquals("red", hybridCar.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals("hybrid", hybridCar.getEngine());
    }
}



