package objetos;
import java.awt.*;
public class Objetos {
	//Ejercicio 1
	 public static double distancia(Point p1, Point p2) {
		 int px=p1.x-p2.x;
		 int py=p1.y-p2.y;
		 return Math.sqrt(px*px+py*py);//Teorema de Pitagoras
	 }
	 //Ejercicio 2
	 public static double diagonal(Rectangle r) {//Practicar 
		 Point P=new Point (r.x,r.y);
		 Point Q=new Point (r.x+r.width,r.y+r.height);
		 return distancia(P,Q);
	 }
	 //Ejercicio 3
	 public static Point centro(Rectangle r) {
		 Point x =new Point((r.x+(r.width/2)),(r.y+(r.height/2)));
		 return x;
	 }
	 //Ejercicio 4
	 public static boolean estaDentro(Point p, Rectangle r) {
		    return p.x >= r.x &&
		           p.x <= r.x + r.width &&
		           p.y >= r.y &&
		           p.y <= r.y + r.height;
		}
	 //Ejercicio 5
	 public static Point puntoMedio(Point p1, Point p2) {
		 Point puntual = new Point ((p1.x+p2.x)/2,(p1.y+p2.y)/2);
		 return puntual;
	 }
	 //Ejercicio 6
	 public static Rectangle encuadrar(Rectangle r1, Rectangle r2) {//Se puede usar Math.min y max
	        int xMin = Math.min(r1.x, r2.x);
	        int yMin = Math.min(r1.y, r2.y);
	        int xMax = Math.max(r1.x + r1.width, r2.x + r2.width);
	        int yMax = Math.max(r1.y + r1.height, r2.y + r2.height);
	        // Crea el nuevo rectángulo
	        return new Rectangle(xMin, yMin, xMax - xMin, yMax - yMin);
	    }
	 //Ejercicio 7
	 public static boolean estaContenido(Rectangle r1, Rectangle r2) {//Idea principal
		    return r1.x >= r2.x &&
		           r1.y >= r2.y &&
		           r1.x + r1.width <= r2.x + r2.width &&
		           r1.y + r1.height <= r2.y + r2.height;
		}
	 //Ejercicio 7 v2
	 public static boolean estaContenidov2(Rectangle r1, Rectangle r2) {
		    Point p1 = new Point(r1.x, r1.y); // esquina superior izquierda
		    Point p2 = new Point(r1.x + r1.width, r1.y + r1.height); // esquina inferior derecha
		    return estaDentro(p1, r2) && estaDentro(p2, r2);
		}

	 //8. (dificil!)
	 public static Rectangle interseccion(Rectangle r1, Rectangle r2) {
		 int xIzq = Math.max(r1.x, r2.x);
		 int yArr = Math.max(r1.y, r2.y);
		 int xDer = Math.min(r1.x + r1.width, r2.x + r2.width);
		 int yAba = Math.min(r1.y + r1.height, r2.y + r2.height);
		 
		 if (xIzq >= xDer || yArr >= yAba) {
		        return null;
		    }
		return new Rectangle(xIzq, yArr, xDer - xIzq, yAba - yArr);
	 }
}