package com.founder.rdf.entity;


/**
 * 知识关系
 *
 */

public class GraphKnowledgeRelation {
	Long id;
	
	GraphKnowledgePoint pointStart;
	
	GraphKnowledgePoint pointEnd;
	
	String name;
	
	long relationID;
	
	String weight;
	
	String extfield;
	
	public GraphKnowledgeRelation() {
		
	}
	
	public GraphKnowledgeRelation(GraphKnowledgePoint pointStart, GraphKnowledgePoint pointEnd) {
		this.pointStart = pointStart;
		this.pointEnd = pointEnd;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRelationID() {
		return relationID;
	}
	public void setRelationID(long relationID) {
		this.relationID = relationID;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getExtfield() {
		return extfield;
	}
	public void setExtfield(String extfield) {
		this.extfield = extfield;
	}
	public GraphKnowledgePoint getPointStart() {
		return pointStart;
	}
	public GraphKnowledgePoint getPointEnd() {
		return pointEnd;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GraphKnowledgeRelation or = (GraphKnowledgeRelation) o;
        if (id == null) return super.equals(o);
        return id.equals(or.id);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : super.hashCode();
    }
}
