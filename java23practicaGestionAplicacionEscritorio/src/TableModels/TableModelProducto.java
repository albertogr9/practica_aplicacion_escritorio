package TableModels;

import javax.swing.table.AbstractTableModel;

import modelo.Producto;

public class TableModelProducto extends AbstractTableModel {
	private String[] columnas = { "modelo", "marca", "disco_duro", "ram",
			"procesador", "pantalla", "peso" };
	private String[][] datos = null;

	public TableModelProducto(Producto[] productos) {
		// cada uno de estos array debera tener tantos elementos como queramos
		// mostrar por cada columna
		datos = new String[productos.length][columnas.length];
		for (int i = 0; i < productos.length; i++) {
			Producto p = productos[i];
			datos[i][0] = p.getModelo();
			datos[i][1] = p.getMarca();
			datos[i][2] = p.getDiscoDuro();
			datos[i][3] = p.getRam();
			datos[i][4] = p.getProcesador();
			datos[i][5] = p.getPantalla();
			datos[i][6] = p.getPeso();
		}
	}

	public int getRowCount() {
		return datos.length;
	}

	public int getColumnCount() {
		return columnas.length;
	}

	public Object getValueAt(int indiceFila, int indiceColumna) {
		return datos[indiceFila][indiceColumna];
	}

}
