package decorator.step4;

import decorator.step4.domain.BeverageOrderSystem;
import decorator.step4.domain.beverage.*;
import decorator.step4.domain.condiment.CondimentSimpleFactory;
import decorator.step4.view.InputView;
import decorator.step4.view.OutputView;

import java.util.List;

import static decorator.step4.domain.condiment.CondimentName.*;

public class Application {
    public static void main(String[] args) {
        BeverageOrderSystem beverageorderSystem = new BeverageOrderSystem(
                new InputView(System.in),
                new OutputView(System.out),
                List.of(MILK, SOY, MOCHA, WHIP),
                new CondimentSimpleFactory(),
                BeverageMenu.from(List.of(
                        new DarkRoast(),
                        new Decaf(),
                        new Espresso(),
                        new HouseBlend())));

        beverageorderSystem.start();
    }
}
