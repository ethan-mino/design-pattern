package decorator.step4.domain;

import decorator.step4.domain.beverage.*;
import decorator.step4.domain.condiment.*;
import decorator.step4.view.InputView;
import decorator.step4.view.OutputView;

import java.util.List;

public class BeverageOrderSystem {
    private final InputView inputView;
    private final OutputView outputView;
    private final Beverages purchasedBeverages;
    private final BeverageMenu beverageMenu;
    private final List<CondimentName> condimentNames;
    private final CondimentFactory condimentFactory;

    public BeverageOrderSystem(InputView inputView, OutputView outputView,
                               List<CondimentName> condimentNames,
                               CondimentFactory condimentFactory,
                               BeverageMenu beverageMenu){
        this.inputView = inputView;
        this.outputView = outputView;
        this.beverageMenu = beverageMenu;
        this.condimentNames = condimentNames;
        this.condimentFactory = condimentFactory;
        this.purchasedBeverages = Beverages.empty();
    }

    public void start() {
        outputView.displayStartMessage();

        outputView.displayMenu(beverageMenu);
        do{
            outputView.displayOrderMessage();
            int orderNumber = inputView.getOrderNumber();

            Beverage beverage = beverageMenu.getBeverage(orderNumber);
            beverage = addCondiments(beverage);
            purchasedBeverages.add(beverage);
        }while(!isEnd());

        outputView.displayEndMessage();
        outputView.displayPurchasedBeverages(purchasedBeverages);
        outputView.displayTotalCost(purchasedBeverages.getTotalCost());
    }

    private Beverage addCondiments(Beverage beverage){
        for(CondimentName condimentName : condimentNames){
            beverage = addCondiment(beverage, condimentName);
        }

        return beverage;
    }

    private Beverage addCondiment(Beverage beverage, CondimentName condimentName) {
        outputView.displayAddCondimentQuestion(condimentName.name());
        int condimentCount = inputView.getAddCondimentCount();
        for(int i = 0; i < condimentCount; i++){
            beverage = condimentFactory.add(beverage, condimentName);
        }

        return beverage;
    }

    private boolean isEnd() {
        outputView.displayAdditionalOrderQuestion();
        return inputView.getAdditionalOrderConfirmation() != 1;
    }
}
