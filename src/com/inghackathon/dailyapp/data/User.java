package com.inghackathon.dailyapp.data;


import java.*;
import java.util.*;
import java.lang.Object;

import com.inghackathon.dailyapp.R;


public class User {
	private static User instance = new User();
	public ArrayList<PreferenceClass> UserPreferences = new ArrayList();
	public ShoppingCart shoppingCart;
	public History history;
	
	PreferenceClass UserPreference = new PreferenceClass();
	
	private User() {
		this.SetInitialPreferences();
		shoppingCart = new ShoppingCart();
		history = new History();
		

		ArrayList<ProductClass> DayProducts;
		
		//historical data for demonstration
		
		ProductClass prod;
		
		DayProducts = new ArrayList<ProductClass>();
		prod = new ProductClass("5000159458139"); //Mars Bar
		DayProducts.add(prod);
		prod = new ProductClass("8713300801582"); //Milk
		DayProducts.add(prod);
		this.history.SetProductsBoughtAtSpecificDate("2013/11/10", DayProducts);
		
		DayProducts = new ArrayList<ProductClass>();
		prod = new ProductClass("8493281345324"); //Orange Juice
		DayProducts.add(prod);
		this.history.SetProductsBoughtAtSpecificDate("2013/11/15", DayProducts);
	}
	
	public static User getInstance(){
		return instance;
	}
	
	public void SetPreference(PreferencesEnum pref, boolean isChosen)
	{
		for (PreferenceClass i : UserPreferences)
		{
			if (i.Title.equals(pref))
			{
				i.IsChosen = isChosen;
			}
		}
	}
	
	
	private void SetInitialPreferences() {
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.AllergicPerson;
		UserPreference.imageResourceId = R.drawable.ic_pref_allergic;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Prevent allergic reactions";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.DietingPerson;
		UserPreference.imageResourceId = R.drawable.ic_pref_diet;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Lose weight fast";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.HeartPatient;
		UserPreference.imageResourceId = R.drawable.ic_pref_heart;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Follow cardiologist recommendations";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.PregnantWoman;
		UserPreference.imageResourceId = R.drawable.ic_pref_pregnant;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Nutrient for pregnant women";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.SportsMan;
		UserPreference.imageResourceId = R.drawable.ic_pref_sport;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Get high performance nutrition";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.Teen;
		UserPreference.imageResourceId = R.drawable.ic_pref_teen;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Prevent acne";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.Tourist;
		UserPreference.imageResourceId = R.drawable.ic_pref_tourist;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Keep you safe from exotic food";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.Vegetarian;
		UserPreference.imageResourceId = R.drawable.ic_pref_veg;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Avoid meat products";
		UserPreferences.add(UserPreference);

	}
	
	
}
