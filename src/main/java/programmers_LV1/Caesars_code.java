package programmers_LV1;

public class Caesars_code {
	//ToDoList
	//1.문장의 각 문자가 대문자,소문자,공백인지 판단
	//2.StringBuilder 객체 생성
	//3.반복문 돌면서 append
	//4.알파벳의 범위를 넘어가면 알파벳의 갯수만큼 나눠서 초기화해주는게 포인트
	
	public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append((char)('a' + (s.charAt(i) - 'a' + n) % 26));
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <='Z') {
                sb.append((char)('A' + (s.charAt(i) - 'A' + n) % 26));
            }else{
                sb.append(' ');
            }
        }
        answer = sb.toString();
        return answer;
    }

}
