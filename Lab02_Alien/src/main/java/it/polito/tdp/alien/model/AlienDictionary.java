package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	List<Word> dictionary;

	/**
	 * Costruttore per la creazione di un dizionario
	 * @param dictionary dizionario delle parole aliene
	 */
	public AlienDictionary() {
		this.dictionary = new LinkedList<>();
	}
	
	
	public void addWord(String alienWord, String translation) {
		for(Word w : this.dictionary) {
			if(w.getAlienWord().compareTo(alienWord)==0) {
				w.setTranslation(translation);
				return;
			}
		}
		Word w= new Word(alienWord,translation);
		this.dictionary.add(w);
		
	}
	
	public String translateWord(String alienWord) {
		for(Word w : this.dictionary) {
			if(w.getAlienWord().compareTo(alienWord)==0) {
				return w.getTranslation();
			}
		}
		return null;
	}

}
