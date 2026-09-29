public class Rectangle extends Trapezoid {


    private double length;
    private double width;



    public Rectangle(Point p1,Point p2,
                     Point p3,Point p4,
                     double l,double w){

        super(p1,p2,p3,p4,l,w,w);

        length=l;
        width=w;

    }



    public double calculateArea(){

        return length*width;

    }

}
