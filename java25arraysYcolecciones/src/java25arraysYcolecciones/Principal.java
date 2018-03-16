package java25arraysYcolecciones;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// un array no es mas que un conjunto de objetos del mismo tipo, tienen
		// un tamaño fijo y no se puede redimensionar

		// definicion de un array de dos objetos
		Cliente[] miArray = { new Cliente(), new Cliente() };
		// definicion de un array de cinco objetos
		Cliente[] otroarray = new Cliente[5];
		// en este caso hay que inicializar los objetos
		otroarray[0] = new Cliente("Juan", "calle sol", "salamanca", "12345",
				"959864");
		// al array se le accede por un indice, la primera posicion es la cero
		System.out
				.println("valor de la posicion 0: " + otroarray[0].toString());
		// la ultima posicion del array es su tamaño menos uno
		// otroarray[5] = new Cliente(); esto da error ya que no hay indice 5
		// porque solo hay 5 elementos y el primero es 0 con lo cual el ultimo
		// seria 4

		// como los arrays no son redireccionables para eso en java tenemos las
		// colecciones que no son mas que objetos que guardan otros objetos

		// en java hay muchos tipos de colecciones pero las que mas se usan
		// son las de tipo List y las de tipo Map

		// las de tipo List: se comportan como un array dinamico, almacenando
		// otros
		// objetos en posiciones numéricas basadas en un índice, como los
		// arrays.

		ArrayList miArrayList = new ArrayList();
		miArrayList.add("primer elemento");
		miArrayList.add("segundo elemento");
		// las colecciones en las que no hemos dicho el tipo de dato con el que
		// van a trabajar
		// son un verdadero problema
		miArrayList.add(new Cliente());
		// como puedo meterles cualquier cosa yo ahora no se si en cierta posicion 
		// tengo un string un cliente o cualquier cosaa
		
		//		String primerElemento = miArrayList.get(0);
		//estoy forzado a hacer un casting:
		String primerElemento = (String) miArrayList.get(0);
		// y en este caso he tenido suerte y puede que funcione:
		System.out.println("primer elemento del ArrayList: " + primerElemento);
		miArrayList.set(0, new Cliente());
		//vamos a ver si haciendo lo mismo funciona:
		//primerElemento = (String)miArrayList.get(0);
	}
}
