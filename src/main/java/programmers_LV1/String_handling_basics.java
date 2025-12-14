package programmers_LV1;

//프로그래머스(문자열 다루기 기본)
public class String_handling_basics {
	
	public static void main(String[] args) {
		String s = "a234";
		boolean answer = true;
		int len = s.length();
        if(!(len == 4 || len == 6)) {
            answer = false;
        }
        for(int i = 0; i < len; ++i){
            if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                answer = false;
                break;
            }
        }
        System.out.println(answer);
	}
	
	

}
