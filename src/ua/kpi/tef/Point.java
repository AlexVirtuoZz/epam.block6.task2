package ua.kpi.tef;

/**
 * Created by User on 07.04.2016.
 */
public class Point implements Cloneable{

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public Point clone()  {
        try {
            return (Point) super.clone();
        }catch( CloneNotSupportedException ex){
            throw new AssertionError("CLONE NOT SUPPORTED");
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
