/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.plotoptions;

import at.downdrown.vaadinaddons.highchartsapi.Colors;
import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import com.vaadin.shared.ui.colorpicker.Color;

public class LineChartPlotOptions implements HighChartsPlotOptions {

    private final ChartType chartType = ChartType.LINE;
    private boolean dataLabelsEnabled = true;
    private String dataLabelsFont = "Trebuchet MS";
    private String dataLabelFontWeight = "thin";
    private Color dataLabelsFontColor = Colors.DIMGRAY;
    private int dataLabelsFontSize = 15;
    private boolean allowPointSelect = true;
    private boolean animated = true;
    private boolean shadow = false;
    private boolean textShadow = false;


    public boolean isDataLabelsEnabled() {
        return dataLabelsEnabled;
    }

    public void setDataLabelsEnabled(boolean dataLabelsEnabled) {
        this.dataLabelsEnabled = dataLabelsEnabled;
    }

    public String getDataLabelsFont() {
        return dataLabelsFont;
    }

    public void setDataLabelsFont(String dataLabelsFont) {
        this.dataLabelsFont = dataLabelsFont;
    }

    public Color getDataLabelsFontColor() {
        return dataLabelsFontColor;
    }

    public void setDataLabelsFontColor(Color dataLabelsFontColor) {
        this.dataLabelsFontColor = dataLabelsFontColor;
    }

    public int getDataLabelsFontSize() {
        return dataLabelsFontSize;
    }

    public void setDataLabelsFontSize(int dataLabelsFontSize) {
        this.dataLabelsFontSize = dataLabelsFontSize;
    }

    public boolean isAllowPointSelect() {
        return allowPointSelect;
    }

    public void setAllowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
    }

    public boolean isAnimated() {
        return animated;
    }

    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    public boolean isShadow() {
        return shadow;
    }

    public void setShadow(boolean shadow) {
        this.shadow = shadow;
    }

    public String getDataLabelFontWeight() {
        return dataLabelFontWeight;
    }

    public void setDataLabelFontWeight(String dataLabelFontWeight) {
        this.dataLabelFontWeight = dataLabelFontWeight;
    }


    @Override
    public ChartType getChartType() {
        return this.chartType;
    }

    @Override
    public String getHighChartValue() {
        StringBuilder builder = new StringBuilder();
        builder.append(", plotOptions: { ");
        builder.append("line: { ");
        builder.append("allowPointSelect: " + allowPointSelect);
        builder.append(", animation: " + animated);
        builder.append(", shadow: " + shadow);
        builder.append(", dataLabels: { ");
        builder.append("enabled: " + dataLabelsEnabled);
        builder.append(", color: '" + dataLabelsFontColor.getCSS() + "'");
        builder.append(", style: { ");
        builder.append("fontFamily: '" + dataLabelsFont + "'");
        builder.append(", fontWeight: '" + dataLabelFontWeight + "'");
        builder.append(", fontSize: '" + dataLabelsFontSize + "px'");
        builder.append(", textShadow: " + textShadow);
        builder.append(" }");
        builder.append(" }");
        builder.append(" }");
        builder.append(" }");
        return builder.toString();
    }
}