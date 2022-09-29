import java.util.Scanner;

public class ReverseWordInString {
	static void reverse(char[] arr,int low,int high) {
		while(low<=high) {
			char temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
	static void reverseWord(char[] str,int n) {
		int i=0,j=0;
		for( i=0;i<n;i++) {
			if(str[i]==' ') {
				reverse(str,j,i-1);
				j=i+1;
			}
		}
		reverse(str,j,n-1);
		reverse(str,0,n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word");
		String s=sc.nextLine();
		char[] arr=s.toCharArray();
		reverseWord(arr,s.length());
		System.out.println(arr);
		sc.close();
	}

}
