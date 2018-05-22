package com.app.brain.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Multiplication {

	private RandomNumberGenerator randomNumberGenerator;
	
	@Autowired
	public Multiplication(RandomNumberGenerator randomNumberGenerator) {
		this.randomNumberGenerator = randomNumberGenerator;
	}

	public int result() {
		return this.randomNumberGenerator.generate() * this.randomNumberGenerator.generate();
	}
	
}
