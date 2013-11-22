package com.inghackathon.dailyapp.ui;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.inghackathon.dailyapp.R;
import com.inghackathon.dailyapp.data.User;

public class CartTabActivity extends Activity {
	private ListView listview;
	
	public User user;
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_tab);
        
        listview = (ListView) findViewById(R.id.cartview);	    
	    CartArrayAdapter adapter = new CartArrayAdapter(this);
	    
	    listview.setAdapter(adapter);
	    
	 
    }
	
	public static String TAB_SELECTED = "Tab_Selected";

	public void onClickCheckout(View v){
		
		user = User.getInstance();
		
		user.history.SetProductsBoughtAtSpecificDate("2013/11/22", user.shoppingCart.getProductsFromShoppingCart());
		user.shoppingCart.EmptyShoppingCart();
		
		Intent intent = new Intent(this, CartActivity.class);
		intent.putExtra(TAB_SELECTED, 1);
		startActivity(intent);
		finish();
	}
}
