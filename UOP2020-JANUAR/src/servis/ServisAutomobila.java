package servis;

import java.util.ArrayList;

import korisnici.Serviser;

public class ServisAutomobila {
	
	public enum StatusServisa {
		otkazan, //0
		zakazan, //1
}

	
	private  String id;
	private Automobil automobilSA;
	private Serviser serviserSA;
	private int Termin;
	private String opis;
	private StatusServisa statusServisa;
	private boolean obrisan;
	
	
	public ServisAutomobila( String id, Automobil automobilSA, Serviser serviserSA, int termin, String opis,
		StatusServisa statusServisa, boolean obrisan) {
		this.id = id;
		this.automobilSA = automobilSA;
		this.serviserSA = serviserSA;
		Termin = termin;
		this.opis = opis;
		this.statusServisa = statusServisa;
		this.obrisan = obrisan;
	}


	public String getId() {
		return id;
	}


	public void setId( String id) {
		this.id = id;
	}



	public Automobil getAutomobilSA() {
		return automobilSA;
	}


	public void setAutomobilSA(Automobil automobilSA) {
		this.automobilSA = automobilSA;
	}


	public Serviser getServiserSA() {
		return serviserSA;
	}


	public void setServiserSA(Serviser serviserSA) {
		this.serviserSA = serviserSA;
	}


	public int getTermin() {
		return Termin;
	}


	public void setTermin(int termin) {
		Termin = termin;
	}


	public String getOpis() {
		return opis;
	}


	public void setOpis(String opis) {
		this.opis = opis;
	}




	public StatusServisa getStatusServisa() {
		return statusServisa;
	}


	public void setStatusServisa(StatusServisa statusServisa) {
		this.statusServisa = statusServisa;
	}


	public boolean isObrisan() {
		return obrisan;
	}


	public void setObrisan(boolean obrisan) {
		this.obrisan = obrisan;
	}
	
	
	
	
	
	

}
