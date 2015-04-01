package at.downdrown.vaadinaddons.highchartsapi;

import at.downdrown.vaadinaddons.highchartsapi.client.HighChartsAPIClientRpc;
import at.downdrown.vaadinaddons.highchartsapi.client.HighChartsAPIServerRpc;
import at.downdrown.vaadinaddons.highchartsapi.client.HighChartsAPIState;

import com.vaadin.shared.MouseEventDetails;

// This is the server-side UI component that provides public API 
// for HighChartsAPI
public class HighChartsAPI extends com.vaadin.ui.AbstractComponent {

	private int clickCount = 0;

	// To process events from the client, we implement ServerRpc
	private HighChartsAPIServerRpc rpc = new HighChartsAPIServerRpc() {

		// Event received from client - user clicked our widget
		public void clicked(MouseEventDetails mouseDetails) {
			
			// Send nag message every 5:th click with ClientRpc
			if (++clickCount % 5 == 0) {
				getRpcProxy(HighChartsAPIClientRpc.class)
						.alert("Ok, that's enough!");
			}
			
			// Update shared state. This state update is automatically 
			// sent to the client. 
			getState().text = "You have clicked " + clickCount + " times";
		}
	};

	public HighChartsAPI() {

		// To receive events from the client, we register ServerRpc
		registerRpc(rpc);
	}

	// We must override getState() to cast the state to HighChartsAPIState
	@Override
	public HighChartsAPIState getState() {
		return (HighChartsAPIState) super.getState();
	}
}
