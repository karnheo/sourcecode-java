package com.pcc.th.yyy;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class RandomNumberTest {

	@Test
	public void test() {
		Random random = new Random5();
		RandomNumber r = new RandomNumber();
		assertEquals(5, r.generate(random));
	}

}

//Override by method
class Random5 extends Random{
	@Override
	public int nextInt(int bound) {
		return 5;
	}
}
