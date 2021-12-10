package oo.claseAbstrata;

public class TesteAbstrato {
	public static void main(String[] args) {
		
		Mamifero a =new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.mamar());
		System.out.println(a.respirar());
		
		Cachorro b = new Cachorro();
		System.out.println();
	

}
	}
