class college{
	private int phy, che, total; float per;
	private void calculation(){
		total=phy+che;
		per=total*100/300;
	}
	public void physics(int p){
		if(p>=0 && p<=150){
			phy=p;
		}
		else{
			phy=-1;
			System.out.println("Invalid Physics Mark");
		}
	}
	public void chemistry(int c){
		if(c>=0 && c<=150){
			che=c;
		}
		else{
			che=-1;
			System.out.println("Invalid Chemistry Mark");
		}
	}
	public void showresults(){
		if(che==-1 || phy==-1){
			System.out.println("No Results");
		}
		else{
			calculation();
			System.out.println("Total Marks: "+total);
			System.out.println("Total Percent: "+per);
		}
	}
}


class schoolv2{
	public static void main(String xyz[]){
		college abc;
		abc = new college();
		abc.physics(64.5);
		abc.chemistry(92.3);
		abc.showresults();
	}
}
