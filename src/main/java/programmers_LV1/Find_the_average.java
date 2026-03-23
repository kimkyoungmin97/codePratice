package programmers_LV1;

public class Find_the_average {
	
	 public double solution(int[] arr) {
	        double answer = 0;
	        int sum = 0;
	        double count = 0;
	        for(int i = 0; i < arr.length; ++i) {
	            count++;
	            sum += arr[i];
	        }
	        answer = sum/count;
	        return answer;
	    }

}
