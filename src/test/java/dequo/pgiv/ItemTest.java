package dequo.pgiv;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testEquals() throws Exception {
        assertTrue(new Item(10).equals(new Item(10)));
        assertFalse(new Item(10).equals(new Item(9)));
        assertFalse(new Item(10).equals(new String("10")));
    }
}