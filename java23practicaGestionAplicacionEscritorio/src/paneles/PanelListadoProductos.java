package paneles;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

import modelo.Producto;
import TableModels.TableModelProducto;
import daos.ProductoDAO;
import daos.ProductoDAOImpl;

public class PanelListadoProductos extends JPanel implements ActionListener {
	ProductoDAO daoProductos = new ProductoDAOImpl();
	private Producto[] productos;
	JTable tabla;
	JButton botonBorrar = new JButton("BORRAR");

	public PanelListadoProductos() {
		this.add(new JLabel("soy el panel del listado de productos"));
	}// end panel listado productos

	public void refrescarProductos() {
		this.productos = daoProductos.obtenerProducto();
		tabla = new JTable(new TableModelProducto(productos));
		removeAll();

		tabla.setPreferredScrollableViewportSize(new Dimension(700, 500));
		tabla.setFillsViewportHeight(true);
		tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JScrollPane scrollPane = new JScrollPane(tabla);// quito todo lo que
														// tuviera antes, dentro
														// del panel.
		this.add(botonBorrar);
		this.add(scrollPane);
		// voy a atender al boton borrar desde la instancia de esta clse
		botonBorrar.addActionListener(this);

	}// end refrescar productos

	public void actionPerformed(ActionEvent arg0) {
		// por si tanto no se selecciona una fila como si pulso el boton
		// repetidas veces
		if (tabla.getSelectedRow() == -1) {
			return; // aunque la funcion no devuelva nada, puedes llamar a
					// return
			// directamente para decir que finaliza la funcion
		}
		JOptionPane.showMessageDialog(null,
				"borrar: " + productos[tabla.getSelectedRow()].toString());
		daoProductos.borrarProducto(productos[tabla.getSelectedRow()].getId());
		refrescarProductos();
		SwingUtilities.updateComponentTreeUI(this);
	}// end actionPerformed
}