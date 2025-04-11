package programacion_1;

public class Ejercicio_Recusion_Enteros {
	//“>” (mayor) y “<” (menor)

	public static void main(String[] args) {
	//Ejercicio 1
		//System.out.println(sumaDesdeUnoHasta(5));
	//Ejercicio 2
		//imprimirHasta(5);
	//Ejercicio 3
		//imprimirDesde(5);
	//Ejercicio 4
		//System.out.println(sumaDeCuadradosHasta(2));
	//Ejercicio 5
		//System.out.println(potencia(5, 0));
	//Ejercicio 6
		//System.out.println(sumaEntre(2, 8));
	//Ejercicio 7
		//System.out.println(cantidadPrimosEntre(2, 8));
	//Ejercicio 8
		//System.out.println(esPar(5));
	//Ejercicio 9
		//System.out.println(esImpar(5));
	//Ejercicio 10
		//System.out.println(cantidadDigitos(3000));
		
	}
	//Ejercicio 1
	static int sumaDesdeUnoHasta(int n) {
		if (n==1) {
			return 1;
		}
		return n+sumaDesdeUnoHasta(n-1);
	}
	//Ejercicio 2
	static void imprimirHasta(int n) {
		//Caso Base
		if(n==1) {
			System.out.println(1);
		}else {//Caso Recursivo
			imprimirHasta(n-1);
			System.out.println(n);			
			}
	}
	//Ejercicio 3
	static void imprimirDesde(int n) {
		//Caso Base
		if(n==1) {
			System.out.println(1);
		}else {//Caso Recursivo
			System.out.println(n);
			 imprimirDesde(n-1);			
		}
	}
	//Ejercicio 4
	static int sumaDeCuadradosHasta(int n) {
		if (n==1) {
			return 1;
		}
		return n*n+sumaDeCuadradosHasta(n-1);//funcion pow (Math.pow)
	}
	//Ejercicio 5
	static double potencia(double base, int exp) {
		if(exp==0) {
			return 1;
		}
		return base*potencia(base,exp-1);
	}
	//Ejercicio 6
	static int sumaEntre(int n, int m) {
		if(n>m) {
			return sumaEntre(m,n);
		}
		if (n==m) {
			return m;
		}
		return n+m+sumaEntre(n+1, m-1);
	}
	//Ejercicio 7
	static int cantidadPrimosEntre(int n, int m) {
		if(n>m) {
			return sumaEntre(m,n);
		}
		if(n==m) {
			return cuentaPrimo(m);
		}
		return cuentaPrimo(n)+cuentaPrimo(m)+cantidadPrimosEntre(n+1, m-1);
	}
	public static int cuentaPrimo(int n){//ESTA MAL REVISAR
		if (Ejercicio_Funciones.esPrimo(n)==true) {
			return 1;
		}
		return 0;
	}
	//Ejercicio 8
	 static boolean esPar(int n) {
		 if (n==1) {
			 return false;
		 }
		 if(n==0) {
			 return true;
		 }
		 return esPar(n-2);
	 }
	 //Ejercicio 9
	 static boolean esImpar(int n) {
		 if (n==1) {
			 return true;
		 }
		 if(n==0) {
			 return false;
		 }
		 return esImpar(n-2);
		 }
	 //Ejercicio 10
	 static int cantidadDigitos(int n) {
		 if (n<10) {
			 return 1;
		 }
		 return cantidadDigitos(n/10)+1;
	 }


}
