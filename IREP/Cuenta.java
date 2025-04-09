package objetos;

public class Cuenta {
	double[]movimientos;
	double saldo;
	boolean deudor;
	
//IREP
	//movimientos!=null &&
	//saldo==suma(movimientos) &&
	//((deudor && saldo <0)||(!deudor && saldo>=0))
	
	public Cuenta (double[]movimientos,double saldo,boolean deudor) {
		this.movimientos=movimientos;
		this.saldo=saldo;
		this.deudor=deudor;
	}
	
	//IREP
	public boolean esValida() {
		if(movimientos!=null && saldo==suma(movimientos) && 
				((deudor && saldo <0)||(!deudor && saldo>=0))) {
			return true;
		}
		return false;
	}
	
	public double suma(double[]movimiento) {
		double s=0;
		for(int i = 0;i<movimiento.length;i++) {
			s=s+movimiento[i];
		}
		return s;
	}

	public double[] getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(double[] movimientos) {
		this.movimientos = movimientos;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isDeudor() {
		return deudor;
	}

	public void setDeudor(boolean deudor) {
		this.deudor = deudor;
	}
	
	
	
}
