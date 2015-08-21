package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
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
    List<Object> data = new ArrayList<Object>();
    String name;

    public String getName() {
        return this.name;
    }

    @Override
    public ChartType getChartType() {
        return this.chartType;
    }

    @Override
    public void addData(DoubleDoubleData doubleDoubleData) {
        this.data.add(doubleDoubleData);
    }

    @Override
    public void addData(DoubleIntData doubleIntData) {
        this.data.add(doubleIntData);
    }

    @Override
    public void addData(IntDoubleData intDoubleData) {
        this.data.add(intDoubleData);
    }

    @Override
    public void addData(IntIntData intIntData) {
        this.data.add(intIntData);
    }

    @Override
    public void addData(StringDoubleData stringDoubleData) {
        this.data.add(stringDoubleData);
    }

    @Override
    public void addData(StringIntData stringIntData) {
        this.data.add(stringIntData);
    }

    @Override
    public String getHighChartValue() {
        return "{ name: '" + this.name + "', data: " + this.data + " }";
    }
}
