package java25arraysYcolecciones;

import java.util.HashMap;
import java.util.Map;

public class PrincipalTerceraParte {

	public static void main(String[] args) {
		// una vez domino los arrays y las colecciones tipo list vamos a ver las
		// colecciones tipo Map
		Map<String, Cliente> mapClientes = new HashMap<String, Cliente>();
		mapClientes.put("primero", new Cliente());
		// en vez de tener posiciones numericas, lo que tengo son Strings en este caso.
		mapClientes.get("primero").setNombre("PRIMER CLIENTE");
		mapClientes.clear(); // borramos todos
		
	}//end main
}//end class
