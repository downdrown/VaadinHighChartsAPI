package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;
import at.downdrown.vaadinaddons.highchartsapi.model.data.base.*;

import java.util.List;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.model.series<br>
 * Klasse: AreaSplineRangeChartSeries.class<br>
 * Erstellt am 21. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class ErrorBarChartSeries extends HighChartsSeriesImpl {

    public ErrorBarChartSeries(String name) {
        chartType = ChartType.ERRORBAR;
        this.name = name;
    }

    public ErrorBarChartSeries(String name, List<ErrorBarChartData> data) {
        chartType = ChartType.ERRORBAR;
        this.name = name;

        if (!data.isEmpty()) {
            for (ErrorBarChartData errorBarChartData : data) {
                this.data.add(errorBarChartData);
            }
        }
    }

    public void addData(ErrorBarChartData errorBarChartData) {
        this.data.add(errorBarChartData);
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ErrorBarChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(HighChartsData highChartsData) {
        throw new UnsupportedOperationException("ErrorBar charts only accept ErrorBarChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ErrorBarChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(int value) {
        throw new UnsupportedOperationException("ErrorBar charts only accept ErrorBarChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ErrorBarChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(double value) {
        throw new UnsupportedOperationException("ErrorBar charts only accept ErrorBarChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ErrorBarChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleDoubleData doubleDoubleData) {
        throw new UnsupportedOperationException("ErrorBar charts only accept ErrorBarChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ErrorBarChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleIntData doubleIntData) {
        throw new UnsupportedOperationException("ErrorBar charts only accept ErrorBarChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ErrorBarChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntDoubleData intDoubleData) {
        throw new UnsupportedOperationException("ErrorBar charts only accept ErrorBarChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ErrorBarChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntIntData intIntData) {
        throw new UnsupportedOperationException("ErrorBar charts only accept ErrorBarChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ErrorBarChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringDoubleData stringDoubleData) {
        throw new UnsupportedOperationException("ErrorBar charts only accept ErrorBarChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ErrorBarChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringIntData stringIntData) {
        throw new UnsupportedOperationException("ErrorBar charts only accept ErrorBarChartData objects.");
    }
}
