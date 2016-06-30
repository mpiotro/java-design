package org.bithus.visitor;

/**
 * Created by michal on 30.06.16.
 */
public class Fender implements AtvPart {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
