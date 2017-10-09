import dta.tgoudouneix.geometry.*;
import dta.tgoudouneix.intList.*;
import dta.tgoudouneix.binaryTree.*;

public class Test {
	public static void main(String[] args) {
		System.out.println("Testing DTA packages");
		System.out.println("----------");
		System.out.println(" ");
		System.out.println("Geometry package :");
		runGeometryTests();
		System.out.println("----------");
		System.out.println("Int list package :");
		runIntListTests();
		System.out.println("----------");
		System.out.println("Binary tree package :");
		runBinaryTreeTests();
		System.out.println("----------");
	}
	
	private static void runGeometryTests() {
		Point pointA = new Point(0, 0);
		Point pointB = new Point(3, 3);
		Point pointC = new Point(2, 6);
		Point pointD = new Point(-1.1, 3.7);
		Point pointE = new Point(0.2, 10);
		Point pointF = new Point(-4.0, -2.1);
		
		Segment segAB = new Segment(pointA, pointB);
		Segment segCD = new Segment(pointC, pointD);
		Segment segEF = new Segment(pointE, pointF);

		System.out.println("Point A : "+pointA.getX()+" "+pointA.getY());
		System.out.println("Point B : "+pointB.getX()+" "+pointB.getY());
		System.out.println("Distance AB : "+pointA.distance(pointB));
		System.out.println("Longueur segment [AB] : "+segAB.length());
		System.out.println("");
		System.out.println("Point C : "+pointC.getX()+" "+pointC.getY());
		System.out.println("Point D : "+pointD.getX()+" "+pointD.getY());
		System.out.println("Distance CD : "+pointC.distance(pointD));
		System.out.println("Longueur segment [CD] : "+segCD.length());
		pointC.translate(-3.0, 2.0);
		System.out.println("Translation de C par -3;2 : "+pointC.getX()+" "+pointC.getY());
		System.out.println("Distance CD : "+pointC.distance(pointD));
		System.out.println("Longueur segment [CD] : "+segCD.length());
		System.out.println("");
		System.out.println("Point E : "+pointE.getX()+" "+pointE.getY());
		System.out.println("Point F : "+pointF.getX()+" "+pointF.getY());
		System.out.println("Distance EF : "+pointE.distance(pointF));
		System.out.println("Longueur segment [EF] : "+segEF.length());
		System.out.println("");
	}
	
	private static void runIntListTests() {
		
	}
	
	private static void runBinaryTreeTests() {
		
	}
}
