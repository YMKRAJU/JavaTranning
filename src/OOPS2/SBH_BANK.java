package OOPS2;


// We are achieving Multiple Inheritance 
public class SBH_BANK implements Reserve_Bank, SBI_Bank {
	
	
	//IS-A Relation Ship
    //If a class is Implementing an Interface,
    // then it is mandatory to override all the methods of Interface.

	// OverRidding Reserve_BANK Methods
	public void Acc_Opening() {
		System.out.println("Account must open");
	}

	public void Savings() {
		System.out.println("Savings Account");
	}

	public void Deposit() {
		System.out.println("Deposit Money");
	}

	public void With_Drawals() {
		System.out.println("With_Drawalss Money");
	}

	//OverRidding SBI_BANK Methods
	public void NetBanking() {
		System.out.println("Provides NetBanking Serivces");
	}

	public void Payments() {
		System.out.println("Provides Payments Serivces");
	}

	public void ATM_Services() {
		System.out.println("Provides ATM_Services");
	}
	

	//SBH_BANK Methods(Separate class Methods)
	public void Mobile_Banking() {
		System.out.println("Provides Mobile Banking Serivces");
	}
	
	public void House_loans() {
		System.out.println("House loans are provided");
	}
	
	public void Education_loans() {
		System.out.println("Education_loans are provided");
	}

}
