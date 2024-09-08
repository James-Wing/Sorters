// Find the smallest value, call it the Bingo Element
// Shift all elements of the array to their correct position which is equal to the smallest element by swapping the position of elements
// Find the next smallest element and shift the elements to thjeir correct position that are equal to new Bingo
// Repeat until sorted

public class Bingo {
	static int[] sort(int[] input) {
		int bingo = input[0];
		
		// Find the smallest element
		for(int i = 0; i < input.length; i++) {
			if(input[i] < bingo) {
				bingo = input[i];
				System.out.println(bingo); 
			}
		}
		
		return input;
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