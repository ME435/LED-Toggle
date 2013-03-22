package edu.rosehulman.ledtoggle;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;
import edu.rosehulman.me435.AccessoryActivity;

public class LedToggleActivity extends AccessoryActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_led_toggle);
	}
	
	public void handleToggleClick(View view) {
		ToggleButton tb = (ToggleButton) view;
	    if (tb.isChecked()) {
	        // Send On
	    	sendCommand("On");
	    } else {
	        // Send Off
	    	sendCommand("Off");
	    }
	}
	
	@Override
	protected void onCommandReceived(String receivedCommand) {
		super.onCommandReceived(receivedCommand);
		Toast.makeText(this, "Received: " + receivedCommand, Toast.LENGTH_SHORT).show();
	}
}
