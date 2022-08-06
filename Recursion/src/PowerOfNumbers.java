import java.util.Scanner;

public class PowerOfNumbers {
///using recursion
	static long power(long n,int R)
	{
	     
	     if(R==0) {
	    	 return 1;
	     }
	     long res=power(n,R>>1);
	     res=(res*res)%1000000007;
	     if((R&1)==0) {
	    	 return res;
	     }
	     else {
	    	 return (res*n)%1000000007;
	     }
	}
    static long find(int N,int r) {
    	long n=N;
    	long ans=power(n,r);
    	return ans;
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int r=sc.nextInt();
		System.out.println(find(n,r));
		sc.close();
		
	}

}
/*
static long power(int N,int R)
{
	 long res=1;
     long n=N;
     while(R>0){
         if((R&1)!=0)
             {
             res=(res*n)%1000000007;
             }
         n=(n*n)%1000000007;
         R=R>>1;
     }
     return res;
}*/