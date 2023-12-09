package cl.inacap.ejercicios;
import java.util.Scanner; //Se importa la clase Scanner.
public class Ejercicio04 {
	static Scanner sc = new Scanner(System.in); //Se crea un objeto de tipo Scanner para poder leer datos.
	public static void main(String[] args) {
		System.out.println("Ingrese el monto de la venta:");
		int precioVenta = Integer.parseInt(sc.nextLine()); //Se lee un String, se convierte a Double y se almacena en la variable.
		
		if (precioVenta > 300000) { //Se evalua la condición.
			double precioDescuento = precioVenta * 0.90;
			System.out.println("El precio final de la venta con el iva es: " + precioDescuento * 1.19);
		}
		else {
			System.out.println("El precio final de la venta con el iva es: " + precioVenta * 1.19);
		}
		
	}

}
