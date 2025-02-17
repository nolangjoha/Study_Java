package study_ch06_exercise_2;

public class Exercise6_20 {
	
	public static int max(int[] arr) {
		
		if(arr==null || arr.length ==0) return -999999;
		
		
		int maxNum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		
		System.out.println("최댓값:" + max(data));
		System.out.println("최댓값:" + max(null));
		System.out.println("최댓값:" + max(new int[] {}));

	}
	
}
