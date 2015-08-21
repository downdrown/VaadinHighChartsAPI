package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import java.util.List;

public class BarChartSeries extends HighChartsSeriesImpl {

    public BarChartSeries(String name) {
        chartType = ChartType.BAR;
        this.name = name;
    }

    public BarChartSeries(String name, List<Object> data) {
        chartType = ChartType.BAR;
        this.name = name;
        this.data = data;
    }

    @Deprecated
    public List<Object> getData() {
        return this.data;
    }

    @Deprecated
    public void setData(List<Object> data) {
        this.data = data;
    }

}