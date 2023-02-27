package step1;

import decorator.step1.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BeverageOrderSystemTest {
    @Test
    @DisplayName("모든 음료의 설명과 가격을 출력할 수 있다.")
    void test1(){
        List<Beverage> beverages = List.of(new DarkRoast()
                , new Decaf()
                , new Espresso()
                , new HouseBlend());

        beverages.forEach((beverage) -> {
            System.out.println("---------------------------------------");
            System.out.println("이 음료는 " + beverage.getDescription());
            System.out.println("가격은 " + beverage.getCost() + "입니다.");
            System.out.println("---------------------------------------");
            System.out.println();
        });
    }
}
