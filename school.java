class results{
	int phy, che, mat;
	public void showresults(){
		int total;
		total=phy+che+mat;
		System.out.println("Total Score: "+total);
		if (total>250){
			System.out.println("PASSED!!");
		}
		else{
			System.out.println("FAILED");
		}
	}
}


class school{
	public static void main(String xyz[]){
		results peter, james;

		peter=new results();
		james=new results();

		peter.phy=60;
		peter.che=100;
		peter.mat=100;

		james.phy=50;
		james.che=40;
		james.mat=60;
		
		peter.showresults();
		james.showresults();
	}
}