package com.inghackathon.dailyapp.ui;

import com.inghackathon.dailyapp.R;
import com.inghackathon.dailyapp.R.menu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class HistoryTabActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
       
        TextView  tv=new TextView(this);
        tv.setTextSize(25);
        tv.setGravity(Gravity.CENTER_VERTICAL);
        tv.setText("This Is Tab3 Activity");
       
        setContentView(tv);
    }


}
