<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="ftm"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${tarefas}" var="tarefa">
	<p> ${tarefa.descricao}</p> <p> ${tarefa.finalizado}
	</p></c:forEach>	
	<hr>	
	<table>
		<c:forEach items="${tarefas}"  var="tarefa">
		<tr><td><a href="remove/${tarefa.id}">remover</a>&nbsp;<a href="edita/${tarefa.id}">editar</a>
		</td>
		<td>${tarefa.descricao}</td><td><c:if test="${tarefa.finalizado eq false}">Não finalizada
		</c:if><c:if test="${tarefa.finalizado eq true}">Finalizado </c:if></td></tr>		
		</c:forEach>
	</table>
</body>
</html>