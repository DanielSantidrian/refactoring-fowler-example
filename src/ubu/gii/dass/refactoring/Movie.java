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

public class Movie {
	
	private TypeMovie type;
	private String _title;

	public Movie(String title, TypeMovie type) {
		_title = title;
		this.type=type;
	}

	
	public String getTitle() {
		return _title;
	}


	public TypeMovie getType() {
		return type;
	}


	public void setType(TypeMovie type) {
		this.type = type;
	}

	
	
}
