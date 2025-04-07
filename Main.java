package objetos;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		//OBJETOS
		//Ejercicio 1
			//Point p1=new Point(2,4);//Si no defino es (0,0)
			//Point p2=new Point(3,5);
			//System.out.println(Objetos.distancia(p1,p2));
		//Ejercicio 2
			//Rectangle n1=new Rectangle(0,0,3,4);
			//System.out.println(Objetos.diagonal(n1));
		//Ejercicio 3		
			//Rectangle c=new Rectangle(10,4,8,6);//(x,y,ancho,alto)
			//System.out.println(Objetos.centro(c));
		//Ejercicio 4
			//Rectangle c=new Rectangle(10,4,8,6);//18;-4
			//Point p1=new Point(10,4);
			//System.out.println(Objetos.estaDentro(p1,c));
		//Ejercicio 5
		Point p1=new Point(10,5);
		Point p2=new Point(20,15);
		System.out.println(Objetos.puntoMedio(p1, p2));
		
	}

}
