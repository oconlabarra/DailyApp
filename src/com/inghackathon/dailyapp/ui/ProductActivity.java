package com.inghackathon.dailyapp.ui;

import com.inghackathon.dailyapp.R;
import com.inghackathon.dailyapp.R.layout;
import com.inghackathon.dailyapp.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ProductActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_product);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.product, menu);
		return true;
	}

}
