package decorator.step1;

import decorator.step1.view.InputView;
import decorator.step1.view.OutputView;

import java.util.List;

public class BeverageOrderSystem {
    private final InputView inputView;
    private final OutputView outputView;
    private final Beverages purchasedBeverages;
    private final BeverageMenu beverageMenu;

    public BeverageOrderSystem(InputView inputView, OutputView outputView){
        this.inputView = inputView;
        this.outputView = outputView;
        this.purchasedBeverages = Beverages.empty();
        this.beverageMenu = BeverageMenu.of(List.of(
                new DarkRoast()
                , new Decaf()
                , new Espresso()
                , new HouseBlend()));
    }

    public void start() {
        outputView.displayStartMessage();
        outputView.displayMenu(beverageMenu);

        do{
            outputView.displayOrderMessage();
            int orderNumber = inputView.getOrderNumber();

            Beverage beverage = beverageMenu.getBeverage(orderNumber);
            purchasedBeverages.add(beverage);
        }while(!isEnd());

        outputView.displayEndMessage();
        outputView.displayTotalCost(purchasedBeverages.getTotalCost());
    }

    private boolean isEnd() {
        outputView.displayAdditionalOrderQuestion();
        return inputView.getAdditionalOrderConfirmation() != 1;
    }
}
