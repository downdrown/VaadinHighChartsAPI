/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.plotoptions;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;

public class ColumnChartPlotOptions extends HighChartsPlotOptionsImpl {
    public ColumnChartPlotOptions() {
        chartType = ChartType.COLUMN;
    }
}