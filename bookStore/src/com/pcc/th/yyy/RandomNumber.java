package com.pcc.th.yyy;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		RandomNumber r = new RandomNumber();
//		System.out.println(r.generate());
	}

	public int generate(Random random) {
		return random.nextInt(10);
	}
}
