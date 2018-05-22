package com.app.brain.train;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BrainTrainApplicationTests {

	@Mock
	private RandomNumberGenerator randomNumberGenerator;
	
	@Test
	public void shouldMultiplyTwoRandomNumbersAndReturnTheResult() {
		Multiplication mulitplication = new Multiplication(randomNumberGenerator);
		when(randomNumberGenerator.generate()).thenReturn(30,100);
		assertThat(mulitplication.result()).isEqualTo(3000);
	}
}
