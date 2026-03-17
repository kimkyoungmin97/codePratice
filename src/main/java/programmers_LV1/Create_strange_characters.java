//ToDoList
//공백이 나오면 인덱스 초기화
//인덱스 짝수면 대문자, 홀수면 소문자로 변환
package programmers_LV1;

public class Create_strange_characters {
	public String solution(String s) {
        String answer = "";
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i <s.length(); ++i) {
            if(s.charAt(i) == ' ') {
                sb.append(' ');
                index = 0;
                continue;
            }
            if(index % 2 == 0) {
                sb.append(Character.toUpperCase(s.charAt(i)));
                
            }else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            index++; 
        }
        answer = sb.toString();
        return answer;
    }

}
