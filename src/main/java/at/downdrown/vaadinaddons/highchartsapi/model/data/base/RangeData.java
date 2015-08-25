package at.downdrown.vaadinaddons.highchartsapi.model.data.base;

import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.model.data<br>
 * Klasse: AreaRangeChartData.class<br>
 * Erstellt am 21. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class RangeData implements HighChartsData {

    private double x;
    private double low;
    private double high;

    public RangeData(double x, double low, double high) {
        this.x = x;
        this.low = low;
        this.high = high;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String getHighChartValue() {
        return "[" + x + ", " + low + ", " + high + "]";
    }

    @Override
    public String toString() {
        return this.getHighChartValue();
    }
}
