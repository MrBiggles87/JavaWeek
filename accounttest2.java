class account{
	public void tax(){
		System.out.println("Tax Rate is: "+22.7);
	}
	public void tax(int salary){
		float t;
		t=salary*22.7f/100;
		System.out.println("Your Tax is: "+t);
	}
	public void tax(int salary, float tax_rate){
		float t;
		t=salary*tax_rate/100;
		System.out.println("Your Tax is: "+t);
	}
}


class accounttest2{
	public static void main(String xyz[]){
		account ref=new account();
		ref.tax();
		ref.tax(2000);
		ref.tax(2000,19);
	}
}