package com.founder.rdf;

import jgsc.GstoreConnector;

// before run this example, you must start up the GStore server at first (use command ./gserver).
public class JavaAPIExample 
{
	public static void main(String[] args)
	{
		// initialize the GStore server's IP address and port.
		GstoreConnector gc = new GstoreConnector("192.168.5.130", 3305);
		
	    // build a new database by a RDF file.
	    // note that the relative path is related to gserver.
//		gc.build("LUBM10.db", "data/LUBM_10.n3");
		
//	    gc.load("LUBM10.db");
	    gc.load("newDb");

		
		// then you can execute SPARQL query on this database.
//		String sparql = "select ?x where "
//				+ "{"
//				+ "?x    <rdf:type>    <ub:UndergraduateStudent>. "
//				+ "?y    <ub:name> <Course1>. "
//				+ "?x    <ub:takesCourse>  ?y. "
//				+ "?z    <ub:teacherOf>    ?y. "
//				+ "?z    <ub:name> <FullProfessor1>. "
//				+ "?z    <ub:worksFor>    ?w. "
//				+ "?w    <ub:name>    <Department0>. "
//				+ "}";	
	    
//	    // 查询和某个知识元有某个关系的其他知识元
//		String sparql = "select ?x ?y ?t where "
//				+ "{"
//				+ "?x <test:dmID> <22>."
//				+ "?x <test:name> ?y."
//				+ "?x <test:invent> ?z."
//				+ "?z <test:name> ?t."
//				+ "}";	
	    
	    // 尝试查询一个知识元的所有内容
//		String sparql = "select ?x ?y ?z where "
//		+ "{"
//		+ "?x <test:name> <薇琴倩>;"
//		+ "   ?y ?z"
//		+ "}";
	    
	    // 简单插入
//		String sparql = "PREFIX dc: <http://www.founder.km.zhuanjia/>"
//				+ "INSERT DATA"
//				+ "{ "
//				+ "dc:25 <test:height> 170 ;"
//					+ "<test:weight> 100 ."
//								+ "}";	
	    // 查询插入的记录(查询所有记录并不成功)
		String sparql = "select ?y where "
		+ "{"
		+ "<http://www.founder.km.zhuanjia/25> <test:weight> ?y."
		+ "}";
		
		// 带条件的插入
//		String sparql = "INSERT { ?person <test:height> <William> }"
//		+ "WHERE { "
//		+ "?person <test:height> 170 ."
//		+ "}";	
		
	    // 简单删除
//		String sparql = "DELETE DATA "
//		+ "{ "
//		+ "<http://www.founder.km.zhuanjia/25> <test:height> 170 ;"
//		+ "<test:height> <William> ."
//		+ "}";	
	    
	    // 带条件的删除
//		String sparql = "DELETE { ?person <test:height> <William> }"
//		+ "WHERE { "
//		+ "?person <test:height> 170 ."
//		+ "}";	
		
		// 删除所有，操作不好
//		String sparql = "DELETE WHERE { ?person <test:height> <William> ;"
//				+ "<test:weight> ?x"
//				+ "}";
		// 更新操作
//		String sparql = "DELETE { ?person <test:weight> 100 }"
//		+ "INSERT {?person <test:weight> <200>}"
//		+ "WHERE {?person <test:weight> 100}";
		
		String answer = gc.query(sparql);
		System.out.println(answer);
		
		// unload this database.
		gc.unload("newDb");
		
	    // also, you can load some exist database directly and then query.
//	    gc.load("LUBM10.db");
//	    answer = gc.query(sparql);	    
//		System.out.println(answer);
	}
}

