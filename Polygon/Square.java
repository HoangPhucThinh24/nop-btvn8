package Polygon;

public class Square implements Polygon {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void display() {

    }

    @Override
    public void calArea() {

    }

    @Override
    public String toString() {
        return "canh hinh vuong la: "+side +" - dien tich hv la: "+getArea();
    }
}
