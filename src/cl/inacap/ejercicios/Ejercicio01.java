package cl.inacap.ejercicios;

import java.util.Scanner; //Se importa la clase Scanner.

public class Ejercicio01 {
	static Scanner sc = new Scanner(System.in); //Se crea un objeto de tipo Scanner para poder leer datos.
	public static void main(String[] args) {
		
		System.out.println("Ingrese el largo del rectangulo"); //Imprime en consola.
		int largo = Integer.parseInt(sc.nextLine()); //Variable de tipo int que almacena el largo (Se lee un String y se convierte a int).
		System.out.println("Ingrese el ancho del rectangulo"); //Imprime en consola.
		int ancho = Integer.parseInt(sc.nextLine()); //Variable de tipo int que almacena el ancho (Se lee un String y se convierte a int).
		
		System.out.println("El area del rectangulo es: " + (largo * ancho)); //Imprime en consola el area del rectangulo concatenado con texto.
		System.out.println("El perimetro del rectangulo es: " + (largo * 2 + ancho * 2)); //Imprime en consola el perimetro del rectangulo concatenado con texto.
	}
}
