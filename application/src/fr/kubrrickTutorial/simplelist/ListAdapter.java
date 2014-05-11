package fr.kubrrickTutorial.simplelist;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
		return null;
	}

}
