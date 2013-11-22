package com.inghackathon.dailyapp.data;

import java.util.ArrayList;


public class MappingCriteriaToPreference {

	
	private int[][] MappingValues = new int[PreferencesEnum.values().length][CriteriaEnum.values().length];
	private ArrayList<CriteriaClass> MainCriteria; 
	
	public MappingCriteriaToPreference()
	{
		
		//AllergicPerson
		MappingValues[PreferencesEnum.AllergicPerson.ordinal()][CriteriaEnum.Allergic.ordinal()] = 1;
		MappingValues[PreferencesEnum.AllergicPerson.ordinal()][CriteriaEnum.Bio.ordinal()] = 0;
		MappingValues[PreferencesEnum.AllergicPerson.ordinal()][CriteriaEnum.Cholesterol.ordinal()] = 0;
		MappingValues[PreferencesEnum.AllergicPerson.ordinal()][CriteriaEnum.Energy.ordinal()] = 0;
		MappingValues[PreferencesEnum.AllergicPerson.ordinal()][CriteriaEnum.Exotic.ordinal()] = 1;
		MappingValues[PreferencesEnum.AllergicPerson.ordinal()][CriteriaEnum.Fat.ordinal()] = 1;
		MappingValues[PreferencesEnum.AllergicPerson.ordinal()][CriteriaEnum.Proteins.ordinal()] = 0;
		MappingValues[PreferencesEnum.AllergicPerson.ordinal()][CriteriaEnum.Sugar.ordinal()] = 0;
		MappingValues[PreferencesEnum.AllergicPerson.ordinal()][CriteriaEnum.Vegetarian.ordinal()] = 0;
		MappingValues[PreferencesEnum.AllergicPerson.ordinal()][CriteriaEnum.Vitamins.ordinal()] = 0;
		


		//DietingPerson
		MappingValues[PreferencesEnum.DietingPerson.ordinal()][CriteriaEnum.Allergic.ordinal()] = 0;
		MappingValues[PreferencesEnum.DietingPerson.ordinal()][CriteriaEnum.Bio.ordinal()] = 1;
		MappingValues[PreferencesEnum.DietingPerson.ordinal()][CriteriaEnum.Cholesterol.ordinal()] = 0;
		MappingValues[PreferencesEnum.DietingPerson.ordinal()][CriteriaEnum.Energy.ordinal()] = 0;
		MappingValues[PreferencesEnum.DietingPerson.ordinal()][CriteriaEnum.Exotic.ordinal()] = 0;
		MappingValues[PreferencesEnum.DietingPerson.ordinal()][CriteriaEnum.Fat.ordinal()] = 1;
		MappingValues[PreferencesEnum.DietingPerson.ordinal()][CriteriaEnum.Proteins.ordinal()] = 0;
		MappingValues[PreferencesEnum.DietingPerson.ordinal()][CriteriaEnum.Sugar.ordinal()] = 1;
		MappingValues[PreferencesEnum.DietingPerson.ordinal()][CriteriaEnum.Vegetarian.ordinal()] = 0;
		MappingValues[PreferencesEnum.DietingPerson.ordinal()][CriteriaEnum.Vitamins.ordinal()] = 0;
		
		//HeartPatient
		MappingValues[PreferencesEnum.HeartPatient.ordinal()][CriteriaEnum.Allergic.ordinal()] = 0;
		MappingValues[PreferencesEnum.HeartPatient.ordinal()][CriteriaEnum.Bio.ordinal()] = 0;
		MappingValues[PreferencesEnum.HeartPatient.ordinal()][CriteriaEnum.Cholesterol.ordinal()] = 1;
		MappingValues[PreferencesEnum.HeartPatient.ordinal()][CriteriaEnum.Energy.ordinal()] = 0;
		MappingValues[PreferencesEnum.HeartPatient.ordinal()][CriteriaEnum.Exotic.ordinal()] = 0;
		MappingValues[PreferencesEnum.HeartPatient.ordinal()][CriteriaEnum.Fat.ordinal()] = 1;
		MappingValues[PreferencesEnum.HeartPatient.ordinal()][CriteriaEnum.Proteins.ordinal()] = 0;
		MappingValues[PreferencesEnum.HeartPatient.ordinal()][CriteriaEnum.Sugar.ordinal()] = 1;
		MappingValues[PreferencesEnum.HeartPatient.ordinal()][CriteriaEnum.Vegetarian.ordinal()] = 0;
		MappingValues[PreferencesEnum.HeartPatient.ordinal()][CriteriaEnum.Vitamins.ordinal()] = 0;
		
		
		//PregnantWoman
		MappingValues[PreferencesEnum.PregnantWoman.ordinal()][CriteriaEnum.Allergic.ordinal()] = 0;
		MappingValues[PreferencesEnum.PregnantWoman.ordinal()][CriteriaEnum.Bio.ordinal()] = 1;
		MappingValues[PreferencesEnum.PregnantWoman.ordinal()][CriteriaEnum.Cholesterol.ordinal()] = 0;
		MappingValues[PreferencesEnum.PregnantWoman.ordinal()][CriteriaEnum.Energy.ordinal()] = 1;
		MappingValues[PreferencesEnum.PregnantWoman.ordinal()][CriteriaEnum.Exotic.ordinal()] = 0;
		MappingValues[PreferencesEnum.PregnantWoman.ordinal()][CriteriaEnum.Fat.ordinal()] = 0;
		MappingValues[PreferencesEnum.PregnantWoman.ordinal()][CriteriaEnum.Proteins.ordinal()] = 0;
		MappingValues[PreferencesEnum.PregnantWoman.ordinal()][CriteriaEnum.Sugar.ordinal()] = 0;
		MappingValues[PreferencesEnum.PregnantWoman.ordinal()][CriteriaEnum.Vegetarian.ordinal()] = 0;
		MappingValues[PreferencesEnum.PregnantWoman.ordinal()][CriteriaEnum.Vitamins.ordinal()] = 1;
		
		
		//SportsMan
		MappingValues[PreferencesEnum.SportsMan.ordinal()][CriteriaEnum.Allergic.ordinal()] = 0;
		MappingValues[PreferencesEnum.SportsMan.ordinal()][CriteriaEnum.Bio.ordinal()] = 0;
		MappingValues[PreferencesEnum.SportsMan.ordinal()][CriteriaEnum.Cholesterol.ordinal()] = 0;
		MappingValues[PreferencesEnum.SportsMan.ordinal()][CriteriaEnum.Energy.ordinal()] = 1;
		MappingValues[PreferencesEnum.SportsMan.ordinal()][CriteriaEnum.Exotic.ordinal()] = 0;
		MappingValues[PreferencesEnum.SportsMan.ordinal()][CriteriaEnum.Fat.ordinal()] = 0;
		MappingValues[PreferencesEnum.SportsMan.ordinal()][CriteriaEnum.Proteins.ordinal()] = 1;
		MappingValues[PreferencesEnum.SportsMan.ordinal()][CriteriaEnum.Sugar.ordinal()] = 0;
		MappingValues[PreferencesEnum.SportsMan.ordinal()][CriteriaEnum.Vegetarian.ordinal()] = 0;
		MappingValues[PreferencesEnum.SportsMan.ordinal()][CriteriaEnum.Vitamins.ordinal()] = 1;
		
		
		//Teen
		MappingValues[PreferencesEnum.Teen.ordinal()][CriteriaEnum.Allergic.ordinal()] = 1;
		MappingValues[PreferencesEnum.Teen.ordinal()][CriteriaEnum.Bio.ordinal()] = 0;
		MappingValues[PreferencesEnum.Teen.ordinal()][CriteriaEnum.Cholesterol.ordinal()] = 0;
		MappingValues[PreferencesEnum.Teen.ordinal()][CriteriaEnum.Energy.ordinal()] = 1;
		MappingValues[PreferencesEnum.Teen.ordinal()][CriteriaEnum.Exotic.ordinal()] = 0;
		MappingValues[PreferencesEnum.Teen.ordinal()][CriteriaEnum.Fat.ordinal()] = 1;
		MappingValues[PreferencesEnum.Teen.ordinal()][CriteriaEnum.Proteins.ordinal()] = 0;
		MappingValues[PreferencesEnum.Teen.ordinal()][CriteriaEnum.Sugar.ordinal()] = 0;
		MappingValues[PreferencesEnum.Teen.ordinal()][CriteriaEnum.Vegetarian.ordinal()] = 0;
		MappingValues[PreferencesEnum.Teen.ordinal()][CriteriaEnum.Vitamins.ordinal()] = 0;
				
		//Tourist
		MappingValues[PreferencesEnum.Tourist.ordinal()][CriteriaEnum.Allergic.ordinal()] = 0;
		MappingValues[PreferencesEnum.Tourist.ordinal()][CriteriaEnum.Bio.ordinal()] = 0;
		MappingValues[PreferencesEnum.Tourist.ordinal()][CriteriaEnum.Cholesterol.ordinal()] = 0;
		MappingValues[PreferencesEnum.Tourist.ordinal()][CriteriaEnum.Energy.ordinal()] = 1;
		MappingValues[PreferencesEnum.Tourist.ordinal()][CriteriaEnum.Exotic.ordinal()] = 0;
		MappingValues[PreferencesEnum.Tourist.ordinal()][CriteriaEnum.Fat.ordinal()] = 0;
		MappingValues[PreferencesEnum.Tourist.ordinal()][CriteriaEnum.Proteins.ordinal()] = 0;
		MappingValues[PreferencesEnum.Tourist.ordinal()][CriteriaEnum.Sugar.ordinal()] = 0;
		MappingValues[PreferencesEnum.Tourist.ordinal()][CriteriaEnum.Vegetarian.ordinal()] = 1;
		MappingValues[PreferencesEnum.Tourist.ordinal()][CriteriaEnum.Vitamins.ordinal()] = 1;
		
		//Vegetarian
		MappingValues[PreferencesEnum.Vegetarian.ordinal()][CriteriaEnum.Allergic.ordinal()] = 0;
		MappingValues[PreferencesEnum.Vegetarian.ordinal()][CriteriaEnum.Bio.ordinal()] = 1;
		MappingValues[PreferencesEnum.Vegetarian.ordinal()][CriteriaEnum.Cholesterol.ordinal()] = 0;
		MappingValues[PreferencesEnum.Vegetarian.ordinal()][CriteriaEnum.Energy.ordinal()] = 0;
		MappingValues[PreferencesEnum.Vegetarian.ordinal()][CriteriaEnum.Exotic.ordinal()] = 0;
		MappingValues[PreferencesEnum.Vegetarian.ordinal()][CriteriaEnum.Fat.ordinal()] = 0;
		MappingValues[PreferencesEnum.Vegetarian.ordinal()][CriteriaEnum.Proteins.ordinal()] = 0;
		MappingValues[PreferencesEnum.Vegetarian.ordinal()][CriteriaEnum.Sugar.ordinal()] = 0;
		MappingValues[PreferencesEnum.Vegetarian.ordinal()][CriteriaEnum.Vegetarian.ordinal()] = 1;
		MappingValues[PreferencesEnum.Vegetarian.ordinal()][CriteriaEnum.Vitamins.ordinal()] = 1;
	}
	
