import lab2.MapDirection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapDirectionTest {
    @Test
    public void next(){
        MapDirection east = MapDirection.EAST;
        MapDirection west = MapDirection.WEST;
        MapDirection north = MapDirection.NORTH;
        MapDirection south = MapDirection.SOUTH;

        assertEquals(east.next(), MapDirection.SOUTH);
        assertEquals(west.next(), MapDirection.NORTH);
        assertEquals(north.next(), MapDirection.EAST);
        assertEquals(south.next(), MapDirection.WEST);
    }

    @Test
    public void previous(){
        MapDirection east = MapDirection.EAST;
        MapDirection west = MapDirection.WEST;
        MapDirection north = MapDirection.NORTH;
        MapDirection south = MapDirection.SOUTH;

        assertEquals(east.previous(), MapDirection.NORTH);
        assertEquals(west.previous(), MapDirection.SOUTH);
        assertEquals(north.previous(), MapDirection.WEST);
        assertEquals(south.previous(), MapDirection.EAST);
    }
}
