package com.founder.rdf.service.impl;


import java.util.List;
import java.util.Map;
import java.util.Set;

import com.founder.rdf.entity.GraphKnowledgePoint;
import com.founder.rdf.entity.KnowledgePoint;
import com.founder.rdf.entity.KnowledgeRelation;
import com.founder.rdf.service.IGraphService;

/**
 * 图数据库操作Service
 */

public class GraphServiceImpl implements IGraphService {

	@Override
	public GraphKnowledgePoint saveGraphKnowledgePoint(KnowledgePoint kPoint) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delGraphKnowledgePoint(long kpId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GraphKnowledgePoint getGraphKnowledgePoint(Long kpId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GraphKnowledgePoint updateGraphKnowledgePoint(Long id,
			KnowledgePoint point) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KnowledgePoint getGraphKpWithAttr(Long kpId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveGraphKpAttr(KnowledgePoint zsy, long gPointId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveGraphKnowledgeRelation(KnowledgeRelation relationship) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delGraphKnowledgeRelation(Long krId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Map<String, Object>> getAllRelationship(Integer ontologyId,
			Integer modelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getAllRelationship(Integer ontologyId,
			Set<Integer> modelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<Map<String, Object>>> getNeighborNodesAndLinks(
			KnowledgePoint point) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<Map<String, Object>>> getDbClickNodesAndLinks(
			KnowledgePoint point) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllKpRelation(int klID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllKp(int klID) {
		// TODO Auto-generated method stub
		
	}
    
}
