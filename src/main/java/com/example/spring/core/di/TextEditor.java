package com.example.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	@Autowired
	private SpellChecker SpellChecker;
	
/*	public TextEditor(SpellChecker spellChecker){
		 System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	}*/
	
/*	@Autowired
	public void setSpellChecker(SpellChecker SpellChecker){
		this.SpellChecker = SpellChecker;
	}
	*/
	public SpellChecker getSpellChecker(){
		return SpellChecker;
	}
	
	public void spellCheck(){
		SpellChecker.checkSpelling();
	}

}
