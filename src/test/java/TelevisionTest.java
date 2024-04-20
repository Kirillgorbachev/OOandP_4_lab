import org.example.Television;
import org.junit.Test;
import static org.junit.Assert.*;

public class TelevisionTest {

    @Test
    public void testTurnOn_WhenTVOff_TelevisionIsTurnedOn() {
        Television tv = new Television();
        tv.turnOn();
        assertTrue(tv.isTurnedOn());
    }

    @Test
    public void testTurnOff_WhenTVOn_TelevisionIsTurnedOff() {
        Television tv = new Television();
        tv.turnOff();
        assertFalse(tv.isTurnedOn());
    }
}
