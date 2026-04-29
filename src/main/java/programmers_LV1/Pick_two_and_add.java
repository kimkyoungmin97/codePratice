package programmers_LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pick_two_and_add {
	//ToDoList
	//두 수를 더했을때 이미 나온 숫자면 제외해야함
	//이중 for문으로 처음부터 끝까지 2개의 숫자를 더한 값을 list에 넣음
	//list에 넣을때 이미 리스트에 들어가 있는 숫자면 안넣음
	//마지막에 list의 값들을 배열생성후 담는다
	
	  public int[] solution(int[] numbers) {
	        List<Integer> list = new ArrayList<>();
	        for(int i = 0; i < numbers.length-1; ++i) {
	            for(int j = i+1; j < numbers.length; ++j) {
	                int temp = numbers[i] + numbers[j];
	                if(list.contains(temp)) {
	                    continue;
	                }else{
	                    list.add(temp);
	                }
	            }
	        }
	        int[] answer = new int[list.size()];
	        for(int i = 0; i< answer.length; ++i) {
	            answer[i] = list.get(i);
	        }
	        Arrays.sort(answer);
	        return answer;
	    }

}
