var referencia; 

 tb = document.getElementById("tabla");

function agregaFila(){
	
	var nuevaFila = tb.insertRow(tb.length);
	
	numero = document.getElementById("numero").value;
	proveedor = document.getElementById("proveedor").value;
	precio = document.getElementById("precio").value;
	descripcion = document.getElementById("descripcion").value;
	fechaentrada = document.getElementById("fechaentrada").value;


	cell1 = nuevaFila.insertCell(0);
	cell1.innerHTML = numero;
	
	cell2 = nuevaFila.insertCell(1);
	cell2.innerHTML = proveedor;
	
	cell3 = nuevaFila.insertCell(2);
	cell3.innerHTML = precio;
	
	cell4 = nuevaFila.insertCell(3);
	cell4.innerHTML = descripcion;
	
	cell5 = nuevaFila.insertCell(4);
	cell5.innerHTML = fechaentrada;

	seleccionaFila(); 
	
}

  function seleccionaFila(){ 
     
        for(var i = 1; i < tb.rows.length; i++){
        
           tb.rows[i].onclick = function(){
         
              referencia = this.rowIndex;
              document.getElementById("numero").value = this.cells[0].innerHTML;
              document.getElementById("proveedor").value = this.cells[1].innerHTML;
              document.getElementById("precio").value = this.cells[2].innerHTML;
              document.getElementById("descripcion").value = this.cells[3].innerHTML;
              document.getElementById("fechaentrada").value = this.cells[4].innerHTML;
     }
 	}
}

    function editaFila(){
		
		var numero = document.getElementById("numero").value;
		var proveedor = document.getElementById("proveedor").value;
		var precio = document.getElementById("precio").value;
		var descripcion = document.getElementById("descripcion").value;
		var fechaentrada = document.getElementById("fechaentrada").value;
      
        tb.rows[referencia].cells[0].innerHTML = numero;
		tb.rows[referencia].cells[1].innerHTML = proveedor;
        tb.rows[referencia].cells[2].innerHTML = precio;   
		tb.rows[referencia].cells[3].innerHTML = descripcion;   
		tb.rows[referencia].cells[4].innerHTML = fechaentrada;
      
}

     
     function borraFila(){
		 var result = confirm("Borrar linea");
			if (result) {
			tb.deleteRow(referencia);
			}
     }