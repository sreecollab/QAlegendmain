package Utilities;

import java.util.Random;

import org.openqa.selenium.WebDriver;

public class fakerUtility {
	WebDriver driver;
	public static int Randomnmbergenerator() {
		Random random = new Random();
		int Randomnum = random.nextInt(10000); // within 10000 oru random number
		return Randomnum;
	}
	

}
