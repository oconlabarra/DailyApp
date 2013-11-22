package com.inghackathon.dailyapp.data;

import java.util.ArrayList;
import java.util.Calendar;


public class ProductsBoughtAtDate {

 String date;
 ArrayList<ProductClass> Products;

public ProductsBoughtAtDate()
 {
	date = new String();
	Products = new ArrayList<ProductClass>();
 }

public ProductsBoughtAtDate(String theDate)
{
	date = new String();
	this.date = theDate;
	Products = new ArrayList<ProductClass>();
}

public ProductsBoughtAtDate(int year, int month, int day)
{
	date = new String();
	this.date = Integer.toString(year) + " / " + Integer.toString(month) + " / " + Integer.toString(day);
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

public void setDate (int year, int month, int day)
{
	this.date = Integer.toString(year) + " / " + Integer.toString(month) + " / " + Integer.toString(day);
}

public String getDate()
{
	return date;
}

}
