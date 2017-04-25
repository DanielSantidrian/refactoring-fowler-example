package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicación de refactorizaciones. Actualizado para colecciones
 * genéricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos López</A>
 * @version 1.1
 * @see java.io.File
 * 
 */
public class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	/**
	 * @return
	 */
	public double getCharge() {
		
		return getMovie().getType().getCharge(getDaysRented());
	}

	/**
	 * @return
	 */
	public int getFrecuentRenterPoints() {
		
		int frequentRenterPoints=0;
		
		frequentRenterPoints++;
		
		
		// add bonus for a two day new release rental
		if ((getMovie().getType().getNameType().equals("NEW_RELEASE"))
				&& getDaysRented() > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}

}
