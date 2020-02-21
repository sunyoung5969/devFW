<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*"
    import="sec02.ex01.*"
    pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
text-align: center;
}
</style>
  <meta charset="UTF-8">
<title>회원 정보 출력창</title> 
</head>
<body>
<h1>회원 정보 출력</h1>
<%
   request.setCharacterEncoding( "utf-8" );
%>
 <table border='1' width='800' align='center'>
   <tr align='center' bgcolor='#FFFF66'> 
     <td>제품아이디</td>
     <td>제품명</td>
     <td>제품가격</td>
     <td >제품설명</td>
     <td >업체명</td>
     <td>수정</td>
</tr>

  <c:forEach var="prod" items="${searchList}" >	
	 <c:url var="url"  value="searchMod.do"  >
	   <c:param  name="p_mod_id" value="${prod.pprod_id}" />
	 </c:url>     

     <tr align=center>
       <td>${prod.pprod_id}</td>
       <td>${prod.pprod_name}</td>
       <td>${prod.pprod_price}</td>
       <td>${prod.pprod_desc}</td>
       <td>${prod.vvend_name}</td>
       <td><a href='${url}'> 수정 </a></td>
     </tr>
  </c:forEach>
</table>
</body>
</html>
