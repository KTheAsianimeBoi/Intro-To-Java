package Week6;

public class Ex6_3_1w21cf19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int arr[] = {12,4,2,3,28,8,1};
		for(int i = 1; i < arr.length; i++) {
			int current = i;
			int behind = current-1;
			while(arr[current]< arr[behind] && current>= 0 &&  behind>= 0) {
				int temp = arr[current];
				arr[current] = arr[behind];
				arr[behind] = temp;
				if (behind>0) behind--;
				if (current>0) current--;
			}
		}
		for (int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
