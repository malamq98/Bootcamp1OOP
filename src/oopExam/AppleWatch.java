package oopExam;

/*
 write inside multiple line comments what you know about Abstract class
Here, Can you make a relationship of AppleWatch with Watch, DigitalWatch, and AppleWatchSeries5? [points: 70] . 
 */
/*Abstract : We can declare and initialize variable
 *It contains both abstract and non abstract method
 * Abstract method can not be implemented, can be defined (declared) only
 * Non abstract methods can be implemented, but can not be defined (declared).
 */

public abstract class AppleWatch {
	public int price = 1500;
	public int series;

	public AppleWatch() {
		System.out.println("I am the default constructor of AppleWatch abstract class");
	}
	/*
	 * Yes, we can create variable and constructor No, we can't instantiate an
	 * Abstract class
	 * 
	 * 
	 */

	public abstract void appleWatchInfo();

	public void appleWatch() {
		System.out.println("I am the non abstract method of AppleWatch abstract class");
	}
}
