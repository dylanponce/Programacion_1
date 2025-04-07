package programacion_1;

public class Ejercicio_de_Parcial {
	//“>” (mayor) y “<” (menor)

	public static void main(String[] args) {
	//Ejercicio 1
		//String s = "Claramente";
		//int desde = 2;
		//int cont = 3;
		//System.out.println(tomarCaractersDesde(s, desde, cont));	
	//Ejercicio 2
		//System.out.println(insertarOrdenado("abcdfghi",'e'));
	//Ejercicio 3
		//System.out.println(comienzaCon("sol", "solamante"));
	//Ejercicio 4
		//System.out.println(eliminarVocalesYRevertir("toro"));
		//System.out.println(eliminarVocalesYRevertir("uia"));
		//System.out.println(eliminarVocalesYRevertir("fadap"));
	//Ejercicio 5
		//System.out.println(alternaVocales("ropero", "mula"));
		//System.out.println(alternaVocales("ropero", "mulata"));
		//System.out.println(alternaVocales("ropa", "muleta") );
		//System.out.println(alternaVocales("ropero",""));
		//System.out.println(alternaVocales("ropero", "crear"));
		//System.out.println(alternaVocales("", "algo"));
	//Ejercicio 2 Parcial
		//System.out.println(inverso("los", "sol"));
		
	}		
	//Ejercicio 1
	public static String tomarCaractersDesde(String s,int desde, int cont) {
		if(cont==0 || s.length()==0) {
			return "";
		}
		//Recursividad
		return s.charAt(desde)+tomarCaractersDesde(s, desde+1, cont-1);    
	}
	//Ejercicio 1 v2
	public static String tomarCaractersDesdev2(String s,int desde, int cont) {
		if(cont==0 || s.length()==0 || desde>s.length()){
			return "";
		}
		else {
			if(desde==0) {
				return s.charAt(0)+tomarCaractersDesdev2(Ejercicios_Recursion_String.resto(s), desde, cont-1);
			}else {
				return s.charAt(0)+tomarCaractersDesdev2(Ejercicios_Recursion_String.resto(s), desde-1, cont);
			}
		}
		
	}
	
	//Ejercicio 2
	public static String insertarOrdenado(String s, char a) {
		if(a<=s.charAt(0)) {
			return a+s;
		}
		return s.charAt(0)+insertarOrdenado(resto(s), a);
		
	}
	//V2
	 public static String insertarOrdenadoV2(String s, char a) {
		 return insertarOdenando(s, a, 0);
	 }
	 //Aux
	 public static String insertarOdenando(String s, char a, int i) {
		 if(a<=s.charAt(i)) {
			 return a+s.substring(i);
		 }
		 return s.charAt(i)+insertarOdenando(s, a, i+1);
	 }
	
	 //Ejercicio 3
	 public static boolean comienzaCon(String s1,String s2) {
		 if (s1.isEmpty()) {
			 return true;   
		 }
		 if (s1.length()>s2.length()) {//Esto es mi falso
			 return false;
		 }
		 if(s1.charAt(0)!=s2.charAt(0)) {//Pude ser igual y llamar a la recursividad desde aca
			 return false;
		 }
		 return comienzaCon(Ejercicios_Recursion_String.resto(s1),Ejercicios_Recursion_String.resto(s2));
	 }
	
	 //Ejercicio 4
	 public static String eliminarVocalesYRevertir(String s) {
		 String abc="AEIOUaeiou";
		 if (s.isEmpty()) {
			 return "";
		 }
		 if (abc.indexOf(s.charAt(0))==-1) {
			 return eliminarVocalesYRevertir(resto(s))+s.charAt(0);
		 }
		 return eliminarVocalesYRevertir(resto(s));
	 }
	 //Ejercicio 5
	 public static String alternaVocales(String s,String t) {
		 String vocal ="AEIOUaeiou";
		 if(s.equals("") || t.equals("")) {
			 return s;
		 }
		 if (vocal.indexOf(t.charAt(0))!=-1) {
			 if(vocal.indexOf(s.charAt(0))!=-1) {
				 return t.charAt(0)+alternaVocales(resto(s),resto(t));
			 }
			 else {
				 return s.charAt(0)+alternaVocales(resto(s), t);
			 }
		 }
		 return alternaVocales(s,resto(t));	 
	 }
	 
	 
	 
	//Ejercicio 2 PARCIAL 2
	//public static boolean inverso(String a, String b) {
		//Caso Base
		
		//Recursividad
		
	//}
	public static boolean inversoAux(String a,int indexA, String b, int indexB) {//Funciones Auxiliares pensar
		if(a.length()!=b.length()) {
			return false;
		}
		if(indexB==0){
			return true;
		}
		else {
			if(a.charAt(indexA)==b.charAt(indexB)){
				return inversoAux(a, indexA+1, b, indexB-1);
			}
			else {
				return false;
			}
		}
	}
	
	//FUNCION RESTO
	//Ya definida, no hace falta recursion.
		public static String resto(String s) {//Dada en el parcial
			String resultado= "";
			for (int i=1; i<s.length();i++) {
				resultado=resultado+s.charAt(i);
			}
			return resultado;
		}
}
