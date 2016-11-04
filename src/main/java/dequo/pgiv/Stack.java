package dequo.pgiv;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by 21301646 on 04/11/2016.
 */
public class Stack implements SimpleStack {
    List<Item> list;

    public Stack(){
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
    public void push(Item item) {
        list.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return list.get(list.size()-1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item item = list.get(list.size()-1);
        list.remove(list.size()-1);
        return item;
    }
}
