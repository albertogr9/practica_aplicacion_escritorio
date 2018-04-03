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
	<br> Introduce los datos:
	<br>
	<form action="ServletRegistroCliente" method="post">
		nombre: <input type="text" name="campoNombre" required /><br> 
		calle:<input type="text" name="campoCalle" /><br>
		numero: <input type="text" name="campoNumero" /><br>
		codigoPostal: <input type="text" name="campoCodigoPostal" required/><br>
		poblacion: <input type="text" name="campoPoblacion" /><br>
		telefono: <input type="text" name="campoTelefono" /><br>
		email: <input type="text" name="campoEmail" /><br>
		particularEmpresa: <input type="text" name="campoParticularEmpresa" /><br>
		 <input type="submit"
			value="ACEPTAR" />
	</form>
</body>
</html>