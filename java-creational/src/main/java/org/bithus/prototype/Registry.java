package org.bithus.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by michal on 08.06.16.
 */
public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Star Wars");
        movie.setPrice(39.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Pan Tadeusz");
        book.setPrice(9.99);
        book.setNumberOfPages(347);
        items.put("Book", book);
    }

}
