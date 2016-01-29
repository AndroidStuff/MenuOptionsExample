package com.example.menuoptions;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	private static final int ITEM_COLORS_ID = Menu.FIRST;
	private static final int ITEM_OPTIONS_ID = Menu.FIRST + 1;
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
		menu.add(Menu.NONE, ITEM_OPTIONS_ID, Menu.NONE, R.string.options);
		menu.add(Menu.NONE, ITEM_QUIT_ID, Menu.NONE, R.string.quit);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
