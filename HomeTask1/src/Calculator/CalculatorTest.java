package Calculator;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {

    public static void main(String[] args) {

        assertThat(Calculator.calculation(3, 5, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(3, 3, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 8, '*')).isEqualTo(16);
        assertThat(Calculator.calculation(50, 10, '/')).isEqualTo(5);

        // Проверка ожидаемого исключения
        assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);



        // проверка метода вычисления суммы покупки со скидкой

        //Отрицательная сумма покупки
        assertThatThrownBy(() ->
                Calculator.calculateDiscount(-1000, 50))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупок - неотрицательное число");

        //Отрицательная скидка
        assertThatThrownBy(() ->
                Calculator.calculateDiscount(1000, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Размер скидеи должен быть не больше 100%, но не меньше 0%");

        //Скидка больше 100
        assertThatThrownBy(() ->
                Calculator.calculateDiscount(1000, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Размер скидеи должен быть не больше 100%, но не меньше 0%");



        assertThat(Calculator.calculateDiscount(1000, 25)).isEqualTo(750);
        assertThat(Calculator.calculateDiscount(1000, 100)).isEqualTo(0);
        assertThat(Calculator.calculateDiscount(1000, 0)).isEqualTo(1000);

    }
}



