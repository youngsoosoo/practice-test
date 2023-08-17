package sample.cafekiosk.unit.beverage;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class AmericanoTest {

    @Test
    void getName(){
        Americano americano = new Americano();

        //assertEquals(americano.getName(), "아메리카노");
        assertThat(americano.getName().equals("아메리카노"));
    }

    @Test
    void getPrice(){
        Americano americano = new Americano();

        assertThat(americano.getPirce()).isEqualTo(4000);
    }
}