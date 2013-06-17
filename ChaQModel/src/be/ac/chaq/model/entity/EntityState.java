package be.ac.chaq.model.entity;

import java.util.List;

public abstract class EntityState {

	public abstract List<PropertyDescriptor> getPropertyDescriptors();

	private EntityIdentifier id;
	
	private EntityIdentifier owner;
			
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
