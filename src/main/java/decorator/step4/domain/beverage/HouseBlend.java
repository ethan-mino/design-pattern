package decorator.step4.domain.beverage;

public class HouseBlend implements Beverage {

    @Override
    public String getName() {
        return "하우스 블렌드";
    }

    @Override
    public String getDescription() {
        return "가장 맛있는 하우스 블렌드입니다.";
    }

    @Override
    public double getCost() {
        return 0.75;
    }
}
