import static org.junit.Assert.*;

import org.junit.Test;

public class Sorttest {

    @Test
    public void array1() {
           Sort sort = new Sort();
           int[] input = {1};
           int[] sorted = sort.of(input);
           assertArrayEquals(new int[] {1}, sorted);
    }
    
    @Test
    public void array2() {
           Sort sort = new Sort();
           int[] input = {1, 2};
           int[] sorted = sort.of(input);
           assertArrayEquals(new int[] {1, 2}, sorted);
    }
    
    @Test
    public void array3() {
           Sort sort = new Sort();
           int[] input = {2, 1};
           int[] sorted = sort.of(input);
           assertArrayEquals(new int[] {1, 2}, sorted);
    }
    
    @Test
    public void array4() {
           Sort sort = new Sort();
           int[] input = {1, 2, 3};
           int[] sorted = sort.of(input);
           assertArrayEquals(new int[] {1, 2, 3}, sorted);
    }
    
    @Test
    public void array5() {
           Sort sort = new Sort();
           int[] input = {2, 1, 3};
           int[] sorted = sort.of(input);
           assertArrayEquals(new int[] {1, 2, 3}, sorted);
    }
    
    @Test
    public void array6() {
           Sort sort = new Sort();
           int[] input = {1, 3, 2};
           int[] sorted = sort.of(input);
           assertArrayEquals(new int[] {1, 2, 3}, sorted);
    }
    
    @Test
    public void array7() {
           Sort sort = new Sort();
           int[] input = {3, 2, 1};
           int[] sorted = sort.of(input);
           assertArrayEquals(new int[] {1, 2, 3}, sorted);
    }

}
