package be.ac.chaq.model.snapshot;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import be.ac.chaq.model.entity.ComponentIdentifier;
import be.ac.chaq.model.entity.EntityIdentifier;
import be.ac.chaq.model.entity.EntityState;

public class SnapShot {

	private Date timeStamp;
	
	private ComponentIdentifier component;

	private Map<EntityIdentifier, EntityState> identifierToState;
	
	private Set<SnapShot> predecessors;
	
	private Set<SnapShot> successors;
	
	public SnapShot() {
		identifierToState = new HashMap<EntityIdentifier, EntityState>();	
		predecessors = new HashSet<SnapShot>();
		successors = new HashSet<SnapShot>();
	}
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public boolean addSuccessor(SnapShot successor) {
		return successors.add(successor);
	}
	
	public boolean addPredecessor(SnapShot predecessor) {
		return predecessors.add(predecessor);
	}

	public ComponentIdentifier getComponent() {
		return component;
	}

	public void setComponent(ComponentIdentifier component) {
		this.component = component;
	}

	public Set<SnapShot> getPredecessors() {
		return predecessors;
	}

	public Set<SnapShot> getSuccessors() {
		return successors;
	}

	public EntityState lookup(EntityIdentifier id) {
		return identifierToState.get(id);
	}
	
	public void update(EntityState s) {
		identifierToState.put(s.getID(), s);
	}
	
	
}
