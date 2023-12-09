package cl.inacap.ejercicios;
import java.util.Scanner; //Se importa la clase Scanner.
public class Ejercicio11 {
	static Scanner sc = new Scanner(System.in);  //Se crea un objeto de tipo Scanner para poder leer datos.
	public static void main(String[] args) {
		System.out.println("Ingrese el primer numero"); //Se imprime en pantalla.
		int numero1 = Integer.parseInt(sc.nextLine()); //Se lee un String y se convierte a int.
		
		System.out.println("Ingrese el segundo numero"); //Se imprime en pantalla.
		int numero2 = Integer.parseInt(sc.nextLine()); //Se lee un String y se convierte a int.
		
		System.out.println("Los numeros que estan entre " + numero1 + " y " + numero2); //Se imprime en pantalla la concatenación.
		int contador = 0;
		if (numero1 < numero2) { //Se evalúa la condición.
			for (int i = (numero1 + 1); i < numero2; i++) { //Se declara el bucle for.
				System.out.println(i);
				contador++;
			}
			System.out.println("La cantidad de numeros que hay entre " + numero1 + " y " + numero2 + " son: " + contador + " numeros"); //Una vez fuera del bucle se imprime esta concatenación.
		}
		else {
			for (int i = (numero2 + 1); i < numero1; i++) { //Se declara el bucle for.
				System.out.println(i);
				contador++;
			}
			System.out.println("La cantidad de numeros que hay entre " + numero1 + " y " + numero2 + " son: " + contador + " numeros"); //Una vez fuera del bucle se imprime esta concatenación.
		}
		
	}

}
