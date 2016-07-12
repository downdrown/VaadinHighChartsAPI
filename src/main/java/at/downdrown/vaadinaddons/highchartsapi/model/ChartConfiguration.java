/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model;

import at.downdrown.vaadinaddons.highchartsapi.Colors;
import at.downdrown.vaadinaddons.highchartsapi.exceptions.HighChartsException;
import at.downdrown.vaadinaddons.highchartsapi.exceptions.NoChartTypeException;
import at.downdrown.vaadinaddons.highchartsapi.exceptions.WrongPlotOptionsException;
import at.downdrown.vaadinaddons.highchartsapi.exceptions.WrongSeriesException;
import at.downdrown.vaadinaddons.highchartsapi.model.plotoptions.*;
import at.downdrown.vaadinaddons.highchartsapi.model.series.HighChartsSeries;
import com.vaadin.shared.ui.colorpicker.Color;

import java.util.ArrayList;
import java.util.List;

public class ChartConfiguration {

    private ChartType chartType = null;
    private Color backgroundColor = null;
    private String title = null;
    private Color titleFontColor = Colors.DIMGRAY;
    private String titleFont = "Trebuchet MS";
    private int titleFontSize = 20;
    private String subTitle = null;
    private Color subTitleFontColor = Colors.DIMGRAY;
    private String subTitleFont = "Trebuchet MS";
    private int subTitleFontSize = 15;
    private boolean creditsEnabled = false;
    private boolean legendEnabled = true;
    private boolean tooltipEnabled = true;
    private boolean exportingEnabled = true;
    private Axis xAxis = new Axis(Axis.AxisType.xAxis);
    private Axis yAxis = new Axis(Axis.AxisType.yAxis);
    private Margin chartMargin = null;
    private List<HighChartsSeries> seriesList = new ArrayList<HighChartsSeries>();
    private List<Color> colors = new ArrayList<Color>();
    private HighChartsPlotOptions plotOptions = null;
    private ZoomType zoomType = null;

    //Constructors
    public ChartConfiguration() {
        //Add default chart colors for special look & feel.
        this.colors.add(Colors.LIGHTSKYBLUE);
        this.colors.add(Colors.LIGHTGREEN);
        this.colors.add(Colors.LIGHTSALMON);
        this.colors.add(Colors.LIGHTCORAL);
        this.colors.add(Colors.LIGHTSTEELBLUE);
        this.colors.add(Colors.LIGHTGRAY);
    }

    public String getTitle() {
        return title;
    }

