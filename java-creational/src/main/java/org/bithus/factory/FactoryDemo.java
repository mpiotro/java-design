package org.bithus.factory;

/**
 * Created by michal on 09.06.16.
 */
public class FactoryDemo {

    public static void main(String[] args) {

        WebSite site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());

    }

}
