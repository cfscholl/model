package be.ac.chaq.change;

import java.util.Date;

import be.ac.chaq.model.entity.Person;

public class Change {
	Date timeStamp;
	ChangeIdentifier identifier;
	Person author;
	
	void perform() {
		
	}
	
	public Change undo() {
		return null;
	}
	
}
