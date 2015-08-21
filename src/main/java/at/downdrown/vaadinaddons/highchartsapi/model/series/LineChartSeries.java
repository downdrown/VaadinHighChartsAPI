/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;

import java.util.List;

public class LineChartSeries extends HighChartsSeriesImpl {

    public LineChartSeries(String name) {
        chartType = ChartType.LINE;
        this.name = name;
    }

    public LineChartSeries(String name, List<Object> data) {
        chartType = ChartType.LINE;
        this.name = name;
        this.data = data;
    }

    @Deprecated
    public List<Object> getData() {
        return data;
    }

    @Deprecated
    public void setData(List<Object> data) {
        this.data = data;
    }

}
