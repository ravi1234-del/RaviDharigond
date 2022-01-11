package Practice.java;

public class PrimeSquereDemo {
	public int prime(int x) {
		int count=0;
		for(int i=2;i<=x;i++) {
			if(x%i==0) {
				count++;
				}
			}
		if(count==2) {
			System.out.println("The max number"+x);
		}
		return x;
	}
	
	

}
