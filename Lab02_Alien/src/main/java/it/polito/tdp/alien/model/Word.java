package it.polito.tdp.alien.model;

public class Word {
	private String alienWord;
	private String translation;
	/**
	 * Costruttore per la parola con relativa traduzione
	 * @param alienWord parola aliena da tradurre
	 * @param translation traduzione della parola 
	 */
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	public String getAlienWord() {
		return alienWord;
	}
	@Override
	public boolean equals(Object obj) {
		Word w=(Word) obj;
		if(this.alienWord.compareTo(w.getAlienWord())==0)
			return true;
		return false;
	}
	
	
	
	

}
