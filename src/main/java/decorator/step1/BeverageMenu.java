package decorator.step1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class BeverageMenu {
    private final Map<Integer, Beverage> menu;

    private BeverageMenu() {
        this.menu = new HashMap<>();
    }

    public void add(int order, Beverage beverage){
        menu.put(order, beverage);
    }

    public Beverage getBeverage(int order){
        return menu.get(order);
    }

    public int size(){
        return menu.size();
    }

    public Set<Integer> getKeys(){
        return menu.keySet();
    }

    public static BeverageMenu of(List<Beverage> beverages){
        BeverageMenu beverageMenu = new BeverageMenu();

        IntStream.range(0, beverages.size())
                .forEach((index) -> beverageMenu.add(index, beverages.get(index)));
        return beverageMenu;
    }
}
