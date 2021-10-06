import com.example.car_gen.CombustionEngine;
import com.example.car_gen.Engine;
import com.example.car_gen.Toyota;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToyotaTest {
    Engine v8 = new CombustionEngine(300000, "Gas");
    Toyota car = new Toyota("red", 2005, "Supra", 98, v8, 2, true);

    @Test
    public void testGetColor() {
        assertEquals("red", car.getColor());
    }

    @Test
    public void testSetColor() {
        assertEquals("red", car.getColor());
        car.setColor("blue");
        assertEquals("blue", car.getColor());
    }

    @Test
    public void testGetYear() {
        assertEquals(2005, car.getYear());
    }

    @Test
    public void testSetYear() {
        assertEquals(2005, car.getYear());
        car.setYear(2009);
        assertEquals(2009, car.getYear());
    }

    @Test
    public void testGetSpeed() {
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testSetSpeed() {
        assertEquals(0, car.getSpeed());
        car.setSpeed(70);
        assertEquals(70, car.getSpeed());
    }

    @Test
    public void testGetMaxSpeed() {
        assertEquals(98, car.getMaxSpeed());
    }

    @Test
    public void testSetMaxSpeed() {
        assertEquals(98, car.getMaxSpeed());
        car.setMaxSpeed(70);
        assertEquals(70, car.getMaxSpeed());
    }

    @Test
    public void testIsElectric() {
        assertFalse(car.isElectric());
    }

    @Test
    public void testAccelerateSpeed() {
        assertEquals(0, car.getSpeed());
        assertEquals(5, car.accelerateSpeed());
    }

    @Test
    public void testDecelerateSpeed() {
        car.setSpeed(0);
        assertEquals(0, car.getSpeed());
        assertEquals(0, car.decelerateSpeed());
        car.setSpeed(10);
        assertEquals(10, car.getSpeed());
        assertEquals(5, car.decelerateSpeed());
    }

    @Test
    public void testConvertToElectric() {
        //car.setElectric(false);
        assertTrue(car.convertToElectric(400000));
        assertTrue(car.convertToElectric(500000));
    }

    @Test
    public void testIsGreatGasMileage() {
        assertTrue(car.isGreatGasMileage());
    }

    @Test
    public void testSetGreatGasMileage() {
        assertTrue(car.isGreatGasMileage());
        car.setGreatGasMileage(false);
        assertFalse(car.isGreatGasMileage());
    }
}