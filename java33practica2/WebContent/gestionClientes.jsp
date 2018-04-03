<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<c:forEach items="${clientes}" var="cliente">
		<div style="margin: 8px">
			nombre: ${cliente.nombre} <br /> calle: ${cliente.calle} <br />
			numero: ${cliente.numero} <br /> codigoPostal:
			${cliente.codigoPostal} <br /> poblacion: ${cliente.poblacion}<br />
			telefono: ${cliente.telefono}<br /> email: ${cliente.email} <br />
			particularEmpresa: ${cliente.particularEmpresa}<br /> <a
				href="ServletBorrarCliente?id=${cliente.id}">BORRAR</a> <a
				href="ServletEditarCliente?id=${cliente.id}">EDITAR</a>
		</div>
	</c:forEach>
</body>
</html>