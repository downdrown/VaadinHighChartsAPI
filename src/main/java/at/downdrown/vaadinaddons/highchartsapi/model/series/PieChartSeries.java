/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.PieChartData;
import at.downdrown.vaadinaddons.highchartsapi.model.data.base.*;

import java.util.ArrayList;
import java.util.List;

public class PieChartSeries extends HighChartsSeriesImpl {

    private List<PieChartData> data = new ArrayList<PieChartData>();

    public PieChartSeries(String name) {
        this.chartType = ChartType.PIE;
        this.name = name;
    }

    public List<PieChartData> getData() {
        return data;
    }

    public void setData(List<PieChartData> data) {
        this.data = data;
    }

    public String getHighChartValue() {

        StringBuilder builder = new StringBuilder();
        builder.append("{ name: '" + this.name + "', data: [");

        int count = 1;
        if (getData() != null) {

            for (PieChartData data : getData()) {
                if (count == 1) {
                    builder.append(data.getHighChartValue());
                } else if (count > 1) {
                    builder.append(",");
                    builder.append(data.getHighChartValue());
                }
                count++;
            }
        }

        builder.append("]");
        builder.append("}");

        return builder.toString();
    }

    public void addData(PieChartData pieChartData) {
        this.data.add(pieChartData);
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleDoubleData doubleDoubleData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleIntData doubleIntData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntDoubleData intDoubleData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntIntData intIntData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringDoubleData stringDoubleData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringIntData stringIntData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }
}


