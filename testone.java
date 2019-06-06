final class one{
	int a;
	public void msg7(){
		System.out.println("Hello! ");
	}
}


class two{
	int b;
	public void msg2(){
		System.out.println("Manchester");
	}
}


class testone{
	public static void main(String xyz[]){
		one x;
		x=new one();
		x.msg7();
		two ref;
		ref=new two();
		ref.msg2();
		
	}
}