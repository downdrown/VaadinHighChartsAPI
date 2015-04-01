/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartConfiguration;

public class HighChartFactory {

    public static HighChart renderChart(ChartConfiguration configuration) {
        HighChart tempChart = new HighChart();
        tempChart.setChartoptions(configuration.getHighChartValue());
        return tempChart;
    }

}