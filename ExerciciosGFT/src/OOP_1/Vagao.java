package OOP_1;

public class Vagao extends Transporte{ 

	double peso;
	double valor;

	public double calculaFrete(double frete) {
		
		double valorPeso;
		double valorCarga;
		
		valorPeso = peso * 20/100;
		valorCarga = valor * 10/100;
		frete = valorCarga + valorPeso;
		return frete;
	}
}
