import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Fluffy Paradise", "Simon", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Fluffy Paradise", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Simon", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(1, candyFlossStall.getParkingSpot());
    }
}
