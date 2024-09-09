// Find the smallest value, call it the Bingo Element
// Shift all elements of the array to their correct position which is equal to the smallest element by swapping the position of elements
// Find the next smallest element and shift the elements to thjeir correct position that are equal to new Bingo
// Repeat until sorted

public class Bingo {
	static int bingo;
	static int nextBingo;
	
	static int[] sort(int[] input) {
		setBingo(input);
		System.out.println(bingo);
		System.out.println(nextBingo);
		
		return input;
	}
	
	// Set bingo and nextBingo to the min and max values
	static void setBingo(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			bingo = Math.min(bingo, arr[i]);
			nextBingo = Math.max(nextBingo, arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr =  { 1, 6, 7, 4, 4, 7, 2, 9 };
		int n = arr.length;
		
		sort(arr);
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}