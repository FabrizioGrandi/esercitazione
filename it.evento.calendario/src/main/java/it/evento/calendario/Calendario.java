package it.evento.calendario;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
	
	public String nome;
	public String descrizione;
	public List<Evento>eventi=new ArrayList();
	public String getNome() {
		return nome;
	}
	public Calendario(String nome, String descrizione) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		
	}
	public Calendario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public List<Evento> getEventi() {
		return eventi;
	}
	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
	
	public void addEvento (Evento evento) 
	{ 
	try {
		eventi.add(evento);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public void RimuoviEvento (Evento f) {
		for (int i=0; i<eventi.size()-1; i++) {
			if (f.getNome()==eventi.get(i).getNome() && f.getDescrizione()== eventi.get(i).getDescrizione() && f.getGiorno()==eventi.get(i).getGiorno() &&  f.getMese()==eventi.get(i).getMese() && f.getAnno()==eventi.get(i).getAnno()){
				eventi.remove(f);
			}
		
		}
	}
	
	public void visualizzaEventi() {
		for ( int i=0; i<eventi.size()-1; i++) {
			System.out.println("Nome:"+eventi.get(i).getNome()+ ""+ "Descrizione:"+ eventi.get(i).getDescrizione()+""+"Giorno:"+ eventi.get(i).getGiorno()+""+"Mese:"+eventi.get(i).getMese()+""+"Anno:"+eventi.get(i).getAnno());
			
		}
	}

}
