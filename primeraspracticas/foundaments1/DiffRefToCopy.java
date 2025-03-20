package foundaments1;

public class DiffRefToCopy {

	public static void refExample() {
		int d[]= {1, 2}, e[]= {3, 4}, f[] = d;

		System.out.println("Referencias y datos a los que apuntan:");
		showArray(d, "d");
		showArray(e, "e");
		showArray(f, "f");
		
		//si cambiamos el contenido de d, no debería cambiar la referencia de f
		d[0] = 5;
		d[1] = 6;
		
		System.out.println("\nSe modifica el array de enteros al que apuntan \'d\', y \'f\' pero se mantiene la referencia:");
		showArray(d, "d");
		showArray(e, "e");
		showArray(f, "f");
		
		System.out.println("\nSe cambia \'d\' a null:");
		d = null;
		System.out.println("d = " + d); //está ok, se imprime "null"
		showArray(f, "f"); //está ok, se imprime
		//System.out.println(d[0] + d[1]); //queriendo acceder, daría NullPointerException.
	}
	public static void copyExample() {
		int	a = 1;
		int b = ++a;//se suma 1 a 'a' y se le asigna su valor a 'b' (2)
		int c = a-- + 1; // 3, y se le resta 1 a 'a' (1)
		int d = b + c;//5 (2 + 3)
		
		System.out.println("Datos primitivos (copia+operaciones):");
		System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\nd = " + d);
	}
	private static void showArray(int array[], String name) {
		System.out.print(name + " = " + array + " => ");
		for (int value : array)
			System.out.print(value + " ");
		System.out.println();
	}
}