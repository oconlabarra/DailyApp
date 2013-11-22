package com.inghackathon.dailyapp.data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

import com.inghackathon.dailyapp.R;


public class History {

ArrayList<ProductsBoughtAtDate> DatesWithProducts = new ArrayList<ProductsBoughtAtDate>();

public History ()
{
		
}

public ArrayList<ProductsBoughtAtDate> getDatesWithProducts()
{
	return DatesWithProducts;
}

public void SetProductsBoughtAtSpecificDate (String theDate, ArrayList<ProductClass> products)
{

	boolean IsDateUsed = false;

	//Date is already in History
	for (ProductsBoughtAtDate ProdAtDate : DatesWithProducts)
		{
			if (ProdAtDate.date.equals(theDate))
				{
					IsDateUsed = true;
						for (ProductClass product : products)
							{
								ProdAtDate.AddProduct(product);
							}
						
				}
		}

	//Date is new
	if (IsDateUsed == false)
		{
			ProductsBoughtAtDate prods = new ProductsBoughtAtDate(theDate);
			for (ProductClass product : products)
				{
					prods.AddProduct(product);
				}

			DatesWithProducts.add(prods);

		}



	}

public void CleartProductsBoughtAtSpecificDate (String theDate)
{
	for (ProductsBoughtAtDate ProdAtDate : DatesWithProducts)
		{
			if (ProdAtDate.date.equals(theDate))
				{
					DatesWithProducts.remove(ProdAtDate);
					

				}
		}
}

public ArrayList<String> getProductsNamesFromHistory ()
{
	
	ArrayList<String> Names = new ArrayList<String>();
	for (ProductsBoughtAtDate i : DatesWithProducts)
	{
		
		for (ProductClass j : i.getProductsFromShoppingCart())
		{
			Names.add(j.Name);
		}
		Names.add(i.date);
	}
	
	Collections.reverse(Names);
	return Names;
}

public ArrayList<String> getProductsDescriptionsFromHistory ()
{
	
	ArrayList<String> Descriptions = new ArrayList<String>();
	
	
	for (ProductsBoughtAtDate i : DatesWithProducts)
	{
		
		for (ProductClass j : i.getProductsFromShoppingCart())
		{
			Descriptions.add(j.Description);
		}
		
		Descriptions.add("Debit card @ Albert Heijn");
	}
	
	Collections.reverse(Descriptions);
	
	return Descriptions;
}

public ArrayList<Integer> getProductsImageIdsFromHistory ()
{
	
	ArrayList<Integer> ImageIds = new ArrayList<Integer>();
	for (ProductsBoughtAtDate i : DatesWithProducts)
	{
		
		for (ProductClass j : i.getProductsFromShoppingCart())
		{
			ImageIds.add(j.productImageResourceId);
		}
		ImageIds.add(R.drawable.ic_ing_logo);
	}
	
	Collections.reverse(ImageIds);
	
	return ImageIds;
}

public void ClearHistory()
{
	DatesWithProducts.clear();
}

}
