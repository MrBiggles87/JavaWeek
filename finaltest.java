final class hsbc{
	public void msg(){
		System.out.println("Hello!");
	}
	public void message(){
		System.out.println("ABC!");
	}
}


class london extends hsbc{
	public void msg(){
		System.out.println("1234");
	}
}

class finaltest{
	public static void main(String xyz[]){
	hsbc x =new hsbc();
	hsbc.msg();
	}
}