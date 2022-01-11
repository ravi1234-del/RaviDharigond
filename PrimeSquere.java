package Practice.java;
import java.util.*;
public class PrimeSquere {
	public static boolean squere(int x1) {
		int sr;
		if(x1>=0) {
			sr = (int)Math.sqrt(x1);
			return ((sr * sr) == x1);
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Integer Number");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			}
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
				}
		}
		System.out.println("This is Largest number"+max);
		PrimeSquereDemo pd=new PrimeSquereDemo();
		int a=pd.prime(max);
		if (squere(max)) {
            System.out.print("This is Biggedt<n>");
		}else if(a%2==0) {
			System.out.println("This is Largest no"+max);
			
		}else {
			for(int i=0;i<=arr.length-1;i++) {
				System.out.print(arr[i]+ " ");
			}
		}
		
	}
	}

