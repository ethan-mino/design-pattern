package decorator.step4.domain.beverage;

import java.util.ArrayList;
import java.util.List;

public class Beverages {
    private final List<Beverage> beverages;
    private Beverages(List<Beverage> beverages){
        this.beverages = beverages;
    }

    public static Beverages empty(){
        return new Beverages(new ArrayList<>());
    }

    public static Beverages of(List<Beverage> beverages){
        return new Beverages(beverages);
    }

    public void add(Beverage beverage){
        beverages.add(beverage);
    }

    public double getTotalCost(){
        return beverages.stream()
                .map(Beverage::getCost)
                .reduce(Double::sum)
                .orElse(.0);
    }

    public List<Beverage> getBeverages(){
        return beverages;
    }
}
