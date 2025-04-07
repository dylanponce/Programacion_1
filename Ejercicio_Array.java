package programacion_1;

public class Ejercicio_Array {
	//“>” (mayor) y “<” (menor)
	
	public static void main(String[] args) {
		//Ejercicio 1
			//int[]lista= {1,2,3,4};
			//imprimir(lista);
		//Ejercicio 2
			//int[]lista= {14,23,3,21,5};
			//System.out.println(maximo(lista));
		//Ejercicio 3
			//int[]notas= {7,8,6,5,8};
			//System.out.println(promedio(notas));
		//Ejercicio 4
			//imprimir(agregarAtras(lista, 5));
		//Ejercicio 5
			//int[]n= {7,8,6,5,8};
			//imprimir(quitar(n, 2));
		//Ejercicio 6
			//int[]reverso= {1,2,3,4};
			//imprimir(reverso(reverso));
		//Ejercicio 7
		//Ejercicio 8
			//int[]opues= {1,2,3,4};
			//imprimir(opuestos(opues));
		//Ejercicio 9
		//Ejercicio 10
			//int[]divisores= {1,2,4,8};
			//int n = 8;
			//System.out.println(sonTodosDivisores(divisores, n));
		//Ejercicio 11
			//int[]repes={2,2,2,3,4,3,5,1,5,2};
			//System.out.println(cantRepetidos(repes));
		
		
		
		
	}
	
	//Ejercicio 1
	public static void imprimir(int[] a) {
		System.out.print("[");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]);
			if(i<a.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	//Ejercicio 2
	public static int maximo(int[]a) {
		int max = a[0];
		for (int i=1;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		return max;
	} 
	//Ejercicio 3
	public static double promedio(int[] a) {
		double suma = 0;
		for (int i = 0;i<a.length;i++) {
			suma=suma+a[i];
		}
		double prom = suma/a.length;
		return prom;
	}
	//Ejercicio 4
	public static int[] agregarAtras(int[] a, int x) {
		int[]newArray=new int[a.length+1];
		for(int i = 0;i<a.length;i++) {
			newArray[i]=a[i];
		}
		newArray[a.length]=x;
		return newArray;
	}
	//Ejercicio 5
	 public static int[] quitar(int[] a, int pos) {
		 int[]newArray=new int[a.length-1];
		 int indice = 0;
			for(int i = 0;i<a.length;i++) {
				if(i!=pos) {
					newArray[indice]=a[i];
					indice++;
				}
			}
			return newArray;
	 }
	 //Ejercicio 6
	 public static int[] reverso(int[] a) { //Crea un nuevo array
		 int[]newArray=new int [a.length];
		 int resta=1;//No hace falta
		 	for(int i = 0;i<a.length;i++) {
		 		newArray[i]=a[a.length-resta];//Podria hacer a.length-1-i
		 		resta++;//No hace falta
		 	}
		 	return newArray;
	 }
	 //Ejercicio 7
	 public static void revertir(int[] a) { //Usa el propio array
		 int aux;
		 int n = a.length;
		 for (int i = 0; i<n/2;i++) {
			 aux=a[i];
			 a[i]=a[n-1-i];
			 a[n-1-i]=aux;
		 }
	 }
	 //Ejercicio 8
	 public static int[] opuestos(int[] a) {
		 int[]newArray=new int[a.length];
		 for (int i = 0; i<a.length;i++) {
			 newArray[i]=(a[i])*-1;
		 }
		 return newArray;
	 }
	 //Ejercicio 9	
	 public static void oponer(int[] a) {
		 for(int i = 0;i<a.length;i++) {
			 a[i]=(a[i])*-1;
		 }
	 }
	 //Ejercicio 10
	 public static boolean sonTodosDivisores(int[]a,int n) {
		 for(int i = 0;i<a.length;i++) {
			 if (n%a[i]!=0) {
				 return false;
			 }
		 }
		 return true;
	 }
	 //Ejercicio 11
	 
	 //DE ACA EN ADELANTE ENTENDER LOS EJERCICIOS. PENSAR EN MAS FUNCIONES
	 
	 //preguntar porque no tengo idea. Probe con for anidado. Comparando entre elementos
	 //Pero no encuentro solucion
	 static int cantRepetidos(int[]a) {
			int cont = 0;
			for(int i = 0 ; i < a.length; i++) {
				for(int j = i+1; j < a.length; j++ ) {
					if(a[i] == a[j]) {
						cont++;
						break;
					}
				}
			
			}
			return cont;
		}
		//Ejercicio 12
		static int[] sinrepetidos(int[]a) {
			int cantRepetidos = cantRepetidos(a);
			int[] nuevo = new int[a.length - cantRepetidos];
			int k = 0; //iterar el nuevo arreglo
			for (int i = 0; i < a.length; i++) {
				if(!elemetoEstaEnElArray(nuevo,k,a[i])) {
					nuevo[k] = a[i];
					k++;
				}
			}
			return nuevo;
		}
		

		public static boolean elemetoEstaEnElArray(int[] nuevo, int k, int n) {
			for (int j = 0; j <= k; j++) {
				if(nuevo[j]==n)
					return true;
			}
			return false;
		}
	 //Ejercicio 13
		public static void imprimirMatriz(int[][] matriz, int filas, int columnas) {

			for (int x = 0; x < matriz.length; x++) {
				System.out.print("[");
				for (int y = 0; y < matriz[x].length; y++) {
					System.out.print(matriz[x][y] + " ");

				}
				System.out.println("]");
			}
		}
}
