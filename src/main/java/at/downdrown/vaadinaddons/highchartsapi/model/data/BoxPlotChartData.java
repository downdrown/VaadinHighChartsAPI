package at.downdrown.vaadinaddons.highchartsapi.model.data;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.model.data<br>
 * Klasse: BoxPlotChartData.class<br>
 * Erstellt am 24. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class BoxPlotChartData implements HighChartsData {

    private String name = null;
    private double minimum;
    private double lowerQuartile;
    private double median;
    private double upperQuartile;
    private double maximum;

    public BoxPlotChartData(String name, double minimum, double lowerQuartile, double median, double upperQuartile, double maximum) {
        this.name = name;
        this.minimum = minimum;
        this.lowerQuartile = lowerQuartile;
        this.median = median;
        this.upperQuartile = upperQuartile;
        this.maximum = maximum;
    }

    public BoxPlotChartData(double minimum, double lowerQuartile, double median, double upperQuartile, double maximum) {
        this.minimum = minimum;
        this.lowerQuartile = lowerQuartile;
        this.median = median;
        this.upperQuartile = upperQuartile;
        this.maximum = maximum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public double getLowerQuartile() {
        return lowerQuartile;
    }

    public void setLowerQuartile(double lowerQuartile) {
        this.lowerQuartile = lowerQuartile;
    }

    public double getMedian() {
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public double getUpperQuartile() {
        return upperQuartile;
    }

    public void setUpperQuartile(double upperQuartile) {
        this.upperQuartile = upperQuartile;
    }

    public double getMaximum() {
        return maximum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    @Override
    public String getHighChartValue() {
        if (name != null) {
            return "['" + name + "', " + minimum + ", " + lowerQuartile + ", " + median + ", " + upperQuartile + ", " + maximum + "]";
        } else {
            return "[" + minimum + ", " + lowerQuartile + ", " + median + ", " + upperQuartile + ", " + maximum + "]";
        }
    }

    @Override
    public String toString() {
        return this.getHighChartValue();
    }
}
