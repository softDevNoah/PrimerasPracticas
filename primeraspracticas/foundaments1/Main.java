package foundaments1;

public class Main {
	public static void main(String []args) {
		//por ahora no hace mucho
		DiffRefToCopy obj1 = new DiffRefToCopy();
		System.out.println("Ejemplos sobre copia de datos y de referencias");
		obj1.copyExample();
		System.out.println();
		obj1.refExample();
		obj1 = null;
		System.out.println(".............................................................................\n");
		System.out.println("Ejemplos sobre casteos válidos e inválidos");
		CastingTests obj2 = new CastingTests();
		obj2.validCastExample();
		System.out.println();
		obj2.invalidCastExample();
		System.out.println("\n..............................................................................\nA la espera de nuevos métodos.");
	}
}
