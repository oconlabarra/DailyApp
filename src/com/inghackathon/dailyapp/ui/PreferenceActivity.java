package com.inghackathon.dailyapp.ui;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.inghackathon.dailyapp.HomeActivity;
import com.inghackathon.dailyapp.R;
import com.inghackathon.dailyapp.data.PreferenceClass;
import com.inghackathon.dailyapp.data.PreferencesEnum;
import com.inghackathon.dailyapp.data.User;

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
	    User u = User.getInstance();
	    for (PreferenceClass pref : u.UserPreferences) {
	    	int position = pref.Title.ordinal();
		    listview.setItemChecked(position, pref.IsChosen);
		}
	    
	    listview.setOnItemClickListener(new OnItemClickListener() {
	    	  public void onItemClick(AdapterView<?> parent, View view,
	    	    int position, long id) {
	    	    Toast.makeText(getApplicationContext(),
	    	    		ListViewArrayAdapter.prefText[position] + " has been set/unset.", Toast.LENGTH_SHORT)
	    	      .show();
	    	    
//	    	    adapter.notifyDataSetChanged();
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

		toast("Your new preference has been set");	
		
		goBackHome();
	}
	
	private void goBackHome(){
		Intent intent = new Intent(this, HomeActivity.class);
		startActivity(intent);
	}
	
	private void setPref(int[] selectedIndex) {
		String s = "";
		for (int i = 0; i < selectedIndex.length; i++) {
			s += selectedIndex[i] + ", ";
		}

		User u = User.getInstance();
		
		for (int i = 0; i < PreferencesEnum.values().length; i++) {
			if(this.arrayContain(selectedIndex, i)){
				u.SetPreference(PreferencesEnum.values()[i], true);
			}else{
				u.SetPreference(PreferencesEnum.values()[i], false);
			}
		}
		
	}
	
	private boolean arrayContain(int[] array, int key){
		for (int i = 0; i < array.length; i++) {
			if(key == array[i]){
				return true;
			}
		}
		return false;
	}
	private int[] extractSelectedIndex(SparseBooleanArray spa){
		int size = spa.size();
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 0; i < size; i++){
			if(spa.valueAt(i)){
				l.add(i);
			}
			
		}
		return buildIntArray(l);
	}
	
	private int[] buildIntArray(List<Integer> integers) {
	    int[] ints = new int[integers.size()];
	    int i = 0;
	    for (Integer n : integers) {
	        ints[i++] = n;
	    }
	    return ints;
	}
	
	public void toast(String s){
		Context context = getApplicationContext();
		int duration = Toast.LENGTH_SHORT;

		Toast.makeText(context, s, duration).show();
	}
	
}
