package main;

import foundaments1.*;
import javax.swing.JOptionPane;

class CallFoundaments1 {
	static void executeFoundaments1() {
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

public class Main {
	public static void main(String []args) {
		//Panel de entrada con opciones "Aceptar" y "Cancelar"
		int choise = JOptionPane.showConfirmDialog(null, "¿Deseas visualizar el resultado de foundaments1?", "Confirmación", JOptionPane.YES_NO_OPTION);
        
        if (choise == JOptionPane.YES_OPTION) {  // Si el usuario presiona "Aceptar" (textoIngresado no es null)
            CallFoundaments1.executeFoundaments1();
        } else {
            JOptionPane.showMessageDialog(null, "Ok, se prosigue la siguiente parte del programa.", "Denegado", JOptionPane.WARNING_MESSAGE);
        }
		
		System.out.println("A la espera de nuevos métodos.");
	}
}

