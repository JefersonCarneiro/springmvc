<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Adicionar tarefas</h3>
	<form action="../atualiza" method="post">
		Descrição<br/>
		<textarea name="Descricao" rows="5" cols="100"></textarea>
		<input type="submit" value="adicionar">
		<input type="hidden" name="idx" value="idx">
		
	</form>	
</body>
</html>