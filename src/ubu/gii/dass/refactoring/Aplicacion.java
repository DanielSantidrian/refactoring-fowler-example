package ubu.gii.dass.refactoring;


public class Aplicacion {

	public static void main(String[] arg) {
		
		Movie m1 = new Movie("Sky Captain", new TypeMovie("NEW_RELEASE", 3, 0, 0));
		Movie m2 = new Movie("Alejandro Magno", new TypeMovie("NEW_RELEASE", 3, 0, 0));
		Movie m3 = new Movie("Accion Mutante", new TypeMovie("REGULAR", 1.5, 2, 2));
		Movie m4 = new Movie("Hermano Oso", new TypeMovie("CHILDREN", 1.5,1.5,3));

		Customer c1 = new Customer("Manuel");

		Rental r1 = new Rental(m1, 5);
		Rental r2 = new Rental(m3, 1);
		Rental r3 = new Rental(m4, 10);

		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(r3);

		System.out.println(c1.statement());

	}

}