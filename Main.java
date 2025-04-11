package objetos;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		//OBJETOS
		//Ejercicio 1
			Point p1=new Point(2,4);//Si no defino es (0,0)
			Point p2=new Point(3,5);
			System.out.println(Objetos.distancia(p1,p2));
		//Ejercicio 2
			Rectangle n1=new Rectangle(0,0,3,4);
			System.out.println(Objetos.diagonal(n1));
		//Ejercicio 3		
			Rectangle c=new Rectangle(10,4,8,6);//(x,y,ancho,alto)
			System.out.println(Objetos.centro(c));
		//Ejercicio 4
			Rectangle c1=new Rectangle(10,4,8,6);//18;-4
			Point p3=new Point(10,4);
			System.out.println(Objetos.estaDentro(p3,c1));
		//Ejercicio 5
			Point p4=new Point(10,5);
			Point p5=new Point(20,15);
			System.out.println(Objetos.puntoMedio(p4, p5));
		//Ejercicio 6
			System.out.println(Objetos.encuadrar(c, c1));
		//Ejercicio 7
			Rectangle r1=new Rectangle(5, 5, 5, 5);//mas chico
			Rectangle r2=new Rectangle(0, 0, 10, 10);//El mas grande
			System.out.println(Objetos.estaContenido(r1, r2));
		//Ejercicio 8
			Rectangle r3=new Rectangle(5, 5, 5, 5);
			Rectangle r4=new Rectangle(0, 0, 10, 10);
			System.out.println(Objetos.interseccion(r3, r4));
			
		//Clase Fecha
			Fecha f1=new Fecha(1,1,2025);
			f1.imprimir();//No hace falta llamar al otro proyecto java
			System.out.println(f1);
			
		//Fecha
		//Ejercicio 1
			System.out.println(Fecha.diaDelMes(2, 2025));
		//Ejercicio 2
			System.out.println(f1.esValida());
		//Ejercicio 3
			f1.avanzarDia();
			f1.imprimir();
		//Ejercicio 4
			Fecha f2=new Fecha(1,1,2027);
			System.out.println(f1.antesQue(f2));
		//Ejecicio 5
			System.out.println(f2.diaDelAnio());
		//Ejercicio 6
			System.out.println(f1.diasDeDiferenciaCon(f2));

		
		//Pixel
		Pixel p = new Pixel(3,4,5);
		System.out.println(p.esValida());
		
		//Microondas
		Microondas m = new Microondas(false, false, 0);
		System.out.println(m.esValida());
		
		//Cuenta
		double[]cuenta= {100,-20,120,-50};
		Cuenta c2 = new Cuenta(cuenta,150,false);
		System.out.println(c2.esValida());
		
	}

}