	public ArrayList<CriteriaClass> getMainCriteria(ArrayList<PreferenceClass> UserPreferences, ArrayList<CriteriaClass> ProductCriteria)
	{
		MainCriteria = new ArrayList<CriteriaClass>();
		
		boolean IfEverythingIsFalse = true;
		
		for (PreferenceClass i : UserPreferences)
		{
			if (i.IsChosen == true)
				IfEverythingIsFalse = false;
		}
		
		if (IfEverythingIsFalse == true)
		{
			// return Fat, Proteins and Energy
			for (CriteriaClass i : ProductCriteria)
			{
				if ((i.name.equals(CriteriaEnum.Fat)) || (i.name.equals(CriteriaEnum.Proteins)) || (i.name.equals(CriteriaEnum.Energy)))
						{
							MainCriteria.add(i);
						}
			}
			
			return MainCriteria;
		}
		
		int [] rating = new int[CriteriaEnum.values().length];
		
		for (int k=0; k<CriteriaEnum.values().length; k++)
		{
			for (int l=0; l<PreferencesEnum.values().length; l++)
			{
				if (UserPreferences.get(l).IsChosen==true)
					rating[k]+=MappingValues[UserPreferences.get(l).Title.ordinal()][ProductCriteria.get(k).name.ordinal()];
			}
		}
		
		int max1 = -1; int maxCounter1 = -1;
		int max2 = -1; int maxCounter2 = -1;
		int max3 = -1; int maxCounter3 = -1;
		
		for (int i=0; i<CriteriaEnum.values().length; i++)
		{
			if (rating[i] > max3)
			{
				if (rating[i] > max2)
				{
					if (rating[i] > max1)
					{
						max3=max2;
						maxCounter3=maxCounter2;
						
						max2=max1;
						maxCounter2=maxCounter1;
						
						max1 = rating[i];
						maxCounter1 = i;
					}
					else
					{
						max3=max2;
						maxCounter3=maxCounter2;
						
						max2 = rating[i];
						maxCounter2 = i;
					}
					
				}
				else
				{
					max3 = rating[i];
					maxCounter3 = i;
				}
				
				}
			}
		
		
		
	MainCriteria.add(ProductCriteria.get(maxCounter1));
	MainCriteria.add(ProductCriteria.get(maxCounter2));
	MainCriteria.add(ProductCriteria.get(maxCounter3));
	
	return MainCriteria;
		
	}
	
}
