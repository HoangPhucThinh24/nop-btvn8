package techmaster;

public class ITStudent extends TechmasterStudent{
    private double marketing;
    private double sales;

    public ITStudent(String name, String major, double marketing, double sales) {
        super(name, major);
        this.marketing = marketing;
        this.sales = sales;
    }


    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double getScore() {
        return ( 2 * marketing + sales) /3;
    }
}
