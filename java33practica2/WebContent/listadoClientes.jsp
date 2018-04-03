<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Ordenador"%>
<%@page import="modelo.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenido a mi portal de Ordenadors</h1>
	<a href="registrarOrdendor.jsp">registrar mi Ordenador</a> listado de
	Ordenadores:
	<br>
	<a href="registrarCliente.jsp">registrar cliente</a> listado de
	clientes:
	<br>
	<c:forEach items="${clientes}" var="cliente">
		<div style="margin: 10px">
			nombre: ${cliente.nombre} <br />
			calle: ${cliente.calle} <br />
			numero: ${cliente.numero} <br />
			codigoPostal: ${cliente.codigoPostal} <br />
			poblacion: ${cliente.poblacion}<br />
			telefono: ${cliente.telefono} <br />
			email: ${cliente.email} <br />
			particularEmpresa: ${cliente.particularEmpresa} <br />
			
		</div>
	</c:forEach>


</body>
</html>