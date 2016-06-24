package org.bithus.chain;

/**
 * Created by michal on 24.06.16.
 */
public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
