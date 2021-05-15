package cotacaoDolar;

public class CoverteMoeda {
	
	public double precoDolar, qtdadeDolar;
	public final double  IOF = 0.06;
	
	public double convert() {
		double juros = precoDolar*qtdadeDolar*IOF;
		return precoDolar*qtdadeDolar + juros; 
	}
	
	public String toString() {
		return "Pre�o atual do d�lar: "+String.format("%.2f", precoDolar)+
				"\nValor do IOF: "+String.format("%.2f", IOF)+
				"\nValor que deseja em d�lar: "+String.format("%.2f", qtdadeDolar)+
				"\nValor total em reais: "+String.format("%.2f", convert());
	}

}
