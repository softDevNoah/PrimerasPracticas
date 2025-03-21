package main;

import foundaments1.*;

public class Main {
	public static void main(String []args) {
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
		
		System.out.println("A la espera de nuevos métodos.");
	}
}
