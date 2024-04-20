import org.example.Television;
import org.example.AirConditioner;
import org.example.AirConditionerCommand;
import org.example.Light;
import org.example.LightCommand;
import org.example.TvCommand;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommandTest {

    @Test
    public void testTvOnCommand_WhenTvTurnedOff_TvIsTurnedOn() {
        Television tv = new Television();
        TvCommand tvOnCommand = new TvCommand(tv);
        tvOnCommand.execute();
        assertTrue(tv.isTurnedOn());
    }

    @Test
    public void testAirConditionerOffCommand_WhenAcTurnedOn_AcIsTurnedOff() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        AirConditionerCommand acOffCommand = new AirConditionerCommand(ac);
        acOffCommand.execute();
        assertFalse(ac.isTurnedOn());
    }

    @Test
    public void testLightOffCommand_WhenLightTurnedOn_LightIsTurnedOff() {
        Light light = new Light();
        light.turnOn();
        LightCommand lightOffCommand = new LightCommand(light);
        lightOffCommand.execute();
        assertFalse(light.isTurnedOn());
    }
}
