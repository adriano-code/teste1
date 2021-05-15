package cotacaoDolar;

public class CoverteMoeda {
	
	public double precoDolar, qtdadeDolar;
	public final double  IOF = 0.06;
	
	public double convert() {
		double juros = precoDolar*qtdadeDolar*IOF;
		return precoDolar*qtdadeDolar + juros; 
	}
	
	public String toString() {
		return "Preço atual do dólar: "+String.format("%.2f", precoDolar)+
				"\nValor do IOF: "+String.format("%.2f", IOF)+
				"\nValor que deseja em dólar: "+String.format("%.2f", qtdadeDolar)+
				"\nValor total em reais: "+String.format("%.2f", convert());
	}

}
