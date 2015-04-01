/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model;

import com.vaadin.shared.ui.colorpicker.Color;

import java.util.ArrayList;
import java.util.List;

public class ChartConfiguration {

    private String title = null;
    private ChartType chartType = ChartType.PIE;
    private Color backgroundColor = new Color(245, 245, 245);
    private boolean creditsEnabled = false;
    private boolean legendEnabled = true;
    private boolean tooltipEnabled = true;
    private XAxis xAxis = null;
    private YAxis yAxis = null;
    private List<Series> seriesList = new ArrayList<Series>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ChartType getChartType() {
        return chartType;
    }

    public void setChartType(ChartType chartType) {
        this.chartType = chartType;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public boolean isCreditsEnabled() {
        return creditsEnabled;
    }

    public void setCreditsEnabled(boolean creditsEnabled) {
        this.creditsEnabled = creditsEnabled;
    }

    public boolean isLegendEnabled() {
        return legendEnabled;
    }

    public void setLegendEnabled(boolean legendEnabled) {
        this.legendEnabled = legendEnabled;
    }

    public boolean isTooltipEnabled() {
        return tooltipEnabled;
    }

    public void setTooltipEnabled(boolean tooltipEnabled) {
        this.tooltipEnabled = tooltipEnabled;
    }

    public XAxis getxAxis() {
        return xAxis;
    }

    public void setxAxis(XAxis xAxis) {
        this.xAxis = xAxis;
    }

    public YAxis getyAxis() {
        return yAxis;
    }

    public void setyAxis(YAxis yAxis) {
        this.yAxis = yAxis;
    }

    public List<Series> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(List<Series> seriesList) {
        this.seriesList = seriesList;
    }

    public String getHighChartValue() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append("chart: { renderTo: 'container', type: '" + getChartType().getHighchartsvalue() + "', backgroundColor: '" + getBackgroundColor().getCSS() + "' }");

        if (getTitle() != null) builder.append(", title: { text: '" + getTitle() + "' }");
        if (getxAxis() != null) builder.append(getxAxis().getHighChartValue());
        if (getyAxis() != null) builder.append(getyAxis().getHighChartValue());

        builder.append(", credits: { enabled: " + isCreditsEnabled() + " }");
        builder.append(", legend: { enabled: " + isLegendEnabled() + " }");
        builder.append(", tooltip: { enabled: " + isTooltipEnabled() + " }");

        if (!getSeriesList().isEmpty()) {
            int seriesNr = 1;
            builder.append(", series: [");
            for (Series series : getSeriesList()) {
                if (seriesNr == 1) {
                    builder.append(series.getHighChartValue());
                } else if (seriesNr > 1) {
                    builder.append(",");
                    builder.append(series.getHighChartValue());
                }
                seriesNr++;
            }
            builder.append("]");
        }

        builder.append("};");
        return builder.toString();
    }
}
