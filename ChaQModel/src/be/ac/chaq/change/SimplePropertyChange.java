package be.ac.chaq.change;

import be.ac.chaq.model.entity.EntityState;
import be.ac.chaq.model.snapshot.SnapShot;

public class SimplePropertyChange extends PropertyChange {
	Object oldValue;
	Object newValue;
	SnapShot currentSnapShot;
	
	
	void perform() {
		//Performing a PropertyChange therefore amounts to making a shallow clone
		//of the current EntityState of the change subject,
		EntityState s = modifiedEntity.shallowclone();
		//updating the Snapshot’s current mapping from the subject’s EntityIdentifier to the new EntityState 
		currentSnapShot.update(s);
		//of the change subject, and updating the property’s value in the newly created EntityState.
		
		
		s.setAppliedChange(this);
		
		
	}
	
	
}
