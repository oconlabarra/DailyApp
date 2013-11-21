package com.inghackathon.dailyapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
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
                    // retrieve format name
                    //String scanFormat = scanningResult.getFormatName();
                    
                    // write retrieved value on the text views
                    //formatTxt.setText("FORMAT: " + scanFormat);
                    //contentTxt.setText("CONTENT: " + scanContent);
                    this.toast("Scan result: " + scanContent);
                    
            } else {
                    // scan data is not received (for example, if the user cancels the scan by pressing the back button)
                Toast toast = Toast.makeText(getApplicationContext(), "No scan data received!", Toast.LENGTH_SHORT);
                toast.show();
            }
    }
}
