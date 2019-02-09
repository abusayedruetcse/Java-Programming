package testcirclerectangle;
public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        System.out.println("The Circle :"+c.toString());
        System.out.println("The color is :"+c.getColor());
        System.out.println("The radius is :"+c.getRadius());
        System.out.println("The Area is :"+c.getArea());
        System.out.println("The diameter is :"+c.getDiameter());
        
        Rectangle r=new Rectangle(4,5);
        System.out.println("The Rectangle is :"+r.toString());
        System.out.println("The color is :"+r.getColor());
        System.out.println("The width is :"+r.getWidth());
        System.out.println("The height is :"+r.getHeight());
        System.out.println("The area is :"+r.getArea());
        System.out.println("The Perimeter is :"+r.getPerimeter());
        
    }
}
