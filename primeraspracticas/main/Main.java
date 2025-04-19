package main;

import foundaments1.*;
import minicalculator.*;

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

class CallMiniCalculator {
	static void executeMiniCalculator() {
		System.out.println("Mini calculadora en proceso de creación");
	}
}

class CalcuPanel {
	static int calcu = JOptionPane.showConfirmDialog(null, "Quieres usar la mini calculadora?", "Confirmación", JOptionPane.YES_NO_OPTION);

	public static void calcuPanel() {
		if (calcu == JOptionPane.YES_OPTION) {  // Si el usuario presiona "Aceptar" (textoIngresado no es null)
			CallMiniCalculator.executeMiniCalculator();
		} else {
			JOptionPane.showMessageDialog(null, "No hay más contenido actualmente para mostrar.", "Aviso de cierre", JOptionPane.WARNING_MESSAGE);
		}
	}
}

public class Main {
	public static void main(String []args) {
		//Panel de entrada con opciones "Aceptar" y "Cancelar"
		int choise = JOptionPane.showConfirmDialog(null, "¿Deseas visualizar el resultado de foundaments1?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (choise == JOptionPane.YES_OPTION) {  // Si el usuario presiona "Aceptar" (textoIngresado no es null)
            CallFoundaments1.executeFoundaments1();
            CalcuPanel.calcuPanel();
        } else {
        	CalcuPanel.calcuPanel();
        }
		System.out.println("A la espera de nuevos métodos.");
	}
}

