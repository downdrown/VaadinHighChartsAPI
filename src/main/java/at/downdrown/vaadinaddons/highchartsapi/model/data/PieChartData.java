/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.data;

public class PieChartData implements HighChartsData {

    private String name;
    private Object value;

    public PieChartData(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String getHighChartValue() {
        return "['" + this.name + "', " + this.value + "]";
    }
}
