package com.inghackathon.dailyapp.data;


import java.*;
import java.util.*;
import java.lang.Object;


public class User {
	private static User instance = new User();
	public ArrayList<PreferenceClass> UserPreferences = new ArrayList();
	
	PreferenceClass UserPreference = new PreferenceClass();
	
	private User() {
		this.SetInitialPreferences();
		
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
		UserPreference.IsChosen = false;
		UserPreference.Description = "Prevent allergic reactions";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.DietingPerson;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Lose weight fast";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.HeartPatient;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Follow cardiologist recommendations";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.PregnantWoman;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Nutrient for pregnant women";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.SportsMan;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Get high performance nutrition";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.Teen;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Prevent acne";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.Tourist;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Keep you safe from exotic food";
		UserPreferences.add(UserPreference);
		
		UserPreference = new PreferenceClass();
		UserPreference.Title = PreferencesEnum.Vegetarian;
		UserPreference.IsChosen = false;
		UserPreference.Description = "Avoid meat products";
		UserPreferences.add(UserPreference);

	}
	
	
}