    /**
     * Set the chart's title.
     *
     * @param title The chart's title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public ChartType getChartType() {
        return chartType;
    }

    /**
     * Set chart type. Use the {@link ChartType} enumeration for this purpose.
     * @param chartType The chart type.
     */
    public void setChartType(ChartType chartType) {
        this.chartType = chartType;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Set the chart's background color. Use the {@link at.downdrown.vaadinaddons.highchartsapi.Colors} interface for this purpose.
     * @param backgroundColor The chart's background color.
     */
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public boolean isCreditsEnabled() {
        return creditsEnabled;
    }

    /**
     * Set the chart's credits en- or disabled.
     * @param creditsEnabled enable or disable credits.
     */
    public void setCreditsEnabled(boolean creditsEnabled) {
        this.creditsEnabled = creditsEnabled;
    }

    public boolean isLegendEnabled() {
        return legendEnabled;
    }

    /**
     * Set the chart's legend en- or disabled.
     * @param legendEnabled enable or disable legend.
     */
    public void setLegendEnabled(boolean legendEnabled) {
        this.legendEnabled = legendEnabled;
    }

    public boolean isTooltipEnabled() {
        return tooltipEnabled;
    }

    /**
     * Set the chart's tooltip en- or disabled.
     * @param tooltipEnabled enable or disable tooltip.
     */
    public void setTooltipEnabled(boolean tooltipEnabled) {
        this.tooltipEnabled = tooltipEnabled;
    }

     public boolean isExportingEnabled() {
        return exportingEnabled;
    }

    /**
     * Set the chart's exporting en- or disabled.
     * Disable exporting will hide the context button, but API methods will still be available.
     * @param exportingEnabled enable or disable exporting.
     */
    public void setExportingEnabled(boolean exportingEnabled) {
        this.exportingEnabled = exportingEnabled;
    }

    public Axis getxAxis() {
        return xAxis;
    }

    /**
     * Set the chart's {@link Axis} object.
     * @param xAxis Axis configuration object.
     */
    public void setxAxis(Axis xAxis) {
        this.xAxis = xAxis;
    }

    public Axis getyAxis() {
        return yAxis;
    }

    /**
     * Set the chart's {@link Axis} object.
     * @param yAxis Axis configuration object.
     */
    public void setyAxis(Axis yAxis) {
        this.yAxis = yAxis;
    }

    public Margin getChartMargin() {
        return chartMargin;
    }

    /**
     * Set the chart's margins. Use the {@link Margin} object for this purpose.
     *
     * @param chartMargin The chart's margin. (LEFT - TOP - RIGHT - BOTTOM)
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
     * @param seriesList The chart's data.
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
     * @param colors The chart's rendering colors.
     */
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public HighChartsPlotOptions getPlotOptions() {
        return plotOptions;
    }

    /**
     * Set the chart's plotOptions. If none is passed, default (API) plotOptions will be used.
     * @param plotOptions plotoptions to set.
     */
    public void setPlotOptions(HighChartsPlotOptions plotOptions) {
        this.plotOptions = plotOptions;
    }

    public ZoomType getZoomType() {
        return zoomType;
    }

    /**
     * Set the chart's zoomType. None if nothing was set.
     *
     * @param zoomType the chart's zoomType.
     */
    public void setZoomType(ZoomType zoomType) {
        this.zoomType = zoomType;
    }

    public Color getTitleFontColor() {
        return titleFontColor;
    }

    /**
     * Set the chart's title color. Default is DIMGRAY.
     *
     * @param titleFontColor the chart's title color.
     */
    public void setTitleFontColor(Color titleFontColor) {
        this.titleFontColor = titleFontColor;
    }

    public String getTitleFont() {
        return titleFont;
    }

    /**
     * Set the chart's title fontFamily. Default is Trebuchet MS.
     *
     * @param titleFont the chart's fontFamily.
     */
    public void setTitleFont(String titleFont) {
        this.titleFont = titleFont;
    }

    public int getTitleFontSize() {
        return titleFontSize;
    }

    /**
     * Set the chart's title fontSize. Default is 20px.
     *
     * @param titleFontSize the chart's fontSize.
     */
    public void setTitleFontSize(int titleFontSize) {
        this.titleFontSize = titleFontSize;
    }

    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Set the chart's subtitle.
     *
     * @param subTitle the chart's subtitle.
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Color getSubTitleFontColor() {
        return subTitleFontColor;
    }

    /**
     * Set the chart's subtitle color. Default is DIMGRAY.
     *
     * @param subTitleFontColor the chart's subtitle.
     */
    public void setSubTitleFontColor(Color subTitleFontColor) {
        this.subTitleFontColor = subTitleFontColor;
    }

    public String getSubTitleFont() {
        return subTitleFont;
    }

    /**
     * Set the chart's subtitle fontFamily. Default is Trebuchet MS.
     *
     * @param subTitleFont the chart's subtitle fontFamily.
     */
    public void setSubTitleFont(String subTitleFont) {
        this.subTitleFont = subTitleFont;
    }

    public int getSubTitleFontSize() {
        return subTitleFontSize;
    }

    /**
     * Set the chart's subtitle fontSize. Default is 15px.
     *
     * @param subTitleFontSize the chart's subtitle fontSize.
     */
    public void setSubTitleFontSize(int subTitleFontSize) {
        this.subTitleFontSize = subTitleFontSize;
    }

    /**
     * Returns the generated HighCharts script.
     *
     * @return A rendered {@link at.downdrown.vaadinaddons.highchartsapi.HighChart} object.
     */
    public String getHighChartValue() throws HighChartsException {

        if (getChartType() == null) throw new NoChartTypeException("No ChartType is set to the configuration.");
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        //Chart properties
        builder.append("chart: { renderTo: 'container' ");
        builder.append(",type: '" + getChartType().getHighChartValue() + "'");
        //Set Background
        if (getBackgroundColor() != null) {
            builder.append(",backgroundColor: '" + getBackgroundColor().getCSS() + "'");
        } else {
            builder.append(",backgroundColor: 'transparent'");
        }
        if (getChartMargin() != null) builder.append(getChartMargin().getHighChartValue());

        if (this.zoomType != null) builder.append(", zoomZype: '" + this.zoomType.name().toLowerCase() + "'");

        //Chart Properties End
        builder.append("}");

        //Set Title if any was given
        builder.append(", title: { ");
        if (getTitle() != null) {
            builder.append("text: '" + getTitle() + "'");
        } else {
            builder.append("text: null");
        }
        builder.append(", style: { ");
        builder.append("fontFamily: '" + titleFont + "'");
        builder.append(", color: '" + titleFontColor.getCSS() + "'");
        builder.append(", fontSize: '" + titleFontSize + "px'");
        builder.append(", textShadow: false");
        builder.append("}");
        builder.append("}");

        //Set Subtitle if any was given
        builder.append(", subtitle: { ");
        if (getSubTitle() != null) {
            builder.append("text: '" + subTitle + "'");
        } else {
            builder.append("text: null");
        }
        builder.append(", style: { ");
        builder.append("fontFamily: '" + subTitleFont + "'");
        builder.append(", color: '" + subTitleFontColor.getCSS() + "'");
        builder.append(", fontSize: '" + subTitleFontSize + "px'");
        builder.append(", textShadow: false");
        builder.append("}");
        builder.append("}");


        if (getxAxis() != null) builder.append(", " + getxAxis().getHighChartValue());
        if (getyAxis() != null) builder.append(", " + getyAxis().getHighChartValue());

        builder.append(", credits: { enabled: " + isCreditsEnabled() + " }");
        builder.append(", legend: { enabled: " + isLegendEnabled() + " }");
        builder.append(", tooltip: { enabled: " + isTooltipEnabled() + " }");
        builder.append(", exporting: { enabled: " + isExportingEnabled() + " }");

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

        if (!this.colors.isEmpty()) {
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

        if (this.plotOptions != null) {
            if (this.plotOptions.getChartType() != this.chartType) {
                throw new WrongPlotOptionsException("Different chart types in configuration and plotOptions.");
            } else {
                //Plotoptions added here.
                builder.append(this.plotOptions.getHighChartValue());
            }
        } else {
            if (this.chartType == ChartType.AREA) builder.append(new AreaChartPlotOptions().getHighChartValue());
            if (this.chartType == ChartType.BAR) builder.append(new BarChartPlotOptions().getHighChartValue());
            if (this.chartType == ChartType.COLUMN) builder.append(new ColumnChartPlotOptions().getHighChartValue());
            if (this.chartType == ChartType.LINE) builder.append(new LineChartPlotOptions().getHighChartValue());
            if (this.chartType == ChartType.PIE) builder.append(new PieChartPlotOptions().getHighChartValue());
        }

        builder.append(" };");
        return builder.toString();
    }

    /**
     * Removes the grid lines from your chart configuration.
     * Must be called before {@link at.downdrown.vaadinaddons.highchartsapi.HighChartFactory#renderChart(ChartConfiguration)} to take effect.
     */
    public void removeBackgroundLines() {
        this.xAxis.setLineWidth(0);
        this.xAxis.setGridLineWidth(0);
        this.xAxis.setTickLength(0);
        this.yAxis.setLineWidth(0);
        this.yAxis.setGridLineWidth(0);
        this.yAxis.setTickLength(0);
    }
}