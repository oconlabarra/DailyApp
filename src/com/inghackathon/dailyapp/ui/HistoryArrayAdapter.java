package com.inghackathon.dailyapp.ui;



import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.inghackathon.dailyapp.R;
import com.inghackathon.dailyapp.data.User;

public class HistoryArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private static final String[] prefText = {
		"Heart Disease Patient", 
		"Pregnant Woman"
	};
	private static final String[] prefDesc = {
		"Follow cardiologist recommendations", 
		"Nutrient for pregnant women"
			
	};
	private static final Integer[] prefIconIds = {
		R.drawable.ic_pref_heart,
		R.drawable.ic_pref_pregnant,
			
    };

	  public HistoryArrayAdapter(Context context) {
	    super(context, R.layout.listitem, User.getInstance().history.getProductsNamesFromHistory());
	    this.context = context;
	  }
	
	
		    
		    
	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
		    LayoutInflater inflater = (LayoutInflater) context
		        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		    View rowView = inflater.inflate(R.layout.listitem, parent, false);
		    TextView text = (TextView) rowView.findViewById(R.id.firstLine);
		    TextView textDesc = (TextView) rowView.findViewById(R.id.secondLine);
		    ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		    //text.setText(prefText[position]);
		    //textDesc.setText(prefDesc[position]);
		    //imageView.setImageResource(prefIconIds[position]);
		    
		    if (User.getInstance().history.getProductsNamesFromHistory().get(position).contains("2013"))
		    {
		    	rowView.setBackgroundColor(Color.LTGRAY);
		    	text.setTextColor(Color.WHITE);
		    	textDesc.setTextColor(Color.WHITE);
		    }
		    else
		    {
		    	rowView.setBackgroundColor(Color.WHITE);
		    	text.setTextColor(Color.BLACK);
		    	textDesc.setTextColor(Color.BLACK);
		    }
		    
		    text.setText(User.getInstance().history.getProductsNamesFromHistory().get(position));
		    textDesc.setText(User.getInstance().history.getProductsDescriptionsFromHistory().get(position));
		    imageView.setImageResource(User.getInstance().history.getProductsImageIdsFromHistory().get(position));

		    
	
		    return rowView;
	  }
}
