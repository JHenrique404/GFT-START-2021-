package OOP_1;

public abstract class Transporte extends Carga{

	public Transporte(){
		
	}
	
	
	public double calculaFrete(double frete) {
		
		double valorPeso;
		double valorCarga;
		
		valorPeso = peso * 20/100;
		valorCarga = valor * 10/100;
		frete = valorCarga + valorPeso;
		return frete;
	}
}
