package programacion_1;

public class Ejercicio_Recursividad_Array {

	public static void main(String[] args) {
	//Ejercicio 1
		//int a[] = {1,2,3,4};
		//imprimir(a);
	//Ejercicio 2
		//int a[] = {1,2,3,4};
		//System.out.println(suma(a));
	//Ejercicio 3
		//int a[] = {1,2,3,4};
		//System.out.println(estaOrdenado(a));
	//Ejercicio 4
		//int s[]= {1,2,1,3,4,1};
		//System.out.println(cantidadApariciones(s, 1));
	//Ejercicio 5
		//int p[]= {1,2,3,4,5,6,7,8,9};
		//System.out.println(pertenece(p, 0));
		
	}
	//Ejercicio 1
	public static void imprimir(int[] a) {
		System.out.print("[");
		imprimirRecursion(a, 0);
		System.out.print("]");
	}
	public static void imprimirRecursion(int[]a,int indice) {
		if(indice>=a.length-1) {
			System.out.print(a[a.length-1]);
			return;
		}
		System.out.print(a[indice]+",");
		imprimirRecursion(a, indice+1);
	}
	//Ejercicio 2
	public static int suma(int[] a) {
		return sumaArray(a,0);
	}
	public static int sumaArray(int[]a,int i) {
		int suma=a[i];
		if (i>=a.length-1) {
			return suma;
		}
		return suma+sumaArray(a, i+1); 
	}
	//Ejercicio 3
	public static boolean estaOrdenado(int[] a) {
		return estaEnOrden(a, 0);
	}
	public static boolean estaEnOrden(int[] a,int i) {
		if (i>=a.length-1) {
			return true;
		}
		else {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return estaEnOrden(a, i+1);
	}
	//Ejercicio 4
	public static int cantidadApariciones(int[] a, int n) {
		return cantidadQueAparece(a,n,0);
	}
	public static int cantidadQueAparece(int[] a, int n,int i) {
		if(i>=a.length) {
			return 0;
		}else {
			if(a[i]==n) {
				return 1+cantidadQueAparece(a, n, i+1);
			}
		}
		return cantidadQueAparece(a, n,i+1);
	}
	//Ejercicio 5
	public static boolean pertenece(int[] a, int n) {
		return perteneciente(a,n, 0);
	}
	public static boolean perteneciente(int[]a,int n, int i) {
		if(i>=a.length) {
			return false;
		}
		if(a[i]==n) {
			return true;
		}
		return perteneciente(a, n, i+1);
	}
	
	
}
