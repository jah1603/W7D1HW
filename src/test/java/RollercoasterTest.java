import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster attraction;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        attraction = new Rollercoaster ("Corkscrew Mountain");
        visitor1 = new Visitor(20, 201, 45.5);
        visitor2 = new Visitor(10, 135, 45.5);
    }


    @Test
    public void hasName(){
        assertEquals("Corkscrew Mountain", attraction.getName());
    }

    @Test
    public void canVetAge(){
        assertEquals(true, attraction.isAllowedTo(visitor1));
        assertEquals(false, attraction.isAllowedTo(visitor2));
    }

}
