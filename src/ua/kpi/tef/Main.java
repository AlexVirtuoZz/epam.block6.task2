package ua.kpi.tef;

public class Main {
    /**
     * Create an object and its clone
     * First, change original to check if a copy won't change
     * Then, change a copy to check if original object won't change
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
        System.out.println("=======POINTS======\n");
        Point p1 = new Point(2,2);
        Point p2 = p1.clone();
        System.out.println(p1.toString() + "\n" + p2.toString() + "\n===============");
        p1.setX(4);
        p1.setY(3);
        System.out.println(p1.toString() + "\n" + p2.toString() + "\n=============");
        p2.setX(1);
        p2.setY(5);
        System.out.println(p1.toString() + "\n" + p2.toString() + "\n=============");

        System.out.println("\n=======CIRCLES=========\n");
        Circle circle1 = new Circle(p2, 5);
        Circle circle2 = circle1.clone();
        System.out.println(circle1.toString() +"\n"+circle2.toString()+"\n============");
        circle1.setCenterCircle(p1);
        circle1.setRadius(123);
        System.out.println(circle1.toString() +"\n"+circle2.toString()+"\n============");
        circle2.setCenterCircle(p1);
        circle2.setRadius(20);
        System.out.println(circle1.toString() +"\n"+circle2.toString()+"\n============");

        System.out.println("\n========RECTANGLES==========\n");
        Rectangle rectangle1 = new Rectangle(p1, p2);
        Rectangle rectangle2 = rectangle1.clone();
        System.out.println(rectangle1.toString() + "\n" + rectangle2.toString() + "\n============");
        rectangle1.setLeftTop(p2);
        rectangle1.setRightBottom(p1);
        System.out.println(rectangle1.toString() + "\n" + rectangle2.toString() + "\n============");
        rectangle2.setLeftTop(p2);
        rectangle2.setRightBottom(p1);
        System.out.println(rectangle1.toString() + "\n" + rectangle2.toString() + "\n============");

    }
}
