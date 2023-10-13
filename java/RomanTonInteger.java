import java.util.HashMap;
import java.util.Scanner;

public class RomanTonInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roman number in string value:");
		String input = sc.next();
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int numValue = map.get(input.charAt(0));
		for(int i=1;i<input.length();i++) {
			if(map.get(input.charAt(i-1))>=map.get(input.charAt(i))) {
				numValue = numValue+map.get(input.charAt(i));
			}
			else {
				int temp = map.get(input.charAt(i)) - map.get(input.charAt(i-1));
				numValue = map.get(input.charAt(i))+temp;
			}
		}
		System.out.println(numValue);

	}
}
