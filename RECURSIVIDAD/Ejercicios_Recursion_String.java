package programacion_1;

public class Ejercicios_Recursion_String {

	public static void main(String[] args) {
	//Ejercicio 1	
		//imprimirEspaciado("JUAN");
	//Ejercicio 2
		//System.out.println(longitud("Hola"));
	//Ejercicio 3
		//System.out.println(reverso("Casa"));
	//Ejercicio 4	
		//System.out.println(combinar("abd", "bbc"));
	//Ejercicio 5
		//intercalado("Hola");
	//Ejercicio 6
		//System.out.println(esAbecedaria("agil"));
	//adios, afín, año, ágil, bello, celos, cenó, chinos dijo, dimos, dios, fijos, finos, hijos, hilos, himno
		
	}
	
	//Ejercicio 1
	public static void imprimirEspaciado(String s) {
		if(s.isEmpty()) {
			System.out.println();
		}
		else {
		System.out.print(s.charAt(0)+" ");
		imprimirEspaciado(resto(s));
		}
	}
	//Ejercicio 2
	public static int longitud(String s) {
		if(s.isEmpty()) {//s.equals("")
			return 0;
		}
		return 1+longitud(resto(s));
	}
	//Ejercicio 3
	public static String reverso(String s) {
		if(s.isEmpty()) {
			return "";
		}
		return reverso(resto(s))+s.charAt(0);
	}
	//Ejercicio 4
	public static String combinar(String s, String t) {
		//Caso Base
		if(s.isEmpty()) {
			return t;
		}
		if(t.isEmpty()) {
			return s;
		}
		char letra_menor;
		if (s.charAt(0)<t.charAt(0)) {
			letra_menor=s.charAt(0);
		}
		else {
			letra_menor=t.charAt(0);
		}
		//Recursion
		return letra_menor+combinar(resto(s),resto(t));
		
	}
	//Ejercicio 5
	public static void intercalado(String s) {
		if(s.length()==1) {
			System.out.print(s);
		}
		else {
		System.out.print(s.charAt(0)+"*");
		intercalado(resto(s));
		}
	}
	//Ejercicio 6
	public static boolean esAbecedaria(String s) {
		if(s.length()<= 1) {
			return true;
		}
		if(s.charAt(1)<s.charAt(0)) {
			return false;//Lo que hago es buscar el caso donde de falso
		}
		return esAbecedaria(resto(s));
	}
	
	
	
	
	
	//Ya definida, no hace falta recursion.
	public static String resto(String s) {//Dada en el parcial
		String resultado= "";
		for (int i=1; i<s.length();i++) {
			resultado=resultado+s.charAt(i);
		}
		return resultado;
	}
}

//Mirar tema de operador termario
