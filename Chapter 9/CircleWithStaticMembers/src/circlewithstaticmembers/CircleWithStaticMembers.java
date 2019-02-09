package circlewithstaticmembers;
public class CircleWithStaticMembers {
    private double radius;
    private static int numberOfCircle=0;
   CircleWithStaticMembers()
   {
       radius=1;
       numberOfCircle++;
   }
   CircleWithStaticMembers(double radius)
   {
       this.radius=radius;
       numberOfCircle++;
   }
   public void setRadius(double radius)
   {
       this.radius=radius;
   }  
   public double getRadius()
   {
       return radius;
   }
   public double getArea()
   {
       return radius*radius*Math.PI;
   } 
   public double getPerimeter()
   {
       return 2*radius*Math.PI;
   }
   public static int getNumberOfCircle()
   {
       return numberOfCircle;
   }
    
}
