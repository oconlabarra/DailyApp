package com.inghackathon.dailyapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SelectProductActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_product);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_product, menu);
		return true;
	}

}
