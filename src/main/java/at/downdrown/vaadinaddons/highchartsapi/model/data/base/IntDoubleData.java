package at.downdrown.vaadinaddons.highchartsapi.model.data.base;

/**
 * You can use this type of data to explicit manually set x and y value for your data.
 */
public class IntDoubleData implements HighChartsBaseData {

    private int xVal;
    private double yVal;

    public IntDoubleData(int xVal, double yVal) {
        this.xVal = xVal;
        this.yVal = yVal;
    }

    public int getxVal() {
        return xVal;
    }

    public void setxVal(int xVal) {
        this.xVal = xVal;
    }

    public double getyVal() {
        return yVal;
    }

    public void setyVal(double yVal) {
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
