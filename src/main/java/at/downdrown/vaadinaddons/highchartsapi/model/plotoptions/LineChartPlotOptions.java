/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.plotoptions;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;

public class LineChartPlotOptions extends HighChartsPlotOptionsImpl {
    public LineChartPlotOptions() {
        chartType = ChartType.LINE;
    }
}