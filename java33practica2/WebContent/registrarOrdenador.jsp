<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="color: red">${mensaje}</div>
	<jsp:include page="menu.jsp"></jsp:include>
	<br> Introduce los datos de tu Ordenador:
	<br>
	<form action="ServletRegistroOrdenador" method="post">
	<!--  onsubmit="return validarFormularioRegistroOrdenadorCliente()">--> 
		marca: <input type="text" name="campoMarca" /><br>
		modelo: <input type="text" name="campoModelo" required/><br>
		precio: <input type="text" name="campoPrecio" /><br> 
		disco: <input type="text" name="campoDisco" /><br>
		ram: <input type="text" name="campoRam" /><br>
		procesador: <input type="text" name="campoProcesador" /><br>
		pantalla: <input type="text" name="campoPantalla" /><br>
		peso: <input type="text" name="campoPeso" /><br>
		
		<input type="submit" value="ACEPTAR" />
	</form>
<!-- 	<script type="text/javascript"
		src="js/validacionRegistrarOrdenadorCliente.js"></script> -->
</body>
</html>