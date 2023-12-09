package cl.inacap.ejercicios;

public class Ejercicio10 {

	public static void main(String[] args) {
		int contador = 0; //Se declara una variable de tipo int.
		int suma = 0; //Se declara una variable de tipo int.
		for (int i = 0; i < 100; i++) { //Se declara un bucle for que repite 100 iteraciones.
			contador++; //La variable aumenta en una unidad.
			suma = suma + contador; //En esta variable se va almacenando el resultado de las sumas.
		}
		System.out.println("La suma de los primeros 100 numeros naturales es: " + suma); //Se imprime en consola la concatenación.

	}

}
