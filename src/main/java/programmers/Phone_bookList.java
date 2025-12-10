package programmers;
//프로그래머스(전화번호 목록)
import java.util.Arrays;

public class Phone_bookList {
	
    public static void main(String[] args) {
        // 로컬에서 테스트해보고 싶으면 여기에 입력
        String[] phone_book = {"119", "97674223", "1195524421"};
        //개선 후
        boolean answer = true;
        getSort(phone_book);
        answer = logic(phone_book);
        System.out.println(answer);
        
       
    }
    //개선 후
    private static String[] getSort(String[] phone_book) {
        Arrays.sort(phone_book);
        return phone_book;
    }
    
    private static boolean logic(String[] phone_book) {
        boolean isStart = true;
        for(int i = 0; i < phone_book.length-1; ++i) {
            if(phone_book[i+1].startsWith(phone_book[i])){
                isStart = false;
                return isStart;
            }
        }
        return isStart;
        
    }
}
//	//개선전
//	class Solution {
//	    public boolean solution(String[] phone_book) {
//	        
//	        //유효성검사
//	        if(!phone_book_condition(phone_book)){
//	            return false;
//	        }else{
//	            arr_sort(phone_book); //배열을 길이순으로 정렬
//	        }
//	        return logic(phone_book);	    }
//	    
//	    //배열을 문자열의 길이순으로 정렬하는 함수
//	    private String[] arr_sort(String[] arr){
//	        for(int i = 0; i < arr.length-1; ++i){
//	            for(int j = i+1; j<arr.length; ++j){
//	                if(arr[i].length() > arr[j].length()){
//	                    String temp;
//	                    temp = arr[i];
//	                    arr[i] = arr[j];
//	                    arr[j] = temp;
//	                }
//	            }
//	        }
//	        return arr;
//	    }
//	    //핵심 로직
//	    private boolean logic(String[] phone_book){
//	        for(int i = 0; i < phone_book.length-1; i++){
//	            int length = phone_book[i].length();
//	            for(int j = i+1; j < phone_book.length; j++){
//	                if(phone_book[i].equals(phone_book[j].substring(0,length))){
//	                  return false;
//	                }
//	            }
//	        }
//	        return true;
//	    }
//	    
//	    //true면 통과 false면 불통과
//	    private boolean phone_book_condition(String[] phone_book){
//	        if(phone_book.length < 1 || phone_book.length > 1000000){
//	            return false;
//	        }else{
//	            for(int i = 0; i < phone_book.length-1; i++){
//	                for(int j = i+1; j < phone_book.length; j++){
//	                    if(phone_book[i].equals(phone_book[j])){
//	                        return false;
//	                    }
//	                }
//	            }
//	            for(int i = 0; i < phone_book.length; i++){
//	                if(phone_book[i].length() < 1 || phone_book[i].length() > 20){
//	                    return false;
//	                }
//	            }
//	        return true;
//	        }
//	    }
//	}
