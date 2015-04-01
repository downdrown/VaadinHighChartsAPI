/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model;

public class PieChartSeries implements HighChartsSeries {
    private String type;
    private Object value;

    public PieChartSeries(String type, Object value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "['"+ type +"', "+ value +"]";
    }

    public String getHighChartValue() {
        return "['"+ type +"', "+ value +"]";
    }
}
