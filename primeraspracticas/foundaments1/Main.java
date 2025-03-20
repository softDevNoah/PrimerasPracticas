package foundaments1;

public class Main {
	public static void main(String []args) {
		//por ahora no hace mucho
		DiffRefToCopy obj1 = new DiffRefToCopy();
		System.out.println("----COPIA DE DATOS Y REFERENCIAS:");
		obj1.copyExample();
		obj1.refExample();
		obj1 = null;
		System.out.println(".............................................................................");
		System.out.println("----CASTING DE DATOS:");
		CastingTests obj2 = new CastingTests();
		obj2.validCastExample();
		obj2.invalidCastExample();
		obj2 = null;
		System.out.println(".............................................................................");
		
		System.out.println("A la espera de nuevos métodos.");
	}
}
