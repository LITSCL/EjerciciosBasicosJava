package cl.inacap.ejercicios;
import java.util.Scanner; //Se importa la clase Scanner.
public class Ejercicio08 {
	static Scanner sc = new Scanner(System.in); //Se crea un objeto de tipo Scanner para poder leer datos.
	public static void main(String[] args) {
		System.out.println("Ingrese la cantidad de segundos:");
		int segundos = Integer.parseInt(sc.nextLine()); //Se lee un int.
		int minutos = (segundos/60); //Se almacena la cantidad de minutos en un int.
		int segundosFaltantes = 0;
		if (segundos%60 != 0) { //Se eval�a la condici�n
			while (segundos%60 != 0) { //Se repite mientras se cumpla la condici�n.
				segundos++;
				segundosFaltantes++;
			}
		}
		else {
			segundosFaltantes = 60;
			System.out.println("Los segundos que introdujiste generan " + minutos + " minutos exactos"); //Si no se cumpli� la condici�n, se ejecuta el c�digo.
		}
		System.out.println("Faltan " + segundosFaltantes + " segundos para convertirse en exactamente " + (minutos+1) + " minutos"); //Se imprime en consola la concatenaci�n.
	}
}
