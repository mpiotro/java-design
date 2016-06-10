package org.bithus.bridge;

import java.util.List;

/**
 * Created by michal on 10.06.16.
 */
public interface Formatter {

    String format(String header, List<Detail> details);

}
