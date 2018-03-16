package modelo;

public class Producto {
	private String modelo;
	private String marca;
	private String discoDuro;
	private String ram;
	private String procesador;
	private String pantalla;
	private String peso;
	private int id;

	public Producto() {

	}

	public Producto(String modelo, String marca, String discoDuro, String ram,
			String procesador, String pantalla, String peso) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.discoDuro = discoDuro;
		this.ram = ram;
		this.procesador = procesador;
		this.pantalla = pantalla;
		this.peso = peso;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(String discoDuro) {
		this.discoDuro = discoDuro;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String toString() {
		return "Producto [modelo=" + modelo + ", marca=" + marca
				+ ", discoDuro=" + discoDuro + ", ram=" + ram + ", procesador="
				+ procesador + ", " + ", pantalla=" + pantalla + ","
				+ ", peso=" + peso + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
