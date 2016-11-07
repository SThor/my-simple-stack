package dequo.pgiv;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by 21301646 on 04/11/2016.
 */
public class Stack implements SimpleStack {
    /**
     * list of all the items in the stack.
     */
    private List<Item> list;

    /**
     * constructs an empty stack.
     */
    public Stack() {
        list = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public void push(final Item item) {
        list.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return list.get(list.size() - 1);
        }
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            Item item = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return item;
        }
    }
}
