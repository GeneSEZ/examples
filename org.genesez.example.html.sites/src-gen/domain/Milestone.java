package domain;

/* 
 *	Do not place import/include statements above this comment, just below. 
 * 	@FILE-ID : (_17_0_1_8a7027a_1346831146061_604031_1656) 
 */

import java.util.LinkedHashMap;
import java.util.Map;
import org.genesez.platform.java.umlsupport.associations.*;
import java.util.Date;

/**
 * Represents a step within a project that has to be completet.
 * @author nicher
 */
public class Milestone implements AssociationRole {
	
	// -- generated attribute, constant + association declarations ----------
	/** Defines an identifier for each association, used by the association handling library */
	public enum Associations implements RelatedAssociationRole {
		PROJECT, TASK
	}
	
	/** Stores the association management objects */
	private Map<RelatedAssociationRole, Association<? extends Object, ? extends Object>> association = new LinkedHashMap<RelatedAssociationRole, Association<? extends Object, ? extends Object>>();
	
	/** Stores the associated object of association PROJECT to Project */
	private Project project;
	
	/** Stores associated objects of association TASK to Task */
	private java.util.Set<Task> task = new java.util.HashSet<Task>();
	
	private String name;
	
	private String description;
	
	private State state = State.TODO;
	
	private Date deadline;
	
	// -- generated association + attribute accessors -----------------------
	/**
	 * Returns the value of attribute '<em><b>name</b></em>'
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the value of attribute '<em><b>name</b></em>'
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the value of attribute '<em><b>description</b></em>'
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the value of attribute '<em><b>description</b></em>'
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Returns the value of attribute '<em><b>state</b></em>'
	 */
	public State getState() {
		return state;
	}
	
	/**
	 * Sets the value of attribute '<em><b>state</b></em>'
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * Returns the value of attribute '<em><b>deadline</b></em>'
	 */
	public Date getDeadline() {
		return deadline;
	}
	
	/**
	 * Sets the value of attribute '<em><b>deadline</b></em>'
	 */
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	// initialization block for association management objects
	{
		association.put(Associations.PROJECT, new OneAssociation<Milestone, Project>(this, new Accessor<Project>() {
			public Project get() {
				return project;
			}
			
			public void set(Project referenced) {
				project = referenced;
			}
		}, Project.Associations.MILESTONE));
		association.put(Associations.TASK, new ManyAssociation<Milestone, Task>(this, task, Task.Associations.MILESTONE));
	}
	
	/**
	 * Provides generic access to association objects, used by the association handling library
	 * @see org.genesez.platform.java.umlsupport.associations.AssociationRole#getAssociation(org.genesez.platform.java.umlsupport.associations.modified.RelatedAssociationRole)
	 */
	public Association<? extends Object, ? extends Object> getAssociation(RelatedAssociationRole role) {
		if (association.containsKey(role))
			return association.get(role);
		throw new RuntimeException("the class doesn't have the association you specified!");
	}
	
	/**
	 * Provides access to the association '<em><b>project</b></em>' to {@link Project}.
	 */
	@SuppressWarnings("unchecked")
	public Association<Milestone, Project> project() {
		return (Association<Milestone, Project>) association.get(Associations.PROJECT);
	}
	
	/**
	 * Provides access to the association '<em><b>task</b></em>' to {@link Task}.
	 */
	@SuppressWarnings("unchecked")
	public Association<Milestone, Task> task() {
		return (Association<Milestone, Task>) association.get(Associations.TASK);
	}
	
	// -- generated code of other cartridges --------------------------------
	
	// -- own code implementation -------------------------------------------
	/* PROTECTED REGION ID(java.class.own.code.implementation._17_0_1_8a7027a_1346831146061_604031_1656) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */
	
}
