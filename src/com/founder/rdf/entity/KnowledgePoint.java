package com.founder.rdf.entity;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 知识元
 */
public class KnowledgePoint {
    private Long id;
    private Integer klID;
    private Integer dmID;
    private String name;
    private Integer source;
    private Long themewordID;
    private Integer pointStatus;
    private Date sysCreated;
    private Date sysLastmodified;
    private Long userID;
    private String remark;
    private String alpha;
    private String doc_explain;
    private long size;
    private String color;
    private Map<String, String> attributes = new LinkedHashMap<>();

    public KnowledgePoint() {
        super();
        // TODO Auto-generated constructor stub
    }

    public KnowledgePoint(Long id, Integer klID, Integer dmID, String name,
                          Integer source, Long themewordID, Integer pointStatus,
                          Date sysCreated, Date sysLastmodified, Long userID) {
        super();
        this.id = id;
        this.klID = klID;
        this.dmID = dmID;
        this.name = name;
        this.source = source;
        this.themewordID = themewordID;
        this.pointStatus = pointStatus;
        this.sysCreated = sysCreated;
        this.sysLastmodified = sysLastmodified;
        this.userID = userID;
    }

    public KnowledgePoint(Long id, Integer klID, Integer dmID, String name,
                          Integer source, Long themewordID, Integer pointStatus,
                          Date sysCreated, Date sysLastmodified, Long userID, String remark, String alpha) {
        super();
        this.id = id;
        this.klID = klID;
        this.dmID = dmID;
        this.name = name;
        this.source = source;
        this.themewordID = themewordID;
        this.pointStatus = pointStatus;
        this.sysCreated = sysCreated;
        this.sysLastmodified = sysLastmodified;
        this.userID = userID;
        this.remark = remark;
        this.alpha = alpha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getKlID() {
        return klID;
    }

    public void setKlID(Integer klID) {
        this.klID = klID;
    }

    public Integer getDmID() {
        return dmID;
    }

    public void setDmID(Integer dmID) {
        this.dmID = dmID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Long getThemewordID() {
        return themewordID;
    }

    public void setThemewordID(Long themewordID) {
        this.themewordID = themewordID;
    }

    public Integer getPointStatus() {
        return pointStatus;
    }

    public void setPointStatus(Integer pointStatus) {
        this.pointStatus = pointStatus;
    }

    public Date getSysCreated() {
        return sysCreated;
    }

    public void setSysCreated(Date sysCreated) {
        this.sysCreated = sysCreated;
    }

    public Date getSysLastmodified() {
        return sysLastmodified;
    }

    public void setSysLastmodified(Date sysLastmodified) {
        this.sysLastmodified = sysLastmodified;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDoc_explain() {
        return doc_explain;
    }

    public void setDoc_explain(String doc_explain) {
        this.doc_explain = doc_explain;
    }

    public String getAlpha() {
        return alpha;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void addAttributeMap(String key, String value) {
        this.attributes.put(key, value);
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KnowledgePoint or = (KnowledgePoint) o;
        if (id == null) return super.equals(o);
        return id.equals(or.id);

    }
}
