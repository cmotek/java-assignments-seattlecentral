
public class sorted {

	public static void main(String[] args) {
	
		//int[] list = {1, 4, 3, 5, 2};
		int[] list2 = {1, 2, 3, 4};
		//int[] list3 = {1};
		
		//isSorted(list);	
		isSorted(list2);
		//isSorted(list3);
		
		
	}

		public static void isSorted(int[] list) {
			int count = 0;
			for (int i = 0; i < (list.length - 1); i++) {
				if (list[i] < list[i + 1]) {
					count++;
				}

		}
			if (count == list.length) {				
				System.out.println("True");
			} else {
				System.out.println("False");
			}
	}
}
