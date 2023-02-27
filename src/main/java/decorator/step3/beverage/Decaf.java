package decorator.step3.beverage;

public class Decaf implements Beverage {

    @Override
    public String getName() {
        return "디카페인 커피";
    }


    @Override
    public String getDescription() {
        return "카페인이 포함되지 않은 디카페인 음료입니다.";
    }

    @Override
    public double getCost() {
        return 0.33;
    }
}
