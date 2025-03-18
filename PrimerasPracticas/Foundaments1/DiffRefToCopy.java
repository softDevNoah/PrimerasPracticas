package Foundaments1;

public class DiffRefToCopy {

	public void executeExample() {
		//tipo primitivo de ejemplo
		int	a = 1;
		int b = ++a;
		int c = a-- + 1;
		//array de enteros(referencias)
		int d[]= {1, 2};
		int e[]= {3, 4};
		int f[] = d;
		//muestra el contenido de las variables de tipo primitivo
		System.out.println("Datos primitivos:");
		System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
		//muestra la referencia que almacenan estas variables
		System.out.println("Referencias:");
		System.out.println("d = " + d + "\ne =" + e + "\nf = " + f);
		//muestra el contenido al que apuntan las referencias
		System.out.println("Datos donde apuntan las referencias:");
		System.out.println("d = " + d[0] + d[1]);
		System.out.println("e =" + e[0] + e[1]);
		System.out.println("f = " + f[0] + f[1]);		
		//si cambiamos el contenido de d, no debería cambiar la
		//referencia de f, sino el contenido, ya que apuntan al mismo sitio
		d[0] = 5;
		d[1] = 6;
		System.out.println("\nSe ha modificado el array de enteros \'d\'.\n");
		//Muestra que no cambian las referencias pero sí el contenido
		System.out.println("Referencias:");
		System.out.println("d = " + d + "\ne =" + e + "\nf = " + f);
		System.out.println("Datos donde apuntan las referencias:");
		System.out.println("d = " + d[0] + d[1]);
		System.out.println("e =" + e[0] + e[1]);
		System.out.println("f = " + f[0] + f[1]);
		
		//cambiamos d y le asignamos null, e imprimimos
		d = null;
		System.out.println("f = " + f[0] + f[1]); //está ok, se imprime
		System.out.println(d); //está ok, se imprime "null"
		
		//si queremos acceder al array d[], siendo null, da una NullPointerException:
		//System.out.println(d[0] + d[1]);
	}
}