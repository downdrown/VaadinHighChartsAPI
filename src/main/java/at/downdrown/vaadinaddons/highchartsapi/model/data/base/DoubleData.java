package at.downdrown.vaadinaddons.highchartsapi.model.data.base;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.model.data.base<br>
 * Klasse: DoubleData.class<br>
 * Erstellt am 25. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class DoubleData implements HighChartsBaseData {

    private double value;

    public DoubleData(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String getHighChartValue() {
        return String.valueOf(this.value);
    }

    @Override
    public String toString() {
        return this.getHighChartValue();
    }
}
