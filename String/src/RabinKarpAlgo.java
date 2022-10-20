import java.util.Scanner;

public class RabinKarpAlgo {
	static final int d=256;
	static final int q=101; //we can take any prime number but make sure it is larger to avoid collision.
	static void rkalgo(String word, String pattern, int n,int m) {
	int h=1;
	for(int i=1;i<=m-1;i++) {
		h=(h*d)%q;
	}	// to find d(i.e base value)^m-1
	int p=0,t=0;
	for(int i=0;i<m;i++) {
		p=(p*d+pattern.charAt(i))%q;
		t=(t*d+word.charAt(i))%q;
	}
	for(int i=0;i<=(n-m);i++) {
		if(p==t) {
			boolean flag=true;
			for(int j=0;j<m;j++) {
				if(pattern.charAt(j)!=word.charAt(i+j))
					flag=false;
			}
			if(flag==true)
				System.out.println(i+" ");
		}
		if(i<n-m) {
			t=(d*(t-(word.charAt(i)*h))+word.charAt(i+m))%q;
		}
		if(t<0)
			t=t+q;
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word");
		String s=sc.nextLine();
		System.out.println("Enter Pattern");
		String p=sc.next();
		rkalgo(s,p,s.length(),p.length());
		sc.close();
	}

}
