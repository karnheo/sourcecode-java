import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void oneGetOneOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(1);
        assertEquals("1", result);
    }
    
    @Test
    public void twoGetTwoOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(2);
        assertEquals("2", result);
    }
    
    @Test
    public void threeGetFizzOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(3);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void fourGetfourOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(4);
        assertEquals("4", result);
    }
    
    @Test
    public void fifthGetBuzzOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(5);
        assertEquals("Buzz", result);
    }
    
    @Test
    public void sixGetFizzOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(6);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void sevenGetsevenOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(7);
        assertEquals("7", result);
    }
    
    @Test
    public void eggGeteggOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(8);
        assertEquals("8", result);
    }
    
    @Test
    public void ningeGetFizzOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(9);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void tenGetBuzzOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(10);
        assertEquals("Buzz", result);
    }
    
    
    @Test
    public void elevenGetElevenOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(11);
        assertEquals("11", result);
    }
    
    @Test
    public void twelGetFizzOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(12);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void tenthreeGetTenthreeOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(13);
        assertEquals("13", result);
    }
    
    @Test
    public void fourteenGetFourteenOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(14);
        assertEquals("14", result);
    }
    
    @Test
    public void fifthteenGetFizzBuzzOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(15);
        assertEquals("FizzBuzz", result);
    }
    
    @Test
    public void sixteenGetSixteenOnly() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(16);
        assertEquals("16", result);
    }
    

    
   

    

}
