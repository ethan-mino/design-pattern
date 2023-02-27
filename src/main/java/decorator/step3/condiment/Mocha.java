package decorator.step3.condiment;

import decorator.step3.beverage.Beverage;

public class Mocha extends BeverageCondiment {
    private String name = "모카";

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", " + name;
    }

    @Override
    public double getCost() {
        return super.beverage.getCost() + 0.15;
    }
}
