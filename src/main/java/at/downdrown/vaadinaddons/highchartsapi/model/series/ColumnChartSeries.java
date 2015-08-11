/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;

import java.util.ArrayList;
import java.util.List;

public class ColumnChartSeries implements HighChartsSeries {

    private final ChartType chartType = ChartType.COLUMN;

    private String name;
    private List<Object> data = new ArrayList<Object>();

    public ColumnChartSeries(String name) {
        this.name = name;
    }

    public ColumnChartSeries(String name, List<Object> data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    @Override
    public String getHighChartValue() {
        return "{ name: '" + this.name + "', data: " + this.data + " }";
    }

    @Override
    public ChartType getChartType() {
        return this.chartType;
    }
}