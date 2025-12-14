package programmers_LV1;
//프로그래머스(가운데 글자 가져오기)
public class Bring_in_the_middle_letter {
	
	public static void main(String[] args) {
		String s ="abcde";
		String answer = "";
		int start = 0;
		int end = 0;
        //짝수일떄
        if(s.length() % 2 == 0){
            start = (s.length() / 2)-1;
            end = start+2;
            answer = s.substring(start,end);
        }
        //홀수일떄
        if(s.length() % 2 != 0){
            start = s.length() / 2;
            end = start+1;
            answer = s.substring(start,end);
        }
        
	}

}
