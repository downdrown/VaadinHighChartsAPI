package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;
import at.downdrown.vaadinaddons.highchartsapi.model.data.base.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.model.series<br>
 * Klasse: HighChartsSeriesImpl.class<br>
 * Erstellt am 21. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class HighChartsSeriesImpl implements HighChartsSeries {

    ChartType chartType;
    List<HighChartsData> data = new ArrayList<>();
    String name;

    public String getName() {
        return this.name;
    }

    @Override
    public ChartType getChartType() {
        return this.chartType;
    }

    /**
     * Add an {@link HighChartsData} object to your series.
     *
     * @param highChartsData - The object you want to add.
     */
    @Override
    public void addData(HighChartsData highChartsData) {
        this.data.add(highChartsData);
    }

    /**
     * Add an {@link Integer} object to your series.
     *
     * @param value - The object you want to add.
     */
    @Override
    public void addData(int value) {
        this.data.add(new IntData(value));
    }
    
    /**
     * Add an {@link Float} object to your series.
     *
     * @param value - The object you want to add.
     */
    @Override
    public void addData(float value) {
        this.data.add(new FloatData(value));
    }

    /**
     * Add an {@link Double} object to your series.
     *
     * @param value - The object you want to add.
     */
    @Override
    public void addData(double value) {
        this.data.add(new DoubleData(value));
    }

    /**
     * Add an {@link DoubleDoubleData} object to your series.
     *
     * @param doubleDoubleData - The object you want to add.
     */
    @Override
    public void addData(DoubleDoubleData doubleDoubleData) {
        this.data.add(doubleDoubleData);
    }

    /**
     * Add an {@link DoubleIntData} object to your series.
     *
     * @param doubleIntData - The object you want to add.
     */
    @Override
    public void addData(DoubleIntData doubleIntData) {
        this.data.add(doubleIntData);
    }

    /**
     * Add an {@link IntDoubleData} object to your series.
     *
     * @param intDoubleData - The object you want to add.
     */
    @Override
    public void addData(IntDoubleData intDoubleData) {
        this.data.add(intDoubleData);
    }

    /**
     * Add an {@link IntIntData} object to your series.
     *
     * @param intIntData - The object you want to add.
     */
    @Override
    public void addData(IntIntData intIntData) {
        this.data.add(intIntData);
    }

    /**
     * Add an {@link StringDoubleData} object to your series
     *
     * @param stringDoubleData - The object you want to add.
     */
    @Override
    public void addData(StringDoubleData stringDoubleData) {
        this.data.add(stringDoubleData);
    }

    /**
     * Add an {@link StringIntData} object to your series
     *
     * @param stringIntData - The object you want to add.
     */
    @Override
    public void addData(StringIntData stringIntData) {
        this.data.add(stringIntData);
    }

    /**
     * Clears the list of data.
     */
    @Override
    public void clearData() {
        this.data.clear();
    }

    @Override
    public String getHighChartValue() {
        return "{ name: '" + this.name + "', type: '" + this.chartType.name().toLowerCase() + "', data: " + this.data + " }";
    }

    @Override
    public String toString() {
        return this.getHighChartValue();
    }
}
