/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model;

import at.downdrown.vaadinaddons.highchartsapi.exceptions.NoChartTypeException;
import at.downdrown.vaadinaddons.highchartsapi.exceptions.WrongSeriesException;
import at.downdrown.vaadinaddons.highchartsapi.model.series.HighChartsSeries;
import com.vaadin.shared.ui.colorpicker.Color;

import java.util.ArrayList;
import java.util.List;

public class ChartConfiguration {

    private String title = null;
    private ChartType chartType = null;
    private Color backgroundColor = null;
    private boolean creditsEnabled = false;
    private boolean legendEnabled = true;
    private boolean tooltipEnabled = true;
    private XAxis xAxis = null;
    private YAxis yAxis = null;
    private Margin chartMargin = null;
    private List<HighChartsSeries> seriesList = new ArrayList<HighChartsSeries>();
    private List<Color> colors = new ArrayList<Color>();

    public String getTitle() {
        return title;
    }

    /**
     * Set the chart's title.
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public ChartType getChartType() {
        return chartType;
    }

    /**
     * Set chart type. Use the {@link ChartType} enumeration for this purpose.
     * @param chartType
     */
    public void setChartType(ChartType chartType) {
        this.chartType = chartType;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Set the chart's background color. Use the {@link at.downdrown.vaadinaddons.highchartsapi.Colors} interface for this purpose.
     * @param backgroundColor
     */
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public boolean isCreditsEnabled() {
        return creditsEnabled;
    }

    /**
     * Set the chart's credits en- or disabled.
     * @param creditsEnabled
     */
    public void setCreditsEnabled(boolean creditsEnabled) {
        this.creditsEnabled = creditsEnabled;
    }

    public boolean isLegendEnabled() {
        return legendEnabled;
    }

    /**
     * Set the chart's legend en- or disabled.
     * @param legendEnabled
     */
    public void setLegendEnabled(boolean legendEnabled) {
        this.legendEnabled = legendEnabled;
    }

    public boolean isTooltipEnabled() {
        return tooltipEnabled;
    }

    /**
     * Set the chart's tooltip en- or disabled.
     * @param tooltipEnabled
     */
    public void setTooltipEnabled(boolean tooltipEnabled) {
        this.tooltipEnabled = tooltipEnabled;
    }

    public XAxis getxAxis() {
        return xAxis;
    }

    /**
     * Set the chart's {@link XAxis} object.
     * @param xAxis
     */
    public void setxAxis(XAxis xAxis) {
        this.xAxis = xAxis;
    }

    public YAxis getyAxis() {
        return yAxis;
    }

    /**
     * Set the chart's {@link YAxis} object.
     * @param yAxis
     */
    public void setyAxis(YAxis yAxis) {
        this.yAxis = yAxis;
    }

    public Margin getChartMargin() {
        return chartMargin;
    }

    /**
     * Set the chart's margins. Use the {@link Margin} object for this purpose.
     *
     * @param chartMargin
     */
    public void setChartMargin(Margin chartMargin) {
        this.chartMargin = chartMargin;
    }

    public List<HighChartsSeries> getSeriesList() {
        return seriesList;
    }

    /**
     * Set the chart's series.
     *
     * @param seriesList
     */
    public void setSeriesList(List<HighChartsSeries> seriesList) {
        this.seriesList = seriesList;
    }

    public List<Color> getColors() {
        return colors;
    }

    /**
     * Set the chart's default rendering colors. Use a collection of {@link Color} objects for this purpose.
     * Maybe the {@link at.downdrown.vaadinaddons.highchartsapi.Colors} interface is helpful herefore.
     *
     * @param colors
     */
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    /**
     * Returns the generated HighCharts script.
     *
     * @return
     */
    public String getHighChartValue() throws NoChartTypeException, WrongSeriesException {

        if (getChartType() == null) throw new NoChartTypeException("No ChartType is set to the configuration.");
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        //Chart properties
        builder.append("chart: { renderTo: 'container' ");
        builder.append(",type: '" + getChartType().getHighchartsvalue() + "'");
        //Set Background
        if (getBackgroundColor() != null) {
            builder.append(",backgroundColor: '" + getBackgroundColor().getCSS() + "'");
        } else {
            builder.append(",backgroundColor: 'transparent'");
        }
        if (getChartMargin() != null) builder.append(getChartMargin().getHighChartValue());
        builder.append("}");

        //Set Title if any was given
        if (getTitle() != null) {
            builder.append(", title: { text: '" + getTitle() + "' }");
        } else {
            builder.append(", title: { text: null }");
        }
        if (getxAxis() != null) builder.append(getxAxis().getHighChartValue());
        if (getyAxis() != null) builder.append(getyAxis().getHighChartValue());

        builder.append(", credits: { enabled: " + isCreditsEnabled() + " }");
        builder.append(", legend: { enabled: " + isLegendEnabled() + " }");
        builder.append(", tooltip: { enabled: " + isTooltipEnabled() + " }");

        if (!getSeriesList().isEmpty()) {
            int seriesNr = 1;
            builder.append(", series: [");
            for (HighChartsSeries series : getSeriesList()) {
                if (getChartType() != series.getChartType())
                    throw new WrongSeriesException("The passed series object has a different chart type than the configuration. Series: " + series.getChartType() + " / Configuration: " + getChartType());
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

        if (!getColors().isEmpty()) {
            int colorsNr = 1;
            builder.append(", colors: [");
            for (Color color : getColors()) {
                if (colorsNr == 1) {
                    builder.append("'" + color.getCSS() + "'");
                } else if (colorsNr > 1) {
                    builder.append(",");
                    builder.append("'" + color.getCSS() + "'");
                }
                colorsNr++;
            }
            builder.append("]");
        }

        builder.append("};");
        return builder.toString();
    }
}
