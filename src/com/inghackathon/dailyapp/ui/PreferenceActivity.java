package com.inghackathon.dailyapp.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.inghackathon.dailyapp.R;

public class PreferenceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_home);
		
	    setContentView(R.layout.activity_preference);

	    final ListView listview = (ListView) findViewById(R.id.listview);	    
	    final ListViewArrayAdapter adapter = new ListViewArrayAdapter(this);
	    listview.setAdapter(adapter);

	    
	    listview.setOnItemClickListener(new OnItemClickListener() {
	    	  public void onItemClick(AdapterView<?> parent, View view,
	    	    int position, long id) {
	    	    Toast.makeText(getApplicationContext(),
	    	      "Click ListItem Number " + position, Toast.LENGTH_SHORT)
	    	      .show();
	    	    
////	    	    final String item = (String) parent.getItemAtPosition(position);
////	            list.remove(item);
////	            adapter.notifyDataSetChanged();
	    	  }
	    	}); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}


}
