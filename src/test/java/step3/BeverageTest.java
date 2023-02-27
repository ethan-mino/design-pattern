package step3;

import decorator.step3.beverage.Beverage;
import decorator.step3.beverage.DarkRoast;
import decorator.step3.condiment.Mocha;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeverageTest {
    @Test
    @DisplayName("더블 모카 다크 로스트의 가격은 (다크 로스트의 가격 + 모카 가격 * 2)이다.")
    void test1(){
        Beverage beverage = new Mocha(new Mocha(new DarkRoast()));
        assertEquals(beverage.getCost(), 1.05);
    }
}
