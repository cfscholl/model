package be.ac.chaq.model;

import be.ac.chaq.model.entity.Mail;
import be.ac.chaq.model.snapshot.SnapShot;

public class Model {
	SnapShot s;
	
	void createMail(String to){
		Mail m = new Mail(s);
		s.update(m);
	}
	
	Model() {
		s = new SnapShot();
	}
	

}