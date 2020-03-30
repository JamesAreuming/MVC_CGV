<%@page import="cgv.deagu.model.Movie"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="movie" class="cgv.deagu.model.Movie" scope="page"/>
<jsp:setProperty name="movie" property="*"/>
<jsp:useBean id="movieMgr" class="cgv.deagu.model.MovieManager" scope="application"/>
<%
	movieMgr.addMovie(movie);
	response.sendRedirect("menu1.jsp");
%>
