package at.downdrown.vaadinaddons.highchartsapi.model.data.base;

/**
 * You can use this type of data to explicit manually set x and y value for your data.
 */
public class DoubleIntData implements HighChartsBaseData {

    private double xVal;
    private int yVal;

    public DoubleIntData(double xVal, int yVal) {
        this.xVal = xVal;
        this.yVal = yVal;
    }

    public double getxVal() {
        return xVal;
    }

    public void setxVal(double xVal) {
        this.xVal = xVal;
    }

    public int getyVal() {
        return yVal;
    }

    public void setyVal(int yVal) {
        this.yVal = yVal;
    }

    @Override
    public String getHighChartValue() {
        return "[" + xVal + ", " + yVal + "]";
    }

    @Override
    public String toString() {
        return this.getHighChartValue();
    }
}
