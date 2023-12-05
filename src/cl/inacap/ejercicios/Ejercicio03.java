package cl.inacap.ejercicios;
import java.util.Scanner; //Se importa la clase Scanner.
public class Ejercicio03 {
	static Scanner sc = new Scanner(System.in); //Se crea un objeto de tipo Scanner para poder leer datos.
	public static void main(String[] args) {
		System.out.println("Ingrese el primer numero");
		int numero1 = sc.nextInt(); //Se lee un int.
		sc.nextLine();
		System.out.println("Ingrese el segundo numero");
		int numero2 = Integer.parseInt(sc.nextLine()); //Se lee un String, se convierte a int  y se almacena en la variable.
		
		if (numero1 > numero2) { //Se eval�a la condici�n.
			System.out.println("El primer numero que ingresaste es mayor que el segundo");
		}
		else if (numero1 < numero2){//Si la condici�n anterior no se cumpli�, se eval�a esta condici�n, de ser correcta imprime su contenido e ignora las siguientes condiciones.
			System.out.println("El segundo numero que ingresaste es mayor que el primero"); 
		}
		else {
			System.out.println("Ambos numeros son iguales"); //Si ninguna condici�n se cumplio se imprime el contenido del else.
		}

	}

}
