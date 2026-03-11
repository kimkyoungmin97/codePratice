//ToDoList
//1.list 생성
//2.반복문으로 배열을 돌며 나누어 떨어지는 값을 list에 추가
//3.마지막에 리스트가 비어있으면 -1을 추가
//4.리스트를 배열로 변환
package programmers_LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisible_NumbersArray {
	public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()) {
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; ++i) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

}
