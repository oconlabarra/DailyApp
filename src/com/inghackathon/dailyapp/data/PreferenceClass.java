package com.inghackathon.dailyapp.data;


import java.*;

public class PreferenceClass {

		public PreferencesEnum Title;
	
		public boolean IsChosen = false;

		public String Description;
		
		public int imageResourceId;
		
		public PreferenceClass()
		{
			IsChosen = false;
			Description = new String();
			Description="";
			Title = PreferencesEnum.AllergicPerson;
			imageResourceId = -1;
		}

}
