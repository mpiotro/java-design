package org.bithus.visitor;

/**
 * Created by michal on 01.07.16.
 */
public class AtvPartDiplayVisitor implements AtvPartVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have wheel");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("We have fender");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("We have oil");
    }

    @Override
    public void visit(PartsOrder partsOrder) {

    }
}
