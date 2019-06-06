abstract class calculations{
	abstract public void tax(int salary);
	public void msg(){
		tax(2000);
		System.out.println("Hello My Friend");
	}
}


class calculations2 extends calculations{
	public void tax(int salary){
		float result;
		result=salary*21/100;
		System.out.println(result);
	}
}

class calculations3{
	public static void main(String xyz[]){
		
	}
}