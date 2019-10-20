import lab2.Vector2d;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class Vector2dTest {
    @Test
    public void equals(){
        Vector2d v_1_2  = new Vector2d(1, 2);
        Vector2d v_2_3 = new Vector2d(2,3);
        Vector2d n = null;

        assertNotEquals(v_1_2, v_2_3);
        assertNotEquals(v_1_2, n);
        assertEquals(v_1_2,v_1_2);
    }

    @Test
    public void add(){
        Vector2d v = new Vector2d(1,2);
        Vector2d u = new Vector2d(-12, -430);
        Vector2d ans = new Vector2d(-11, -428);

        assertEquals(v.add(u), ans);
    }

    @Test
    public void subtract(){
        Vector2d v = new Vector2d(1,2);
        Vector2d u = new Vector2d(-12, -430);
        Vector2d ans = new Vector2d(13, 432);

        assertEquals(v.subtract(u), ans);
    }

    @Test
    public void tostring(){
        Vector2d r = new Vector2d(-1, 50);

        assertEquals(r.toString(), "(-1,50)");
    }

    @Test
    public void follows(){
        Vector2d v = new Vector2d(1, 2);
        Vector2d u = new Vector2d(-1, -2);
        Vector2d w = new Vector2d(1, 1);
        Vector2d t = new Vector2d(1, 3);

        assertTrue(v.follows(u));
        assertTrue(v.follows(w));
        assertTrue(v.follows(v));
        assertFalse(v.follows(t));
    }

    @Test
    public void precedes(){
        Vector2d v = new Vector2d(1, 2);
        Vector2d u = new Vector2d(-1, -2);
        Vector2d w = new Vector2d(1, 1);
        Vector2d t = new Vector2d(1, 3);

        assertFalse(v.precedes(u));
        assertFalse(v.precedes(w));
        assertTrue(v.precedes(v));
        assertTrue(v.precedes(t));
    }

    @Test
    public void upperRight(){
        Vector2d v = new Vector2d(1, 10);
        Vector2d u = new Vector2d(10, 1);

        assertEquals(v.upperRight(u), new Vector2d(10, 10));
        assertEquals(v.upperRight(v), v);
    }

    @Test
    public void lowerLeft(){
        Vector2d v = new Vector2d(1, 10);
        Vector2d u = new Vector2d(10, 1);

        assertEquals(v.lowerLeft(u), new Vector2d(1, 1));
        assertEquals(v.lowerLeft(v), v);
    }

    @Test
    public void opposite(){
        Vector2d v = new Vector2d(1, 10);
        Vector2d u = new Vector2d(-1, 10);
        Vector2d t = new Vector2d(1, -10);
        Vector2d w = new Vector2d(-1, -10);

        assertEquals(v.opposite(), w);
        assertEquals(u.opposite(), t);
        assertEquals(w.opposite(), v);
        assertEquals(t.opposite(), u);
        assertNotEquals(v.opposite(), t);
    }
}
