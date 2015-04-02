/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model;

public class Margin implements HighchartsObject {
    private int marginLeft;
    private int marginTop;
    private int marginRight;
    private int marginBottom;

    public Margin(int marginLeft, int marginTop, int marginRight, int marginBottom) {
        this.marginLeft = marginLeft;
        this.marginTop = marginTop;
        this.marginRight = marginRight;
        this.marginBottom = marginBottom;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(int marginLeft) {
        this.marginLeft = marginLeft;
    }

    public int getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(int marginTop) {
        this.marginTop = marginTop;
    }

    public int getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(int marginRight) {
        this.marginRight = marginRight;
    }

    public int getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(int marginBottom) {
        this.marginBottom = marginBottom;
    }

    public String getHighChartValue() {
        return ",margin: [" + marginTop + ", " + marginRight + ", " + marginBottom + ", " + marginLeft + "]";
    }
}
