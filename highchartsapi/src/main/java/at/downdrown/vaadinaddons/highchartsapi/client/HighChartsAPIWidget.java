package at.downdrown.vaadinaddons.highchartsapi.client;

import com.google.gwt.user.client.ui.Label;

// Extend any GWT Widget
public class HighChartsAPIWidget extends Label {

	public HighChartsAPIWidget() {

		// CSS class-name should not be v- prefixed
		setStyleName("highchartsapi");

		// State is set to widget in HighChartsAPIConnector		
	}

}