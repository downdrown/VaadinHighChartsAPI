package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;

import java.util.List;

public class AreaChartSeries extends HighChartsSeriesImpl {

    public AreaChartSeries(String name) {
        chartType = ChartType.AREA;
        this.name = name;
    }

    public AreaChartSeries(String name, List<HighChartsData> data) {
        chartType = ChartType.AREA;
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