<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Novo Produto</title>
</head>
<body>
	<h1>Novo Produto</h1>
	<hr>
	<c:url var="url" value="/produto"/>
	<form method="post" action="${url }">
		
		<label for="titulo">Titulo: </label>
		<input type="text" name="titulo" id="titulo">
		<br>
		
		<label for="descricao">Descricao: </label>
		<textarea rows="5" cols="30" name="descricao" id="descricao"></textarea>
		<br>
		
		<label for="numeroDePaginas">Número de Páginas: </label>
		<input type="text" name="numeroDePaginas" id="numeroDePaginas">
		<br>
		
		<c:forEach items="${tiposDeLivro }" var="tipo" varStatus="status">
			<label for="preco_${tipo}">${tipo}</label>
			<input type="text" name="precos[${status.index}].valor" id="preco_${tipo}"/>
			<input type="hidden" name="precos[${status.index}].tipoDeLivro" value="${tipo}"/>
			<br>
		</c:forEach>
		
		<input type="submit" value="Salvar">
	</form>
</body>
</html>