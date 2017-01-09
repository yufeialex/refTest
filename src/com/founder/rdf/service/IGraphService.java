package com.founder.rdf.service;


import java.util.List;
import java.util.Map;
import java.util.Set;

import com.founder.rdf.entity.GraphKnowledgePoint;
import com.founder.rdf.entity.KnowledgePoint;
import com.founder.rdf.entity.KnowledgeRelation;

/**
 * 图数据库业务接口
 * 知识元的属性存储于图DB，所有涉及知识元属性的操作均应使用图DB和关系DB的混合操作。
 * 本接口中的操作主要用于实现混合操作。若有图数据库可单独完成的亦可调用
 * 本接口中的操作应只涉及图数据库。
 */
public interface IGraphService {

    GraphKnowledgePoint saveGraphKnowledgePoint(KnowledgePoint kPoint);

    void delGraphKnowledgePoint(long kpId);

    GraphKnowledgePoint getGraphKnowledgePoint(Long kpId);

    GraphKnowledgePoint updateGraphKnowledgePoint(Long id, KnowledgePoint point);


    KnowledgePoint getGraphKpWithAttr(Long kpId);

    void saveGraphKpAttr(KnowledgePoint zsy, long gPointId);


    void saveGraphKnowledgeRelation(KnowledgeRelation relationship);

    void delGraphKnowledgeRelation(Long krId);


    List<Map<String, Object>> getAllRelationship(Integer ontologyId, Integer modelId);

    List<Map<String, Object>> getAllRelationship(Integer ontologyId, Set<Integer> modelId);

    Map<String, List<Map<String, Object>>> getNeighborNodesAndLinks(KnowledgePoint point);

    Map<String, List<Map<String, Object>>> getDbClickNodesAndLinks(KnowledgePoint point);

    void deleteAllKpRelation(int klID);

    void deleteAllKp(int klID);

}
