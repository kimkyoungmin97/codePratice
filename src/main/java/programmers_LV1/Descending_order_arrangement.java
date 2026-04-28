package programmers_LV1;

import java.util.Arrays;

public class Descending_order_arrangement {
	
	//ToDoList
	//1.숫자를 문자열로 치환 후 문자열 길이만큼 문자형 배열 생성
	//2.반복문으로 배열에 값 넣기
	//3. Arrays.sort()사용
	
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] arr = new char[str.length()];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; ++i){
          arr[i] =  str.charAt(i);
        }
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; --i) {
            sb.append(arr[i]);
        }
        str = sb.toString();
        answer = Long.parseLong(str);
       return answer;
    }

}
