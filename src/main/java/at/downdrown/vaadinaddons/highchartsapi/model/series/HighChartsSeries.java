/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.HighchartsObject;
import at.downdrown.vaadinaddons.highchartsapi.model.data.base.*;

public interface HighChartsSeries extends HighchartsObject {

    ChartType getChartType();

    /**
     * Add an {@link DoubleDoubleData} object to your series.
     *
     * @param doubleDoubleData - The object you want to add.
     */
    void addData(DoubleDoubleData doubleDoubleData);
    /**
     * Add an {@link DoubleIntData} object to your series.
     *
     * @param doubleIntData - The object you want to add.
     */
    void addData(DoubleIntData doubleIntData);
    /**
     * Add an {@link IntDoubleData} object to your series.
     *
     * @param intDoubleData - The object you want to add.
     */
    void addData(IntDoubleData intDoubleData);
    /**
     * Add an {@link IntIntData} object to your series.
     *
     * @param intIntData - The object you want to add.
     */
    void addData(IntIntData intIntData);
    /**
     * Add an {@link StringDoubleData} object to your series
     *
     * @param stringDoubleData - The object you want to add.
     */
    void addData(StringDoubleData stringDoubleData);
    /**
     * Add an {@link StringIntData} object to your series
     *
     * @param stringIntData - The object you want to add.
     */
    void addData(StringIntData stringIntData);
}
