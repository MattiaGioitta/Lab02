package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	List<WordEnhanced> dictionary;

	/**
	 * Costruttore per la creazione di un dizionario
	 * @param dictionary dizionario delle parole aliene
	 */
	public AlienDictionary() {
		this.dictionary = new LinkedList<>();
	}
	
	
	public void addWord(String alienWord, String translation) {
		WordEnhanced word= new WordEnhanced(alienWord);
		for(WordEnhanced w : this.dictionary) {
			if(w.equals(word)) {
				w.getTranslation().add(translation);
				return;
			}
		}
		word.getTranslation().add(translation);
		this.dictionary.add(word);
		
	}
	
	public String translateWord(String alienWord) {
		for(WordEnhanced w : this.dictionary) {
			if(w.getAlienWord().compareTo(alienWord)==0) {
				return w.toString();
			}
		}
		return null;
	}
	
	public String translateWordSpecial(String alienWord) {
		String s="";
		for(WordEnhanced w : this.dictionary) {
			if(w.getAlienWord().contains(alienWord)) {
				s+=w.toString();				
			}
		}
		return s;
	}

}
