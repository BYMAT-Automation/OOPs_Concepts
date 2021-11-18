package encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		ba.setAccount_no(1234567891);
		ba.setAccount_balance(3000);
		ba.setAccountOwner("Hema");
		ba.setAddress("Delhi");
		ba.setDeposit_amount(750);
		
		System.out.println(ba.getAccount_no() +" this account is belongs to "+ba.getAccountOwner()+ 
				" with account balance "+ba.getAccount_balance()+" and address is "+ba.getAddress());
		
	}

}
