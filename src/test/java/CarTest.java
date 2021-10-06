import com.example.car_gen.Car;
import com.example.car_gen.CombustionEngine;
import com.example.car_gen.Engine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    Engine v4 = new CombustionEngine(150000, "Gas");
    Car car = new Car("red", 2005, "Honda", "Civic", 98, v4,4);

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
    public void testGetEngine() {
        assertEquals(v4.getType(), car.getEngine().getType());
        assertEquals(v4.getPower(), car.getEngine().getPower());
    }

    @Test
    public void testSetEngine() {
        Engine v8 = new CombustionEngine(300000, "Gas");
        assertEquals(v4.getType(), car.getEngine().getType());
        assertEquals(v4.getPower(), car.getEngine().getPower());
        car.setEngine(v8);
        assertEquals(v8.getType(), car.getEngine().getType());
        assertEquals(v8.getPower(), car.getEngine().getPower());
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
        assertTrue(car.convertToElectric(200000));
        assertTrue(car.convertToElectric(150000));
    }

    @Test
    public void testGetNumDoors() {
        assertEquals(4, car.getNumDoors());
    }

    @Test
    public void testSetNumDoors() {
        assertEquals(4, car.getNumDoors());
        car.setNumDoors(6);
        assertEquals(6, car.getNumDoors());
    }
}
