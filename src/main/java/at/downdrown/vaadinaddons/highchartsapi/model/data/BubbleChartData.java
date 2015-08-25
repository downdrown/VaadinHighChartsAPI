package at.downdrown.vaadinaddons.highchartsapi.model.data;

/**
 * Projekt: VaadinHighChartsAPI<br>
 * Package: at.downdrown.vaadinaddons.highchartsapi.model.data<br>
 * Klasse: BubbleChartData.class<br>
 * Erstellt am 24. August 2015.<br>
 * Copyright &copy; HSWE Allg. Applikationen.<br>
 * <br>
 *
 * @author Manfred Huber (02ub0j08)<br>
 */
public class BubbleChartData implements HighChartsData {

    private double x;
    private double y;
    private double z;

    public BubbleChartData(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String getHighChartValue() {
        return "[" + x + ", " + y + ", " + z + "]";
    }

    @Override
    public String toString() {
        return this.getHighChartValue();
    }
}
