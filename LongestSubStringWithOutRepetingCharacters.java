
import java.util.*;
class Solution {
	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			boolean visited[] = new boolean[128];
			int length = 0;
			for (int j = i; j < s.length(); j++) {
				char currentChar = s.charAt(j);
				if (visited[currentChar]) {
					break;
				} else {
					visited[currentChar] = true;
					length++;
				}
			}
			if (length > maxLength)
				maxLength = length;
		}
		return maxLength;
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string");
		String input = scanner.nextLine();
		int result = solution.lengthOfLongestSubstring(input);
		System.out.println("Longest substring length: " + result);
	}
}
