/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi;

import com.vaadin.ui.AbstractJavaScriptComponent;

public abstract class AbstractHighChart extends AbstractJavaScriptComponent {
    private static final long serialVersionUID = 7738496276049495017L;

    public static int currChartId = 0;

    public static int nextChartId() {
        return ++currChartId;
    }


    protected int chartId = nextChartId();

    /**
     * Creates the chart object.
     */
    public AbstractHighChart() {
        setId(getDomId());
        getState().domId = getDomId();
        getState().hcjs = "";
    }

    /**
     * Returns the stage of the chart that is shared with the web browser.
     */
    @Override
    protected HighChartState getState() {
        return (HighChartState) super.getState();
    }

    /**
     * Returns the DOM ID of the chart component.
     *
     * @return DOM ID of the chart component
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
}
