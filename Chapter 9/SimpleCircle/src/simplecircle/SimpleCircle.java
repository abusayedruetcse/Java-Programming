/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecircle;

/**
 *
 * @author abusa
 */
public class SimpleCircle {

    /**
     * @param args the command line arguments
     */
    double radius;
    SimpleCircle()
    {
        radius=1;
    }
    SimpleCircle(double radius)
    {
        this.radius=radius;
    }
    void setRadius(double radius)
    {
       this.radius=radius;
    }
    double getRadius()
    {
        return radius;
    }
    double getArea()
    {
        return Math.PI*radius*radius;
    } 
    double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleCircle c1=new SimpleCircle();
        System.out.println("The area of circle of the radius "+c1.radius+" is: "+c1.getArea());
        
        SimpleCircle c2=new SimpleCircle(5);
        System.out.println("The area of circle of the radius "+c2.radius+" is: "+c2.getArea());
        
        SimpleCircle c3=new SimpleCircle(10);
        System.out.println("The area of circle of the radius "+c3.radius+" is: "+c3.getArea());
        
        c3.radius=15;
        System.out.println("The area of circle of the radius "+c3.radius+" is: "+c3.getArea());
        
        c1=c3;
        System.out.println("The area of circle of the radius "+c1.radius+" is: "+c1.getArea());
    }
}
