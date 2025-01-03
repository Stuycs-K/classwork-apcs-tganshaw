public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(
		    Math.pow(b.getX()-a.getX(), 2) +
		    Math.pow(b.getY()-a.getY(), 2)
		    );
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3+ " with expected value of: " + "(" + p3.getX() + ",  " + p3.getY() + ")");
    System.out.println( distance(p1,p2) + " with expected value of: " + Math.sqrt(8));
    System.out.println( Point.distance(p1,p2)+ " with expected value of: " + Math.sqrt(8));
    System.out.println( p1.distanceTo(p2)+ " with expected value of: " + Math.sqrt(8));

    Point trione = new Point(0.0,0.0);
    Point tritwo = new Point(3.0,0.0);
    Point trithree = new Point(1.5,3.0);
    System.out.println(Point.distance(trione, tritwo));
    System.out.println(Point.distance(tritwo, trithree ));
    System.out.println(Point.distance(trithree, trione ));
  }
}
