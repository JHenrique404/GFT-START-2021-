package OOP_1;

public class Caminhao extends Transporte{ 

	double peso;
	double valor;

	public double calculaFrete(double frete) {
		
		double valorPeso;
		double valorCarga;
		
		valorPeso = peso * 12/100;
		valorCarga = valor * 30/100;
		frete = valorCarga + valorPeso;
		return frete;
	}
	
}
