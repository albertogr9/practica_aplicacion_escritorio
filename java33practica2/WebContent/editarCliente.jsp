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
	<form action="ServletGuardarCambiosCliente" method="post">
		nombre: <input type="text" name="campoNombre"
			value="${clienteAeditar.nombre}" /><br /> 
		calle: <input type="text" name="campoCalle"
			value="${clienteAeditar.calle}" /><br />
		numero: <input type="text" name="campoNumero"
			value="${clienteAeditar.numero}" /><br /> 
		codigoPostal: <input type="text" name="campoCodigoPostal"
			value="${clienteAeditar.codigoPostal}" /><br /> 	
		poblacion: <input type="text" name="campoPoblacion"
			value="${clienteAeditar.poblacion}" /><br /> 
		telefono: <input type="text" name="campoTelefono"
			value="${clienteAeditar.telefono}" /><br /> 
		email: <input type="text"
			name="campoEmail" value="${clienteAeditar.email}" /><br />
		particularEmpresa: <input type="text" name="campoParticularEmpresa"
			value="${clienteAeditar.particularEmpresa}" /><br /> 
			<input type="hidden" name="campoId" value="${clienteAeditar.id}"/>
			<input type="submit"
			value="GUARDAR CAMBIOS" />
	</form>
</body>
</html>