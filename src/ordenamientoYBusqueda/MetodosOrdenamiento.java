package ordenamientoYBusqueda;

public class MetodosOrdenamiento {
	
	/**************************************************METODO BURBUJA*****************************************/
	public void Burbuja(int [] arreglo)
	{
		 int contador ; // Cuenta las comparaciones
		 int aux = 0; // variable que pasa el numero mayor
		 int pasadas ; // Cuenta en que pasada te encuentras 
		 int indicador = 0; // Indica si hay o no intercambio
		 int totalpasadas = 0; // total de las pasadas contadas
		 int totalcomparaciones = 0; // total de las comparaciones realizadas
		 int intercambios = 0;

		 // CICLO PARA CONTAR PASADAS
		 for(pasadas = 0; pasadas < arreglo.length - 1; pasadas++)
		 {
			 System.out.printf("\n\nPASADA No. %d", pasadas + 1); // PASADA EN LA QUE NOS ENCONTRAMOS
			 totalpasadas +=1;
			        
			 for(contador = arreglo.length - 1; contador > pasadas; contador--) // CICLO PARA RECORRER EL ARREGLO CON EL METODO
			 {
				totalcomparaciones += 1; // Cuenta las comparaciones realizadas
				System.out.println("\nAplicando metodo BURBUJA: "); 
				
				 if(arreglo[contador - 1] > arreglo[contador]) 
				 {
					 aux = arreglo[contador - 1]; 
					 
					 arreglo[contador - 1] = arreglo[contador]; 
					 
					 arreglo[contador] = aux; 
					 
					 intercambios += 1;
					 indicador = 1;
				 }// fin de if
				 
				 for( int i = 0; i < arreglo.length; i++)
				 {
					 System.out.printf("%d ", arreglo[i]);
				 }
				
			     if(indicador == 1)
				   System.out.printf("\n**********************Si hay intercambio");
			     else
				   System.out.printf("\n**********************No hay intercambio");
				   
				   
				   indicador = 0;
			  }// fin de for intercambios
					 
					 
		 }// fin de for pasadas
		 System.out.println("\n\n********ARREGLO ORDENADO POR BURBUJA******** ");
		 for(int i = 0; i < arreglo.length; i++)
		 {
			 System.out.printf("%d ", arreglo[i]);
		 }

		 System.out.printf("\n\n%s\n%s: %d\n%s: %d\n%s: %d",
		                   "EFICIENCIA DEL METODO BURBUJA", 
		                   "Num. Total de Pasadas", totalpasadas,
		                   "Num. Total de Comparaciones", totalcomparaciones,
		                   "Num. Total de Intercambios", intercambios);
	} // FIN DE METODO BURBUJA 
	// *********************************************************************************************************************************
	                                             // *********METODO DE INSERCION DIRECTA**************
    // *********************************************************************************************************************************
	
