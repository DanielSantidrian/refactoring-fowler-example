package ubu.gii.dass.refactoring;

public class TypeMovie {
	
	private String nameType;
	private double priceMovie;
	private double priceType;
	private int daysType;
	
	public TypeMovie(String nameType, double priceMovie, double priceType, int daysType) {
		this.nameType=nameType;
		this.priceMovie=priceMovie;
		this.priceType=priceType;
		this.daysType=daysType;
	}

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}


	public double getPriceMovie() {
		return priceMovie;
	}

	public void setPriceMovie(double priceMovie) {
		this.priceMovie = priceMovie;
	}

	public double getPriceType() {
		return priceType;
	}

	public void setPriceType(double priceType) {
		this.priceType = priceType;
	}

	public int getDaysType() {
		return daysType;
	}

	public void setDaysType(int daysType) {
		this.daysType = daysType;
	}
	
	public double getCharge(int days){
		
		double result=0;
		
		result+=priceType;
		
		if(days>daysType)
			result += (days - daysType) * priceMovie;
		
		return result;
		
	}

}
