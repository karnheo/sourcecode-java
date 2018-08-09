import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactor {

    @Test
    public void objTest1() {
        PrimeFactortest p = new PrimeFactortest();
        String result = p.of(2);
        assertEquals("2", result);
    }
    
    @Test
    public void objTest2() {
        PrimeFactortest p = new PrimeFactortest();
        String result = p.of(3);
        assertEquals("3", result);
    }
    
    @Test
    public void objTest3() {
        PrimeFactortest p = new PrimeFactortest();
        String result = p.of(4);
        assertEquals("22", result);
    }
    
    @Test
    public void objTest4() {
        PrimeFactortest p = new PrimeFactortest();
        String result = p.of(6);
        assertEquals("23", result);
    }
    
    @Test
    public void objTest5() {
        PrimeFactortest p = new PrimeFactortest();
        String result = p.of(8);
        assertEquals("222", result);
    }
    
    @Test
    public void objTest6() {
        PrimeFactortest p = new PrimeFactortest();
        String result = p.of(10);
        assertEquals("25", result);
    }
    
    
    @Test
    public void objTest7() {
        PrimeFactortest p = new PrimeFactortest();
        String result = p.of(12);
        assertEquals("223", result);
    }

}
