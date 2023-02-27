package decorator.step3.condiment;

import decorator.step3.beverage.Beverage;

public abstract class BeverageCondiment implements Beverage {
    protected final Beverage beverage;

    protected BeverageCondiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName();
    }
}
