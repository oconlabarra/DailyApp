
import java.*;

public class PreferenceClass {

		public PreferencesEnum Title;
	
		public boolean IsChosen = false;

		public String Description;
		
		public PreferenceClass()
		{
			IsChosen = false;
			Description = new String();
			Description="";
			Title = PreferencesEnum.AllergicPerson;
		}

}
