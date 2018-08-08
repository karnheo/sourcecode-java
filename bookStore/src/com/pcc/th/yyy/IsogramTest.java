package com.pcc.th.yyy;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsogramTest {

	@Test
	public void test() {
		Isogram isogram = new Isogram();
		assertTrue(isogram.check("lumberjacks"));
	}

}
