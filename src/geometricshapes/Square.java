package geometricshapes;

public class Square extends Rectangle {
	public Square(double xV, double yV, double l) {
		/* Il costruttore della classe derivata richiama il costruttore
		 * della classe padre, impostando opportunamente i valori.
		 */
		super(xV, yV, l, l);
	}
	
	/**
	 * @param l the length of the sides
	 */
	public void setL(double l) {
		this.setXSideLength(l);
		/* Viene invocato il metodo setXSideLength (ri)definito da Square,
		 * che garantisce la coerenza dello stato.
		 * 
		 * Un'implementazione alternativa, ma ugualmente corretta, sarebbe potuta essere
		 * super.setXSideLength()
		 * super.setYSideLength()
		 * 
		 * In questo caso i metodi richiamati sarebbero stati quelli della classe padre,
		 * per cui sarebbe stato necessario invocarli entrambi, onde garantire la coerenza
		 * dello stato.
		 */
	}
	
	/**
	 * @return the length of the sides
	 */
	public double getL() {
		return this.getXSideLength();
	}
	/**
	 * Sets the legnth of both the sides to l
	 * @param l
	 */
	@Override
	public void setXSideLength(double l) {
		/* NOTA
		 * E' necessario ridefinire il metodo pubblico della superclasse
		 * affinchè sia garantita la consistenza dello stato.
		 * Se lasciassi l'implementazione della classe base, potrei avere
		 * i due lati di lunghezza differente.
		 */
		if(l <= 0)
			throw new IllegalArgumentException("The length of the side must be positive");
		else {
			super.setXSideLength(l);
			super.setYSideLength(l);
		}
	}
	
	/**
	 * Sets the legnth of both the sides to l
	 * @param l
	 */
	@Override
	public void setYSideLength(double l) {
		/* NOTA
		 * E' necessario ridefinire il metodo pubblico della superclasse
		 * affinchè sia garantita la consistenza dello stato.
		 * Se lasciassi l'implementazione della classe base, potrei avere
		 * i due lati di lunghezza differente.
		 */
		if(l <= 0)
			throw new IllegalArgumentException("The length of the side must be positive");
		else {
			super.setXSideLength(l);
			super.setYSideLength(l);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Square [xV=" + this.getXV() + ", yV=" + this.getXV() + ", l="
				+ this.getL() + "]";
	}
}
