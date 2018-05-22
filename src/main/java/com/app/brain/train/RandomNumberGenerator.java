package com.app.brain.train;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RandomNumberGenerator {

	private Random random;
	
	public RandomNumberGenerator() {
		random = new Random();
	}

	public int generate() {
		return random.nextInt();
	}
}
