package decorator.step4.domain.condiment;

import decorator.step4.domain.beverage.Beverage;

public class Mocha extends BeverageCondiment{
    private final CondimentName name;

    public Mocha(CondimentName name, Beverage beverage) {
        super(beverage);
        this.name = name;
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
