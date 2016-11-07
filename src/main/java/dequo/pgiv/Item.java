package dequo.pgiv;

/**
 * Created by 21301646 on 04/11/2016.
 */
public class Item {
    /**
     * value of this Item.
     */
    private int i;

    /**
     * constructor specifying a value.
     * @param valeur value of the Item
     */
    public Item(final int valeur) {
        i = valeur;
    }

    @Override
    public boolean equals(final Object o) {
        if (o instanceof Item) {
            Item item = (Item) o;
            return item.i == i;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return i;
    }

    /**
     * Sets the new value of the item.
     * @param valeur new value of the item
     */
    public void set(final int valeur) {
        i = valeur;
    }

    /**
     * gets the value of the item.
     * @return value of the item
     */
    public int get() {
        return i;
    }
}
