/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.PieChartData;

import java.util.ArrayList;
import java.util.List;

public class PieChartSeries implements HighChartsSeries {

    private final ChartType chartType = ChartType.PIE;
    private String name;
    private List<PieChartData> data = new ArrayList<PieChartData>();

    public PieChartSeries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    @Override
    public ChartType getChartType() {
        return this.chartType;
    }
}


