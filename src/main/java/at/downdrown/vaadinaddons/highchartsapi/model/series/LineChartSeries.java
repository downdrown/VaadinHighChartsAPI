/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;

import java.util.List;

public class LineChartSeries extends HighChartsSeriesImpl {

    public LineChartSeries(String name) {
        chartType = ChartType.LINE;
        this.name = name;
    }

    public LineChartSeries(String name, List<HighChartsData> data) {
        chartType = ChartType.LINE;
        this.name = name;
        this.data = data;
    }

    @Deprecated
    public List<HighChartsData> getData() {
        return data;
    }

    @Deprecated
    public void setData(List<HighChartsData> data) {
        this.data = data;
    }

}
