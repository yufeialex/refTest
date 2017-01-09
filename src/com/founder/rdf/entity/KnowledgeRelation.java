package com.founder.rdf.entity;

/**
 * 知识关联
 *
 */
public class KnowledgeRelation {
    private Long id;
    private Long fromID;
    private Long toID;
    private String name;
    private String code;
    private Integer weights;
    private String extfield;

    public KnowledgeRelation() {
        super();
        // TODO Auto-generated constructor stub
    }

    public KnowledgeRelation(Long id, String name, Long fromID, Long toID, String code) {
        super();
        this.id = id;
        this.name = name;
        this.fromID = fromID;
        this.toID = toID;
        this.code = code;
    }

    public KnowledgeRelation(Long id, String name, Long fromID, Long toID,
                             String code, Integer weights, String extfield) {
        super();
        this.id = id;
        this.name = name;
        this.fromID = fromID;
        this.toID = toID;
        this.code = code;
        this.weights = weights;
        this.extfield = extfield;
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

    public Long getFromID() {
        return fromID;
    }

    public void setFromID(Long fromID) {
        this.fromID = fromID;
    }

    public Long getToID() {
        return toID;
    }

    public void setToID(Long toID) {
        this.toID = toID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getWeights() {
        return weights;
    }

    public void setWeights(Integer weights) {
        this.weights = weights;
    }

    public String getExtfield() {
        return extfield;
    }

    public void setExtfield(String extfield) {
        this.extfield = extfield;
    }


    @Override
    public String toString() {
        return "KnowledgeRelation{"
                + "id = " + id
                + ", fromID = " + fromID
                + ", toID = " + toID
                + ", name = '" + name + '\''
                + ", code = '" + code + '\''
                + ", weights = " + weights
                + ", extfield = '" + extfield + '\'' + '}';
    }
}
