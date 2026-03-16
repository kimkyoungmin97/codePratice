package programmers_LV1;

import java.util.Arrays;

public class String_descending_order {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        char arr[] = new char[s.length()];
	        for(int i =0; i < arr.length; ++i) {
	            arr[i] = s.charAt(i);
	        }
	        Arrays.sort(arr);
	        for(int i = arr.length-1; i >= 0; --i) {
	            answer += arr[i];
	        }
	        return answer;
	    }
	}

}
