package controller;

import model.PilhaInt;

public class PilhasController {

	private PilhaInt p;

	public PilhasController() {
		this.p = new PilhaInt();
	}
	
	public String decToBin(int n) throws Exception {
		
		int divisao = n/2;
		int resto = n%2;
		p.Push(resto);
		if (n <=1) {
			String binario = "";
			while(p.isEmpty() == false) {
				int valor = p.Pop();
				String digito = String.valueOf(valor);
				binario = binario + digito;
			}
			return binario;
		}
		else {
			return decToBin(divisao);
		}
	}
		
		
	
}
