package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.AreaSplineRangeChartData;
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
public class AreaSplineRangeChartSeries extends HighChartsSeriesImpl {

    public AreaSplineRangeChartSeries(String name) {
        chartType = ChartType.AREASPLINERANGE;
        this.name = name;
    }

    public AreaSplineRangeChartSeries(String name, List<AreaSplineRangeChartData> data) {
        chartType = ChartType.AREASPLINERANGE;
        this.name = name;

        if (!data.isEmpty()) {
            for (AreaSplineRangeChartData areaSplineRangeChartData : data) {
                this.data.add(areaSplineRangeChartData);
            }
        }
    }

    public void addData(AreaSplineRangeChartData areaSplineRangeChartData) {
        this.data.add(areaSplineRangeChartData);
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(AreaSplineRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(HighChartsData highChartsData) {
        throw new UnsupportedOperationException("AreaRange charts only accept AreaRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(AreaSplineRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(int value) {
        throw new UnsupportedOperationException("AreaRange charts only accept AreaRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(AreaSplineRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(double value) {
        throw new UnsupportedOperationException("AreaRange charts only accept AreaRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(AreaSplineRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleDoubleData doubleDoubleData) {
        throw new UnsupportedOperationException("AreaRange charts only accept AreaRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(AreaSplineRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleIntData doubleIntData) {
        throw new UnsupportedOperationException("AreaRange charts only accept AreaRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(AreaSplineRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntDoubleData intDoubleData) {
        throw new UnsupportedOperationException("AreaRange charts only accept AreaRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(AreaSplineRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntIntData intIntData) {
        throw new UnsupportedOperationException("AreaRange charts only accept AreaRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(AreaSplineRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringDoubleData stringDoubleData) {
        throw new UnsupportedOperationException("AreaRange charts only accept AreaRangeChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(AreaSplineRangeChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringIntData stringIntData) {
        throw new UnsupportedOperationException("AreaRange charts only accept AreaRangeChartData objects.");
    }
}
