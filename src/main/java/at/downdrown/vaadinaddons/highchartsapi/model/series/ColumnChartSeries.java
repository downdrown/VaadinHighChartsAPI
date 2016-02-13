package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;

import java.util.List;

public class ColumnChartSeries extends HighChartsSeriesImpl {

    public ColumnChartSeries(String name) {
        chartType = ChartType.COLUMN;
        this.name = name;
    }

    public ColumnChartSeries(String name, List<HighChartsData> data) {
        chartType = ChartType.COLUMN;
        this.name = name;
        this.data = data;
    }

    @Deprecated
    public List<HighChartsData> getData() {
        return data;
    }

    @Deprecated
    public void setData(List<HighChartsData> data) {
        this.data = data;
    }

}