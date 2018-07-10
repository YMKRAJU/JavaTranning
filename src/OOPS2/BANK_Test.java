package OOPS2;

public class BANK_Test {

	public static void main(String[] args) {
		SBH_BANK sb = new SBH_BANK();
		sb.ATM_Services();
		sb.NetBanking();
		sb.Payments();
		sb.Acc_Opening();
		sb.Mobile_Banking();
		sb.Deposit();
		sb.With_Drawals();
		sb.Education_loans();
		sb.House_loans();
		sb.Acc_Opening();

		System.out.println("***********************");
		//Dynamic Polymorpism 
		//Child class Object can be referred by Parent Interface reference variable
		Reserve_Bank rb = new SBH_BANK();
		rb.Acc_Opening();
		rb.Deposit();
		rb.With_Drawals();
		rb.Savings();
		
		System.out.println("**************");
		
		SBI_Bank s = new SBH_BANK();
		s.ATM_Services();
		s.Payments();
		s.NetBanking();
		System.out.println("************");
		System.out.println(Reserve_Bank.min_Balance);

	}

}
