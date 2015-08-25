package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;

import java.util.List;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.model.series<br>
 * Klasse: FunnelChartSeries.class<br>
 * Erstellt am 25. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class FunnelChartSeries extends HighChartsSeriesImpl {

    public FunnelChartSeries(String name) {
        this.chartType = ChartType.FUNNEL;
        this.name = name;
    }

    public FunnelChartSeries(String name, List<HighChartsData> data) {
        this.chartType = ChartType.FUNNEL;
        this.name = name;
        this.data = data;
    }
}
