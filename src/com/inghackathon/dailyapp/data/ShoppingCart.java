package com.inghackathon.dailyapp.data;

import java.util.ArrayList;


public class ShoppingCart {

ArrayList<ProductClass> Products;

public ShoppingCart()
{
	Products = new ArrayList<ProductClass>();	
}

public void AddProduct (ProductClass product)
{
	Products.add(product);
}

public void AddProductByBarCode (String BarCode)
{
	ProductClass product = new ProductClass(BarCode);
	Products.add(product);
}

public ArrayList<ProductClass> getProductsFromShoppingCart ()
{
	return Products;
}

public ArrayList<String> getProductsNamesFromShoppingCart ()
{
	
	ArrayList<String> Names = new ArrayList<String>();
	for (ProductClass i : Products)
	{
		Names.add(i.Name);
	}
	
	return Names;
}

public ArrayList<String> getProductsDescriptionsFromShoppingCart ()
{
	
	ArrayList<String> Descriptions = new ArrayList<String>();
	for (ProductClass i : Products)
	{
		Descriptions.add(i.Description);
	}
	
	return Descriptions;
}

public ArrayList<Integer> getProductsImageIdsFromShoppingCart ()
{
	
	ArrayList<Integer> ImageIds = new ArrayList<Integer>();
	for (ProductClass i : Products)
	{
		ImageIds.add(i.productImageResourceId);
	}
	
	return ImageIds;
}

public void EmptyShoppingCart ()
{
	Products.clear();
}

}
