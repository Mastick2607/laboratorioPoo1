package laboratorioPOO1;

import javax.swing.JOptionPane;

public class Numeros {
	
 int num;  // se crean las variables
 int i,neg=0, par =0;
 
 public void entrada() {
	 
	 for(i=0; i<5; i++) {//itera la cantidad de veces que va pedir el numero
		 num=ingresarDatos("Ingrese un numero"); // se lla el motodo y luego se almacena en la variable num
		// se valida si es par acumla lasveces que se repiten, lo mismo para los numeros negativos 
		 if(num %2==0) {
			 par++;
		    }
		 else if(num<0){
			 neg++;
			 
		 }
	 }
	 
	 //imprime la informacion
	 JOptionPane.showMessageDialog(null," la cantidad de numeros pares es: "+par+"\n"
			   +" y la cantidad de numeros negativo es :"+neg);
 } 
 
// se crea el metodo que va pedir el numero en pantalla
private int ingresarDatos(String mensaje ) {
  int valor;
  valor = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
	return valor;
}

}
