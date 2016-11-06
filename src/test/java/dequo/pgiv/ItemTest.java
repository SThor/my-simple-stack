package dequo.pgiv;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testEquals() throws Exception {
        assertTrue(new Item(10).equals(new Item(10)));
        assertFalse(new Item(10).equals(new Item(9)));
        assertFalse(new Item(10).equals("10"));
    }

    @Test
    public void testSetGet() throws Exception {
        Item item = new Item(10);
        assertEquals(10, item.get());
        item.set(9);
        assertEquals(9,item.get());
    }
}