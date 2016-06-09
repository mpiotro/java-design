package org.bithus.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 09.06.16.
 */
public abstract class WebSite {

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public WebSite() {
        this.createWebsite();
    }

    public abstract void createWebsite();

}
