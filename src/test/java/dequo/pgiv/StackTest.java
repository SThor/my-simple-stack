package dequo.pgiv;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(stack.isEmpty());
        stack.push(new Item(10));
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals(0, stack.getSize());
        for(int i = 0; i<10; i++){
            stack.push(new Item(10));
        }
        assertEquals(10, stack.getSize());
    }

    @Test
    public void testPush() throws Exception {

    }

    @Test
    public void testPeek() throws Exception {
        Item item = new Item(10);
        stack.push(item);
        assertEquals(item, stack.peek());
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testPop() throws Exception {
        Item item = new Item(10);
        stack.push(item);
        assertEquals(item, stack.pop());
        assertTrue(stack.isEmpty());
    }
}