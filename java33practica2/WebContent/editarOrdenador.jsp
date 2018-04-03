<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<form action="ServletGuardarCambiosOrdenador" method="post">
		marca: <input type="text" name="campoMarca"
			value="${ordenadorAeditar.marca}" /><br />
		modelo: <input type="text" name="campoModelo"
			value="${ordenadorAeditar.modelo}" /><br />
		precio: <input type="text"
			name="campoPrecio" value="${ordenadorAeditar.precio}" /><br />
		disco: <input type="text" name="campoDisco"
			value="${ordenadorAeditar.disco}" /><br />
		ram: <input type="text" name="campoRam"
			value="${ordenadorAeditar.ram}" /><br />	
		procesador: <input type="text" name="campoProcesador"
			value="${ordenadorAeditar.procesador}" /><br />
		pantalla: <input type="text" name="campoPantalla"
			value="${ordenadorAeditar.pantalla}" /><br />
		peso: <input type="text" name="campoPeso"
			value="${ordenadorAeditar.peso}" /><br />
			<input type="hidden" name="campoIdOrdenador" value="${ordenadorAeditar.id}"/>
			<input type="submit"
			value="GUARDAR CAMBIOS" />
	</form>
</body>
</html>