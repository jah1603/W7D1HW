import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){

            tobaccoStall = new TobaccoStall("Lung Killer", "Bill", 2);
            visitor1 = new Visitor(20, 201, 45.5);
            visitor2 = new Visitor(10, 150, 45.5);

    }

    @Test
    public void canVetAge(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }


}
