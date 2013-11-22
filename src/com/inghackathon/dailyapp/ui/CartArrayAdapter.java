package com.inghackathon.dailyapp.ui;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.inghackathon.dailyapp.R;
import com.inghackathon.dailyapp.data.User;

public class CartArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	
	public User user = User.getInstance();
	
	private static final String[] prefText = {
			"Pregnant Woman", 
			"Heart Disease Patient"
	};
	private static final String[] prefDesc = {
			"Nutrient for pregnant women", 
			"Follow cardiologist recommendations"
			
	};
	private static final Integer[] prefIconIds = {
			R.drawable.ic_pref_pregnant,
			R.drawable.ic_pref_heart
    };

	  public CartArrayAdapter(Context context) {
		  
		
	    super(context, R.layout.listitem, User.getInstance().shoppingCart.getProductsNamesFromShoppingCart());
	    	//User.getInstance().shoppingCart.getProductsNamesFromShoppingCart());
	    this.context = context;
	    
	    //user = User.getInstance();
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
		    

		    text.setText(User.getInstance().shoppingCart.getProductsNamesFromShoppingCart().get(position));
		    textDesc.setText(User.getInstance().shoppingCart.getProductsDescriptionsFromShoppingCart().get(position));
		    imageView.setImageResource(User.getInstance().shoppingCart.getProductsImageIdsFromShoppingCart().get(position));

		    return rowView;
	  }
}
