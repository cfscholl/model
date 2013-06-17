package be.ac.chaq.model.entity;

import java.util.List;

import be.ac.chaq.change.Change;
import be.ac.chaq.model.snapshot.SnapShot;

public abstract class EntityState  {
	public abstract EntityState shallowclone();
	public abstract List<PropertyDescriptor> getPropertyDescriptors();
	public abstract EntityIdentifier getProperty(PropertyDescriptor descriptor);

	private EntityIdentifier id;
	private EntityIdentifier owner;
	private Change appliedChange;
	private EntityState predecessor;
	private SnapShot lookup;
	
	EntityState(EntityState s) {
		this.appliedChange = s.appliedChange;
		this.owner = s.owner;
		this.id = s.id;
		this.predecessor = s.predecessor;
	}
	
	public void setAppliedChange(Change c)  {
		if(this.appliedChange != null) {
			this.appliedChange=c;
		}
	}
	
	public Change getAppliedChange() {
		return appliedChange;
	}
	
	public EntityIdentifier getID() {
		return id;
	}
	
	public void setID(EntityIdentifier id) {
		this.id = id;
	}

	public EntityIdentifier getOwner() {
		return owner;
	}

	public void setOwner(EntityIdentifier owner) {
		this.owner = owner;
	}

	
	
}
