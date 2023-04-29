
package homework6;


public class Circle {
    
    public double radius; // attribute for the circles radius
    public Point center;  //attribute for the circles center point
    
         //default constructor that sets radius to zero and center to 0,0
    public Circle(){
         radius = 0.0;
         center = new Point(); //invoke Point's Default constructor
        }
    
        // constructor that sets radius to the given value and center to 0,0
    public Circle(double r) {
        radius = r;
        center = new Point();
    }
        //This constructor sets the radius and center to the given values
    public Circle(Point c, double r) {
        radius = r;
        center = c;
    }
    
    public void setRadius(double r) {
        radius = r;
        
    }
        
    public double getArea() {
        double PI = 3.14159;    // Declare and initialize PI
        double area = PI * radius * radius;  // call on radius twice to multiply it by PI
        return area;    //Return statement gives the area of the circle
    }
    
    public double getCircumference() {
        double PI = 3.14159;
        double circumference = 2 * PI * radius; //Here i us a simple formula to find the circumference
        return circumference;
    }
    
    public boolean intersect(Point p) {
        
            ////Calculate the distance between the center of the circle and the given point
        double dx = p.X - center.X;  
        double dy = p.Y - center.Y;
        double distanceSquared = dx * dx + dy * dy;
        double radiusSquared = radius * radius;     //Calculate the radius squared of the circle
         
        if (distanceSquared <= radiusSquared) { // Check if the distance between the center of the circle and the point is less than or equal to the radius of the circle
            return true; //If the point is in the circle return true
        } else {
            return false; // if the point is outside the circle return false
        }
    }
}
