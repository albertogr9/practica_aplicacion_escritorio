package paneles;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



import daos.ProductoDAOImpl;
import modelo.Producto;

public class PanelRegistroProducto extends JPanel implements ActionListener {
	JTextField campoModelo = new JTextField(10);
	JTextField campoMarca = new JTextField(10);
	JTextField campoDiscoDuro = new JTextField(10);
	JTextField campoRam = new JTextField(10);
	JTextField campoProcesador = new JTextField(10);
	JTextField campoPantalla = new JTextField(10);
	JTextField campoPeso = new JTextField(10);

	public PanelRegistroProducto() {
		// asi asigno un gestor de diseño que me permite colocar las cosas en
		// forma de filas y celdas
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		// primer elemento
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		this.add(new JLabel("Introduce los datos del producto"), gbc);
		// vuelvo a decir que cada componente solo ocupe un elemento:
		gbc.gridwidth = 1;
		// segunda fila:
		gbc.gridy = 1;
		gbc.gridx = 0;
		this.add(new JLabel("Modelo:"), gbc);
		gbc.gridy = 1;
		gbc.gridx = 1;
		this.add(campoModelo, gbc);
		// tercera fila
		gbc.gridy = 2;
		gbc.gridx = 0;
		this.add(new JLabel("Marca"), gbc);
		gbc.gridy = 2;
		gbc.gridx = 1;
		this.add(campoMarca, gbc);
		// cuarta fila
		gbc.gridy = 3;
		gbc.gridx = 0;
		this.add(new JLabel("Disco Duro"), gbc);
		gbc.gridy = 3;
		gbc.gridx = 1;
		this.add(campoDiscoDuro, gbc);
		// quinta fila
		gbc.gridy = 4;
		gbc.gridx = 0;
		this.add(new JLabel("Ram"), gbc);
		gbc.gridy = 4;
		gbc.gridx = 1;
		this.add(campoRam, gbc);
		// sexta fila
		gbc.gridy = 5;
		gbc.gridx = 0;
		this.add(new JLabel("Procesador"), gbc);
		gbc.gridy = 5;
		gbc.gridx = 1;
		this.add(campoProcesador, gbc);
		// septima fila
		gbc.gridy = 6;
		gbc.gridx = 0;
		this.add(new JLabel("Pantalla"), gbc);
		gbc.gridy = 6;
		gbc.gridx = 1;
		this.add(campoPantalla, gbc);
		//octava fila
		gbc.gridy = 7;
		gbc.gridx = 0;
		this.add(new JLabel("Peso"), gbc);
		gbc.gridy = 7;
		gbc.gridx = 1;
		this.add(campoPeso, gbc);
		//ultima fila
		JButton botonRegistroProducto = new JButton("REGISTRAR");
		botonRegistroProducto.addActionListener(this);
		gbc.gridy = 8;
		gbc.gridx = 0;
		gbc.gridwidth = 2;
		this.add(botonRegistroProducto, gbc);
		
	} // end PanelRegistroProducto()

	public void actionPerformed(ActionEvent arg0) {
		System.out.println("actionPerformed del PanelRegistroProducto");
		String modelo = campoModelo.getText();
		String marca = campoMarca.getText();
		String discoDuro = campoDiscoDuro.getText();
		String ram = campoRam.getText();
		String procesador = campoProcesador.getText();
		String pantalla = campoPantalla.getText();
		String peso = campoPeso.getText();

		Producto productoAregistrar = new Producto(modelo, marca, discoDuro,
				ram, procesador, pantalla, peso);
		System.out.println("voy a registrar " + productoAregistrar.toString());

		ProductoDAOImpl ProductoDAO = new ProductoDAOImpl();
		ProductoDAO.registrarProducto(productoAregistrar);
		JOptionPane.showMessageDialog(null, "PRODUCTO REGISTRADO");
		
		//limpio los campos despues de registar el producto
		campoModelo.setText("");
		campoMarca.setText("");
		campoDiscoDuro.setText("");
		campoRam.setText("");
		campoProcesador.setText("");
		campoPantalla.setText("");
		campoPeso.setText("");
	}

} // end class
