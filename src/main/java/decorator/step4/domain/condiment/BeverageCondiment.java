package decorator.step4.domain.condiment;

import decorator.step4.domain.beverage.Beverage;

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