	public void insercionDirecta (int [] arreglo)
	{
		 int i;
		 int aux;
		 int k;
		 int totalpasadas = 0;
		 int totalcomparaciones = 0;
		 int indicador  = 0;
		 
		 for(i = 1; i < arreglo.length; i++)
		 {
			 System.out.printf("\n\nPASADA No. %d", i); // PASADA EN LA QUE NOS ENCONTRAMOS
			 totalpasadas +=1;
			 indicador = 0;
			 
			 aux = arreglo[i];
			 k = i - 1;
			 
			 	 
			 while( (k >= 0) && (aux < arreglo[k]) )
			 {
				 totalcomparaciones += 1; // Cuenta las comparaciones realizadas

				 arreglo[k + 1] = arreglo[k];
				 k = k -1;				 
				 indicador = 1;
				 
				 if(indicador == 1)
				 {
					 arreglo[k + 1] = aux;
					 System.out.println("\nAplicando INSERCION DIRECTA: "); 
				     for(int j = 0; j < arreglo.length; j++)
				     {
							System.out.printf("%d ", arreglo[j]);
					 }
				     System.out.printf("\n************************ Hay intercambio");
				 }
			 }
			 
			 arreglo[k + 1] = aux;
			 
			
		     if(indicador == 0)
		     {
		    	 System.out.println("\nAPLICANDO INSERCION DIRECTA: "); 
				     for(int j = 0; j < arreglo.length; j++)
				     {
							System.out.printf("%d ", arreglo[j]);
					 } 
					   System.out.printf("\n***************************");
		     }
			 
			   
			  
		 }
		 
        System.out.println("\n\nARREGLO ORDENADO: ");
		 
		 for(int cont = 0; cont < arreglo.length; cont++)
		 {
			 System.out.printf("%d ", arreglo[cont]);
		 }
		 
		 System.out.printf("\n\n%s\n%s: %d\n%s: %d",
                "EFICIENCIA DEL METODO INSERCION DIRECTA", 
                "Num. Total de Pasadas", totalpasadas,
                "Num. Total de Comparaciones", totalcomparaciones);
		 
		 /*
		  * Repetir con I desde 2 hasta N 
		  *     Hacer AUX = A[I]
		  *     K = I - 1
		  *     Mientras ( ( K >= 1 ) && ( AUX < A[K] ) ) Repetir
		  *         Hacer A[ K + 1 ] = A[ K ] 
		  *               K = K - 1
		  *     Fin_Mientras
		  *     Hacer A[K + 1] = AUX
		  *  Fin_For
		  * */

	}
     /*********************************************METODO SHELLSORT***********************************************/	
	public void shellSort(int [] arreglo)
	{
		int N = arreglo.length; // N = 16
		boolean band; 
		int I;
		int aux;
		int pasadas = 0;
		int intercambios  = 0;
		int comparaciones = 0;
		
			
		
		int entero = N + 1; // 16 + 1 = *17
		while(entero > 1) // Mientras 17 > 1
		{
			pasadas = pasadas + 1;
			
			entero = entero / 2; // 17 / 2 = *8
		    comparaciones = comparaciones + entero;
		    
			band = true; // band = verdadero
			while(band == true) // mientras(band == verdadero)
			{
				
				
				band = false; // band = falso
				I = 0; // I = 1
				while((I + entero) <= N - 1) // mientras(8 <= 15) // iteracion que se hace 8 veces
				{
					
					if(arreglo[I] > arreglo[I + entero]) // Si arreglo[0] > arreglo[8]
					{
						intercambios = intercambios + 1;
						aux = arreglo[I];
					    arreglo[I] = arreglo[I + entero];
					    arreglo[I + entero] = aux;
					    band = true;
					    
					}
					I = I + 1;
				}
			}
		}
		
		System.out.printf("\n\n%s","ARREGLO ORDENADO: ");
		for(int i = 0; i < arreglo.length; i++)
		{
		   System.out.printf("%d ", arreglo[i]);
		}
		
		System.out.printf("\n\nEFICIENCIA DEL METODO SHELL: \n%s: %d", 
				           "Numero de pasadas", pasadas);
		System.out.printf("\nNumero de comparaciones entre numeros: %d", comparaciones + intercambios);
		
		System.out.printf("\nNumero de intercambios ocurridos: %d", intercambios);
	}
	
	/*******************************************METODO QUICKSORT**************************************************************/
	 public void quickSort(int[] arreglo)
	   {
		   arreglo = quickSort1(arreglo);
		   
		   System.out.println("APLICANDO METODO QUICK SORT RECURSIVO");
		   System.out.println("ARREGLO ORDENADO: ");
		   for(int i = 0; i < arreglo.length; i++)
			 {
				 System.out.printf("%d ", arreglo[i]);
			 }

	   }
	   
	   public int[] quickSort1(int arreglo[])
	   {
		  
		   return quickSort2(arreglo, 0, arreglo.length -1);
	   }
		
	   public int[] quickSort2(int arreglo[], int izq, int der)
	   {
		   if(izq >= der)
			   return arreglo;
		   
		   
		   int ini = izq;
	       int fin = der;
	       
	       
		   
		   if(izq != der)
		   {
			   int cen;
			   int aux;
			   cen = izq;
			   
			   while(izq != der)
			   {
				
				 while((arreglo[der] >= arreglo[cen]) && (izq < der))
				       der--;
			           	 
			       while((arreglo[izq] < arreglo[cen]) && (izq<der))
			             izq++;
			   
				   if(der != izq)
				   {
					   aux = arreglo[der];
					   arreglo[der] = arreglo[izq];
					   arreglo[izq] = aux;
					   
				   }
			   }
			   
			   if(izq == der)
			   {
				   quickSort2(arreglo, ini, izq - 1);
				   quickSort2(arreglo, izq + 1, fin);
			   }
			   
		      } 
			   else
		    	return arreglo;
			 
		   return arreglo;
			   
	   }
		

}
