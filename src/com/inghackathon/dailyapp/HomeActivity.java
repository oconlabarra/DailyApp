package com.inghackathon.dailyapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
//Test from Jemmy
// test from Fry
//Test from Alexey

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	public void onClickScanBtn(View v){
		this.toast("Scan Button clicked");
	}
	
	public void onClickCartBtn(View v){
		this.toast("Cart Button clicked");
		
	}
	
	public void toast(String s){
		Context context = getApplicationContext();
		int duration = Toast.LENGTH_SHORT;

		Toast.makeText(context, s, duration).show();
	}
	

}
