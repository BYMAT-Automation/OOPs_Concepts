package encapsulation;

public class BankAccount {
	
	private long account_no;
	private float account_balance= 10;
	private String accountOwner, address;
	private float deposit_amount=0;
	
	public float getDeposit_amount() {
		return deposit_amount;
	}
	public void setDeposit_amount(float deposit_amount) {
		if(deposit_amount <= 500)
			System.out.println("Please deposit amount more that Rs 500");
		else
		this.deposit_amount = deposit_amount;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public float getAccount_balance() {
		account_balance = account_balance + deposit_amount;
		return account_balance;
	}
	public void setAccount_balance(float account_balance) {
		this.account_balance = account_balance;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
