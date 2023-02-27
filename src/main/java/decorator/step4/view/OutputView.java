package decorator.step4.view;

import decorator.step4.domain.beverage.Beverage;
import decorator.step4.domain.beverage.BeverageMenu;
import decorator.step4.domain.beverage.Beverages;

import java.io.PrintStream;

public class OutputView {
    private final PrintStream printStream;

    public OutputView(PrintStream printStream){
        this.printStream = printStream;
    }

    public void displayAdditionalOrderQuestion() {
        printStream.println("더 주문하시겠습니까?");
    }

    public void displayStartMessage() {
        printStream.println("---------- 커피 전문점의 주문 시스템 ----------");
    }

    public void displayEndMessage() {
        printStream.println("-----------------------------------------");
    }

    public void displayTotalCost(double totalCost) {
        printStream.println("총 가격 : " + convertCost(totalCost));
    }

    public void displayOrderMessage() {
        printStream.println("무엇을 주문하시겠습니까?");
    }

    public void displayMenu(BeverageMenu beverageMenu) {
        printStream.println();
        printStream.println("----------- 커피 메뉴 -----------");

        beverageMenu.getKeys()
                .forEach((key) -> {
            Beverage beverage = beverageMenu.getBeverage(key);
            printStream.println(key + ". " + beverage.getName());
            printStream.println("설명 : " + beverage.getDescription());
            printStream.println("가격 : " + convertCost(beverage.getCost()));
            printStream.println();
        });
    }

    public void displayPurchasedBeverages(Beverages purchasedBeverages) {
        printStream.println();
        printStream.println("----------- 구매한 음료 -----------");
        purchasedBeverages.getBeverages()
                .forEach((beverage) ->
                    printStream.println(beverage.getName() + ", " + convertCost(beverage.getCost()))
                );
        printStream.println("--------------------------------");
    }

    private String convertCost(double cost){
        return "$" + cost;
    }

    public void displayAddCondimentQuestion(String name) {
        printStream.println(name + " 을(를) 몇개 추가하시겠습니까?");
    }
}
