package com.example.menuoptions;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static final int ITEM_COLORS_ID = Menu.FIRST;
	private static final int ITEM_DAYS_OF_WEEK_ID = Menu.FIRST + 1;
	private static final int ITEM_QUIT_ID = Menu.FIRST + 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);

		//Adding Menu Items Programatically
		menu.add(Menu.NONE, ITEM_COLORS_ID, Menu.NONE, R.string.colors);
		menu.add(Menu.NONE, ITEM_DAYS_OF_WEEK_ID, Menu.NONE, R.string.days_of_week);
		menu.add(Menu.NONE, ITEM_QUIT_ID, Menu.NONE, R.string.quit); //Is Quit Menu, a good practice for Android app??

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		//if (id == R.id.action_settings) { return true; }
		if (id == ITEM_COLORS_ID) {
			//
		} else if (id == ITEM_DAYS_OF_WEEK_ID ) {
			final String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
			alertDialogBuilder.setTitle("Sample Options");
			alertDialogBuilder.setItems(days, new OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					String day = days[which];
					Toast.makeText(MainActivity.this, "So you like " + day + ", ha?", Toast.LENGTH_LONG).show();
				}
			});
			alertDialogBuilder.setNegativeButton("Cancel", null);
			alertDialogBuilder.show();
		} else if (id == ITEM_QUIT_ID){
			finish();
		}
		//		return super.onOptionsItemSelected(item);
		return true;
	}
}
