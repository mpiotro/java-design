package org.bithus.visitor;

/**
 * Created by michal on 30.06.16.
 */
public interface AtvPartVisitor {

    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(Oil oil);
    void visit(PartsOrder partsOrder);
}
