package decorator.step4.domain.beverage;

public class DarkRoast implements Beverage {

    @Override
    public String getName() {
        return "다크 로스트";
    }

    @Override
    public String getDescription() {
        return "가장 다크한 다크 로스트입니다.";
    }

    @Override
    public double getCost() {
        return 0.75;
    }
}
