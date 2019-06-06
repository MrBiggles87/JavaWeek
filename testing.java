abstract class draw{
	abstract public void drawing();
}


class line extends draw{
	public void drawing(){
		System.out.println("Drawing line");
	}
}


class circle extends draw{
	public void drawing(){
		System.out.println("Drawing Circle");
	}
}


class testing{
	public static void main(String xyz[]){
		line x=new line();
		letsdraw(x);
		circle c=new circle ();
		letsdraw(c);
	}
	public static void letsdraw(draw d){
		d.drawing();
	}
}