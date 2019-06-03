class first{
	int x;
	int y;
}

class test{
	public static void main(String xyz[]){
		first ref;
		ref=new first();
		ref.x=15;
		ref.y=20;
		System.out.println(ref.x+ref.y);
	}
}