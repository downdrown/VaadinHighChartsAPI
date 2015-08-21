/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.plotoptions;

import at.downdrown.vaadinaddons.highchartsapi.Colors;
import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import com.vaadin.shared.ui.colorpicker.Color;

public class HighChartsPlotOptionsImpl implements HighChartsPlotOptions {

    ChartType chartType = null;
    private boolean dataLabelsEnabled = true;
    private String dataLabelsFont = "Trebuchet MS";
    private String dataLabelFontWeight = "thin";
    private DashStyle dashStyle = DashStyle.Solid;
    private Color dataLabelsFontColor = Colors.DIMGRAY;
    private int dataLabelsFontSize = 15;
    private boolean allowPointSelect = true;
    private boolean animated = true;
    private boolean shadow = false;
    private boolean textShadow = false;
    private boolean showCheckBox = false;
    private boolean connectNulls = false;
    private Steps steps = Steps.FALSE;

    /**
     * Returns if datalabels are enabled.
     *
     *  @return {@link Boolean}
     */
    public boolean isDataLabelsEnabled() {
        return dataLabelsEnabled;
    }

    /**
     * Set if datalabels shall be enabled.
     *
     * @param dataLabelsEnabled
     */
    public void setDataLabelsEnabled(boolean dataLabelsEnabled) {
        this.dataLabelsEnabled = dataLabelsEnabled;
    }

    /**
     * Returns the font for the datalabels.
     *
     * @return {@link String}
     */
    public String getDataLabelsFont() {
        return dataLabelsFont;
    }

    /**
     * Set the font for the datalabels.
     *
     * @param dataLabelsFont CSS FontFamily value.
     */
    public void setDataLabelsFont(String dataLabelsFont) {
        this.dataLabelsFont = dataLabelsFont;
    }

    /**
     * Returns the {@link Color} for the datalabels.
     *
     *  @return {@link Color}
     */
    public Color getDataLabelsFontColor() {
        return dataLabelsFontColor;
    }

    /**
     * Set the color for the datalabels.
     * You can use the {@link Colors} interface for common CSS color names.
     *
     * @param dataLabelsFontColor The color you want to set.
     */
    public void setDataLabelsFontColor(Color dataLabelsFontColor) {
        this.dataLabelsFontColor = dataLabelsFontColor;
    }

    /**
     * Returns the font size for the datalabels.
     *
     * @return {@link Integer}
     */
    public int getDataLabelsFontSize() {
        return dataLabelsFontSize;
    }

    /**
     * Set the font size for the datalabels.
     *
     * @param dataLabelsFontSize The font size you want to set.
     */
    public void setDataLabelsFontSize(int dataLabelsFontSize) {
        this.dataLabelsFontSize = dataLabelsFontSize;
    }

    /**
     * Returns the font weight for the datalabels.
     *
     * @return {@link String}
     */
    public String getDataLabelFontWeight() {
        return dataLabelFontWeight;
    }

    /**
     * Set the font weight for the datalabels.
     *
     * @param dataLabelFontWeight The font weight you want to set.
     */
    public void setDataLabelFontWeight(String dataLabelFontWeight) {
        this.dataLabelFontWeight = dataLabelFontWeight;
    }

    /**
     * Returns if pointer selection is enabled.
     *
     * @return {@link Boolean}
     */
    public boolean isAllowPointSelect() {
        return allowPointSelect;
    }

    /**
     * Set if pointer selection shall be enabled.
     *
     * @param allowPointSelect
     */
    public void setAllowPointSelect(boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
    }

    /**
     * Returns if animation is enabled.
     *
     * @return {@link Boolean}
     */
    public boolean isAnimated() {
        return animated;
    }

    /**
     * Set if animation shall be enabled.
     *
     * @param animated
     */
    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    /**
     * Returns if shadow is enabled.
     *
     * @return {@link Boolean}
     */
    public boolean isShadow() {
        return shadow;
    }

    /**
     * Set if shadow shall be enabled.
     *
     * @param shadow
     */
    public void setShadow(boolean shadow) {
        this.shadow = shadow;
    }

    /**
     * Returns the current dashstyle.
     *
     * @return {@link at.downdrown.vaadinaddons.highchartsapi.model.plotoptions.HighChartsPlotOptionsImpl.DashStyle}
     */
    public DashStyle getDashStyle() {
        return dashStyle;
    }

    /**
     * Set the dash style.
     *
     * @param dashStyle The {@link at.downdrown.vaadinaddons.highchartsapi.model.plotoptions.HighChartsPlotOptionsImpl.DashStyle} you want to set.
     */
    public void setDashStyle(DashStyle dashStyle) {
        this.dashStyle = dashStyle;
    }

    /**
     * Returns if there series checkbox is enabled.
     *
     * @return {@link Boolean}
     */
    public boolean isShowCheckBox() {
        return showCheckBox;
    }

    /**
     * If set to true, there will be a little Checkbox in the Legend from where you can choose
     * which series yo want to see in the chart.
     *
     * @param showCheckBox
     */
    public void setShowCheckBox(boolean showCheckBox) {
        this.showCheckBox = showCheckBox;
    }

    /**
     * Returns if the chart gets connected over null points.
     *
     * @return {@link Boolean}
     */
    public boolean isConnectNulls() {
        return connectNulls;
    }

    /**
     * Set if the chart should be connected over null points.
     *
     * @param connectNulls
     */
    public void setConnectNulls(boolean connectNulls) {
        this.connectNulls = connectNulls;
    }

    /**
     * Returns the steps property.
     *
     * @return {@link at.downdrown.vaadinaddons.highchartsapi.model.plotoptions.HighChartsPlotOptionsImpl.Steps}
     */
    public Steps getSteps() {
        return steps;
    }

    /**
     * Whether to apply steps to the chart.
     *
     * @param steps The value you want to set.
     */
    public void setSteps(Steps steps) {
        this.steps = steps;
    }


    @Override
    public ChartType getChartType() {
        return this.chartType;
    }

    @Override
    public String getHighChartValue() {
        StringBuilder builder = new StringBuilder();
        builder.append(", plotOptions: { ");
        builder.append(chartType.getHighChartValue().toLowerCase() + ": { ");
        builder.append("allowPointSelect: " + allowPointSelect);
        builder.append(", dashStyle: '" + dashStyle.name() +"'");
        builder.append(", showCheckbox: " + showCheckBox);
        builder.append(", step: " + steps.name());
        builder.append(", connectNulls: " + connectNulls);
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

    public enum DashStyle {
        Solid,
        ShortDash,
        ShortDot,
        ShortDashDot,
        ShortDashDotDot,
        Dot,
        Dash,
        LongDash,
        DashDot,
        LongDashDot,
        LongDashDotDot;
    }

    public enum Steps {
        LEFT,
        CENTER,
        RIGHT,
        FALSE
    }

}