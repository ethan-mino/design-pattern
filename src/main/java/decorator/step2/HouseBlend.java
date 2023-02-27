package decorator.step2;

public class HouseBlend extends Beverage {

    @Override
    public String getName() {
        return "하우스 블렌드";
    }

    @Override
    public String getDescription() {
        return "가장 맛있는 하우스 블렌드입니다.";
    }

    @Override
    public Double getCost() {
        return 0.75 + super.getCost();
    }
}
