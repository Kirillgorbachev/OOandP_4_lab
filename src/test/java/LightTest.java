import org.example.Light;
import org.junit.Test;
import static org.junit.Assert.*;

public class LightTest {

    @Test
    public void testTurnOn_WhenLightOff_LightIsTurnedOn() {
        Light light = new Light();
        light.turnOn();
        assertTrue(light.isTurnedOn());
    }

    @Test
    public void testTurnOff_WhenLightOn_LightIsTurnedOff() {
        Light light = new Light();
        light.turnOff();
        assertFalse(light.isTurnedOn());
    }
}
