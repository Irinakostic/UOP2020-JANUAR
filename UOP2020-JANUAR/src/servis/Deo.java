package servis;

import java.util.ArrayList;

public class Deo {
	

	
	private  String id;
	private Marka marka;
	private Model model;
	private String nazivDela;
	private double cena;
	private boolean obrisan;
	private ArrayList<ServisAutomobila>listaServisa;
	

	

	public Deo(String id, Marka marka, Model model, String nazivDela, double cena, boolean obrisan,
			ArrayList<ServisAutomobila> listaServisa) {
		this.id = id;
		this.marka = marka;
		this.model = model;
		this.nazivDela = nazivDela;
		this.cena = cena;
		this.obrisan = obrisan;
		this.listaServisa = listaServisa;
	}



	public ArrayList<ServisAutomobila> getListaServisa() {
		return listaServisa;
	}



	public void setListaServisa(ArrayList<ServisAutomobila> listaServisa) {
		this.listaServisa = listaServisa;
	}



	public  String getId() {
		return id;
	}


	public void setId( String id) {
		this.id = id;
	}


	public Marka getMarka() {
		return marka;
	}


	public void setMarka(Marka marka) {
		this.marka = marka;
	}


	public Model getModel() {
		return model;
	}


	public void setModel(Model model) {
		this.model = model;
	}


	public String getNazivDela() {
		return nazivDela;
	}


	public void setNazivDela(String nazivDela) {
		this.nazivDela = nazivDela;
	}



	public double getCena() {
		return cena;
	}


	public void setCena(double cena) {
		this.cena = cena;
	}


	public boolean isObrisan() {
		return obrisan;
	}


	public void setObrisan(boolean obrisan) {
		this.obrisan = obrisan;
	}
	
	
	

}
