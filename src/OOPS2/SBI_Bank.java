package OOPS2;

public interface SBI_Bank {
	
	/*
	 * Interface does not have Main Method. In Interface Method body does not
	 * Accept. 
	 * In Interface we can declare the variables and this variables are
	 * Static in nature,its not mandatory to use Static keyword for variables
	 * separately. 
	 * Variables Value will not be changed, its constant/final in
	 * nature. 
	 * In Interface Only Method decelerations is available. 
	 * In Interface Methods are NON Static by default. 
	 * In Interface Methods can not be Static,
	 * because Interface is a part of Object Oriented programmer Concept. So Objects
	 * can not have a Static Method,That's why we never use Static Methods in
	 * interface.
	 * We can not create an Object for interface, because Interface is
	 * Abstract in nature.
	 * If a class is Implementing an Interface,
	 * then it is mandatory to override all the methods of Interface.
	 * A class can have their own separate Methods.
	 */

	public void ATM_Services();

	public void NetBanking();

	public void Payments();

}
