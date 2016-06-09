package org.bithus.factory;

/**
 * Created by michal on 09.06.16.
 */
public class WebsiteFactory {

    public static WebSite getWebsite(WebsiteType siteType) {
        switch(siteType) {

            case BLOG : {
                return new Blog();
            }

            case SHOP : {
                return new Shop();
            }

            default : {
                return null;
            }
        }
    }
}
