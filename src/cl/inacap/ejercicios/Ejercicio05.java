package cl.inacap.ejercicios;
import java.util.Scanner; //Se importa la clase Scanner.
public class Ejercicio05 {
	static Scanner sc = new Scanner(System.in); //Se crea un objeto de tipo Scanner para poder leer datos.
	public static void main(String[] args) {
		System.out.println("Ingrese un numero:");
		int numero = Integer.parseInt(sc.nextLine());
		
		if (numero < 0) { //Si la condici�n se cumple, imprime el contenido e ignora las dem�s condiciones.
			System.out.println("El numero es negativo");
		}
		else if (numero == 0) { //Si la condici�n anterior no se cumpli�, se eval�a esta condici�n, de ser correcta imprime su contenido e ignora las siguientes condiciones.
			System.out.println("El numero es 0");
		}
		else { //Si ninguna condici�n se cumplio se imprime el contenido del else.
			System.out.println("El numero es positivo");
		}
	}

}
