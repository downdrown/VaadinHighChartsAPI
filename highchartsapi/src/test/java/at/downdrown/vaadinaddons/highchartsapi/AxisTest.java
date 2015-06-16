/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi;

import at.downdrown.vaadinaddons.highchartsapi.model.Axis;
import at.downdrown.vaadinaddons.highchartsapi.model.ChartConfiguration;
import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import com.vaadin.shared.ui.colorpicker.Color;
import org.junit.Test;

public class AxisTest {

    @Test
    public void xAxisTest() throws Exception {

        ChartConfiguration config = new ChartConfiguration();
        config.setChartType(ChartType.PIE);

        Axis xAxis = new Axis(Axis.AxisType.xAxis);

        xAxis.getCategories().add("My First Category");
        xAxis.getCategories().add("My Second Category");
        xAxis.setLineColor(Color.BLUE);
        xAxis.setTickLength(20);

        config.setxAxis(xAxis);

        HighChart chart = HighChartFactory.renderChart(config);

    }

}