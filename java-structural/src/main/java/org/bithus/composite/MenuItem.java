package org.bithus.composite;

/**
 * Created by michal on 17.06.16.
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
