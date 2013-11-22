package com.inghackathon.dailyapp.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.inghackathon.dailyapp.R;

public class PreferenceActivity extends Activity {
	private ListView listview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_home);
		
	    setContentView(R.layout.activity_preference);

	    listview = (ListView) findViewById(R.id.listview);	    
	    final ListViewArrayAdapter adapter = new ListViewArrayAdapter(this);
	    
	    listview.setAdapter(adapter);
	    listview.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
	    //TODO: Initiate the existing preference
	    //listview.setItemChecked(position, value)
	    
	    listview.setOnItemClickListener(new OnItemClickListener() {
	    	  public void onItemClick(AdapterView<?> parent, View view,
	    	    int position, long id) {
	    	    Toast.makeText(getApplicationContext(),
	    	      "Click ListItem Number " + position, Toast.LENGTH_SHORT)
	    	      .show();
	    	    
	    	    adapter.notifyDataSetChanged();
	    	  }
	    	}); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	public void onClickPrefDone(View v){
		SparseBooleanArray spa = listview.getCheckedItemPositions();
		int[] selectedIndex = extractSelectedIndex(spa);
		setPref(selectedIndex);
	}
	
	private void setPref(int[] selectedIndex) {
		String s = "";
		for (int i = 0; i < selectedIndex.length; i++) {
			s += selectedIndex[i] + ", ";
		}
		//TODO:###
		toast("Todo: set preference object" + s);	
	}
	
	private int[] extractSelectedIndex(SparseBooleanArray spa){
		int size = spa.size();
		int[] selectedIndex = new int[size];
		for(int i = 0; i < size; i++){
			selectedIndex[i] = spa.keyAt(i);
		}
		return selectedIndex;
	}
	
	public void toast(String s){
		Context context = getApplicationContext();
		int duration = Toast.LENGTH_SHORT;

		Toast.makeText(context, s, duration).show();
	}
	
}
