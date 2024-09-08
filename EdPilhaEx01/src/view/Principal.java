package view;

import java.util.Scanner;

import controller.PilhasController;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		PilhasController pc = new PilhasController();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para converter");
		int n = scanner.nextInt();
		
		String binario = pc.decToBin(n);
		System.out.println(binario);
		
	}
	
}
