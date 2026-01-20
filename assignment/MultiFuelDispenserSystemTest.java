import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiFuelDispenserSystemTest{

    @Test
    public void testGetBuyingMethod(){
        

    } 

    @Test
    public void testCalculateAmount(){
        double actual = MultiFuelDispenserSystem.calculateAmount(2,5);
        double expected = 10;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testCalculateLitres(){
        double actual = MultiFuelDispenserSystem.calculateLitres(10,2);
        double expected = 5;
        Assertions.assertEquals(expected,actual);
    }
}
