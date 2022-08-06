import java.util.*;

public class PossibleWordsFromPhoneDigit {
	static void possibleWord(String[] sr,String output,int n,int index,ArrayList<String> ans) {
		if(index==n) {
			ans.add(output);
			return;
		}
		for(int i=0;i<sr[index].length();i++) {
			possibleWord(sr, output+(sr[index].charAt(i)), n, index+1, ans);
		}
	}
	static ArrayList<String> phone(int[] arr,int n) {
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(0, "");hm.put(1, "");hm.put(2, "abc");hm.put(3, "def");hm.put(4, "ghi");hm.put(5, "jkl");
		hm.put(6, "mno");hm.put(7, "pqrs");hm.put(8, "tuv");hm.put(9, "wxyz");
		String[] sr=new String[n];
		for(int i=0;i<n;i++) {
			sr[i]=hm.get(arr[i]);
		}
		ArrayList<String> ans=new ArrayList<String>();
		possibleWord(sr,"",n,0,ans);
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<String> ans=phone(arr,n);
		for(String i:ans) {
			System.out.println(i);
		}
		sc.close();
	}

}
