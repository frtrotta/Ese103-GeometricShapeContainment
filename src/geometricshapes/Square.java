package geometricshapes;

public class Square extends Rectangle {
	public Square(double xV, double yV, double l) {
		super(xV, yV, l, l);
	}
	
	/**
	 * @param l the length of the sides
	 */
	public void setL(double l) {
		this.setxSideLength(l);
		this.setySideLength(l);
	}
	
	/**
	 * @return the length of the sides
	 */
	public double getL() {
		return this.xSideLength;
	}
	/**
	 * Sets the legnth of both the sides to l
	 * @param l
	 */
	@Override
	public void setxSideLength(double l) {
		/* NOTA
		 * E' necessario ridefinire il metodo pubblico della superclasse
		 * affinchè sia garantita la consistenza dello stato.
		 * Se lasciassi l'implementazione della classe base, potrei avere
		 * i due lati di lunghezza differente.
		 */
		if(l <= 0)
			throw new IllegalArgumentException("The length of the side must be positive");
		else {
			this.xSideLength = l;
			this.ySideLength = l;
		}
	}
	
	/**
	 * Sets the legnth of both the sides to l
	 * @param l
	 */
	@Override
	public void setySideLength(double l) {
		/* NOTA
		 * E' necessario ridefinire il metodo pubblico della superclasse
		 * affinchè sia garantita la consistenza dello stato.
		 * Se lasciassi l'implementazione della classe base, potrei avere
		 * i due lati di lunghezza differente.
		 */
		if(l <= 0)
			throw new IllegalArgumentException("The length of the side must be positive");
		else {
			this.xSideLength = l;
			this.ySideLength = l;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Square [xV=" + xV + ", yV=" + yV + ", l="
				+ xSideLength + "]";
	}
}
