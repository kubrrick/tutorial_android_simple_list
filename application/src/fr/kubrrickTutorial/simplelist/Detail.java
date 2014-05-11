package fr.kubrrickTutorial.simplelist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Detail extends Activity {

	private Personne personne;
	private TextView nom, prenom, age, adresse, telephone;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_detail);
		
		personne = (Personne) getIntent().getSerializableExtra("personne");
		
		nom = (TextView) this.findViewById(R.id.nom);
		prenom = (TextView) this.findViewById(R.id.prenom);
		age= (TextView) this.findViewById(R.id.age);
		adresse = (TextView) this.findViewById(R.id.adresse);
		telephone = (TextView) this.findViewById(R.id.telephone);
		
		
		
		nom.setText(personne.getNom());
		prenom.setText(personne.getPrenom());
		age.setText(String.valueOf(personne.getAge()) + " ans");
		adresse.setText(personne.getAdresse());
		telephone.setText(personne.getTelephone());
		
		
		
	}
	
	
}
