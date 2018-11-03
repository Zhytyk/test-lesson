import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ArithmeticTest {

    @Test
    public void testFormula2() {
        //arrange
        IArithmetic arithmetic = new Arithmetic();
        double result, result2, result3,
                x, y;

        //act
        x = 3;
        y = 1;
        result = arithmetic.countFormula2(x, y);

        x = 6;
        y = 2;
        result2 = arithmetic.countFormula2(x, y);

        x = 10;
        y = 1;
        result3 = arithmetic.countFormula2(x, y);

        //assert
        Assertions.assertEquals(1 / 2.0, result, "Expected result doesn't equal.");
        Assertions.assertEquals(4 / 13.0, result2);
        Assertions.assertEquals(9 / 11.0, result3);
    }

    @Test
    public void testFormula4() {
        //arrange
        IArithmetic arithmetic = new Arithmetic();
        String result, result1, result2;
        double x, y;



        //act
        x = 4;
        y = 4;
        result = arithmetic.countFormula4(x, y);


        x = 2;
        y = 18;
        result1 = arithmetic.countFormula4(x, y);


        x = 3;
        y = 12;
        result2 = arithmetic.countFormula4(x, y);



        //assert
        Assertions.assertEquals("4.0 4.0", result);
        Assertions.assertEquals("10.0 6.0", result1);
        Assertions.assertEquals("7.5 6.0", result2);
    }

    @Test
    public void testFormula6() {
        //arrange
        IArithmetic arithmetic = new Arithmetic();
        String result1, result2;
        Executable result3;
        double a, b;


        //act
        a = 3;
        b = 5;
        result1 = arithmetic.countFormula6(a, b);


        a = 1;
        b = 2;
        result2 = arithmetic.countFormula6(a, b);


        result3 = () -> arithmetic.countFormula6(2, -5);


        //assert
        Assertions.assertEquals("5.83 7.50", result1);
        Assertions.assertEquals("2.24 1.00", result2);
        Assertions.assertThrows(
                IllegalArgumentException.class,
                result3
        );
    }
}
