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

    public AxisType getAxisType() {
        return axisType;
    }

    public void setAxisType(AxisType axisType) {
        this.axisType = axisType;
    }

    public AxisValueType getAxisValueType() {
        return axisValueType;
    }

    public void setAxisValueType(AxisValueType axisValueType) {
        this.axisValueType = axisValueType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public boolean isShowFirstLabel() {
        return showFirstLabel;
    }

    public void setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
    }

    public boolean isShowLastLabel() {
        return showLastLabel;
    }

    public void setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
    }

    public boolean isLabelsEnabled() {
        return labelsEnabled;
    }

    public void setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
    }

    public boolean isAllowDecimals() {
        return allowDecimals;
    }

    public void setAllowDecimals(boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
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
