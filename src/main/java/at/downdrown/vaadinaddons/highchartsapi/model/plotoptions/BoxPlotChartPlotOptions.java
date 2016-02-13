package at.downdrown.vaadinaddons.highchartsapi.model.plotoptions;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.model.plotoptions<br>
 * Klasse: BoxPlotChartPlotOptions.class<br>
 * Erstellt am 24. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class BoxPlotChartPlotOptions extends HighChartsPlotOptionsImpl {

    public BoxPlotChartPlotOptions() {
        this.chartType = ChartType.BOXPLOT;
    }
}
