public class Trapezoid extends Quadrilateral {


    protected double base1;
    protected double base2;
    protected double height;



    public Trapezoid(Point p1,Point p2,
                     Point p3,Point p4,
                     double b1,double b2,double h){

        super(p1,p2,p3,p4);

        base1=b1;
        base2=b2;
        height=h;

    }



    public double calculateArea(){

        return ((base1+base2)*height)/2;

    }

}
