package daos;

import java.util.List;

import modelo.Ordenador;

public interface OrdenadoresDAO {
	void registrarOrdenador(Ordenador ordenador);
	List<Ordenador> obtenerOrdenador();
	void borrarOrdenador(int id);
	Ordenador obtenerOrdenadorPorId(int id);
	void guardarCambiosOrdenador(Ordenador ordenador);
}
