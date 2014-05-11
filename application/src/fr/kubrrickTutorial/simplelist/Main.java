package fr.kubrrickTutorial.simplelist;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;

public class Main extends ListActivity {

	
	private ListAdapter listAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		
		listAdapter = new ListAdapter(this, preparePersonneList());
		
	}
	
	
	
	private ArrayList<Personne> preparePersonneList(){
		ArrayList<Personne> personneList = new ArrayList<Personne>();
		personneList.add(new Personne("Mouline", "Clément", 22));
		personneList.add(new Personne("Enderlin", "Morgan", 21));
		personneList.add(new Personne("Barakowsky", "Baptiste", 22));
		personneList.add(new Personne("Meyer", "Franck", 20));
		return personneList;
	}
	
}
