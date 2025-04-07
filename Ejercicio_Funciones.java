package programacion_1;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio_Funciones {
	//“>” (mayor) y “<” (menor)

	public static void main(String[] args) {
	//Ejercicio 1
		//System.out.println(cantDivisores(45));
		//System.out.println(cantDivisores(2374));
		//System.out.println(cantDivisores(3529));
	//Ejercicio 2
		//System.out.println(esPrimo(37));
		//System.out.println(esPrimo(633));
		//System.out.println(esPrimo(3592));
	//Ejercicio 3
		//System.out.println(siguientePrimo(8));
		//System.out.println(siguientePrimo(633));
		//System.out.println(siguientePrimo(3592));
	//Ejercicio 4
		//System.out.println(factorial(3));
		//System.out.println(factorial(7));
		//System.out.println(factorial(16));
		//El mayor numero depende del tipo de dato y el rango
	//Ejercicio 5
		//System.out.println(cantidadDigitos(562));
		//System.out.println(cantidadDigitos(4289));
		//System.out.println(cantidadDigitos(12));
		//System.out.println(cantidadDigitos(7));
	//Ejercicio 6
		//System.out.println(cantDivComun(12,8));
		//System.out.println(DivEnComun(12, 8));
	//Ejercicio 7
		juegoAdivinador();
	}
	
//Ejercicio 1
	public static int cantDivisores (int n) {
		int cant = 0;
		for (int i = 1; i<=n;i++) {
			if (n % i == 0) {
				cant++;
			}
		}
		return cant;
	}
//Ejercicio 2
	public static boolean esPrimo (int a) {
		return (cantDivisores(a)==2);
	}
//Ejercicio 3
	public static int siguientePrimo (int n) {
		int sigue = n;
		while(!esPrimo(sigue)) {
			sigue++;
		}
		return sigue;
	}
	//Si busco un ciclo con finalizacion es mejor usar while
	//Analizar la condicion en bolean
//Ejercicio 4
	public static int factorial (int n) {//Usar long si quiero mas numeros
		if (n==0||n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
//Ejercicio 5
	public static int cantidadDigitos(int n) {
		if (n < 10) {
			return 1;
		}
		return 1 + cantidadDigitos(n/10);//Recursividad
	}
//Ejercicio 6
	public static int cantDivComun(int n,int m) {
		int cont = 0;
		int[]nd=susDivisores(n);
		int[]md=susDivisores(m);
		for (int i=0;i<nd.length;i++) {
			for (int j=0;j<md.length;j++) {
				if (nd[i]==md[j]) {
					cont++;
				}
			}
		}
		return cont;
	}
	public static int[] susDivisores(int n) {
		int[]div= new int[cantDivisores(n)]; 
		int indice = 0;
		for (int i = 1; i<=n ;i++) {
			if(n%i==0) {
				div[indice]=i;
				indice++;
			}
		}
		return div;
	}
	//Ejercicio 6 v2
	public static int DivEnComun (int a,int b) {
		int cont=0;
		int min = Math.min(a, b);
		for (int i=1;i<=min;i++) {
			if (a%i==0 && b%i==0) {
				cont++;
			}
		}
		return cont;
	}
	//Ejercicio 7
	public static void juegoAdivinador() {
		int a = numRandom();
		int intentos = 0;
		boolean adivinan = false;
		while(!(adivinan)) {
			intentos++;
			int e = entrada();
			if (a==e) {
				System.out.println("Adivinaste! Felicidades");
				adivinan=true;
			}
			else {
				System.out.println("Numero Incorrecto");
				if (intentos>=3) {
					if (e>a) {
						System.out.println("El numero es menor que "+e);
					}
					else {
						System.out.println("El numero es mayor que "+e);
					}
				}
			}
		}
	}
	
	public static int numRandom () {
		Random random = new Random();//Creador de Random
		int randomNum = random.nextInt(10)+1;//Genera el numero en el rango
		return randomNum;
	}
	public static int entrada() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		int num = scan.nextInt();
		return num;
	} 
}
