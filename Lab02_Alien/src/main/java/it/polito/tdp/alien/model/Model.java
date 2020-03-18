package it.polito.tdp.alien.model;

import java.security.InvalidParameterException;
import java.util.StringTokenizer;

public class Model {
	private AlienDictionary dictionary;
	
	public Model() {
		this.dictionary=new AlienDictionary();		
	}
	/**
	 * Controllo ortografico del testo inserito dall'utente
	 * @param ts stringa inserita dall'utente
	 * @return 1 se la parola e' valida, 0 parola aggiunta, -1 nulla
	 */
	public int controlText(String ts) {
		ts.toLowerCase();
		StringTokenizer st = new StringTokenizer(ts," ");
		int numWords=st.countTokens();
		if(numWords==1) {
			String alienWord=st.nextToken();
			if(this.controlWord(alienWord)==false) {
				throw new InvalidParameterException("Inserisci parole con sole lettere!");
				}
			return 1;
		}
		if(numWords==2) {
			String alienWord=st.nextToken();
			String translation=st.nextToken();
			if(this.controlWord(alienWord)==false || this.controlWord(translation)==false) {
				throw new InvalidParameterException("Inserisci parole con sole lettere!");
			}
			this.dictionary.addWord(alienWord, translation);
			return 0;
		}
		return -1;		
	}
	/**
	 * Controllo sulla parola singola
	 * @param toControl parola da controllare
	 * @return true se corretta false se non lo e'
	 */
	public boolean controlWord(String toControl) {
		for(int i=0; i<toControl.length();i++) {
			if(Character.isLetter(toControl.charAt(i))==false) {
				return false;
			}
		}
		return true;
		
	}
	public AlienDictionary getDictionary() {
		return dictionary;
	}
	
	

}
