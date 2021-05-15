package cotacaoDolar;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CoverteMoeda cm = new CoverteMoeda();
		
		cm.precoDolar = sc.nextDouble();
		cm.qtdadeDolar = sc.nextDouble();
		
		System.out.println(cm); 
		// ou
		//System.out.println(cm.toString()); 
		
		sc.close();
		
	}
	

}
