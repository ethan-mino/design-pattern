package decorator.step4.domain.condiment;

import decorator.step4.domain.beverage.Beverage;

public interface CondimentFactory {
    Beverage add(Beverage beverage, CondimentName condimentName);
}
