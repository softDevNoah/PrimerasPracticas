package main;

import foundaments1.*;
//import minicalculator.*;
import java.util.*;

class FoundamentsExecutor {
	static void tryExe(String choise, int Foundaments) {
		if (CheckInput.checkInput(choise) == 1) {
			switch (Foundaments) {
			case 1 :
				FoundamentsExecutor.exeFoundaments1();
			}
		}
	}
	static void exeFoundaments1() {
		
		System.out.println("----COPIA DE DATOS Y REFERENCIAS:");
		DiffRefToCopy.copyExample();
		DiffRefToCopy.refExample();
		System.out.println(".............................................................................");
		System.out.println("----CASTING Y CONVERSIÓN DE DATOS:");
		CastingTests.validCastExample();
		CastingTests.invalidCastExample();
		System.out.println(".............................................................................");
		System.out.println("----NOMBRES VÁLIDOS E INVÁLIDOS DE VARIABLES:");
		ValidVarNames.exampleUnvalidVarNames();
		System.out.println(".............................................................................");
	}
}

class MiniCalculator {
	static void tryExeCalculator(String choise) {
		if (CheckInput.checkInput(choise) == 1)
			System.out.println("Mini calculadora en proceso de creación");
	}
}

class CheckInput {
	static int checkInput(String input){
		if (input.equals("Sí") || input.equals("Si") || input.equals("sí") || input.equals("si"))
			return (1);
		else if (input.equals("SÍ") || input.equals("SI"))
			return (1);
		else if (input.equals("No") || input.equals("no") || input.equals("NO"))
			return (0);
		else {
			System.out.println("Sección omitida a causa de una respuesta no permitida.");
			return (0);
		}
	}
}

public class Main {
	public static void main(String []args) {

		Scanner input = new Scanner(System.in);
		String	choise;
		
		System.out.println("AVISO: Se responde solo: \"Sí\" o \"No\". Cualquier otra respuesta se interpretará como un No)\n");
		System.out.println("¿Deseas visualizar el contenido de Foundaments1?");
		choise = input.nextLine();
		FoundamentsExecutor.tryExe(choise, 1);
		
		System.out.println("¿Deseas visualizar el contenido de minicalculator?");
		choise = input.nextLine();
		MiniCalculator.tryExeCalculator(choise);
		
        input.close();
		System.out.println("A la espera de nuevos métodos.");
	}
}

