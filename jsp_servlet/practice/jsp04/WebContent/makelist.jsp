<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="vo.BbsVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.BbsDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	System.out.println(request.getParameter("page"));
	int i = Integer.parseInt(request.getParameter("page")) * 10;
	
	Map<String, Integer> map = new HashMap<>();
	map.put("begin", i-9);
	map.put("end", i);
	List<BbsVO> vo = BbsDao.getDao().listPost(map);
	StringBuffer sb = new StringBuffer();
	for (BbsVO e: vo){
		sb.append(String.valueOf(e.getR_num())).append("&nbsp&nbsp");
		sb.append(e.getSub()).append("&nbsp&nbsp");
		sb.append(e.getWrite()).append("&nbsp&nbsp");
		sb.append(e.getHit()).append("<br>");
	}
	System.out.println(sb.toString());
%>
<%= sb.toString() %>