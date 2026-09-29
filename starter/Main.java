public class Main {


public static void main(String args[]){


Point p1=new Point(0,0);
Point p2=new Point(4,0);
Point p3=new Point(5,3);
Point p4=new Point(1,3);



Trapezoid t=
new Trapezoid(p1,p2,p3,p4,4,6,3);


Rectangle r=
new Rectangle(p1,p2,p3,p4,5,10);


Square s=
new Square(p1,p2,p3,p4,5);



System.out.println("Trapezoid Area : "
+t.calculateArea());


System.out.println("Rectangle Area : "
+r.calculateArea());


System.out.println("Square Area : "
+s.calculateArea());


}

}
