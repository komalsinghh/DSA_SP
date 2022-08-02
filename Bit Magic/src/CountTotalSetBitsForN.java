import java.util.*;
//Efficient Approach Time Complexity-O(logn)
public class CountTotalSetBitsForN {
	static int countAllSet(int n) {
		if(n==0) {
			return 0;
		}
		int res=0;
		int msb=HighestPowerOf2(n);
		int setBitBeforeHP=(1<<(msb-1))*msb;
		int setBitHPtoN=(n-(1<<msb)+1);
		int m=n-(1<<msb);
		 res=setBitBeforeHP + setBitHPtoN + countAllSet(m);
		return res;
	}
	static int HighestPowerOf2(int n) {
		int ans=(int)Math.floor(Math.log(n)/Math.log(2));
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(countAllSet(n));
		sc.close();
	}

}

//Naive Approach Time Complexity-O(nlogn)
/*public static int checkBit(int i){
    int res=0;
    while(i!=0){
    i=(i&(i-1));
    res++;
        
    }
    return res;
}
public static int countSetBits(int n){

    // Your code here
    if(n==0){
        return 0;
    }
    int count=0;
    for(int i=1;i<=n;i++){
        count+=checkBit(i);
    }
    return count;
}
}
*/