package JavaRefresh;


import org.junit.Assert;

public class CalculatorTest {
    @org.junit.Test
    public void Test2(){
        Assert.assertEquals(Calculate.calculate("2*8"), 16);
    }
}
