package com.inghackathon.dailyapp.ui;

import com.inghackathon.dailyapp.R;
import com.inghackathon.dailyapp.R.menu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

public class HistoryTabActivity extends Activity {
	private ListView listview;
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_tab);
        
        listview = (ListView) findViewById(R.id.historyview);	    
	    HistoryArrayAdapter adapter = new HistoryArrayAdapter(this);
	    
	    listview.setAdapter(adapter);
	    
	 
    }


}
