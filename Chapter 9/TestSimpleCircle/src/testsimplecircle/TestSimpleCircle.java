/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimplecircle;

/**
 *
 * @author abusa
 */
public class TestSimpleCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleCircle circle1=new SimpleCircle();
        System.out.println("The area of the circle of radius "+circle1.radius+" is : "+circle1.getArea());
        
        SimpleCircle circle2=new SimpleCircle(5);
        System.out.println("The Area of the circle of radius "+circle2.radius+" is: "+circle2.getArea());
        
        SimpleCircle circle3=new SimpleCircle(125);
        System.out.println("The area of the circle of radius "+circle3.radius+" is: "+circle3.getArea() );
        
        circle2.radius=100;  //calling instance variable
        System.out.println("The area of the circle of radius "+circle2.radius+" is: "+circle2.getArea());
        
        
    }
}
