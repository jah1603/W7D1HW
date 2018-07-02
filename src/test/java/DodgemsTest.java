import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Collision Course");
    }

    @Test
    public void hasName(){
        assertEquals("Collision Course", dodgems.getName());
    }
}
