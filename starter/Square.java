public class Square extends Rectangle {


    private double side;



    public Square(Point p1,Point p2,
                  Point p3,Point p4,
                  double s){

        super(p1,p2,p3,p4,s,s);

        side=s;

    }



    public double calculateArea(){

        return side*side;

    }

}
