package geometricshapes;

public class Circle extends GeometricShape {
	private double xC;
	private double yC;
	private double r;
	
	public Circle(double xC, double yC, double r) {
		this.xC = xC;
		this.yC = yC;
		if(r <= 0)
			throw new IllegalArgumentException("The radius must be positive");
		this.r = r;
	}

	/**
	 * @return the x-coordinate of the center
	 */
	public double getXC() {
		return xC;
	}

	/**
	 * @param xC the x-coordinate of the center
	 */
	public void setXC(double xC) {
		this.xC = xC;
	}

	/**
	 * @return the y-coordinate of the center
	 */
	public double getYC() {
		return yC;
	}

	/**
	 * @param yC the y-coordinate of the center
	 */
	public void setYC(double yC) {
		this.yC = yC;
	}

	/**
	 * @return the radius of the circle
	 */
	public double getR() {
		return r;
	}

	/**
	 * @param r the radius of the circle, that must be positive
	 */
	public void setR(double r) {
		if(r <= 0)
			throw new IllegalArgumentException("The radius must be positive");
		else
			this.r = r;
	}
	
	/**
	 * @return the minimal x-coordinate of the bounding box
	 */
	@Override
	public double getXMin() {
		return this.xC - this.r;
	}
	
	/**
	 * @return the maximal x-coordinate of the bounding box
	 */
	@Override
	public double getXMax() {
		return this.xC + this.r;
	}
	
	/**
	 * @return the minimal y-coordinate of the bounding box
	 */
	@Override
	public double getYMin() {
		return this.yC - this.r;
	}
	
	/**
	 * @return the maximal y-coordinate of the bounding box
	 */
	@Override
	public double getYMax() {
		return this.yC + this.r;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle [xC=" + xC + ", yC=" + yC + ", r=" + r + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yC);
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
		if (!(obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if (Double.doubleToLongBits(xC) != Double.doubleToLongBits(other.xC))
			return false;
		if (Double.doubleToLongBits(yC) != Double.doubleToLongBits(other.yC))
			return false;
		return true;
	}
	
	
}
