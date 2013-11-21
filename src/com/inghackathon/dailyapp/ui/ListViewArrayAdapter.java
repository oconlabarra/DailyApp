package com.inghackathon.dailyapp.ui;



import java.util.ArrayList;

import com.inghackathon.dailyapp.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private static final String[] prefText = {
			"Pregnant Woman", 
			"Healthy Patient",
			"Sportsman",
			"Teen",
			"Allergic person",
			"Vegetarian",
			"Dieting person",
			"Tourist", 
	};
	private static final String[] prefDesc = {
			"Nutrient for pregnant women", 
			"Follow cardiologist recommendations",
			"Get high performance nutrition",
			"Prevent acne",
			"Prevent allergic reactions",
			"Avoid meat products",
			"Lose weight fast",
			"Keep you safe from exotic food"
			
	};
	private static final Integer[] prefIconIds = {
			R.drawable.ic_pref_pregnant,
			R.drawable.ic_pref_heart,
			R.drawable.ic_pref_sport,
			R.drawable.ic_pref_teen,
			R.drawable.ic_pref_allergic,
			R.drawable.ic_pref_veg,
			R.drawable.ic_pref_diet,
			R.drawable.ic_pref_tourist
    };

	  public ListViewArrayAdapter(Context context) {
	    super(context, R.layout.listitem, prefText);
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
	    text.setText(prefText[position]);
	    textDesc.setText(prefDesc[position]);
	    imageView.setImageResource(prefIconIds[position]);
	    

	    return rowView;
	  }
}
