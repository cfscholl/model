package be.ac.chaq.model.entity;

import java.util.ArrayList;
import java.util.List;

import be.ac.chaq.model.snapshot.SnapShot;

public class Mail extends EntityState {
	static List<PropertyDescriptor> descriptors; 
	
	Mail(Mail m) {
		super(m);
		if ( descriptors == null) {
			descriptors = new ArrayList<PropertyDescriptor>();
			PropertyDescriptor descriptor = new PropertyDescriptor();
			descriptor.name = "TO";
			descriptors.add(descriptor);
		}
	}
	
	
	public Mail(SnapShot s) { super(s); }


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
