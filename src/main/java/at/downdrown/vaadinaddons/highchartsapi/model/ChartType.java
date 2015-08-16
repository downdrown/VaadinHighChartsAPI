/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model;

/**
 * Contains all implementet chart types.
 */
public enum ChartType {
    AREA("area"),
    BAR("bar"),
    COLUMN("column"),
    LINE("line"),
    PIE("pie");

    private String highchartsvalue;

    ChartType(String highchartsvalue) {
        this.highchartsvalue = highchartsvalue;
    }

    public String getHighchartsvalue() {
        return this.highchartsvalue;
    }
}