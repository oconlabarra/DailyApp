package com.inghackathon.dailyapp.ui;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.inghackathon.dailyapp.R;

public class CartActivity extends TabActivity {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cart);
            
            // create the TabHost that will contain the Tabs
            TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


            TabSpec tab1 = tabHost.newTabSpec("Cart");
            TabSpec tab2 = tabHost.newTabSpec("History");

           // Set the Tab name and Activity
           // that will be opened when particular Tab will be selected
            tab1.setIndicator("Cart");
            tab1.setContent(new Intent(this,CartTabActivity.class));
           
            tab2.setIndicator("History");
            tab2.setContent(new Intent(this,HistoryTabActivity.class));

           
            /** Add the tabs  to the TabHost to display. */
            tabHost.addTab(tab1);
            tabHost.addTab(tab2);
            
            Intent intent = getIntent();
                        
            tabHost.setCurrentTab(intent.getIntExtra(CartTabActivity.TAB_SELECTED, 0));

    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cart, menu);
		return true;
	}

}
