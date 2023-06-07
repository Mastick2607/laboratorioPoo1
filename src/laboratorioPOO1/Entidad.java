package laboratorioPOO1;

import javax.swing.JOptionPane;

public class Entidad {
	private double ladoA;
	private double ladoB;
	
	public void ingresarDatos() {
		
		
	
	      ladoA = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la longitud del lado A"));
	      ladoB = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la longitud del lado B"));
	}
	public void calcularArea() {
		
		double resultado;
		
		resultado = ladoA + ladoB;
		JOptionPane.showMessageDialog(null,"El resultado es: "+ resultado);
	
	}

}
