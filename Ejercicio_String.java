package programacion_1;

public class Ejercicio_String {
	//“>” (mayor) y “<” (menor)

	public static void main(String[] args) {
		//Ejercicio 1
			//String s = "Celestiales";
			//System.out.println("La letra E aparece "+cantidadDeApariciones(s));
		//Ejercicio 2
			//String r = "EEEeeeEeee";
			//System.out.println(compuesto(r));
		//Ejercicio 3
			//String s1 = "Clandestino";
			//String s2 = "Clandestino";
			//System.out.println(sonIguales(s1, s2));
		//Ejercicio 4
			//String s = "ccaassaa";
			//System.out.println(esDuodroma(s));
		//Ejercicio 5
			//String prefijo = "Hola";
			//String s = "Gente Hola";
			//System.out.println(esPrefijo(prefijo, s));
		//Ejercicio 6
			//int pos = 6;
			//System.out.println(esPrefijoDesde(prefijo, s, pos));
		//Ejercicio 7
			//String a = "cama";
			//String b = "mucama";
			//System.out.println(esSubstring(a, b));
		//Ejercicio 8
		   //String s = "Pileta";
		   //System.out.println(invertirCadena(s));
		//Ejercicio 9
			//String s = "alla";
			//System.out.println(palindrome(s));
		
		
	}
	//Ejercicio 1
	public static int cantidadDeApariciones(String s) {
		int cont =0;
		for (int i=0;i<=(s.length())-1;i++) {
			if (s.charAt(i)=='e'||s.charAt(i)=='E') {
				cont++;
			}
		}
		return cont;
	}
	//Ejercicio 2
	public static boolean compuesto(String s) {
		return (cantidadDeApariciones(s)==s.length());
	}
	//Ejercicio 3
	public static boolean sonIguales(String s1, String s2) {
		if (s1.length()!=s2.length()) {
			return false;
		}
		for (int i = 0;i<=(s1.length())-1;i++) {
			if (s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	//Ejercicio 4
	public static boolean esDuodroma(String s) {
		if (s.length()%2!=0) {
			return false;
		}
		int i = 0;
		while (i<s.length()) {
			if(s.charAt(i)==s.charAt(i+1)) {
				i+=2;
			}
			else {
				return false;
			}
		}
		return true;
		
	}
	//Ejercicio 5
	public static boolean esPrefijo(String prefijo, String s) {
		int cont=1;
		for(int i = 0;i<(prefijo.length())-1;i++) {
			if (prefijo.charAt(i)==s.charAt(i)) {
				cont++;
			}
		}
		return (cont==prefijo.length());
	}
	//Ejercicio 6
	public static boolean esPrefijoDesde(String prefijo, String s, int pos) {
		String pocisional="";
		for (int i = pos;i<(s.length())-1;i++) {
			pocisional = pocisional+s.charAt(i);
		}
		return esPrefijo(prefijo, pocisional);
	}
	//Ejercicio 7
	 public static boolean esSubstring(String s1, String s2) { //Ver si la idea es correcta
		 return (s2.indexOf(s1)!=-1);//Para indexOf puedo usar char o string
	 }
	 //Ejercicio 8
	 public static String invertirCadena(String s) {
		 String newCadena = "";
		 for (int i = 0;i<=(s.length())-1;i++) {
			 newCadena=s.charAt(i)+newCadena;
		 }
		 return newCadena;
	 }
	 //Ejercicio 9
	 public static boolean palindrome (String s) {
		 int ulti = 1;
		 for (int i = 0;i<(s.length())-1;i++) {
			 if(s.charAt(i)==s.charAt(s.length()-ulti)) {
				 ulti++;
			 }
		 }
		 return (ulti==s.length());
	 }
}
