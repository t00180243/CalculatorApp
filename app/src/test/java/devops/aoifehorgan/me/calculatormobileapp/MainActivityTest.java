package devops.aoifehorgan.me.calculatormobileapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainActivityTest {
    private MainActivity activity = new MainActivity();
    private String add = MainActivity.ADD;
    private String minus = MainActivity.SUB;
    private String mul = MainActivity.MUL;
    private String div = MainActivity.DIV;
    @Test
    public void applyOperation() throws Exception {
       checkAddition();
       checkSubtraction();
       checkMultiplication();
       checkDivision();
    }
    @Test
    public void checkAddition() throws Exception {
        double actual = activity.applyOperation(add,2,2);
        double expected = 4;
        assertEquals("Failed",expected,actual,0.001);
    }
    @Test
    public void checkSubtraction() throws Exception {
        double actual = activity.applyOperation(minus,2,2);
        double expected = 0;
        assertEquals("Failed",expected,actual,0.001);
    }
    @Test
    public void checkMultiplication() throws Exception {
        double actual = activity.applyOperation(mul,2,4);
        double expected = 8;
        assertEquals("Failed",expected,actual,0.001);
    }
    @Test
    public void checkDivision() throws Exception {
        double actual = activity.applyOperation(div,4,2);
        double expected = 2;
        assertEquals("Failed",expected,actual,0.001);
    }



    @Test
    public void onCreateOptionsMenu() throws Exception {
        assertTrue(true);
    }

    @Test
    public void registerKey() throws Exception {
        activity.safelyPlaceOperator("0");
        activity.safelyPlaceOperator("1");
        activity.safelyPlaceOperator(minus);
        activity.safelyPlaceOperator(add);

    }

    @Test
    public void display() throws Exception {

    }

    @Test
    public void endsWithNumber() throws Exception {
        boolean actual = activity.endsWithNumber();
        //int expected = false;
        assertFalse("222E",actual);
    }

    @Test
    public void endsWithOperator() throws Exception {
        boolean actual =activity.endsWithOperator();
        assertFalse(actual);
    }

    @Test
    public void findLastOperator() throws Exception {
    }

    @Test
    public void calculate() throws Exception {
    }

    @Test
    public void resetCalculator() throws Exception {
        activity.resetCalculator();

    }


}