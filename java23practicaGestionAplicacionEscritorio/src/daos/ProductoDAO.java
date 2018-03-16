package daos;

import modelo.Producto;

// en entorno corportaivo lo mas normal es 
//definir las operaciones que se van a poder hacer 
//sobre la base de datos en un interfaz.

//en este caso para el interfaz actual, 
//cada metodo dira que se puede hacer en 
//base de datos de cara a productos
public interface ProductoDAO {
	void registrarProducto(Producto p);

	void borrarProducto(int id);

	Producto[] obtenerProducto();
	// un array es un conjunto de datos del mismo tipo
}
