package decorator.step1.view;

import decorator.step1.Beverage;
import decorator.step1.BeverageMenu;

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
        printStream.println("총 가격 : " + totalCost);
    }

    public void displayOrderMessage() {
        printStream.println("무엇을 주문하시겠습니까?");
    }

    public void displayMenu(BeverageMenu beverageMenu) {
        printStream.println();
        printStream.println("----------- 커피 메뉴 -----------");

        for(int key : beverageMenu.getKeys()){
            Beverage beverage = beverageMenu.getBeverage(key);
            printStream.println(key + ". " + beverage.getName());
            printStream.println("설명 : " + beverage.getDescription());
            printStream.println("가격 : " + beverage.getCost());
            printStream.println();
        }
    }
}
