class maths{
	public void addition(int a, int b){
		int result;
		result = a+b;
		System.out.println("Result is: "+result);
	}
	public int subtraction(int a, int b){
		int answer;
		answer = a-b;
		return answer;
	}
}


class test3function{
	public static void main(String xyz[]){
		maths x;
		x = new maths();
		x.addition(10,43);
		System.out.println("Result is: "+x.subtraction(200,40));
	}
}