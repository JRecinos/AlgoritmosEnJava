/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {

	int i=Integer.parseInt(args[0].toString());
			int k=Integer.parseInt(args[1].toString());
					i=i+1;
         				while(i<k){
                   			System.out.println(i);
                  			 i=i+1;
      
   }

}