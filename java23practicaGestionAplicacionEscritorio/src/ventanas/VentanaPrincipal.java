package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import paneles.PanelListadoProductos;
import paneles.PanelRegistroProducto;



public class VentanaPrincipal extends JFrame implements ActionListener {
	// paneles de ventana:
	private PanelRegistroProducto panelRegistroProducto = new PanelRegistroProducto();
	private PanelListadoProductos panelListadoProductos = new PanelListadoProductos();
	// barra de menu
	private JMenuBar barraDeMenu = new JMenuBar();
	private JMenu menuProductos = new JMenu("Productos");
	private JMenu menuAyuda = new JMenu("Ayuda");

	// preparacion de la ventana principal
	public VentanaPrincipal() {

		// preparar la barra de menu
		JMenuItem productosInsertar = new JMenuItem("Insertar producto");
		JMenuItem productosListar = new JMenuItem("Listar producto");
		menuProductos.add(productosInsertar);
		menuProductos.add(productosListar);
		barraDeMenu.add(menuProductos);
		barraDeMenu.add(menuAyuda);

		this.setJMenuBar(barraDeMenu);
		// voy a decir a las opciones de menu quien las va a atender cuando se
		// las haga un click
		productosInsertar.addActionListener(this);
		productosListar.addActionListener(this);
		// preparacion de la ventana principal
		this.setSize(800, 600);
		this.setLocation(50, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// vamos a decir que cuando arranque esta ventana se muestre el panel de
		// registro producto
		this.setContentPane(panelRegistroProducto);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("atiendo a: " + e.getActionCommand());
		if (e.getActionCommand().equals("Insertar producto")) {
			setContentPane(panelRegistroProducto);
		} else if (e.getActionCommand().equals("Listar producto")) {
			setContentPane(panelListadoProductos);
			panelListadoProductos.refrescarProductos();
		}
		SwingUtilities.updateComponentTreeUI(this);
	}
} // end class
