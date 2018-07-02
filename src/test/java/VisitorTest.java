import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(15, 175, 45.5);
    }

    @Test
    public void hasAge(){
        assertEquals(15, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(175, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(45.5, visitor.getMoney(), 0);
    }


}
