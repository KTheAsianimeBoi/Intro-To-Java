package Week10;

public class Ex101_1W21CF19 {
	
	public static void Recursive_Insertion_Sort(int arr[], int n) {
		if (n <= 1) {
			return;
		}
		
		Recursive_Insertion_Sort(arr, n-1);
		
		int insertNum = arr[n-1];
		int track = n-2;
		
		while (track >= 0 && arr[track] > insertNum) {
			arr[track+1] = arr[track];
			track--;
		}
		arr[track+1] = insertNum;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6};
		Recursive_Insertion_Sort(arr,arr.length);
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
