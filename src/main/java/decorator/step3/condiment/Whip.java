package decorator.step3.condiment;

import decorator.step3.beverage.Beverage;

public class Whip extends BeverageCondiment {
    private final String name = "휘핑크림";

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", " + name;
    }

    @Override
    public double getCost() {
        return super.beverage.getCost() + 0.33;
    }
}
