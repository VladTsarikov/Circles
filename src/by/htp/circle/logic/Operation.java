package by.htp.circle.logic;

import by.htp.circle.entity.Circle;

public class Operation {

	Circle[] circles;	
	double max = 0;
	double min = 0;
	
	public Circle[] getCircles() {
		return circles;
	}

	public  void setCircles(Circle[] circles) {
		this.circles = circles;
	}

	public void findBigger(){
		max = circles[0].getSquare();
		for(int i = 0; i < circles.length;i++){
			if(max<circles[i].getSquare()){
				max = circles[i].getSquare();
			}
		}
		
		for(int i = 0; i < circles.length;i++){
			if(circles[i].getSquare() == max){
				System.out.println("Ќаибольша€ по площади окружность: " + circles[i].getName());
			}
		}
	}
	
	public void findSmaller(){
		min = circles[0].getSquare();
		for(int i = 0; i < circles.length;i++){
			if(min>circles[i].getSquare()){
				min = circles[i].getSquare();
			}
		}
		for(int i = 0; i < circles.length;i++){
			if(circles[i].getSquare() == min){
				System.out.println("Ќаименьша€ по площади окружность: " + circles[i].getName());
			}
		}
	}
	
	public void calculateSquare(Circle crcl){
		crcl.setSquare(Math.PI*Math.pow(crcl.getRadius(),2));
		System.out.printf("%.2f",crcl.getSquare());
		System.out.println();
		
	}
	
	public void calculatePerimeter(Circle crcl){
		crcl.setPerimeter(2*Math.PI*crcl.getRadius());
		System.out.printf("%.2f",crcl.getPerimeter());
		System.out.println();
	}
	
	public void pointsBelong(Circle crcl1,Circle crcl2,Circle crcl3){
		if((crcl3.getX()-crcl1.getX())/(crcl2.getX()-crcl1.getX())==(crcl3.getY()-crcl1.getY())/(crcl2.getY()-crcl1.getY())){
			System.out.println("÷ентры окржностей принадлежат одной пр€мой");
		}
		else
			System.out.println("÷ентры окржностей не принадлежат одной пр€мой");
	}
	
}
