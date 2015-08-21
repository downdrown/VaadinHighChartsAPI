package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import java.util.List;

public class AreaChartSeries extends HighChartsSeriesImpl {

    public AreaChartSeries(String name) {
        chartType = ChartType.AREA;
        this.name = name;
    }

    public AreaChartSeries(String name, List<Object> data) {
        chartType = ChartType.AREA;
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