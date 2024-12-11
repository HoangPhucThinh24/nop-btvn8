package Polygon;

public class Rectangle implements Polygon{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public void display() {

    }

    @Override
    public void calArea() {

    }

    @Override
    public String toString() {
        return "chieu dai hcn la: "+length +" - chieu rong hcn la: "+width +" - dien tich hcn la: "+getArea();
    }
}
