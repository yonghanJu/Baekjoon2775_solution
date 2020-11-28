import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tries = sc.nextInt();
		int[] result = new int[tries];

				for(int i = 0; i < tries; i++) {
					int k = sc.nextInt(); //k=층
					int n = sc.nextInt(); //n=호
					result[i] = f(k,n);
				}
	for(int r : result)System.out.println(r);

	}
	
	static int f(int k, int n) {
		
		if(n==1) return 1;
		else if(k==0) return n;
		
		 return f(k,n-1) + f(k-1,n);
		
	}

}