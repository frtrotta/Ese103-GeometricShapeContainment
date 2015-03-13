package geometricshapes;

public class Rectangle extends GeometricShape {
	protected double xV;
	protected double yV;
	protected double xSideLength;
	protected double ySideLength;
	
	public Rectangle(double xV, double yV, double xSideLength,
			double ySideLength) {
		this.xV = xV;
		this.yV = yV;
		
		if(xSideLength <= 0)
			throw new IllegalArgumentException("The length of the side parallel to the x-axis must be positive");
		else
			this.xSideLength = xSideLength;
		
		if(ySideLength <= 0)
			throw new IllegalArgumentException("The length of the side parallel to the y-axis must be positive");
		else
			this.ySideLength = ySideLength;
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
	 * @return the length of the side parallel to the x-axis
	 */
	public double getxSideLength() {
		return xSideLength;
	}

	/**
	 * @param xSideLength the length of the side parallel to the x-axis, that must be positive
	 */
	public void setxSideLength(double xSideLength) {
		if(xSideLength <= 0)
			throw new IllegalArgumentException("The length of the side parallel to the x-axis must be positive");
		else
			this.xSideLength = xSideLength;
	}

	/**
	 * @return the length of the side parallel to the y-axis
	 */
	public double getySideLength() {
		return ySideLength;
	}

	/**
	 * @param ySideLength the length of the side parallel to the y-axis, that must be positive
	 */
	public void setySideLength(double ySideLength) {
		if(ySideLength <= 0)
			throw new IllegalArgumentException("The length of the side parallel to the y-axis must be positive");
		else
			this.ySideLength = ySideLength;
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
		return this.xV + this.xSideLength;
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
		return this.yV + this.ySideLength;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [xV=" + xV + ", yV=" + yV + ", xSideLength="
				+ xSideLength + ", ySideLength=" + ySideLength + "]";
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(xSideLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ySideLength);
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
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(xSideLength) != Double
				.doubleToLongBits(other.xSideLength))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(ySideLength) != Double
				.doubleToLongBits(other.ySideLength))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}
}
