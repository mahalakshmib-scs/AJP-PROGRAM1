public class Quadrilateral {


    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;



    public Quadrilateral(Point p1,Point p2,Point p3,Point p4){

        point1=p1;
        point2=p2;
        point3=p3;
        point4=p4;

    }



    public void displayPoints(){

        point1.displayPoint();
        point2.displayPoint();
        point3.displayPoint();
        point4.displayPoint();

    }


}
