package decorator.step2;

public class Espresso extends Beverage {

    @Override
    public String getName() {
        return "에소프레소";
    }

    @Override
    public String getDescription() {
        return "우리 카페의 시그니처 메뉴인 에스프레소입니다.";
    }

    @Override
    public Double getCost() {
        return 0.3 + super.getCost();
    }
}
