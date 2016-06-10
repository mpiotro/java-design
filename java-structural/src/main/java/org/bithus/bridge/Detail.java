package org.bithus.bridge;

/**
 * Created by michal on 10.06.16.
 */
public class Detail {

    private String label;
    private String value;

    public Detail(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
