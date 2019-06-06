class maths2{
	public void add(int a, int b){
		int result = a+b;
		System.out.println("Result is: "+result);
	}
	public void subtract(int a, int b){
		int result = a-b;
		System.out.println("Result is: "+result);
	}
	public void divide(int a, int b){
		int result = a/b;
		System.out.println("Result is: "+result);
	}
}


class mathtest{
	public static void main(String xyz[]){
		maths2 x=new maths2();
		x.add(3,7);
	}
}