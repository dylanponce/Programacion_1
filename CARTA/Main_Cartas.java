package clase_carta;

public class Main_Cartas {

	public static void main(String[] args) {
		Carta [] cartas= new Carta [40];
		//System.out.println(cartas[0].numero);
		
		//Mazo
		//Aliasing
		Mazo mazov1=new Mazo();
		Mazo copiav1=mazov1.copiarv1();
		copiav1.cartas[0].numero=2;//Cuando cambiamos el numero de una carta se cambia en ambos
		System.out.println(mazov1.cartas[0].numero);//Cambia la copia x direccion, y cambia el mazo original
		
		Mazo mazo=new Mazo();//Copiando los distintos mazos
		Mazo copia=mazo.copiar();
		copia.cartas[0].numero=2;
		System.out.println(copia.cartas[0].numero);
		
		System.out.println("Original: " + mazo.cartas[0].numero);
        System.out.println("Copia: " + copia.cartas[0].numero);
	}

}
