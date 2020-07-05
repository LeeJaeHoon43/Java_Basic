class Account{
	private String name;
	private long balance;

	Account(){}

	Account(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public long getBalance(){
		return balance;
	}

	public void deposit(long amount){
		balance += amount;
	}

	public void withdraw(long amount){
		if(balance < amount)
			System.out.println("�ܰ��� �����մϴ�.");
		else
			balance -= amount;
	}
}