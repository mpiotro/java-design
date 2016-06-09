package org.bithus.factory;

/**
 * Created by michal on 09.06.16.
 */
public class Shop extends WebSite {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
