package org.bithus.bridge;

import java.util.List;

/**
 * Created by michal on 10.06.16.
 */
public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();
    abstract protected String getHeader();

}
