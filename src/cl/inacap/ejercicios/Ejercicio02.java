package cl.inacap.ejercicios;
import java.util.Scanner; //Se importa la clase Scanner.
public class Ejercicio02 {
	static Scanner sc = new Scanner(System.in); //Se crea un objeto de tipo Scanner para poder leer datos.
	public static void main(String[] args) {
		System.out.println("Ingrese la nota de la primera evaluación del alumno");
		double evaluacion1 = Double.parseDouble(sc.nextLine()); //Se lee un String, se convierte a double y se almacena en la variable.
		System.out.println("Ingrese la nota de la segunda evaluación del alumno");
		double evaluacion2 = sc.nextDouble(); //Se lee un Double.
		sc.nextLine();
		System.out.println("Ingrese la nota de la tercera evaluación del alumno");
		double evaluacion3 = Double.parseDouble(sc.nextLine()); //Se lee un String, se convierte a double y se almacena en la variable.
		System.out.println("Ingrese la nota de la cuarta evaluación del alumno");
		double evaluacion4 = sc.nextDouble(); //Se lee un Double.
		sc.nextLine();
		
		System.out.println("El promedio del alumno es: " + (evaluacion1 * 0.15 + evaluacion2 * 0.20 + evaluacion3 * 0.25 + evaluacion4 * 0.40)); //Aca se calcula el promedio de notas.
	}

}
