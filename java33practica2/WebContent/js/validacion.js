function validacion(){
	var enviarForm = true;
	
	var nombre = document.getElementsByName("nombre")[0];
	var cnombre = nombre.value;

	var expresionCampoNombre=/^[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{3,10}$/i;
	if (expresionCampoNombre.test(cnombre)){
	}else{
		alert("nombre no valido");
		enviarform = false;
	}
	
	
	var calle = document.getElementsByName("calle")[0];
	var ccalle = calle.value;

	var expresionCampoCalle=/^[0-9a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{3,20}$/i;
	if (expresionCampoCalle.test(ccalle)){
	}else{
		alert("calle no valida");
		enviarform = false;
	}
	
	
	var numero = document.getElementsByName("numero")[0];
	var cnumero = numero.value;

	var expresionCampoNumero=/^[0-9]{1,11}$/;
	if (expresionCampoNumero.test(cnumero)){
	}else{
		alert("numero no valido");
		enviarform = false;
	}
	
	
	var codigoPostal = document.getElementsByName("codigoPostal")[0];
	var ccodigoPostal = codigoPostal.value;

	var expresionCampoCodigoPostal=/^[0-9]{1,11}$/;
	if (expresionCampoCodigoPostal.test(ccodigoPostal)){
	}else{
		alert("codigo postal no valido");
		enviarform = false;
	}
	
	var poblacion = document.getElementsByName("poblacion")[0];
	var cpoblacion = poblacion.value;

	var expresionCampoPoblacion=/^[0-9a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{3,20}$/i;
	if (expresionCampoPoblacion.test(cpoblacion)){
	}else{
		alert("poblacion no valida");
		enviarform = false;
	}
	
	
	var telefono = document.getElementsByName("telefono")[0];
	var ctelefono = telefono.value;

	var expresionCampoTelefono=/^[0-9]{1,11}$/;
	if (expresionCampoTelefono.test(ctelefono)){
	}else{
		alert("telefono no valido");
		enviarform = false;
	}
	
	
	var email = document.getElementsByName("email")[0];
	var cemail =email.value;

	var expresionCampoEmail=/^[^@]+@[^@]+\.[a-zA-Z]{2,}/i;
	if (expresionCampoEmail.test(cemail)){
	}else{
		alert("email mal");
		enviarform = false;
	}
	
	var particularEmpresa = document.getElementsByName("particularEmpresa")[0];
	var cparticularEmpresa = particularEmpresa.value;

	var expresionCampoParticularEmpresa=/^[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—\\s]{3,10}$/i;
	if (expresionCampoParticularEmpresa.test(cparticularEmpresa)){
	}else{
		alert("particular o empresa mal");
		enviarform = false;
	}
	
	return enviarForm;
}