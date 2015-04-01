/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi;

import com.vaadin.shared.ui.JavaScriptComponentState;

/**
 * State of the chart which is transferred to the web browser whenever a property changed.
 *
 * @author Stefan Endrullis
 */
public class HighChartState extends JavaScriptComponentState {
    private static final long serialVersionUID = -8963272160069864062L;

    public String domId;
    public String hcjs;
}
