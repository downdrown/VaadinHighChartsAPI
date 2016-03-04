/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.HighchartsObject;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;
import at.downdrown.vaadinaddons.highchartsapi.model.data.base.*;

public interface HighChartsSeries extends HighchartsObject {

    //Needed for script generation!
    ChartType getChartType();

    //Data manipulation
    void addData(HighChartsData highChartsData);
    void addData(int value);
    void addData(float value);
    void addData(double value);
    void addData(DoubleDoubleData doubleDoubleData);
    void addData(DoubleIntData doubleIntData);
    void addData(IntDoubleData intDoubleData);
    void addData(IntIntData intIntData);
    void addData(StringDoubleData stringDoubleData);
    void addData(StringIntData stringIntData);

    void clearData();
}
