package foundaments1;

public class DiffRefToCopy {

	public void refExample() {
		int d[]= {1, 2}, e[]= {3, 4}, f[] = d;

		//muestra la referencia que almacenan estas variables
		System.out.println("Referencias y datos a los que apuntan:");
		showArray(d, "d");
		showArray(e, "e");
		showArray(f, "f");	
		//si cambiamos el contenido de d, no debería cambiar la referencia de f
		d[0] = 5;
		d[1] = 6;
		System.out.println("\nSe modifica el array de enteros al que apuntan \'d\', y \'f\' pero se mantiene la referencia:");
		//Muestra que no cambian las referencias pero sí el contenido
		showArray(d, "d");
		showArray(e, "e");
		showArray(f, "f");
		System.out.println("\nSe cambia \'d\' a null:");
		//cambiamos d y le asignamos null, e imprimimos
		d = null;
		System.out.println("d = " + d); //está ok, se imprime "null"
		showArray(f, "f"); //está ok, se imprime
			
		//si queremos acceder al array d[], siendo null, da una NullPointerException:
		//System.out.println(d[0] + d[1]);
	}
	public void copyExample() {
		//tipo primitivo de ejemplo
		int	a = 1;
		int b = ++a;
		int c = a-- + 1;
		int d = b + c;
		
		//muestra el contenido de las variables de tipo primitivo
		System.out.println("Datos primitivos:");
		System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
		System.out.println("d = " + d + ", porque es b (" + b + ") + c (" + c + ")");
	}
	private void showArray(int array[], String name) {
		System.out.print(name + " = " + array + " => ");
		for (int value : array)
			System.out.print(value + " ");
		System.out.println();
	}
}