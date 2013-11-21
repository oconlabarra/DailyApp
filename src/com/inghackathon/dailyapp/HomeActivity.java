package com.inghackathon.dailyapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.inghackathon.dailyapp.ui.*;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
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
//		if(selectedView == null){
//			Toast.makeText(getApplicationContext(), "Please select your preference", 
//					   Toast.LENGTH_SHORT).show();
//		}else{
//			Intent intent = new Intent(this, HomeActivity.class);
//			int selectedId = selectedView.getId();
//			int selectedPref = -1;
//			for(int i = 0; i < prefIconIds.length; i++){
//				if(prefIconIds[i].equals(selectedId)){
//					selectedPref = i;
//				}
//			}
//			
//			if(selectedPref > -1){
//				intent.putExtra(SELECTED_PREF, ""+ selectedPref);
//			}
//			startActivity(intent);
//
//		}
		Intent intent = new Intent(this, PreferenceActivity.class);
		startActivity(intent);
	}
	public void onClickScanBtn(View v){
		//this.toast("Scan Button clicked");
		IntentIntegrator scanIntegrator = new IntentIntegrator(this);
        scanIntegrator.initiateScan();
	}
	
	public void onClickCartBtn(View v){
		this.toast("Cart Button clicked");
		
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
