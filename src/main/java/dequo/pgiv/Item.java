package dequo.pgiv;

/**
 * Created by 21301646 on 04/11/2016.
 */
public class Item<T> {
    private T i;

    public Item(T i){
        this.i = i;
    }

    public boolean equals(Object o){
        if(o instanceof Item){
            Item item = (Item) o;
            return item.i.equals(i);
        }else
            return false;
    }

    public void set(T i){
        this.i = i;
    }

    public T get(){
        return i;
    }
}
