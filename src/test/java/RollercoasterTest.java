import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster attraction;

    @Before
    public void before(){
        attraction = new Rollercoaster ("Corkscrew Mountain");
    }

    @Test
    public void hasName(){
        assertEquals("Corkscrew Mountain", attraction.getName());
    }
}
