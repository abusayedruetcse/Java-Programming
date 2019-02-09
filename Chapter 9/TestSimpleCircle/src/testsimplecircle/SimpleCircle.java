/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimplecircle;


/**
 *
 * @author abusa
 */
public class SimpleCircle {
    double radius;
    public SimpleCircle()
    {
        radius=1;
    }
    public SimpleCircle(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return radius*radius*Math.PI;
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    public void setRadius(double radius)
    {
        //here this.radius is a hidden variable.
        this.radius=radius;
    }
    
}
