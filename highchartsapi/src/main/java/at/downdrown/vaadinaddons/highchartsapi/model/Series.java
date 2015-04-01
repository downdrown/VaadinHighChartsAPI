/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model;

import java.util.ArrayList;
import java.util.List;

public class Series {
    private String name;
    private List<HighChartsSeries> data = new ArrayList<HighChartsSeries>();

    @Deprecated
    public Series() {
    }

    public Series(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HighChartsSeries> getData() {
        return data;
    }

    public void setData(List<HighChartsSeries> data) {
        this.data = data;
    }

    public String getHighChartValue() {
        return "{ name: '" + getName() + "', data: " + getData() + " }";
    }
}
