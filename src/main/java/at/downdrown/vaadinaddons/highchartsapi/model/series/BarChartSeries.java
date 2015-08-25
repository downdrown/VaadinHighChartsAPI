package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;

import java.util.List;

public class BarChartSeries extends HighChartsSeriesImpl {

    public BarChartSeries(String name) {
        chartType = ChartType.BAR;
        this.name = name;
    }

    public BarChartSeries(String name, List<HighChartsData> data) {
        chartType = ChartType.BAR;
        this.name = name;
        this.data = data;
    }

    @Deprecated
    public List<HighChartsData> getData() {
        return this.data;
    }

    @Deprecated
    public void setData(List<HighChartsData> data) {
        this.data = data;
    }

}