/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model;

/**
 * Contains all implementet chart types.
 */
public enum ChartType implements HighchartsObject {

    AREA("area"),
    AREARANGE("arearange"),
    AREASPLINE("areaspline"),
    AREASPLINERANGE("areasplinerange"),
    BAR("bar"),
    BOXPLOT("boxplot"),
    BUBBLE("bubble"),
    COLUMN("column"),
    COLUMNRANGE("columnrange"),
    ERRORBAR("errorbar"),
    FUNNEL("funnel"),
    GAUGE("gauge"),
    HEATMAP("heatmap"),
    LINE("line"),
    PIE("pie"),
    POLYGON("polygon"),
    PYRAMID("pyramid"),
    SCATTER("scatter"),
    SOLIDGAUGE("solidgauge"),
    SPLINE("spline"),
    TREEMAP("treemap"),
    WATERFALL("waterfall");

    private String highchartsvalue;

    ChartType(String highchartsvalue) {
        this.highchartsvalue = highchartsvalue;
    }

    public String getHighChartValue() {
        return this.highchartsvalue;
    }
}