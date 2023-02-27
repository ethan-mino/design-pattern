package decorator.step1;

public class DarkRoast extends Beverage {

    @Override
    public String getName() {
        return "다크 로스트";
    }

    @Override
    public String getDescription() {
        return "가장 다크한 다크 로스트입니다.";
    }

    @Override
    public Double getCost() {
        return 0.75;
    }
}
