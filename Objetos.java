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
		 if (p.x >= r.x && p.x <= (r.x + r.width) &&
		p.y <= r.y && p.y >= (r.y - r.height)) {
			 return true;
		 }
		 return false;
	 }
	 //Ejercicio 5
	 public static Point puntoMedio(Point p1, Point p2) {
		 Point puntual = new Point ((p1.x+p2.x)/2,(p1.y+p2.y)/2);
		 return puntual;
	 }
	 //Ejercicio 6
	 public static Rectangle encuadrar(Rectangle r1, Rectangle r2) {
		 int x1, y1, x2, y2;

		// Comparar para encontrar el menor valor de x
		if (r1.x < r2.x) {
		    x1 = r1.x;
		} else {
		    x1 = r2.x;
		}
		// Comparar para encontrar el menor valor de y
		if (r1.y < r2.y) {
		    y1 = r1.y;
		} else {
		    y1 = r2.y;
		}
		// Comparar para encontrar el mayor límite derecho
		if (r1.x + r1.width > r2.x + r2.width) {
		    x2 = r1.x + r1.width;
		} else {
		    x2 = r2.x + r2.width;
		}
		// Comparar para encontrar el mayor límite inferior
		if (r1.y + r1.height > r2.y + r2.height) {
		    y2 = r1.y + r1.height;
		} else {
		    y2 = r2.y + r2.height;
		}

		// Calcular el ancho y la altura del nuevo rectángulo
		int newWidth = x2 - x1;
		int newHeight = y2 - y1;
		
		Rectangle resultado = new Rectangle(x1, y1, newWidth, newHeight);
		return resultado;
	 }
	 //7. boolean estaContenido(Rectangle r1, Rectangle r2)
	 //El método debe indicar si el rectangulo r1 está contenido completamente dentro del rectángulo r2.

	 //8. (dificil!)
	 //Rectangle interseccion(Rectangle r1, Rectangle r2)
	 //El método debe devolver el rectángulo contenido en ambos rectángulos r1 y r2. En caso de que no se intersequen debe devolver null.

}


//DATA se genera desde esquina superior izquierda (x,y) 

/*Objeto -- Un objeto es una instancia de una clase y representa una entidad con:
Estado-------------------
El estado de un objeto está definido por sus atributos (variables de instancia). 
Por ejemplo, un objeto "Coche" podría tener atributos como color,marca  y modelo.
Comportamiento-----------------
El comportamiento se refiere a las acciones que el objeto puede realizar. 
Estas acciones se implementan usando métodos, como arranca() o frena() 
en el caso de un objeto "Coche".

Métodos------------
Un método es un bloque de código que realiza una acción. 
Los métodos pueden interactuar con los atributos del objeto o realizar tareas independientes.

Instancia--------------
Una instancia es un objeto específico creado a partir de una clase. 
Por ejemplo, si tienes la clase COCHE, podrías crear dos instancias: un coche rojo y otro azul.

Variables de instancia----------
Son las variables asociadas con una instancia particular de un objeto.
Cada instancia tiene su propio conjunto de valores de estas variables.

Constructor--------
Un constructor es un método especial que se utiliza para inicializar un objeto. 

Métodos de instancia--------
Son métodos que actúan sobre una instancia específica del objeto. 
Puedes invocarlos usando una referencia del objeto.

Métodos de clase------
Son métodos definidos con la palabra clave STATIC y no necesitan una instancia para ser invocados. 
Se llaman directamente desde la clase.


//Objetos Pilares
    //Abstraccion
    //Encapsulamieto Dado un objeto, determinar privacidad del mismo
    //Herencia Un objeto que puede ser usado para varios clases
    //Polimorfismo
//DUDA
 */