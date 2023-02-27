package decorator.step4.domain.condiment;

import decorator.step4.domain.beverage.Beverage;

public class CondimentSimpleFactory implements CondimentFactory{
    @Override
    public Beverage add(Beverage beverage, CondimentName condimentName) {
        if(CondimentName.MILK.equals(condimentName)){
            return new Milk(CondimentName.MILK, beverage);
        }

        if(CondimentName.SOY.equals(condimentName)){
            return new Soy(CondimentName.SOY, beverage);
        }

        if(CondimentName.MOCHA.equals(condimentName)){
            return new Mocha(CondimentName.MOCHA, beverage);
        }

        if(CondimentName.WHIP.equals(condimentName)){
            return new Whip(CondimentName.WHIP, beverage);
        }

        return null;
    }
}
