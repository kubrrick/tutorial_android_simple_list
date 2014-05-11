package fr.kubrrickTutorial.simplelist;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Main extends ListActivity {

	
	private ListAdapter listAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		
		listAdapter = new ListAdapter(this, preparePersonneList());
		setListAdapter(listAdapter);
		
	}
	
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		Intent i = new Intent(this, Detail.class);
		i.putExtra("personne", (Personne) listAdapter.getItem(position));
		startActivity(i);

	}
	
	
	private ArrayList<Personne> preparePersonneList(){
		ArrayList<Personne> personneList = new ArrayList<Personne>();
		personneList.add(new Personne("Mouline", "Clément", 22, "14 cité Kermilliau 75000 PARIS", "0024867598"));
		personneList.add(new Personne("Enderlin", "Morgan", 21, "14 cité Kermilliau 75000 PARIS", "0034586125"));
		personneList.add(new Personne("Barakowsky", "Baptiste", 22, "14 cité Kermilliau 75000 PARIS", "0065847589"));
		personneList.add(new Personne("Meyer", "Franck", 20, "14 cité Kermilliau 75000 PARIS", "0045896587"));
		personneList.add(new Personne("Zorn", "Nicolas", 22, "14 cité Kermilliau 75000 PARIS", "0063254781"));
		personneList.add(new Personne("Arnold", "Loïc", 22, "14 cité Kermilliau 75000 PARIS", "0045878962"));
		personneList.add(new Personne("Bruno", "Guillaume", 22, "14 cité Kermilliau 75000 PARIS", "0045879523"));
		personneList.add(new Personne("Ta", "Guillaume", 20, "14 cité Kermilliau 75000 PARIS", "0042647859"));
		personneList.add(new Personne("Jobs", "Steve", 56, "14 cité Kermilliau 75000 PARIS", "0062145736"));
		personneList.add(new Personne("Bauer", "Adrien", 22, "14 cité Kermilliau 75000 PARIS", "0042684589"));
		return personneList;
	}
	
}
