package org.bithus.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by michal on 23.06.16.
 */
public class Catalog {

    private Map<String, Item> items = new HashMap<>();

    /* factory method */
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName))
            items.put(itemName, new Item(itemName));
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }

}
