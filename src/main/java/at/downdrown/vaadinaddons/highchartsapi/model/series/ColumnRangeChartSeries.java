package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.ColumnRangeChartData;
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
public class ColumnRangeChartSeries extends HighChartsSeriesImpl {

    public ColumnRangeChartSeries(String name) {
        chartType = ChartType.COLUMNRANGE;
        this.name = name;
    }

    public ColumnRangeChartSeries(String name, List<ColumnRangeChartData> data) {
        chartType = ChartType.COLUMNRANGE;
        this.name = name;

        if (!data.isEmpty()) {
            for (ColumnRangeChartData columnRangeChartData : data) {
                this.data.add(columnRangeChartData);
            }
        }
    }

    public void addData(ColumnRangeChartData columnRangeChartData) {
        this.data.add(columnRangeChartData);
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ColumnRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(HighChartsData highChartsData) {
        throw new UnsupportedOperationException("ColumnRange charts only accept ColumnRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ColumnRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(int value) {
        throw new UnsupportedOperationException("ColumnRange charts only accept ColumnRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ColumnRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(double value) {
        throw new UnsupportedOperationException("ColumnRange charts only accept ColumnRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ColumnRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleDoubleData doubleDoubleData) {
        throw new UnsupportedOperationException("ColumnRange charts only accept ColumnRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ColumnRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleIntData doubleIntData) {
        throw new UnsupportedOperationException("ColumnRange charts only accept ColumnRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ColumnRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntDoubleData intDoubleData) {
        throw new UnsupportedOperationException("ColumnRange charts only accept ColumnRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ColumnRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntIntData intIntData) {
        throw new UnsupportedOperationException("ColumnRange charts only accept ColumnRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ColumnRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringDoubleData stringDoubleData) {
        throw new UnsupportedOperationException("ColumnRange charts only accept ColumnRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(ColumnRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringIntData stringIntData) {
        throw new UnsupportedOperationException("ColumnRange charts only accept ColumnRangeChartData objects.");
    }
}
