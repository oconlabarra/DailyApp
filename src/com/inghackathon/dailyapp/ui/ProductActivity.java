package com.inghackathon.dailyapp.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.inghackathon.dailyapp.HomeActivity;
import com.inghackathon.dailyapp.R;
import com.inghackathon.dailyapp.data.ProductClass;
import com.inghackathon.dailyapp.data.User;

public class ProductActivity extends Activity {
	ProductClass productClass;
	ProductClass pc1;
	ProductClass pc2;
	ProductClass pc3;
	public User user;
	
	public static final String PRODUCT_BARCODE = "PRODUCT_BARCODE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_product);
		
		Intent intent = getIntent();
		String barcodeNo = intent.getStringExtra(HomeActivity.PRODUCT_BARCODE);
		productClass = new ProductClass(barcodeNo);
		
		
		updateProductInfo(productClass);
		
		
//		pc.BarCodeOfProductRelated1;
//		pc.BarCodeOfProductRelated2;
//		pc.BarCodeOfProductRelated3;
	}
	
	private void updateProductInfo(ProductClass productClass){
		TextView textName = (TextView) findViewById(R.id.textProductName);
		textName.setText(productClass.Name);
		
		TextView textPrice = (TextView) findViewById(R.id.textPrice);
		String euroSign = "\u20ac";
		textPrice.setText(euroSign + " " + productClass.Price);
		
		//Set photos for the scanned product and  related products
		ImageView productImage = (ImageView) findViewById(R.id.imageProduct);
		productImage.setImageResource(productClass.productImageResourceId);
		
		//Update criteria image
		ImageView imageCriteria = (ImageView) findViewById(R.id.imageCriteria);
		imageCriteria.setImageResource(productClass.detailImageResourceId);
		
		
		ImageView imageChoice1 = (ImageView) findViewById(R.id.imageChoice1);
		ImageView imageChoice2 = (ImageView) findViewById(R.id.imageChoice2);
		ImageView imageChoice3 = (ImageView) findViewById(R.id.imageChoice3);
		pc1 = new ProductClass(productClass.BarCodeOfProductRelated1);
		pc2 = new ProductClass(productClass.BarCodeOfProductRelated2);
		pc3 = new ProductClass(productClass.BarCodeOfProductRelated3);
		imageChoice1.setImageResource(pc1.productImageResourceId);
		imageChoice2.setImageResource(pc2.productImageResourceId);
		imageChoice3.setImageResource(pc3.productImageResourceId);
		
		
		
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
	
	public void onClickCartBtn(View view)
	{
		Intent intent = new Intent(this, ProductActivity.class);
		String chosenBarCode = new String();
		
		switch (view.getId())
		{
		case R.id.imageChoice1:
			chosenBarCode = pc1.BarCode;
			break;
		case R.id.imageChoice2:
			chosenBarCode = pc2.BarCode;
			break;
		case R.id.imageChoice3:
			chosenBarCode = pc3.BarCode;
			break;
		}
		
		intent.putExtra(PRODUCT_BARCODE, chosenBarCode);
		startActivity(intent);
		finish();
	}
	
	public void onClickAddToCart (View view)
	{
		user = User.getInstance();
		user.shoppingCart.AddProduct(productClass);
		Intent intent = new Intent(this, CartActivity.class);
		startActivity(intent);
	}
}
