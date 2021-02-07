import java.util.*;


public class IsPrimeEasyApproach {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//input T numbers 
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			
			int count = 0;
			for(int div = 1; div <= n; div++) {
				
				if(n % div == 0) {
					count++;
				}
				
			}
			
			if(count == 2)
				System.out.println(n +" is Prime" );
			else
				System.out.println(n + "is Not prime");
		}
		
		
	}
	
	
}
