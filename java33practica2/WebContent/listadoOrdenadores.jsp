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
	
<c:forEach items="${ordenadores}" var="ordenador">
	<div style="margin: 10px">
		marca: ${ordenador.marca} <br />
		modelo: ${ordenador.modelo} <br />
		precio: ${ordenador.precio}<br /> 
		disco: ${ordenador.disco}<br /> 
		ram: ${ordenador.ram}<br /> 
		procesador: ${ordenador.procesador}<br /> 
		pantalla: ${ordenador.pantalla}<br /> 
		peso: ${ordenador.peso}<br /> 
	</div>
</c:forEach>

</body>
</html>