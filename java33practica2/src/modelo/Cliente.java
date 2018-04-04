package modelo;

public class Cliente {
	private String nombre;
	private String calle;
	private String numero;
	private String codigoPostal;
	private String poblacion;
	private String telefono;
	private String email;
	private String particularEmpresa;
	private int id;

	public Cliente(String nombre, String calle, String numero,
			String codigoPostal, String poblacion, String telefono,
			String email, String particularEmpresa) {
		super();
		this.nombre = nombre;
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.email = email;
		this.particularEmpresa = particularEmpresa;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getParticularEmpresa() {
		return particularEmpresa;
	}


	public void setParticularEmpresa(String particularEmpresa) {
		this.particularEmpresa = particularEmpresa;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", calle=" + calle + ", numero="
				+ numero + ", codigoPostal=" + codigoPostal + ", poblacion="
				+ poblacion + ", telefono=" + telefono + ", email=" + email
				+ ", particularEmpresa=" + particularEmpresa + ", id=" + id
				+ "]";
	}



}
