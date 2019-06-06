class bank{
	private int amount;
	public void deposit(int money){
		amount+=money;
	}
	public void withdraw(int money){
		if(money<amount){
			amount-=money;
		}
		else{
			System.out.println("Not Enough Funds!");
		}
	}
	public void balance(){
		System.out.println("Your Balance is: "+amount);
	}
	public bank(){
		System.out.println("Hello My Friends!!!!");
	}
}


class NBS{
	public static void main(String xyz[]){
		bank ref;
		ref = new bank();
	}
}