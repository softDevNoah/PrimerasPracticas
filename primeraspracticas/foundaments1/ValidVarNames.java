package foundaments1;

public class ValidVarNames {
	public static void exampleUnvalidVarNames() {
		boolean _notConventional = true, $notConventional = true, notconventional = true;
		//boolean 3unvalid;
		//boolean 4;
		//boolean .unvalid5;
		if (_notConventional|| $notConventional || notconventional) {
			System.out.println("Por convención:");
			System.out.println("\t- Se evita _ o $ como primer caracter en el nombre de una variable (técnicamente es válido).");
			System.out.println("\t- Se usa estilo camelCase para variables.\n");
			System.out.println("Casos que dan error(descomentar código):");
			System.out.println("\t- Inlcuyan caracteres que no son alfabéticos o numéricos ni _ ni $");
			System.out.println("\t- Comiencen por un nº o solo sea numérico");
		}
	}
}
