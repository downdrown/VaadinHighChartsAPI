/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model;

import at.downdrown.vaadinaddons.highchartsapi.exceptions.HighChartsException;
import com.vaadin.shared.ui.colorpicker.Color;

import java.util.ArrayList;
import java.util.List;

public class Axis {

    private AxisType axisType = null;
    private AxisValueType axisValueType = AxisValueType.LINEAR;
    private String title = null;
    private List<String> categories = new ArrayList<String>();
    private Color lineColor = null;
    private int lineWidth = 1;
    private boolean showFirstLabel = true;
    private boolean showLastLabel = true;
    private boolean labelsEnabled = true;
    private boolean allowDecimals = true;
    private int tickLength = 1;
    private int gridLineWidth = 1;

    @Deprecated
    /**
     * Can cause an Exception if you forget to set an {@link at.downdrown.vaadinaddons.highchartsapi.model.Axis.AxisType}, use {@link #Axis(AxisType)} instead.
     */
    public Axis() {
    }

    /**
     * Default constructor.
     * @param axisType - Type of axis you want to create.
     */
    public Axis(AxisType axisType) {
        this.axisType = axisType;
    }

    /**
     * Returns the current {@link at.downdrown.vaadinaddons.highchartsapi.model.Axis.AxisType}.
     *
     * @return {@link at.downdrown.vaadinaddons.highchartsapi.model.Axis.AxisType}
     */
    public AxisType getAxisType() {
        return axisType;
    }

    /**
     * Set the {@link at.downdrown.vaadinaddons.highchartsapi.model.Axis.AxisType} for this instance.
     * @param axisType - The type you want to set.
     */
    public void setAxisType(AxisType axisType) {
        this.axisType = axisType;
    }

    /**
     * Returns the current {@link at.downdrown.vaadinaddons.highchartsapi.model.Axis.AxisValueType} for this instance.
     * @return {@link at.downdrown.vaadinaddons.highchartsapi.model.Axis.AxisValueType}
     */
    public AxisValueType getAxisValueType() {
        return axisValueType;
    }

    /**
     * Set the {@link at.downdrown.vaadinaddons.highchartsapi.model.Axis.AxisValueType} for this instance.
     * @param axisValueType - The type you want to set.
     */
    public void setAxisValueType(AxisValueType axisValueType) {
        this.axisValueType = axisValueType;
    }

    /**
     * Returns the current title for this instance.
     * @return {@link String}
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title for this instance.
     * @param title - The title you want to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the current categories for this instance.
     * @return {@link java.util.List}
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     * Set the current categories for this instance.
     * @param categories - The categories you want to set.
     */
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * Returns the current line color.
     * @return {@link Color}
     */
    public Color getLineColor() {
        return lineColor;
    }

    /**
     * Set the line color for the current instance.
     * Use the {@link at.downdrown.vaadinaddons.highchartsapi.Colors} interface for common CSS colors.
     * @param lineColor - The color you want to set.
     */
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    /**
     * Returns the current line width.
     * @return {@link Integer}
     */
    public int getLineWidth() {
        return lineWidth;
    }

    /**
     * Set the line width for the current instance.
     * @param lineWidth - The line width you want to set.
     */
    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    /**
     * Returns if the first label is shown.
     * @return {@link Boolean}
     */
    public boolean isShowFirstLabel() {
        return showFirstLabel;
    }

    /**
     * Set if the first label shall be shown or not.
     * @param showFirstLabel
     */
    public void setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
    }

    /**
     * Returns if the last label is shown.
     * @return {@link Boolean}
     */
    public boolean isShowLastLabel() {
        return showLastLabel;
    }

    /**
     * Set if the last label shall be shown or not.
     * @param showLastLabel
     */
    public void setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
    }

    /**
     * Returns if the labels are enabled or not.
     * @return {@link Boolean}
     */
    public boolean isLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * Set if the labels shall be enabled or not.
     * @param labelsEnabled
     */
    public void setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
    }

    /**
     * Returns if decimals are allowed or not.
     * @return {@link Boolean}
     */
    public boolean isAllowDecimals() {
        return allowDecimals;
    }

    /**
     * Set if decimals shall be allowed or not.
     * @param allowDecimals
     */
    public void setAllowDecimals(boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
    }

    /**
     * Returns the current tick length.
     * @return {@link Integer}
     */
    public int getTickLength() {
        return tickLength;
    }

    /**
     * Set the chart's tickLength.
     *
     * @param tickLength - The tick length you want to set.
     */
    public void setTickLength(int tickLength) {
        this.tickLength = tickLength;
    }

    public int getGridLineWidth() {
        return gridLineWidth;
    }

    /**
     * Set the chart's gridLineWidth.
     *
     * @param gridLineWidth the chart's gridLineWidth.
     */
    public void setGridLineWidth(int gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
    }

    public String getHighChartValue() throws HighChartsException {

        if (this.axisType == null) throw new HighChartsException("No AxisType was set to the passed Axis object.");

        StringBuilder builder = new StringBuilder();
        builder.append(this.axisType.name() + ": { ");

        //Axis Title
        if (this.title != null) {
            builder.append("title : { text: '" + this.title + "' }");
        } else {
            builder.append("title : { text: null }");
        }

        //Axis Value Type
        builder.append(", type: '" + this.axisValueType.name().toLowerCase() + "'");

        //Categories
        if (!this.categories.isEmpty()) {
            builder.append(", categories : [");
            int catCount = 1;
            for (String category : this.categories) {
                if (catCount == 1) {
                    builder.append("'" + category + "'");
                } else if (catCount > 1) {
                    builder.append(", '" + category + "'");
                }
                catCount++;
            }
            builder.append("]");
        }

        //Line Color
        if (this.lineColor != null) {
            builder.append(", lineColor: '" + this.lineColor.getCSS() + "'");
        }

        //LineWidth
        builder.append(", lineWidth: " + lineWidth);

        //GridLineWidth
        builder.append(", gridLineWidth: " + gridLineWidth);

        //TickLength
        builder.append(", tickLength: " + tickLength);

        //Allow Decimals
        builder.append(", allowDecimals: " + this.allowDecimals);

        //Show First Label
        builder.append(", showFirstLabel: " + this.showFirstLabel);

        //Show Last Label
        builder.append(", showLastLabel: " + this.showLastLabel);

        //Axis Labels
        builder.append(", labels: { enabled: " + this.labelsEnabled + " }");

        //Close Tag
        builder.append("}");

        return builder.toString();
    }

    public enum AxisType {
        xAxis,
        yAxis
    }

    public enum AxisValueType {
        LINEAR,
        LOGARITHMIC,
        DATETIME,
        CATEGORY
    }
}
