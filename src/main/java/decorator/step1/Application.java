package decorator.step1;

import decorator.step1.view.InputView;
import decorator.step1.view.OutputView;

public class Application {
    public static void main(String[] args) {
        BeverageOrderSystem beverageOrderSystem = new BeverageOrderSystem(
                new InputView(System.in),
                new OutputView(System.out)
        );

        beverageOrderSystem.start();
    }
}
