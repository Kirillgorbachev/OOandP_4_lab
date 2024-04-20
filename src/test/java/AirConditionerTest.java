import org.example.AirConditioner;
import org.junit.Test;
import static org.junit.Assert.*;

public class AirConditionerTest {

    @Test
    public void testTurnOn_WhenConnected_ConditionerIsTurnedOn() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        assertTrue(ac.isTurnedOn());
    }

    @Test
    public void testTurnOff_WhenDisconnected_ConditionerIsTurnedOff() {
        AirConditioner ac = new AirConditioner();
        ac.turnOff();
        assertFalse(ac.isTurnedOn());
    }
}
