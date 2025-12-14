package programmers;
//프로그래머스(문자열 압축)
import java.util.*;
public class String_compression {
	
	public static void main(String[] args) {
		String s = "abcabcabcabcdededededede";
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        //문자열이 1일경우 list에 압축문자열의 길이를 넣는 for문이 안돎
        //그래서 예외처리 해줘야함
//        if(s.length() == 1) {
//        	return 1;
//        }
        for(int i = 1; i < s.length(); ++i){
            int len = getLength(s,i);
            if(!list.contains(len)) {
                list.add(len);
            }
        }
        answer = list.get(0);
        for(int min : list) {
            if(answer > min){
                answer = min;
            }
        }
        System.out.println(answer);
	}
    //뎁스만큼 문자열 자르기,나머지 출력
    private static int getLength(String s, int depth) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int count = 1;
        String temp =s.substring(0,depth);
        for(start = depth; start+depth<= s.length(); start+=depth){
            if(temp.equals(s.substring(start,start+depth))){
                count++;
            }else{
                if(count == 1){
                    sb.append(temp);
                }else{
                    sb.append(count);
                    sb.append(temp);
                    count = 1;
                }
            }
            temp = s.substring(start,start+depth);
        }
        
        if(count == 1){
            sb.append(temp);
        }else{
            sb.append(count);
            sb.append(temp);
        }
        //나머지
        if(start < s.length()){
            sb.append(s.substring(start));
        }
        return sb.length();
    }

}
