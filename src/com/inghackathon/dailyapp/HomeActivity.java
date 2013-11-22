package com.inghackathon.dailyapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.inghackathon.dailyapp.data.ProductClass;
import com.inghackathon.dailyapp.data.User;
import com.inghackathon.dailyapp.ui.CartActivity;
import com.inghackathon.dailyapp.ui.PreferenceActivity;
import com.inghackathon.dailyapp.ui.ProductActivity;

public class HomeActivity extends Activity {
	public static final String PRODUCT_BARCODE = "PRODUCT_BARCODE";
	public User user;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		user = User.getInstance();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}
	
	public User getUser(){
		return user;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.home, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_pref:
	            this.goToPref();
	            return true;
	        case R.id.action_settings:
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	private void goToPref(){
		Intent intent = new Intent(this, PreferenceActivity.class);
		startActivity(intent);
	}
	public void onClickScanBtn(View v){
		//this.toast("Scan Button clicked");
//		IntentIntegrator scanIntegrator = new IntentIntegrator(this);
//        scanIntegrator.initiateScan();
		
		String barcodeNo = "4890008100309";
		Intent intent = new Intent(this, ProductActivity.class);
		intent.putExtra(PRODUCT_BARCODE, barcodeNo);
		startActivity(intent);
	}
	
	public void onClickCartBtn(View v){
		Intent intent = new Intent(this, CartActivity.class);
		startActivity(intent);
	}
	
	public void toast(String s){
		Context context = getApplicationContext();
		int duration = Toast.LENGTH_SHORT;

		Toast.makeText(context, s, duration).show();
	}
	

	/**
     * Retrieve scan result - From tutorial
     */
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
            // parse the result into an instance of the ZXing Intent Result
            IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
            
            if (scanningResult != null) {
                    //we have a result, retrieve content of the scan
                    String scanContent = scanningResult.getContents();
                    
                    // write retrieved value on the toast
                    this.toast("Scan result: " + scanContent);
                    
            } else {
                    // scan data is not received (for example, if the user cancels the scan by pressing the back button)
                Toast toast = Toast.makeText(getApplicationContext(), "No scan data received!", Toast.LENGTH_SHORT);
                toast.show();
            }
    }
}
