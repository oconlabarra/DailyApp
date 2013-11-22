package com.inghackathon.dailyapp.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import com.inghackathon.dailyapp.HomeActivity;
import com.inghackathon.dailyapp.R;
import com.inghackathon.dailyapp.data.ProductClass;

public class ProductActivity extends Activity {
	ProductClass productClass;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_product);
		
		Intent intent = getIntent();
		String barcodeNo = intent.getStringExtra(HomeActivity.PRODUCT_BARCODE);
		productClass = new ProductClass(barcodeNo);
		toast(barcodeNo);
		
//		pc.Name;
//		pc.Price;
//		pc.BarCodeOfProductRelated1;
//		pc.BarCodeOfProductRelated2;
//		pc.BarCodeOfProductRelated3;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.product, menu);
		return true;
	}

	public void toast(String s){
		Context context = getApplicationContext();
		int duration = Toast.LENGTH_SHORT;

		Toast.makeText(context, s, duration).show();
	}
}
