package com.founder.rdf.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 知识点
 *
 */
public class GraphKnowledgePoint {

	Long id;

	Long pId;	

	private int klID;

	private int dmID;

	private String name;

	private int source;

	private long themewordID;

	private int pointStatus;

	private Long userID;

	private Map<String, Object> attributeMap = new HashMap<String, Object>();

	public GraphKnowledgePoint() {
		
	}
	
	public GraphKnowledgePoint(KnowledgePoint kp) {
		pId = kp.getId();
		klID = kp.getKlID();
		dmID = kp.getDmID();
		name = kp.getName();
		source = kp.getSource();
		themewordID = kp.getThemewordID();
		pointStatus = kp.getPointStatus();
		userID = kp.getUserID();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public int getKlID() {
		return klID;
	}

	public void setKlID(int klID) {
		this.klID = klID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public long getThemewordID() {
		return themewordID;
	}

	public void setThemewordID(long themewordID) {
		this.themewordID = themewordID;
	}

	public int getPointStatus() {
		return pointStatus;
	}

	public void setPointStatus(int pointStatus) {
		this.pointStatus = pointStatus;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public Integer getDmID() {
		return dmID;
	}

	public void setDmID(Integer dmID) {
		this.dmID = dmID;
	}

	public Map<String, Object> getAttributeMap() {
		return attributeMap;
	}

	public void addAttributeMap(String key, Object value) {
		this.attributeMap.put(key, value);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		GraphKnowledgePoint word = (GraphKnowledgePoint) o;
		if (id == null)
			return super.equals(o);
		return id.equals(word.id);
	}
}
