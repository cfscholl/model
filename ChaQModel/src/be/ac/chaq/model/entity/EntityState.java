package be.ac.chaq.model.entity;

import java.util.List;

import be.ac.chaq.change.Change;

public abstract class EntityState {
	public abstract List<PropertyDescriptor> getPropertyDescriptors();
	private EntityIdentifier id;
	private EntityIdentifier owner;
	private Change appliedChange;
	private EntityState predecessor;
	
	public void setAppliedChange(Change c) throws Exception {
		if(this.appliedChange != null) {
			this.appliedChange=c;
		} else {
			throw new Exception("Trying to modify an applied change");
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
