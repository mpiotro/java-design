package org.bithus.factory;

/**
 * Created by michal on 09.06.16.
 */
public class Blog extends WebSite {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
