package cl.inacap.ejercicios;
import java.util.Scanner; //Se importa la clase Scanner.
public class Ejercicio07 {
	static Scanner sc = new Scanner(System.in); //Se crea un objeto de tipo Scanner para poder leer datos.
	public static void main(String[] args) {
		System.out.println("Ingrese la cantidad de horas academicas asistidas del alumno:");
		double horasAcademicas = Double.parseDouble(sc.nextLine()); //Se lee un double.
		double minutosAcademicos = horasAcademicas * 45; //Se lee un double.
		double horasReales = minutosAcademicos / 60; //Se lee un double.
		System.out.println("La cantidad de horas reales es: " + horasReales); //Se imprime en consola la concatenación.
	}
}
