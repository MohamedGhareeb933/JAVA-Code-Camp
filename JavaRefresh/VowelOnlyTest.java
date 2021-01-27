package JavaRefresh;

import org.junit.Assert;

public class VowelOnlyTest {

    @org.junit.Test
    public void Test1() {
        String Input = "Hello World";
        String Output = VowelOnly.Vowell(Input);
        String Expected = "eoo";

        Assert.assertEquals(Output, Expected);
    }

    @org.junit.Test
    public void Test2() {
        String Input = "Learning At My Own";
        String Output = VowelOnly.Vowell(Input);
        String Expected = "eaiao";

        Assert.assertEquals(Output, Expected);
    }
}
