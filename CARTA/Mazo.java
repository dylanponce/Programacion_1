package clase_carta;

public class Mazo {
	Carta[]cartas;
	
	//Los array de objetos se inicializan en null
	//Asignacion copia referencias
	public Mazo(){
		this.cartas=new Carta[40];
		int j=0;
		for (int p=0;p<=3;p++) {
			for (int n=1;n<=7;n++) {
				cartas[j]=new Carta(p,n);
				j++;
			}
			for (int n=10;n<=12;n++) {
				cartas[j]=new Carta(p,n);
				j++;
			}
		}
	}
	public Mazo copiarv1() {
		Mazo mazo = new Mazo();
		for (int i=0;i<this.cartas.length;i++) {
			mazo.cartas[i]=this.cartas[i];//Lo que ese copia son referencias
		}
		return mazo;
	}
	public Mazo copiar() {//deep copy
		Mazo mazo = new Mazo();
		for(int i=0;i<this.cartas.length;i++) {
			if(this.cartas[i]==null) {
				mazo.cartas[i]=null;
			}
			else {
				mazo.cartas[i]=new Carta(this.cartas[i].numero,this.cartas[i].palo);
			}
		}
		return mazo;
		
	}
}
