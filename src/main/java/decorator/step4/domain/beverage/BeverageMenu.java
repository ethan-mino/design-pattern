package decorator.step4.domain.beverage;

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

    public static BeverageMenu from(List<Beverage> beverages){
        BeverageMenu beverageMenu = new BeverageMenu();
        IntStream.range(0, beverages.size())
                .forEach((index) -> beverageMenu.add(index + 1, beverages.get(index)));
        return beverageMenu;
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
}
