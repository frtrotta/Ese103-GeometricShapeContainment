package geometricshapes;

public class Circle {
	private double xC;
	private double yC;
	private double r;
	
	public Circle(double xC, double yC, double r) {
		this.xC = xC;
		this.yC = yC;
		this.r = r;
	}

	/**
	 * @return the x-coordinate of the center
	 */
	public double getxC() {
		return xC;
	}

	/**
	 * @param xC the x-coordinate of the center
	 */
	public void setxC(double xC) {
		this.xC = xC;
	}

	/**
	 * @return the y-coordinate of the center
	 */
	public double getyC() {
		return yC;
	}

	/**
	 * @param yC the y-coordinate of the center
	 */
	public void setyC(double yC) {
		this.yC = yC;
	}

	/**
	 * @return the radius of the circle
	 */
	public double getR() {
		return r;
	}

	/**
	 * @param r the radius of the circle, that must be non-negative
	 */
	public void setR(double r) {
		if(r < 0)
			throw new IllegalArgumentException("The radius must be non-negative");
		else
			this.r = r;
	}
	
	/**
	 * @return the minimal x-coordinate of the bounding box
	 */
	public double getXMin() {
		return this.xC - this.r;
	}
	
	/**
	 * @return the maximal x-coordinate of the bounding box
	 */
	public double getXMax() {
		return this.xC + this.r;
	}
	
	/**
	 * @return the minimal y-coordinate of the bounding box
	 */
	public double getYMin() {
		return this.yC - this.r;
	}
	
	/**
	 * @return the maximal y-coordinate of the bounding box
	 */
	public double getYMax() {
		return this.yC + this.r;
	}
	
	/**
	 * Doea the bounding-box of this circle contains that of c?
	 * @param c
	 * @return
	 */
	public boolean contains(Circle c) {
		return	(this.getXMin() <= c.getXMin()) &&
				(this.getYMin() <= c.getYMin()) &&
				(c.getXMax() <= this.getXMax()) &&
				(c.getYMax() <= this.getYMax());
	}

	@Override
	public String toString() {
		return "Circle [xC=" + xC + ", yC=" + yC + ", r=" + r + "]";
	}

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
