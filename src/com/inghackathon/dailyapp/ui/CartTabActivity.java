package com.inghackathon.dailyapp.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.inghackathon.dailyapp.R;

public class CartTabActivity extends Activity {
	private ListView listview;
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_tab);
        
        listview = (ListView) findViewById(R.id.cartview);	    
	    CartArrayAdapter adapter = new CartArrayAdapter(this);
	    
	    listview.setAdapter(adapter);
	    
	 
    }

	public void onClickCheckout(View v){
		//TODO: copy the list of ids to history
	}
}
