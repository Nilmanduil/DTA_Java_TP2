package dta.tgoudouneix.geometry;

/**
 * Segment in a plan
 * 
 * @author tgoudouneix
 */
public class Segment {
	private Point point1;
	private Point point2;
	
	public Segment(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}
	
	/**
	 * @param point1 Point
	 */
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	
	/**
	 * @param point2 Point
	 */
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	
	/**
	 * @return Point
	 */
	public Point getPoint1() {
		return this.point1;
	}
	
	/**
	 * @return Point
	 */
	public Point getPoint2() {
		return this.point2;
	}
	
	/**
	 * Returns the length of the segment
	 * 
	 * @return double
	 */
	public double length() {
		return this.point1.distance(this.point2);
	}
}
