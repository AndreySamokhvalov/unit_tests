
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CheckNumTest {

    private CheckNum checkNum;
    @BeforeEach
    void setUp() {

       checkNum = new CheckNum();
    }

    @Test
    void trueIfNumIsEvent(){
        assertThat(checkNum.evenOddNumber(10)).isTrue();
    }


    @Test
    void trueIfNumIsNotEvent(){
        assertThat(checkNum.evenOddNumber(11)).isFalse();
    }


}
