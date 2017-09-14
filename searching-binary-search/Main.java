
public class Main {
	public static int binarySearch(int[] arr, int begin, int end, int search) {
		if (end >= 1) {
			int mid = begin + (end - 1) / 2;
			if (arr[mid] == search)
				return mid;
			if (arr[mid] > search)
				binarySearch(arr, begin, mid - 1, search);
			binarySearch(arr, mid + 1, end, search);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 8, 32, 65, 86, 88, 96 };
		int item = 8;
		int result = Main.binarySearch(arr, 0, arr.length - 1, item);
		if (result == -1)
			System.out.println("Nothing Found");
		else
			System.out.println("Found at position :" + ++result);
	}

}
