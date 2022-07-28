import java.util.*;
public class CountDigitFactorial {
	static int facDigits(int N){
        if(N<0){
            return 0;
        }
        if(N<=1){
            return 1;
        }
        double sum=0;
        for(int i=2;i<=N;i++){
            sum+=Math.log10(i);
        }
        
        return (int)(sum+1);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(facDigits(n));
		sc.close();
	
	}

}
