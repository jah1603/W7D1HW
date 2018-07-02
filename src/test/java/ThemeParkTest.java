import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor1;
    Visitor visitor2;
    Rollercoaster rollercoaster;
    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        themePark = new ThemePark("Into Africa Thrill Centre");
        visitor1 = new Visitor(15, 175, 45.5);
        visitor2 = new Visitor(20, 202, 6.2);
        rollercoaster = new Rollercoaster ("Corkscrew Mountain");
        candyFlossStall = new CandyFlossStall("Fluffy Paradise", "Simon", 1);
    }

    @Test
    public void canStoreAttractions(){
        themePark.addAttraction(rollercoaster);
        assertEquals(1, themePark.countAttractions());
    }

    @Test
    public void canStoreStalls(){
        themePark.addStall(candyFlossStall);
        assertEquals(1, themePark.countStalls());
    }
}
