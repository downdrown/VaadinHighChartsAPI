package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.BoxPlotChartData;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;
import at.downdrown.vaadinaddons.highchartsapi.model.data.base.*;

import java.util.List;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.model.series<br>
 * Klasse: AreaRangeChartSeries.class<br>
 * Erstellt am 21. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class BoxPlotChartSeries extends HighChartsSeriesImpl {

    public BoxPlotChartSeries(String name) {
        chartType = ChartType.BOXPLOT;
        this.name = name;
    }

    public BoxPlotChartSeries(String name, List<BoxPlotChartData> data) {
        chartType = ChartType.BOXPLOT;
        this.name = name;

        if (!data.isEmpty()) {
            for (BoxPlotChartData boxPlotChartData : data) {
                this.data.add(boxPlotChartData);
            }
        }
    }

    public void addData(BoxPlotChartData boxPlotChartData) {
        this.data.add(boxPlotChartData);
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BoxPlotChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(HighChartsData highChartsData) {
        throw new UnsupportedOperationException("BoxPlot charts only accept BoxPlotChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BoxPlotChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(int value) {
        throw new UnsupportedOperationException("BoxPlot charts only accept BoxPlotChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BoxPlotChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(double value) {
        throw new UnsupportedOperationException("BoxPlot charts only accept BoxPlotChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BoxPlotChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleDoubleData doubleDoubleData) {
        throw new UnsupportedOperationException("BoxPlot charts only accept BoxPlotChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BoxPlotChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleIntData doubleIntData) {
        throw new UnsupportedOperationException("BoxPlot charts only accept BoxPlotChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BoxPlotChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntDoubleData intDoubleData) {
        throw new UnsupportedOperationException("BoxPlot charts only accept BoxPlotChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BoxPlotChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntIntData intIntData) {
        throw new UnsupportedOperationException("BoxPlot charts only accept BoxPlotChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BoxPlotChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringDoubleData stringDoubleData) {
        throw new UnsupportedOperationException("BoxPlot charts only accept BoxPlotChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BoxPlotChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringIntData stringIntData) {
        throw new UnsupportedOperationException("BoxPlot charts only accept BoxPlotChartData objects.");
    }
}
