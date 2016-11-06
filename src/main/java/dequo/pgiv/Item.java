package dequo.pgiv;

/**
 * Created by 21301646 on 04/11/2016.
 */
public class Item {
    private int i;

    public Item(int i){
        this.i = i;
    }

    public boolean equals(Object o){
        if(o instanceof Item){
            Item item = (Item) o;
            return item.i == i;
        }else
            return false;
    }

    public void set(int i){
        this.i = i;
    }

    public int get(){
        return i;
    }
}
