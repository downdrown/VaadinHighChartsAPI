package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;

import java.util.List;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.model.series<br>
 * Klasse: AreaSplineChartSeries.class<br>
 * Erstellt am 21. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class AreaSplineChartSeries extends HighChartsSeriesImpl {

    public AreaSplineChartSeries(String name) {
        chartType = ChartType.AREASPLINE;
        this.name = name;
    }

    public AreaSplineChartSeries(String name, List<HighChartsData> data) {
        chartType = ChartType.AREASPLINE;
        this.name = name;
        this.data = data;
    }

}
