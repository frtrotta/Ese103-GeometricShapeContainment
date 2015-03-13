package geometricshapes;

abstract public class GeometricShape {
	/**
	 * @return the minimal x-coordinate of the bounding box
	 */
	abstract public double getXMin();
	
	/**
	 * @return the maximal x-coordinate of the bounding box
	 */
	abstract public double getXMax();
	
	/**
	 * @return the minimal y-coordinate of the bounding box
	 */
	abstract public double getYMin();
	
	/**
	 * @return the maximal y-coordinate of the bounding box
	 */
	abstract public double getYMax();
	
	/**
	 * Does the bounding-box of this shape contains that of s?
	 * @param s
	 * @return
	 */
	public boolean contains(GeometricShape s) {
		return	(this.getXMin() <= s.getXMin()) &&
				(this.getYMin() <= s.getYMin()) &&
				(s.getXMax() <= this.getXMax()) &&
				(s.getYMax() <= this.getYMax());
	}
}
