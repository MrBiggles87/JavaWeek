class results{
	private int phy,che,mat;
	public void physics(int p){
		if (p>=0 && p<=150){
			phy=p;
		}
		else{
			phy=-1;
			System.out.println("Invalid Physics Mark");
		}
	}
	public void chemistry(int c){
		if (c>=0 && c<=150){
			che=c;
		}
		else{
			che=-1;
			System.out.println("Invalid Chemistry Mark");
		}
	}
	public void maths(int m){
		if (m>=0 && m<=150){
			mat=m;
		}
		else{
			mat=-1;
			System.out.println("Invalid Maths Mark");
	}
}
	public void showresults(){
	int total;
		if (phy==-1 || che==-1 || mat==-1){
			System.out.println("No Results");
		}
		else{
			total=phy+che+mat;
			System.out.println("Result is:"+total);
		}
	}
}



class school2{
	public static void main(String xyz[]){
		results peter, james;
		peter= new results();
		james= new results();

		peter.physics(100);
		peter.chemistry(100);
		peter.maths(90);
		james.physics(40);
		james.chemistry(50);
		james.maths(80);

		peter.showresults();
		james.showresults();

	}
}