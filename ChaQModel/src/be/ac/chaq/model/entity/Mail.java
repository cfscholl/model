package be.ac.chaq.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Mail extends EntityState {
	List<PropertyDescriptor> descriptors; 
	
	
	Mail(Mail m) {
		super(m);
		descriptors = new ArrayList<PropertyDescriptor>();
		this.descriptors.addAll(m.getPropertyDescriptors());
	}
	
	@Override
	public EntityState shallowclone() {
		Mail clone = new Mail(this);
		return clone;
	}

	@Override
	public List<PropertyDescriptor> getPropertyDescriptors() {
		return descriptors;
	}

	@Override
	public EntityIdentifier getProperty(PropertyDescriptor descriptor) {
		return null;
	}

}
