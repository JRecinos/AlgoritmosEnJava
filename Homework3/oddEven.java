/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
      
      	int numero;
	        numero= Integer.parseInt(args[0].toString());
			if((numero%2==0)){
				System.out.println("Numero es par");}
			else if((numero%2!=0)){
 				System.out.println("Numero es Impar");}
   }
}