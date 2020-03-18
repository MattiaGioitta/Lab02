package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {
	private String alienWord;
	private List<String> translation;
	/**
	 * Costruttore per la parola con relativa traduzione
	 * @param alienWord parola aliena da tradurre
	 * @param translation traduzione della parola 
	 */
	public WordEnhanced(String alienWord) {
		this.alienWord = alienWord;
		this.translation = new LinkedList<>();
	}
	
	
	public List<String> getTranslation() {
		return translation;
	}


	public String getAlienWord() {
		return alienWord;
	}
	@Override
	public boolean equals(Object obj) {
		WordEnhanced w=(WordEnhanced) obj;
		if(this.alienWord.compareTo(w.getAlienWord())==0)
			return true;
		return false;
	}
	/**
	 * Ritorna una stringa contenente le traduzioni della medesima parola
	 */
	public String toString() {
		String s="";
		for(String ss: this.translation)
			s+=ss+"\n";
		return s;
	}
	
	
	

}
