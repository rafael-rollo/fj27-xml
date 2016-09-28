<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livros</title>
</head>
<body>
	<h1>Nossos Livros</h1>
	<hr>
	<table>
		<thead>
			<tr>
				<th>Titulo</th>
				<th colspan="3">Precos</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="produto" items="${produtos }">
				<tr>
					<td>${produto.titulo }</td>
					<c:forEach var="preco" items="${produto.precos }">
						<td>${preco.tipoDeLivro }: R$ ${preco.valor }</td> 
					</c:forEach>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>