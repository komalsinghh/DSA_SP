import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstring {
	//Efficient Approach O(n)
	static int longest(String str,int n) {
		int res=0,i=0;
		int[] prev=new int[256];
		Arrays.fill(prev, -1);
		for(int j=0;j<n;j++) {
			i=Math.max(i, prev[str.charAt(j)]+1);
			int maxEnd=j-i+1;
			res=Math.max(res, maxEnd);
			prev[str.charAt(j)]=j;
 		}
		return res;
	}
	
	// Better Approach O(n^2)
	/*static int longest(String str, int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			boolean[] visited = new boolean[256];
			for (int j = i; j < n; j++) {
				if (visited[str.charAt(i)] == true)
					break;
				else {
					res = Math.max(res, j - i + 1);
					visited[str.charAt(j)] = true;
				}
			}

		}
		return res;
	}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word");
		String s = sc.next();
		System.out.println(longest(s, s.length()));
		sc.close();
	}

}
