public class Selection {
	static void sort(int[] input, int l) {
		int selection;
		
		// Move bounds of array back by one per loop
		for(int pass = 0; pass < l-1; pass++) {
			selection = pass;
			
			//Determine the minimum element
			for(int i = pass + 1; i < l; i++) {
				if(input[i] < input[selection]) {
					selection = i;
				}
			}
			
			//Swap the elements
			int temp = input[selection];
			input[selection] = input[pass];
			input[pass] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] input = { 1, 3, 5, 7, 9, 2, 4, 6, 8 };
		int l = input.length;
		
		sort(input, l);
		
		for(int i = 0; i < l; i++) {
			System.out.println(input[i] + " ");
		}
	}
}