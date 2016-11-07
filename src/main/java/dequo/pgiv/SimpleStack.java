package dequo.pgiv;

import java.util.EmptyStackException;

/**
 * Created by 21301646 on 04/11/2016.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     * @return true if the stack is empty, else otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     * @return number of items in this stack
     */
    int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed
     * @param item to add to the stack
     */
    void push(Item item);

    /**
     * Looks at the object at the top of this stack
     * without removing it from the stack.
     * @throws EmptyStackException is this stack is empty
     * @return Item at the top of this stack
     */
    Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack
     * and returns that object as the value of this function.
     * @throws EmptyStackException is this stack is empty
     * @return item at the top of this stack
     */
    Item pop() throws EmptyStackException;
}
