package dta.tgoudouneix.geometry;

/**
 * Point in a plan
 * 
 * @author tgoudouneix
 */
public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @param x double
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * @param y double
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * @return double
	 */
	public double getX() {
		return this.x;
	}
	
	/**
	 * @return double
	 */
	public double getY() {
		return this.y;
	}
	
	/**
	 * Returns the distance between the point and another
	 * 
	 * @param point Point
	 * @return double
	 */
	public double distance(Point point) {
		double dist;
		
		dist = Math.sqrt(
				Math.pow(this.getX() - point.getX(), 2) 
				+ Math.pow(this.getY() - point.getY(), 2)
			);
		
		return dist;
	}
	
	/**
	 * Moves the point
	 * 
	 * @param dx double
	 * @param dy double
	 */
	public void translate(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
}
