package by.htp.circle.launcher;

import by.htp.circle.entity.Circle;
import by.htp.circle.logic.Operation;

public class Main {

	public static void main(String[] args){
	
	Circle[] circles  = new Circle[5];	
	circles[0] = new Circle("Circle1",1,2,2);
	circles[1] = new Circle("Circle2",2,4,3);
	circles[2] = new Circle("Circle3",3,6,4);
	circles[3] = new Circle("Circle4",2,2,4);
	circles[4] = new Circle("Circle5",4,4,5);
	
	Operation operation = new Operation();
	operation.setCircles(circles);
	
	operation.calculateSquare(circles[0]);
	operation.calculatePerimeter(circles[0]);
	operation.calculateSquare(circles[1]);
	operation.calculatePerimeter(circles[1]);
	operation.calculateSquare(circles[2]);
	operation.calculatePerimeter(circles[2]);
	operation.calculateSquare(circles[3]);
	operation.calculatePerimeter(circles[3]);
	operation.calculateSquare(circles[4]);
	operation.calculatePerimeter(circles[4]);
		
	operation.findBigger();
	operation.findSmaller();
	
	operation.pointsBelong(circles[0], circles[1], circles[2]);
	
	}
}
