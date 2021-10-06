import com.example.car_gen.CombustionEngine;
import com.example.car_gen.Engine;
import com.example.car_gen.Honda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HondaTest {
    Engine v4 = new CombustionEngine(150000, "Gas");
    Honda car = new Honda("red", 2005, "Civic", 98, v4, 4,true);

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
        // car.setElectric(false);
        assertTrue(car.convertToElectric(250000));
        assertTrue(car.convertToElectric(200000));
    }

    @Test
    public void testIsTurboCharged() {
        assertTrue(car.isTurboCharged());
    }

    @Test
    public void testSetTurboCharged() {
        assertTrue(car.isTurboCharged());
        car.setTurboCharged(false);
        assertFalse(car.isTurboCharged());
    }
}