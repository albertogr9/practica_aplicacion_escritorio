<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${sessionScope.admin == null}"/>
<a href="ServletListadoClientes">gestionar clientes</a>
&nbsp;
<a href="registrarCliente.jsp">a�adir clientes</a>
&nbsp;
<a href="ServletListadoOrdenadores">gestionar ordenadores</a>
&nbsp;
<a href="registrarOrdenador.jsp">a�adir ordenadores</a>
&nbsp;
<a href="ServletLogOutAdmin">salir</a>
&nbsp;
