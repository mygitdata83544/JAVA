package com.app.geometry;

public class Point2D 
{
	 private double x;
	 private double y;
	
	 
	 public Point2D(double x, double y) 
	 {
		this.x = x;
		this.y = y;
	}
	 
	 public String getDetails()
	 {
		 String result;
		 
		 result = "(" + x + ", " + y + ")";
		 
		 return result;
	 }
	 
	 public boolean isEqual(Point2D p2)
	 {
		 if(this.x==p2.x && this.y==p2.y)
			return true;
		 else 
			 return false;	 
	 }
	 
	 
	 public double calculateDistance(Point2D p2)
	 {
		 return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2));
	 }
	 
	 

}
