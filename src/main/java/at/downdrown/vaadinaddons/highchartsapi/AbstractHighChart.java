/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi;

import at.downdrown.vaadinaddons.highchartsapi.exceptions.HighChartsException;
import at.downdrown.vaadinaddons.highchartsapi.model.ChartConfiguration;
import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.JavaScript;


public abstract class AbstractHighChart extends AbstractJavaScriptComponent {
    private static final long serialVersionUID = 7738496276049495017L;
    public static int currChartId = 0;
    protected int chartId = nextChartId();
    private ChartConfiguration chartConfiguration;

    /**
     * Creates the chart object.
     */
    public AbstractHighChart() {
        setId(getDomId());
        getState().domId = getDomId();
        getState().hcjs = "";
    }

    public static int nextChartId() {
        return ++currChartId;
    }

    /**
     * Re-Renders your chart.
     * Make sure you set your new {@link ChartConfiguration} <b><u>BEFORE</u></b> you call {@link #reRender()}.
     *
     * @throws HighChartsException
     */
    public void reRender() throws HighChartsException {
        int componentIndex;
        ChartConfiguration configuration = this.getChartConfiguration();

        AbstractOrderedLayout container = (AbstractOrderedLayout) this.getParent();
        componentIndex = container.getComponentIndex(this);
        container.getComponentIndex(this);
        container.removeComponent(this);
        container.addComponent(HighChartFactory.renderChart(configuration), componentIndex);
    }

    /**
     * Returns the state of the chart that is shared with the web browser.
     */
    @Override
    protected HighChartState getState() {
        return (HighChartState) super.getState();
    }

    /**
     * Returns the DOM ID of the chart component.
     *
     * @return {@link String}
     */
    public String getDomId() {
        return "highchart_" + chartId;
    }

    /**
     * Sets the Highcharts JavaScript code describing the chart.
     * Note that this code binds the the chartoptions parameter to a JS variable called <code>options</code>.
     * <p>Example:</p>
     * <pre>chart.setChartoptions("{ chart: { title: 'my title' } };")</pre>
     *
     * @param chartoptions Highcharts JavaScript code describing the chart
     */
    public void setChartoptions(String chartoptions) {
        getState().hcjs = "var options = " + chartoptions;
    }

    /**
     * Returns the chart's configuration object.
     *
     * @return {@link ChartConfiguration}
     */
    public ChartConfiguration getChartConfiguration() {
        return chartConfiguration;
    }

    /**
     * Set the chart's configuration object.
     *
     * @param chartConfiguration the chart's configuration object.
     */
    public void setChartConfiguration(ChartConfiguration chartConfiguration) {
        this.chartConfiguration = chartConfiguration;
    }

    /**
     * Rerenders your chart configuration.
     */
    public void redraw(ChartConfiguration configuration) throws HighChartsException {
        this.setChartoptions(configuration.getHighChartValue());
        JavaScript.getCurrent().execute("$(#" + this.getDomId() + ").redraw();");
    }
}
