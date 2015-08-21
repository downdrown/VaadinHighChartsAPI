package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;

import java.util.List;

public class ColumnChartSeries extends HighChartsSeriesImpl {

    public ColumnChartSeries(String name) {
        chartType = ChartType.COLUMN;
        this.name = name;
    }

    public ColumnChartSeries(String name, List<Object> data) {
        chartType = ChartType.COLUMN;
        this.name = name;
        this.data = data;
    }

    @Deprecated
    public List<Object> getData() {
        return data;
    }

    @Deprecated
    public void setData(List<Object> data) {
        this.data = data;
    }

}