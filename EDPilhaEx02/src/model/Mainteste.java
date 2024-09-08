package model;

public class Mainteste {

	public static void main(String[] args) {
		
		PilhaInt p = new PilhaInt();
		
		p.Push(10);
		p.Push(20);
		p.Push(5);
		System.out.println(p.Max());
		
	}
	
}
