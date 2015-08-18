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
    private Color dataLabelsFontColor = Colors.DIMGRAY;
    private int dataLabelsFontSize = 15;
    private boolean allowPointSelect = true;
    private boolean animated = true;
    private boolean shadow = false;
    private boolean textShadow = false;

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

    @Override
    public ChartType getChartType() {
        return this.chartType;
    }

    @Override
    public String getHighChartValue() {
        StringBuilder builder = new StringBuilder();
        builder.append(", plotOptions: { ");
        builder.append(this.chartType.name().toLowerCase() + ": { ");
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