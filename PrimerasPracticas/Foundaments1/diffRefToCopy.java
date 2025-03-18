package Foundaments1;

public class diffRefToCopy {

	public void executeExample() {
		int	a = 1;
		int b = ++a;
		int c = a-- + 1;
		int d[]= {1, 2};
		int e[]= {3, 4};
		int f[] = d;
		
		System.out.println("Datos primitivos:\na = " + a + "\nb = " + b + "\nc = " + c);
		System.out.println("Referencias:\nd = " + d + "\ne =" + e + "\nf = " + f);
		System.out.println("Datos donde apuntan las referencias:\nd = " + d[0] + d[1] + "\ne =" + e[0] + e[1] + "\nf = " + f[0] + f[1]);		
		//si cambiamos el contenido de d, no debería cambiar la referencia de f, sino el contenido, ya que apuntan al mismo sitio
		d[0] = 5;
		d[1] = 6;
		System.out.println("Referencias:\nd = " + d + "\ne =" + e + "\nf = " + f);
		System.out.println("Datos donde apuntan las referencias:\nd = " + d[0] + d[1] + "\ne =" + e[0] + e[1] + "\nf = " + f[0] + f[1]);		

	}
}