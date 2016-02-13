/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi;

import at.downdrown.vaadinaddons.highchartsapi.exceptions.HighChartsException;
import at.downdrown.vaadinaddons.highchartsapi.exceptions.NoChartTypeException;
import at.downdrown.vaadinaddons.highchartsapi.exceptions.WrongSeriesException;
import at.downdrown.vaadinaddons.highchartsapi.model.ChartConfiguration;

public class HighChartFactory {

    /**
     * This method renders a chart from a passed {@link ChartConfiguration} object.
     * You can catch the super-exception {@link HighChartsException} if you don't
     * want to catch each exception seperate.
     *
     * @param configuration The {@link ChartConfiguration} object to render.
     * @return {@link HighChart} object.
     * @throws HighChartsException Super Exception.
     * @throws NoChartTypeException Thrown, when there is no chartType set in the configuration.
     * @throws WrongSeriesException Thrown, when there is a Series passed with a different chart type than the config.
     */
    public static HighChart renderChart(ChartConfiguration configuration) throws HighChartsException {
        HighChart tempChart = new HighChart();
        tempChart.setChartoptions(configuration.getHighChartValue());
        tempChart.setChartConfiguration(configuration);
        return tempChart;
    }
}