package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.BubbleChartData;
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
public class BubbleChartSeries extends HighChartsSeriesImpl {

    public BubbleChartSeries(String name) {
        chartType = ChartType.BUBBLE;
        this.name = name;
    }

    public BubbleChartSeries(String name, List<BubbleChartData> data) {
        chartType = ChartType.BUBBLE;
        this.name = name;

        if (!data.isEmpty()) {
            for (BubbleChartData bubbleChartData : data) {
                this.data.add(bubbleChartData);
            }
        }
    }

    public void addData(BubbleChartData bubbleChartData) {
        this.data.add(bubbleChartData);
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BubbleChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(HighChartsData highChartsData) {
        throw new UnsupportedOperationException("Bubble charts only accept BubbleChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BubbleChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(int value) {
        throw new UnsupportedOperationException("Bubble charts only accept BubbleChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BubbleChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(double value) {
        throw new UnsupportedOperationException("Bubble charts only accept BubbleChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BubbleChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleDoubleData doubleDoubleData) {
        throw new UnsupportedOperationException("Bubble charts only accept BubbleChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BubbleChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleIntData doubleIntData) {
        throw new UnsupportedOperationException("Bubble charts only accept BubbleChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BubbleChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntDoubleData intDoubleData) {
        throw new UnsupportedOperationException("Bubble charts only accept BubbleChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BubbleChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntIntData intIntData) {
        throw new UnsupportedOperationException("Bubble charts only accept BubbleChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BubbleChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringDoubleData stringDoubleData) {
        throw new UnsupportedOperationException("Bubble charts only accept BubbleChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(BubbleChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringIntData stringIntData) {
        throw new UnsupportedOperationException("Bubble charts only accept BubbleChartData objects.");
    }
}
