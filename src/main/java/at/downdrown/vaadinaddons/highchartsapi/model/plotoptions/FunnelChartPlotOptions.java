/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.plotoptions;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;

public class FunnelChartPlotOptions extends HighChartsPlotOptionsImpl {
    public FunnelChartPlotOptions() {
        chartType = ChartType.FUNNEL;
    }
}