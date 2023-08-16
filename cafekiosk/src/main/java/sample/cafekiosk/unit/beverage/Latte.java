package sample.cafekiosk.unit.beverage;

public class Latte implements Beverage{

    @Override
    public String getName() {
        return "라떼";
    }

    @Override
    public int getPirce() {
        return 4000;
    }
}
