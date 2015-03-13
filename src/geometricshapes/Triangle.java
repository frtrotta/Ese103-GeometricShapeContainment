package geometricshapes;

public class Triangle extends GeometricShape {
	private double xV;
	private double yV;
	private double l;
	
	public Triangle(double xV, double yV, double l) {
		this.xV = xV;
		this.yV = yV;
		this.l = l;
	}

	/**
	 * @return the the x-coordinate of the bottom left vertex
	 */
	public double getxV() {
		return xV;
	}

	/**
	 * @param xV the x-coordinate of the bottom left vertex
	 */
	public void setxV(double xV) {
		this.xV = xV;
	}

	/**
	 * @return the the y-coordinate of the bottom left vertex
	 */
	public double getyV() {
		return yV;
	}

	/**
	 * @param yV the y-coordinate of the bottom left vertex
	 */
	public void setyV(double yV) {
		this.yV = yV;
	}

	/**
	 * @return the length of the side
	 */
	public double getL() {
		return l;
	}

	/**
	 * @param l the length of the side, that must positive
	 */
	public void setL(double l) {
		if(l <= 0)
			throw new IllegalArgumentException("The length of the side must be positive");
		else
			this.l = l;
	}
	
	/**
	 * @return the minimal x-coordinate of the bounding box
	 */
	@Override
	public double getXMin() {
		return this.xV;
	}
	
	/**
	 * @return the maximal x-coordinate of the bounding box
	 */
	@Override
	public double getXMax() {
		return this.xV + this.l;
	}
	
	/**
	 * @return the minimal y-coordinate of the bounding box
	 */
	@Override
	public double getYMin() {
		return this.yV;
	}
	
	/**
	 * @return the maximal y-coordinate of the bounding box
	 */
	@Override
	public double getYMax() {
		return this.yV + this.l * Math.sqrt(3) / 2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangle [xV=" + xV + ", yV=" + yV + ", l=" + l + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Triangle))
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}
	
	
}
