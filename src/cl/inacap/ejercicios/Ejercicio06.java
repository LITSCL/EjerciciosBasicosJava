package cl.inacap.ejercicios;
import java.util.Scanner; //Se importa la clase Scanner.
public class Ejercicio06 {
	static Scanner sc = new Scanner(System.in); //Se crea un objeto de tipo Scanner para poder leer datos.
	public static void main(String[] args) {
		System.out.println("Ingrese el precio de la venta:");
		double precioVenta = Double.parseDouble(sc.nextLine()); //Se lee un double.
		
		if (precioVenta > 500000) { //Se evalúa la condición.
			precioVenta = precioVenta * 0.90;
		}
		else {
			precioVenta = precioVenta * 0.95;
		}
		
		precioVenta = precioVenta * 1.19;
		
		System.out.println("El precio de la venta con el IVA incluido es: " + precioVenta); //Se imprime en consola la concatenación.
	}

}
