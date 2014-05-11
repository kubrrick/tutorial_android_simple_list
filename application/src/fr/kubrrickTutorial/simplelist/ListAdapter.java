package fr.kubrrickTutorial.simplelist;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

	private Context context;
	private ArrayList<Personne> personneList;
	
	public ListAdapter(Context context, ArrayList<Personne> personneList){
		this.context = context;
		this.personneList = personneList;
	}
	
	
	@Override
	public int getCount() {
		return personneList.size();
	}

	@Override
	public Object getItem(int position) {
		return personneList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		TextView nom, prenom, age;
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService (Context.LAYOUT_INFLATER_SERVICE);
		convertView = inflater.inflate(R.layout.cell, null);
		
		nom = (TextView) convertView.findViewById(R.id.nom);
		prenom = (TextView) convertView.findViewById(R.id.prenom);
		age = (TextView) convertView.findViewById(R.id.age);
		
		
		nom.setText(personneList.get(position).getNom());
		prenom.setText(personneList.get(position).getPrenom());
		age.setText(String.valueOf(personneList.get(position).getAge()));
		
		
		return convertView;
	}

}
