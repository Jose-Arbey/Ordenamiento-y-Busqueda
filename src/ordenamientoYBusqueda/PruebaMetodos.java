package ordenamientoYBusqueda;

import java.util.Scanner;

public class PruebaMetodos {

	public static void main(String[] args) { // metodo principal
		
		  int espacio; 
		  int [] arreglo; 
	      int numero; 
		
		  Scanner entrada = new Scanner(System.in);
		
	       System.out.printf("Ingresa el numero de espacios para el arreglo: ");
	       espacio = entrada.nextInt(); 

	       arreglo = new int [espacio]; 
			 
	       System.out.println(); // Imprime una linea en blanco
	       
			 
			 for(int x = 0; x < arreglo.length; x++)
			 {
				 System.out.printf("Ingresa un numero para la posicion[%d]: ", x);
				 numero = entrada.nextInt();
				 arreglo[x] = numero;
			 }
			 
			 System.out.println("\nArreglo desordenado: ");
			 
			 for(int i = 0; i < arreglo.length; i++)
			 {
				 System.out.printf("%d ", arreglo[i]);
			 }
			 
			 /*Aplicar lo aprendido en la clase pedir*/

			 MetodosOrdenamiento llamada = new MetodosOrdenamiento();
			 
			 int elige = 0;
			 
			 System.out.printf("\nSi deseas ordenar el arreglo ingresa 1 si deseas salir ingresa 2: ");
			 elige = entrada.nextInt();
			 
			 if(elige != 1) // Si la opcion es diferente de 1 el programa termina 
			 {
				 System.out.printf("\nHas introducido la opcion 2 por lo tanto el Programa termino!");
			 }
			 
			 else 
			 {
				 while(elige == 1)
				 {
					 System.out.printf("\n\n%s\n%s\n%s\n%s\n%s\n%s",
				              "Para ordenar tu arreglo introduce una de las sig opciones",
				              "1 - Para ordenar con metodo Burbuja",
				              "2 - Para ordenar con metodo Insercion Directa",
				              "3 - Para ordenar con metodo Shell Sort",
				              "4 - Para ordenar con metodo Quick Sort\n",
				              "Porfavor introduce una de las opciones anteriores: ");
		                      int opcion = entrada.nextInt();
		                      
						 switch(opcion)
						 {
							 case 1:
								 llamada.Burbuja(arreglo);
								 break;
								 
							 case 2:
								 llamada.insercionDirecta(arreglo);
								 break;
								 
							 case 3:
								 llamada.shellSort(arreglo);
								 break;
								 
							 case 4:
								 llamada.quickSort(arreglo);
								 break;
						 }
						 
		 
		 System.out.printf("\n\n%s\n%s\n%s\n%s: ",
				              "    Elige una de las dos opciones",
				              "1 - Para Busqueda Secuencial Ordenada",
				              "2 - Para Busqueda Binaria Ordenada",
				              "Ingresa el numero de la opcion: ");
		                       int opcion2 = entrada.nextInt();
		 
		 MetodosBusqueda variable = new MetodosBusqueda();
		 
		 switch(opcion2)
		 {
			 case 1:
				 variable.busquedaSecuencial(arreglo);
				 break;
			 
			 case 2:
				 variable.busquedaBinaria(arreglo);
				 break;
		 }
		 
		 System.out.printf("\nSi deseas ordenar el arreglo ingresa 1 si deseas salir ingresa 2: ");
		 elige = entrada.nextInt();
	    }
				 
	}
			 
			 
}

}
