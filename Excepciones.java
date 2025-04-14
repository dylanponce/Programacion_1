package excepciones;

import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		String s1 = new String();
		s1="";
		
		//1
		try {
			char c=s1.charAt(500);
		}catch (StringIndexOutOfBoundsException ex) {
			System.out.println("Ingresar un numero entra 0 y "+s1.length()+"");//+ex.getMessage()
		}
		//2
		try {
			if(s1.length()==0) {
				throw new RuntimeException("La cadena esta vacia");
			}
		}catch (Exception ex1) {
			System.out.println(ex1.getMessage());
		}
		//System.out.println("La cadena esta vacia");
		//2
		String abc = "abcdefghijklmnñopqrstuvwxyz";
		boolean ok=false;
		while(!ok) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Ingrese le numero del abecedario que quiere consultar");
				int n = scan.nextInt();
				
				System.out.println("Letra numero: "+n+" es "+abc.charAt(n-1));
				ok=true;
			}catch(StringIndexOutOfBoundsException ex){
				System.out.println("El numero debe estar entre 1 y "+abc.length());
				System.out.println(ex.getMessage());
			}catch(Exception ex) {
				System.out.println("El valor ingresado no es un numero");
			}finally {//Se ejecuta siempre
				System.out.println("FINALLY esto es una prueba");
			}
		}
		
	}

}

/*
 Excepciones son errores en tiempo de ejecucion
Tipos de excepciones:
*NullPointerException metodo de objeto null 
*ArrayIndexOutOfBoundsException cuando accedemos a un indice no valido
*NumberFormatException leemos en consola algo que no es numero, y lo intentamos convertir en int
La idea es capturar esos errores
Se trabaja con try y catch
try{ 
//lo que queremos hacer (codigo normal))
}
catch (tipo de excepcion  nombreVarible){
//manejo de error
}
/No sigue la ejecion en orden, direcamente corta en el error al ser capturado

/Para lanzar excepcion hay qye crear un objeto del tipo excepcion
throw new TipoException(-parametros del constructor-);

/Ej
if (condicion cumple error){
         throw new RuntimeException("se presento este error");
}
 */
