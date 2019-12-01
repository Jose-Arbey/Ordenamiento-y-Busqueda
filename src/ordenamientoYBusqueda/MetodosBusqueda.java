package ordenamientoYBusqueda;

import java.util.Scanner;

public class MetodosBusqueda 
{
      public void busquedaSecuencial(int [] arreglo)
      {
    	  Scanner entrada = new Scanner(System.in);
    	  
    	  int valor = 0;
    	  
    	  System.out.printf("\n\nEscribe un valor a buscar dentro del arreglo ya ORDENADO: ");
			 valor = entrada.nextInt();
			 
			 // METODO DE BUSQUEDA ORDENADA
			 int i = 0;
			 int n = arreglo.length - 1;
			 int comparaciones = 0;
			
			 while((i <= n) && (valor > arreglo[i]))
			 {
				 i = i + 1;
				 comparaciones += 1;
			 }
			 
			 if((i > n) || (valor < arreglo[i]))
			 {
				 System.out.printf("\nEl valor %d no se encuentra en el arreglo", valor);
			 }else {
				 System.out.printf("\nEl valor %d esta en la poscion: [%d] del arreglo", valor, i);
				 System.out.printf("\nEl numero de comparaciones que se efectuaron para encontrarlo es: %d", comparaciones);
				 
			 }
      }
      
      public void busquedaBinaria(int [] arreglo)
      {
    	 
    	  int x = 0;
    	  Scanner entrada = new Scanner(System.in);
    	  
    	  System.out.printf("\nEscribe un valor a buscar dentro del arreglo ya ORDENADO: ");
  		  x = entrada.nextInt();
  			 
  	     // METODO DE BUSQUEDA BINARIA
  	     int izq = 0;
  	     int der = (arreglo.length - 1);
  	     int cen = ((izq + der) / 2);
  	   int inter = 0;
  	     
  	     while((izq <= der) && (x != arreglo[cen]))
  	     {
  	    	 if(x > arreglo[cen])
  	    	 {
  	    		 izq = cen + 1;
  	    		 inter = inter + 1;
  	    	 }
  	    	 else
  	    	 {
  	    		  der = cen - 1;
  	    		  inter = inter + 1;
  	    	 }
  	    	 
  	    	 cen = ((izq + der) / 2);
  	     }
  	     if(izq > der)
  	     {
  	       System.out.printf("El valor %d no se encuentra en el arreglo", x); 
  	     }
  	     else
  	     {
  	    	 System.out.printf("El valor %d se encuentra en la posicion arreglo[%d]", x, cen);
  	    	 System.out.printf("\nEl numero de comparaciones realizadas fue %d", inter);
  	     }
      }
}
