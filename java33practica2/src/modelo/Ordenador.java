package modelo;

public class Ordenador {
	private String marca;
	private String modelo;
	private String precio;
	private String disco;
	private String ram;
	private String procesador;
	private String pantalla;
	private String peso;
	private int id;

	public Ordenador() {
	}

	public Ordenador(String marca, String modelo, String precio, String disco,
			String ram, String procesador, String pantalla, String peso) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.disco = disco;
		this.ram = ram;
		this.procesador = procesador;
		this.pantalla = pantalla;
		this.peso = peso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", precio="
				+ precio + ", disco=" + disco + ", ram=" + ram
				+ ", procesador=" + procesador + ", pantalla=" + pantalla
				+ ", peso=" + peso + ", id=" + id + "]";
	}

}
