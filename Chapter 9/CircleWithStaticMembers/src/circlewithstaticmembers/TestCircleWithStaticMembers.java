package circlewithstaticmembers;
public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        
       System.out.println("Before Creating Circle\nNumber of circle: "+CircleWithStaticMembers.getNumberOfCircle());
       CircleWithStaticMembers c1=new CircleWithStaticMembers();
       System.out.println("c1 radius: "+c1.getRadius()+" Area: "+c1.getArea());
       
       CircleWithStaticMembers c2=new CircleWithStaticMembers(5);
       c1.setRadius(5);
       System.out.println("\nAfter Creating  Circle\nNumber of Circle: "+CircleWithStaticMembers.getNumberOfCircle());
       System.out.println("c1 radius: "+c1.getRadius()+" Area: "+c1.getArea());
       System.out.println("c2 radius: "+c2.getRadius()+" Area: "+c2.getArea());
    }
}
