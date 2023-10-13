import java.util.Arrays;
import java.util.Scanner;

public class PangramString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		boolean pangram = true;
		String input = sc.nextLine();
		input = input.toLowerCase();
		int freq[] = new int[26];
		Arrays.fill(freq, 0);
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				//System.out.println(input.charAt(i));
				freq[input.charAt(i) - 97]++;
			}
		}
//		for (int i = 0; i < freq.length; i++) {
//			System.out.print( freq[i]+" ");
//		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] < 1) {
				pangram = false;
				break;
			}
		}
		
		System.out.println("\n"+pangram);

	}

}
